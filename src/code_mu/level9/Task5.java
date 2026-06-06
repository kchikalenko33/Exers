package code_mu.level9;

public class Task5 {
    public static void main(String[] args) {
        String url = "http://test.com/dir1/dir2/dir3/page.html";
        String[] name = url.split("/");

        System.out.println(name[name.length - 1]);
    }
}
