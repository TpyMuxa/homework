package libraryReference;

public class Book {
    private String name;
    private Author publisher;
    private int yearOfBookPublication;

    public Book(String name, Author publisher, int yearOfBookPublication) {
        this.name = name;
        this.publisher = publisher;
        this.yearOfBookPublication = yearOfBookPublication;
    }

    public String getName() {

        return this.name;
    }

    public int getYearOfBookPublication() {
        return this.yearOfBookPublication;
    }

    public void setYearOfBookPublication(int yearOfBookPublication) {
        this.yearOfBookPublication = yearOfBookPublication;

    }

    public Author getPublisher() {
        return this.publisher;
    }

    public String toString() {
        return "Имя книги: " + this.name + "\n" + getPublisher().toString() + "\n" + "Год издания: " +
                this.yearOfBookPublication;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return name.equals(b2.name) && publisher.equals(b2.publisher) && yearOfBookPublication == b2.yearOfBookPublication;
    }

    public int hashCode() {
        return java.util.Objects.hash(name, publisher, yearOfBookPublication);
    }
}
