package pro.sky.java.course1.homework1;

public class Book {
    private final String name;
    private final Author author;
    private int publishingYear;

    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public void info() {
        System.out.printf("Произведение: %s %s - \"%s\", впервые издано в %d году \n", this.author.getAuthorName(),
                this.author.getAuthorSurname(), this.name, this.publishingYear);
    }
}
