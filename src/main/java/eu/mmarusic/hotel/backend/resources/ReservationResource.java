package eu.mmarusic.hotel.backend.resources;

import eu.mmarusic.hotel.backend.data.Reservation;
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
@Path("reservations")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class ReservationResource {

    @GET
    public List<Reservation> get() {
        return Reservation.listAll(Sort.by("dateCreated"));
    }

}
