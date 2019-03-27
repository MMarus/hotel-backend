package eu.mmarusic.hotel.backend.data.enums;

/**
 * Created by Marek Marusic <mmarusic@redhat.com> on 3/25/18.
 */
public enum Role {

    ADMIN,
    CUSTOMER,
    EMPLOYEE;

    // We can use constants in @RolesAllowed annotations
    public static final String ALLOW_ADMIN = "ADMIN";
    public static final String ALLOW_CUSTOMER = "CUSTOMER";
    public static final String ALLOW_EMPLOYEE = "EMPLOYEE";
}
