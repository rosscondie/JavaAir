import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("John Travolta", "Captain", "JA2023");
    }

    @Test
    public void pilotHasName() {
        assertEquals("John Travolta", pilot.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void pilotHasPilotLicenceNumber() {
        assertEquals("JA2023", pilot.getPilotLicenceNumber());
    }

    @Test
    public void pilotCanFlyPlane() {
        assertEquals("I can fly the plane, trust me!", pilot.pilotCanFly());
    }
}
