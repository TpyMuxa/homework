package libraryReference;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public String toString() {

        return this.firstName + " " + this.lastName;
    }

    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        if (this == other) {
            return true;
        }
        Author a2 = (Author) other;
        return a2.firstName.equals(firstName) && a2.lastName.equals(lastName);
    }

    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }
}