package nz.denys.restservice.service;

import nz.denys.restservice.dao.FlightDaoImpl;
import nz.denys.restservice.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightDaoImpl flightDao;

    @Override
    public List<Flight> getFlights() {
        List<nz.denys.restservice.tables.pojos.Flight> flights = flightDao.findAll();
        List<Flight> resultFlights = new ArrayList();
        for (nz.denys.restservice.tables.pojos.Flight flight : flights) {
            Flight resultFlight = new Flight();
            resultFlight.setName(flight.getFlightName());
            resultFlight.setDeparture(flight.getDeparture());
            resultFlights.add(resultFlight);
        }
        return resultFlights;
    }

    @Override
    public Flight findFlightById(Integer id) {
        return null;
    }
}
