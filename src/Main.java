public class Main {
    public static void main(String[] args) {
        // коноструктор автора
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Фёдор", "Достоевский");

        //конструктор книги
        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);


        System.out.println("Книга: " + book1.getNameBook() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год публикации: " + book1.getPublicationYear());
        System.out.println("Книга: " + book2.getNameBook() + ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Год публикации: " + book2.getPublicationYear());

        // изменение года
        book1.setPublicationYear(1873);
        System.out.println("Обновленный год публикации книги " + book1.getNameBook() + ": " + book1.getPublicationYear());
    }
}

