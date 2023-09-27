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
}
