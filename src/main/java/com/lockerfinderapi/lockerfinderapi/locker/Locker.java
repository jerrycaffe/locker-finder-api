package com.lockerfinderapi.lockerfinderapi.locker;

public class Locker {
//    id, name, description, city, state, country, quantity,
    private Long id;
    private String description;
    private String city;
    private String state;
    private String country;
    private int quantity;

    public Locker(){

    }

    @Override
    public String toString() {
        return "Locker{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public Locker(String description, String city, String state, String country, int quantity) {
        this.description = description;
        this.city = city;
        this.state = state;
        this.country = country;
        this.quantity = quantity;
    }

    public Locker(Long id, String description, String city, String state, String country, int quantity) {
        this.id = id;
        this.description = description;
        this.city = city;
        this.state = state;
        this.country = country;
        this.quantity = quantity;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
