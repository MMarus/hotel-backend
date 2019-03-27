package eu.mmarusic.hotel.backend.data;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

import static javax.persistence.CascadeType.REMOVE;

/**
 * Created by Marek Marusic <mmarusic@redhat.com> on 3/24/18.
 */
@Entity
public class Service  extends PanacheEntity {
    public String name = "";

    public String description = "";

    public int price;

    @ManyToMany(mappedBy="services", cascade = REMOVE)
    public List<Reservation> reservations;

}
