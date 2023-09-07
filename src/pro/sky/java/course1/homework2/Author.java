package pro.sky.java.course1.homework2;

import java.util.Objects;

public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    @Override
    public String toString() {
        return  authorName + " " + authorSurname;
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author comparable = (Author) other;
        return authorName.equals(comparable.getAuthorName()) && authorSurname.equals(comparable.getAuthorSurname());
    }
}
