package org.acme

import javax.sql.DataSource
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.inject.Inject
import java.sql.Connection

@Path("/posts")
class PostResource {
    @Inject
    lateinit var dataSource: DataSource


    @GET
    fun getData(): String {
        // Use the dataSource to interact with the database
        val connection: Connection = dataSource.connection
        // Perform database operations here...
        return "Data from PostgreSQL"
    }
}
