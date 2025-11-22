package dz.try_catch;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[3] = 42;
            String s = null;
            s.length();
            int n = Integer.parseInt("abc");
        } catch (IllegalArgumentException i) {
        } catch (RuntimeException e) {
            System.out.println("Произошла ошибка: " + e.getClass().getSimpleName());

        }
    }
}
