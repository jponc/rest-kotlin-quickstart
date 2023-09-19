package org.acme

import javax.sql.DataSource
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.inject.Inject
import jakarta.transaction.Transactional
import java.sql.Connection

import org.acme.repository.PostRepository
import org.acme.entity.Post

@Path("/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
class PostResource {
    @Inject
    lateinit var postRepository: PostRepository

    @GET
    fun getAllPosts(): List<Post> {
        return postRepository.listAll()
    }

    @GET
    @Path("/{id}")
    fun getPost(@PathParam("id") id: Long): Post? {
        println("id: $id")
        return postRepository.findById(id)
    }

    @POST
    fun createPost(post: Post): Post {
        postRepository.persist(post)
        return post
    }
}
