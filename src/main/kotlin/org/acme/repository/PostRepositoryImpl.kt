package org.acme.repository

import jakarta.enterprise.context.ApplicationScoped
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepositoryBase
import org.acme.entity.Post

@ApplicationScoped
class PostRepositoryImpl : PanacheRepositoryBase<Post, Long>, PostRepository {
    override fun findByTitle(title: String): List<Post> {
        return list("title", title)
    }
}
