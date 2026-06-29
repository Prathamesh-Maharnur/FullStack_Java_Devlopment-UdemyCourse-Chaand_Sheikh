package org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.RandomStringUtils;
import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.model.Account;
import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.model.Album;
import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.model.Photo;
import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.payload.album.AlbumPayloadDTO;
import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.payload.album.AlbumViewDTO;
import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.services.AccountService;
import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.services.AlbumService;
import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.services.PhotoService;
import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.util.AppUtils.AppUtil;
import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.util.constants.AlbumError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/v1")
@Tag(name = "Album Controller", description = "Controller for album and photo management")
@Slf4j
public class AlbumController {

    static final String PHOTOS_FOLDER_NAME = "photos";
    static final String THUMBNAIL_FOLDER_NAME = "thumbnails";
    static final int THUMBNAIL_WIDTH = 300;


    @Autowired
    private AccountService accountService;

    @Autowired
    private AlbumService albumService;

    @Autowired
    private PhotoService photoService;

    @PostMapping(value = "/albums/add", consumes = "application/json", produces = "application/json")
    @ApiResponse(responseCode = "201", description = "Album added")
    @ApiResponse(responseCode = "400", description = "Please add valid name and description")
    @Operation(summary = "Add an album")
    @SecurityRequirement(name = "springboot-demo-api")
    public ResponseEntity<AlbumViewDTO> addAlbum(@Valid @RequestBody AlbumPayloadDTO albumPayloadDTO,
            Authentication authentication) {
        try {
            Album album = new Album();
            album.setName(albumPayloadDTO.getName());
            album.setDescription(albumPayloadDTO.getDescription());
            String email = authentication.getName();
            Optional<Account> optionalAccount = accountService.findByEmail(email);
            Account account = optionalAccount.get();
            album.setAccount(account);
            album = albumService.save(album);
            AlbumViewDTO albumViewDTO = new AlbumViewDTO(album.getId(), album.getName(), album.getDescription());
            return ResponseEntity.ok(albumViewDTO);
        } catch (Exception e) {
            log.error(AlbumError.ADD_ALBUM_ERROR.toString() + ": " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping(value = "/albums", produces = "application/json")
    @ApiResponse(responseCode = "200", description = "List of albums")
    @ApiResponse(responseCode = "401", description = "Token missing")
    @ApiResponse(responseCode = "403", description = "Token error")
    @Operation(summary = "List album api")
    @SecurityRequirement(name = "springboot-demo-api")
    public List<AlbumViewDTO> albums(Authentication authentication) {
        String email = authentication.getName();
        Optional<Account> optionalAccount = accountService.findByEmail(email);
        Account account = optionalAccount.get();
        List<AlbumViewDTO> albums = new ArrayList<>();
        for (Album album : albumService.findByAccount_id(account.getId())) {
            albums.add(new AlbumViewDTO(album.getId(), album.getName(), album.getDescription()));
        }
        return albums;
    }

    @PostMapping(value = "/albums/{album_id}/upload-photos", consumes = { "multipart/form-data" })
    @ApiResponse(responseCode = "400", description = "Please check payload or token")
    @Operation(summary = "Upload photo into album")
    @SecurityRequirement(name = "springboot-demo-api")
    public ResponseEntity<List<HashMap<String, List<String>>>> photos(@RequestPart(required = true) MultipartFile[] files, @PathVariable long album_id,
            Authentication authentication) {
        String email = authentication.getName();
        Optional<Account> optionalAccount = accountService.findByEmail(email);
        Account account = optionalAccount.get();
        Optional<Album> optionalAlbum = albumService.findById(album_id);
        Album album;
        if (optionalAlbum.isPresent()) {
            album = optionalAlbum.get();
            if (account.getId() != album.getAccount().getId()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        List<String> fileNamesWithSuccess = new ArrayList<>();
        List<String> fileNamesWithError = new ArrayList<>();

        Arrays.asList(files).forEach(file -> {
            String contentType = file.getContentType();
            if (contentType.equals("image/png") ||
                    contentType.equals("image/jpg") ||
                    contentType.equals("image/jpeg")) {

                fileNamesWithSuccess.add(file.getOriginalFilename());

                int length = 10;
                boolean useLetters = true;
                boolean useNumbers = true;

                try {
                    String fileName = file.getOriginalFilename();
                    String generatedString = RandomStringUtils.secure().next(length, useLetters, useNumbers);
                    String final_photo_name = generatedString.concat(fileName);
                    String absoluteFileLocation = AppUtil.get_photo_upload_path(final_photo_name, PHOTOS_FOLDER_NAME, album_id);
                    Path path = Paths.get(absoluteFileLocation);
                    Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
                    Photo photo = new Photo();
                    photo.setName(fileName);
                    photo.setFileName(final_photo_name);
                    photo.setOriginalFileName(fileName);
                    photo.setAlbum(album);
                    photoService.save(photo);

                    BufferedImage thumbImage = AppUtil.getThumbnail(file, THUMBNAIL_WIDTH);
                    File thumbnail_location = new File(AppUtil.get_photo_upload_path(fileName, THUMBNAIL_FOLDER_NAME, album_id));
                    ImageIO.write(thumbImage, file.getContentType().split("/")[1], thumbnail_location);
                } catch (Exception e) {
                    log.debug(AlbumError.PHOTO_UPLOAD_ERROR.toString()+": "+e.getMessage());
                    fileNamesWithError.add(file.getOriginalFilename());
                }
            } else {
                fileNamesWithError.add(file.getOriginalFilename());
            }
        }

        );

        HashMap<String, List<String>> result = new HashMap<>();
        result.put("SUCCESS", fileNamesWithSuccess);
        result.put("ERRORS", fileNamesWithError);

        List<HashMap<String, List<String>>> response = new ArrayList<>();
        response.add(result);

        return ResponseEntity.ok(response);
    }
}
