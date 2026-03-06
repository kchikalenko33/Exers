package netology.task3_4_2.event;

public abstract class Event {
    protected String title;
    protected int releaseYear;
    protected int age;

    public Event(String title, int releaseYear, int age) {
        this.title = title == null ? "" : title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", age=" + age +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }
}
