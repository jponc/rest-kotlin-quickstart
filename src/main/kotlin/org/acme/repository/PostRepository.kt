package org.acme.repository

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import org.acme.entity.Post

interface PostRepository : PanacheRepository<Post> {
    fun findByTitle(title: String): List<Post>
}
