public class Pilot extends CabinCrewMember {

    private String pilotLicenceNumber;

    public Pilot(String name, String rank, String pilotLicenceNumber) {
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public String pilotCanFly() {
        return "I can fly the plane, trust me!";
    }
}
