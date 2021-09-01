package io.tjohander.blockingapi

import io.tjohander.blockingapi.model.Post
import io.tjohander.blockingapi.service.PostService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BlockingApiApplication(
    @Autowired private val postService: PostService
) : CommandLineRunner {

    private val log = LoggerFactory.getLogger(BlockingApiApplication::class.java)

    override fun run(vararg args: String?) {
        log.info("Starting 'run'...")
        val posts: List<Post>? = postService.getPosts()
        posts?.map { log.info(it.toString()) }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(BlockingApiApplication::class.java, *args)
}