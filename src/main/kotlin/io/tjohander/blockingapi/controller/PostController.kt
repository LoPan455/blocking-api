package io.tjohander.blockingapi.controller

import io.tjohander.blockingapi.model.Post
import io.tjohander.blockingapi.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("posts")
class PostController(
    @Autowired private val postService: PostService
) {

    @RequestMapping("/")
    fun getPosts(): List<Post>? =
        postService.getPosts()

}