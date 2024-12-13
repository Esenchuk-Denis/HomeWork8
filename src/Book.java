import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int publicationYear;

    public Book(String nameBook, Author author, int publicationYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getNameBook() {

        return nameBook;
    }

    public Author getAuthor() {

        return author;
    }

    public int getPublicationYear() {

        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {

        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Книга: " + nameBook + ", Автор: " + author.toString() + ", Год публикации: " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author)&& Objects.equals(publicationYear, book.publicationYear);
    }


    @Override
    public int hashCode() {
        return java.util.Objects.hash( nameBook.hashCode() + author.hashCode() + publicationYear);
    }
}
