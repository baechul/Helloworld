/**
 *
 */
public class Person {

    // instance variables
    String firstName;
    String lastName;

    // constructor: Called when this class is instantiated.
    public Person(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    public Person(String fName) {
        firstName = fName;
        lastName = "Stone";
    }

    // default ctor.
    public Person() {
    }

    // methods: called as needed
    public String getName() {
        return lastName+", "+firstName;
    }
}
