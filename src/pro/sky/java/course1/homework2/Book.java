package pro.sky.java.course1.homework2;

import java.util.Objects;

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

    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return author + " \"" + name + "\" " + publishingYear + " год";
    }
    @Override
    public int hashCode() {
        return Objects.hash( name, author, publishingYear);
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book comparable = (Book) other;
        return author.equals(comparable.getAuthor()) && name.equals(comparable.getName()) && publishingYear == comparable.getPublishingYear();
    }
}
