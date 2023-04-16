import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Sheila Skye", "Flight Attendant");
    }

    @Test
    public void cabinCrewMemberHasName() {
        assertEquals("Sheila Skye", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasRank() {
        assertEquals("Flight Attendant", cabinCrewMember.getRank());
    }

    @Test
    public void cabinCrewMemberCanRelayMessageToPassengers() {
        assertEquals("Please fasten your seatbelts", cabinCrewMember.relayMessage());
    }
}
