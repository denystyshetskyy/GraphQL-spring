/**
 * This class is generated by jOOQ
 */
package nz.denys.restservice.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Flight implements Serializable {

	private static final long serialVersionUID = -939248463;

	private Long      id;
	private String    flightName;
	private Timestamp departure;

	public Flight() {}

	public Flight(Flight value) {
		this.id = value.id;
		this.flightName = value.flightName;
		this.departure = value.departure;
	}

	public Flight(
		Long      id,
		String    flightName,
		Timestamp departure
	) {
		this.id = id;
		this.flightName = flightName;
		this.departure = departure;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightName() {
		return this.flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public Timestamp getDeparture() {
		return this.departure;
	}

	public void setDeparture(Timestamp departure) {
		this.departure = departure;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Flight (");

		sb.append(id);
		sb.append(", ").append(flightName);
		sb.append(", ").append(departure);

		sb.append(")");
		return sb.toString();
	}
}
