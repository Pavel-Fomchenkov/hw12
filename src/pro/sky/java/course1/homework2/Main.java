package pro.sky.java.course1.homework2;

public class Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Book masterAndMargarita = new Book("Мастер и Маргарита", bulgakov, 1966);
        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevsky, 1865);
        crimeAndPunishment.setPublishingYear(1866);

        System.out.println(masterAndMargarita);
        System.out.println(crimeAndPunishment);

        // following code for testing purposes only
        Author mikhailBulgakov = new Author("Михаил", "Булгаков");
        Book crime_and_punishment = new Book("Преступление и наказание", dostoevsky, 1866);
        System.out.println(bulgakov.equals(mikhailBulgakov));
        System.out.println(bulgakov.equals(dostoevsky));
        System.out.println(crime_and_punishment.equals(crimeAndPunishment));
        System.out.println(masterAndMargarita.equals(crimeAndPunishment));
        System.out.println(bulgakov.hashCode());
        System.out.println(mikhailBulgakov.hashCode());
        System.out.println(dostoevsky.hashCode());
        System.out.println(masterAndMargarita.hashCode());
        System.out.println(crimeAndPunishment.hashCode());
        System.out.println(crime_and_punishment.hashCode());
/*        Author noname = null;
        System.out.println(noname.hashCode());*/
        // testing block ended
    }
}
