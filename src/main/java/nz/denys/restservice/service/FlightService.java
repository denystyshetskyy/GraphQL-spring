package nz.denys.restservice.service;

import nz.denys.restservice.model.Flight;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FlightService {
    List<Flight> getFlights();

    Flight findFlightById(Integer id);
}
