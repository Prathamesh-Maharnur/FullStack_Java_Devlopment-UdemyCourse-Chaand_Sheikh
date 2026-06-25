package org.maharnur.prathamesh.S47L03_BuildList_AlbumAPI.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.maharnur.prathamesh.S47L03_BuildList_AlbumAPI.model.Account;
import org.maharnur.prathamesh.S47L03_BuildList_AlbumAPI.model.Album;
import org.maharnur.prathamesh.S47L03_BuildList_AlbumAPI.payload.album.AlbumPayloadDTO;
import org.maharnur.prathamesh.S47L03_BuildList_AlbumAPI.payload.album.AlbumViewDTO;
import org.maharnur.prathamesh.S47L03_BuildList_AlbumAPI.services.AccountService;
import org.maharnur.prathamesh.S47L03_BuildList_AlbumAPI.services.AlbumService;
import org.maharnur.prathamesh.S47L03_BuildList_AlbumAPI.util.constants.AlbumError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/v1/album")
@Tag(name = "Album Controller", description = "Controller for album and photo management")
@Slf4j
public class AlbumController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AlbumService albumService;

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
    public List<AlbumViewDTO> albums(Authentication authentication){
        String email = authentication.getName();
        Optional<Account> optionalAccount = accountService.findByEmail(email);
        Account account = optionalAccount.get();
        List<AlbumViewDTO> albums = new ArrayList<>();
        for(Album album: albumService.findByAccount_id(account.getId())){
            albums.add(new AlbumViewDTO(album.getId(), album.getName(), album.getDescription()));
        }
        return albums;
    }

}
