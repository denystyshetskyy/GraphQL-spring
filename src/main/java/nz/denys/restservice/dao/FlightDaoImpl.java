package nz.denys.restservice.dao;

import nz.denys.restservice.Tables;
import nz.denys.restservice.tables.pojos.Flight;
import nz.denys.restservice.tables.records.FlightRecord;
import org.jooq.Configuration;
import org.jooq.Table;
import org.jooq.impl.DAOImpl;
import org.springframework.stereotype.Repository;

/**
 * Created by denys on 12/09/17.
 */
@Repository
public class FlightDaoImpl extends DAOImpl<FlightRecord, Flight, Long> {

    protected FlightDaoImpl(Configuration configuration) {
        super(Tables.FLIGHT, Flight.class, configuration);
    }

    @Override
    protected Long getId(Flight flight) {
        return null;
    }
}
