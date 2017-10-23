package nz.denys.restservice.model;

import graphql.annotations.GraphQLField;
import graphql.annotations.GraphQLName;
import graphql.schema.DataFetchingEnvironment;
import nz.denys.restservice.service.FlightService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * Created by denys on 15/10/17.
 */
@GraphQLName("flight")
public class FlightQuery {

    @Autowired
    private static FlightService flightService;

    @GraphQLField
    public static Flight findFlight(final DataFetchingEnvironment env, @NotNull @GraphQLName("id") final String id) {
        final Optional<Flight> any = flightService.getFlights().stream().filter(flight -> flight.getName().equals(id)).findFirst();
        return any.orElse(null);
    }
}
