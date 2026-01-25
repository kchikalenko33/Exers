package practical_task.file13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       String str = "search gg j";
       int index = str.lastIndexOf(' ');
       String str1 = str.substring(0, index);
       String str2 = str.substring(index + 1);

        System.out.println(str1.equalsIgnoreCase("search"));
        System.out.println("search".equalsIgnoreCase(str1));
    }
}
