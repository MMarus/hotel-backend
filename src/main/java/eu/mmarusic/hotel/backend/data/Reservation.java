package eu.mmarusic.hotel.backend.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import eu.mmarusic.hotel.backend.data.enums.PaymentType;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Created by Marek Marusic <mmarusic@redhat.com> on 3/24/18.
 */
@Entity
public class Reservation extends PanacheEntity {
    @ManyToOne()
    public Userr customer;

    @ManyToOne()
    public Userr creator;

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    public Date dateCreated = new Date();

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    public Date dateFrom;

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    public Date dateTo;

    public boolean paid;

    @Enumerated(EnumType.STRING)
    public PaymentType paymentType;

    @ManyToOne()
    public Room reservedRoom;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="SERVICE_RESERVATION",
            joinColumns=@JoinColumn(name="RESERVATION_ID", referencedColumnName="ID"),
            inverseJoinColumns=@JoinColumn(name="SERVICE_ID", referencedColumnName="ID")
    )
    public List<Service> services;

}
