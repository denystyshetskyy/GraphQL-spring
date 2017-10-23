package nz.denys.restservice.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import nz.denys.restservice.model.Flight;
import nz.denys.restservice.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private FlightService flightService;

    public List<Flight> allFlights() {
        return flightService.getFlights();
    }
}
