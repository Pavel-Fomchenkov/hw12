package pro.sky.java.course1.homework1;

public class First {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Book masterAndMargarita = new Book("Мастер и Маргарита", bulgakov, 1966);
        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevsky, 1866);

        masterAndMargarita.info(); // добавил немного от себя
        crimeAndPunishment.info();
    }
}
