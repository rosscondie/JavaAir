import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    ArrayList<Pilot> pilots;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    ArrayList<Passenger> passengers;
    Plane plane;

    @Before
    public void before() {
        pilots = new ArrayList<>();
        pilots.add(new Pilot("John Travolta", "Captain", "CC2023"));
        pilots.add(new Pilot("Ameila Earhart", "Co-Pilot", "CC1932"));

        cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(new CabinCrewMember("Sheila Skyes", "Flight Attendant"));
        cabinCrewMembers.add(new CabinCrewMember("Jeffrey Skyes", "First Officer"));
        cabinCrewMembers.add(new CabinCrewMember("Julie Fair", "Flight Attendant"));

        passengers = new ArrayList<>();
        plane = new Plane(PlaneType.AIRBUSA320);


        flight = new Flight(pilots, cabinCrewMembers, passengers, plane, "FR1234", "EDI", "HAM", "15:30"  );
    }

    @Test
    public void flightHasAtLeastOnePilot() {
        assertEquals(2, flight.getNumberOfPilots());
    }

    @Test
    public void flightHasAListOfCabinCrewMembers() {
        assertEquals(3, flight.getNumberOfCabinCrew());
    }

    @Test
    public void flightStartsWithAnEmptyListOfPassengers() {
        assertEquals(0, flight.getPassengers());
    }

    @Test
    public void flightHasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void flightHasFlightNumber() {
        assertEquals("FR1234", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("EDI", flight.getFlightDestination());
    }

    @Test
    public void flightHasDepartureAirport() {
        assertEquals("HAM", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals("15:30", flight.getDepartureTime());
    }

    @Test
    public void flightCanReturnNumberOfAvailableSeats() {
        assertEquals(5, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void flightCanBookPassengerIfSeatsAvailable() {
        flight.addPassenger(new Passenger("Harvey Specter", 2));
        assertEquals(1, flight.getPassengers());
    }

    @Test
    public void flightCannotBookPassengerIfNoSeatsAvailable() {
        flight.addPassenger(new Passenger("Harvey Specter", 2));
        flight.addPassenger(new Passenger("Mike Ross", 2));
        flight.addPassenger(new Passenger("Louis Litt", 2));
        flight.addPassenger(new Passenger("Donna Paulsen", 2));
        flight.addPassenger(new Passenger("Robert Zane", 2));
        flight.addPassenger(new Passenger("Jessica Pearson", 2));
        assertEquals(5, flight.getPassengers());
    }

    @Test
    public void pilotShouldBeAbleToFlyThePlane() {
        assertEquals("I can fly the plane, trust me!", flight.pilotCanFly());
    }
}
