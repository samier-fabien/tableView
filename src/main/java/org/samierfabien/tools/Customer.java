package org.samierfabien.tools;

public class Customer {
    private String firstName;
    private String lastName;
    private String city;

    /**
     * Initialise firstName, lastName et city avec les String passés en paramètres.
     * @param firstName
     * @param lastName
     * @param city
     */
    public Customer(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
