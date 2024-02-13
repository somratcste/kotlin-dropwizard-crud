package dropwizard.kotlin.example.resource

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Path("/hello-world")
class HelloWorldResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun default(): Response {
        val jsonObject = mapOf(
                "message" to "This is an example JSON object",
                "status" to "success"
        )
        return Response.ok().entity(jsonObject).build();
    }
}