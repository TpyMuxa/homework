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
        return "Автор: " + this.firstName + " " + this.lastName;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        return firstName.equals(a2.firstName) && lastName.equals(a2.lastName);
    }

    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }
}