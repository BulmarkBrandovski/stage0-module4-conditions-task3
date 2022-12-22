package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month >= 13 || month <= 0) {
            System.out.println("wrong number!");
        } else if (month <= 2 || month == 11) {
            System.out.println("Winter");
        } else if (month <= 5) {
            System.out.println("Spring");
        } else if (month <= 8) {
            System.out.println("Summer");
        } else  {
            System.out.println("Autumn");
        }
    }
}
