package netology.task4_5_3;

public class Book {
    private String author;
    private String name;
    private int year;
    private String genre;

    public Book(String author, String name, int year, String genre) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }
}
