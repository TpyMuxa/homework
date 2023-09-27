package libraryReference;

public class Main {
    public static void main(String[] args) {
        Author firstBook = new Author("Лев", "Толстой");
        Author secondBook = new Author("Стивен", "Кинг");
        Book one = new Book("Война и мир", firstBook, 1867);
        Book two = new Book("Оно", secondBook, 1986);
        one.setYearOfBookPublication(1873);
        System.out.println("Имя книги: " + one.getName() + "\n" + "Автор: " + firstBook.getFirstName() + " " +
                firstBook.getLastName() + "\n" + "Год издания: " + one.getYearOfBookPublication());
        System.out.println("\nИмя книги: " + two.getName() + "\n" + "Автор: " + secondBook.getFirstName() + " " +
                secondBook.getLastName() + "\n" + "Год издания: " + two.getYearOfBookPublication());
    }
}
