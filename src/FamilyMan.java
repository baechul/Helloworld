
public class FamilyMan extends Person {

    // another instance variable only for this sub class.
    int numOfBaby;

    public FamilyMan(String fName, String lName) {
        super(fName, lName);
    }

    public FamilyMan(String fName, String lName, int babies) {
        super(fName, lName);
        numOfBaby = babies;
    }

    public int getNumerOfBabies() {
        return numOfBaby;
    }
}
