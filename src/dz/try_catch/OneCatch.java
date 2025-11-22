package dz.try_catch;

public class OneCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            arr[10] = 15;
            String s = null;
            s.charAt(0);
            Object x = "42";
            Integer i = (Integer) x;
        } catch (Exception e) {
            System.out.println("Любая проверяемая ошибка: " + e.getClass().getSimpleName());
        }

    }
}
