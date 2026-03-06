package netology.task3_4_2;

import netology.task3_4_2.event.Event;
import netology.task3_4_2.event.Movie;
import netology.task3_4_2.event.Theatre;

public class Main {
    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Интерстеллар", 2014, 12),
                new Movie("Тёмный рыцарь", 2008, 16),
                new Movie("Помни", 2000, 18),
                new Movie("Престиж", 2006, 14),
                new Movie("Матрица", 1999, 16),
                new Movie("Бегущий по лезвию 2049", 2017, 15),
                new Movie("Облачный атлас", 2012, 17),
                new Movie("Донни Дарко", 2001, 13),
                new Movie("12 обезьян", 1995, 14),
                new Movie("Эквилибриум", 2002, 15)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Гамлет", 2019, 18),
                new Theatre("Ревизор", 2020, 14),
                new Theatre("Три сестры", 2018, 16),
                new Theatre("Вишнёвый сад", 2021, 15),
                new Theatre("Ромео и Джульетта", 2016, 17),
                new Theatre("Горе от ума", 2022, 14),
                new Theatre("На дне", 2015, 18),
                new Theatre("Чайка", 2019, 16),
                new Theatre("Король Лир", 2023, 17),
                new Theatre("Женитьба", 2018, 13)
        };
    }

    public static void validEvent(Event event) {
        if (event.getTitle().isEmpty()) {
            throw new RuntimeException("заголовок не заполнен");
        }

        if (event.getAge() == 0) {
            throw new RuntimeException("возраст == 0");
        }

        if (event.getReleaseYear() == 0) {
            throw new RuntimeException("Не верный год");
        }
    }


}
