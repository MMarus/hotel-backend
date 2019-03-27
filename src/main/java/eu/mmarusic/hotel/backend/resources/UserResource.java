package eu.mmarusic.hotel.backend.resources;

import eu.mmarusic.hotel.backend.data.Userr;
import io.quarkus.panache.common.Sort;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * Created by Marek Marusic <mmarusic@redhat.com> on 3/8/19.
 */
@Path("users")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class UserResource {

    @GET
    public List<Userr> get() {
        return Userr.listAll(Sort.by("surname"));
    }


}
