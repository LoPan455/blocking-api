package io.tjohander.blockingapi.model

data class Post(
    val userId: Int = 0,
    val id: Int = 0,
    val title: String? = null,
    val body: String? = null,
)