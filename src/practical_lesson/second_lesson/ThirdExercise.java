package practical_lesson.second_lesson;

public class ThirdExercise {
    public static void main(String[] args) {
        int lightSpeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = lightSpeed * seconds;

        System.out.println(distance);
    }
}
