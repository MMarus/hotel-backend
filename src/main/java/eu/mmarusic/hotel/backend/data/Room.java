package eu.mmarusic.hotel.backend.data;


import eu.mmarusic.hotel.backend.data.enums.RoomType;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Marek Marusic <mmarusic@redhat.com> on 3/24/18.
 */
@Entity
public class Room  extends PanacheEntity {
    public int size;

    public int capacity;

    public String description = "";

    public String name = "";

    public double price;

    @Enumerated(EnumType.STRING)
    public RoomType type;

    public String image = "";

    @OneToMany(mappedBy = "reservedRoom", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, orphanRemoval = true)
    public List<Reservation> reservations;
    
}
