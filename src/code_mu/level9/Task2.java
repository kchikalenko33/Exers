package code_mu.level9;

public class Task2 {
    public static void main(String[] args) {
        String url = "http://test.com/dir1/dir2/dir3/page.html";

        String[] domen = url.split("/");

        System.out.println(domen[2]);
    }
}
