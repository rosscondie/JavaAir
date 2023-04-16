import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
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
    public void flightHasFlightNumber() {
        assertEquals("FR1234", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("EDI", flight.getFlightDestination());
    }
}
