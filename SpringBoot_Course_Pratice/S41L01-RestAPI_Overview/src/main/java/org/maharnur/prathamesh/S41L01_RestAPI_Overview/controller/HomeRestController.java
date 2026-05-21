package org.maharnur.prathamesh.S41L01_RestAPI_Overview.controller;

import java.util.List;

import org.maharnur.prathamesh.S41L01_RestAPI_Overview.models.Post;
import org.maharnur.prathamesh.S41L01_RestAPI_Overview.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeRestController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public List<Post> home(){
        return postService.findAll();
    }

}
