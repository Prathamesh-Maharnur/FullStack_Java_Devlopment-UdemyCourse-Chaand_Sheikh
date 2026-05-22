package org.maharnur.prathamesh.S43L02_SpringBoot4_Section_WrapUp.controller;

import java.util.List;

import org.maharnur.prathamesh.S43L02_SpringBoot4_Section_WrapUp.models.Post;
import org.maharnur.prathamesh.S43L02_SpringBoot4_Section_WrapUp.services.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeRestController {

    @Autowired
    private PostService postService;

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public List<Post> home(){
        logger.error("This is a test error log");
        return postService.findAll();
    }

}
