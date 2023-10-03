package libraryReference;

public class Main {
    public static void main(String[] args) {
        Author firstBook = new Author("Лев", "Толстой");
        Author secondBook = new Author("Стивен", "Кинг");
        Book one = new Book("Война и мир", firstBook, 1867);
        Book two = new Book("Оно", secondBook, 1986);
        one.setYearOfBookPublication(1873);
        System.out.println(one.toString() + "\n\n" + two.toString());

        Author threeBook = new Author("Лев", "Толстой");
        Book three = new Book("Война и мир", threeBook, 1873);

        System.out.println(firstBook.equals(threeBook));
        System.out.println(one.equals(three));
        System.out.println(one.hashCode() + "\n" + three.hashCode());
    }
}
