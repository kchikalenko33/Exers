package sber.dz3_part1.task4;

public class TimeUnit {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeUnit(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeUnit(int hours, int minutes) {
        this(hours,minutes,0);
    }

    public TimeUnit(int hours) {
        this(hours,0,0);
    }

    private void validate(int h, int m, int s) {
        if (h < 0 || h > 23) {
            throw new IllegalArgumentException("Часы должны быть в диапазоне 0–23");
        }
        if (m < 0 || m > 59) {
            throw new IllegalArgumentException("Минуты должны быть в диапазоне 0–59");
        }
        if (s < 0 || s > 59) {
            throw new IllegalArgumentException("Секунды должны быть в диапазоне 0–59");
        }
    }

    public void print24() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

    public void print12() {
        int h12 = hours % 12;
        if (h12 == 0) {
            h12 = 12;
        }
        String ampm = (hours < 12) ? "am" : "pm";
        System.out.printf("%02d:%02d:%02d %s%n", h12, minutes, seconds, ampm);
    }

    public void add(int addHours, int addMinutes, int addSeconds) {
        if (addHours < 0 || addMinutes < 0 || addSeconds < 0) {
            throw new IllegalArgumentException("Нельзя прибавлять отрицательное время");
        }

        int totalSeconds = this.seconds + addSeconds;
        int extraMinutes = totalSeconds / 60;
        this.seconds = totalSeconds % 60;

        int totalMinutes = this.minutes + addMinutes + extraMinutes;
        int extraHours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;

        int totalHours = this.hours + addHours + extraHours;
        this.hours = totalHours % 24; // цикл по суткам
    }

    public static void main(String[] args) {
        TimeUnit t = new TimeUnit(23, 50, 30);
        t.print24();
        t.print12();

        t.add(0, 15, 40); // +15 мин 40 сек
        t.print24();
        t.print12();
    }
}
