package eu.mmarusic.hotel.backend.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import eu.mmarusic.hotel.backend.data.enums.Role;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by Marek Marusic <mmarusic@redhat.com> on 3/8/19.
 */
@Entity
public class Userr extends PanacheEntity {
    public String firstname;
    public String surname;
    public String personalId;
    public String email;
    public String phone;
    public boolean active = true;

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    public Date birthDate;

    //secure fields
    @JsonIgnore
    public @NotNull String password;

    //secure fields
    @JsonIgnore
    public String authToken;

    //secure fields
    @Enumerated(EnumType.STRING)
    public Role role = Role.CUSTOMER;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, orphanRemoval = true)
    public List<Reservation> reservationsOrdered;

    @OneToMany(mappedBy = "creator", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, orphanRemoval = true)
    public List<Reservation> reservationsCreated;
}
