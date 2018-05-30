package pl.mpas.microbloge_course.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.mpas.microbloge_course.model.UserPost;

public class PostController {

    @GetMapping("/add-new-post")
    public String addNewPost(UserPost newPost) {
//        throw new IllegalStateException("Not implemented");
        return "";
    }

    @GetMapping("/edit-user-post")
    public String editPost(UserPost userPost, Model model) {
        model.addAttribute("header", userPost.getPostHeader());
        model.addAttribute("note", userPost.getNote());
        return "post_form";
    }
}
