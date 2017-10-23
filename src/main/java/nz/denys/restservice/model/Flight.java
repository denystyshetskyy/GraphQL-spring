package nz.denys.restservice.model;

import graphql.annotations.GraphQLType;

import java.sql.Timestamp;

@GraphQLType
public class Flight {
    private String name;
    private String destination;
    private Timestamp departure;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Timestamp getDeparture() {
        return departure;
    }

    public void setDeparture(Timestamp departure) {
        this.departure = departure;
    }
}
