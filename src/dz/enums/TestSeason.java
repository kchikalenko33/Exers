package dz.enums;

public class TestSeason {
    public static void main(String[] args) {
        Season winter = Season.WINTER;

        System.out.println(winter.getName());
        System.out.println(winter.getDescription());
        System.out.println(winter.containsMonth(1));
        System.out.println(winter);

        Season[] all = Season.getAllSeasons();
        System.out.println(all.length);

        Season season = Season.byMonth(5);
        System.out.println(season);

        Season.printAllSeasons();


    }
}
