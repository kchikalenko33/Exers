package code_mu.level9;

import java.util.Arrays;
import java.util.function.IntFunction;

public class Task7 {
    public static void main(String[] args) {
        /*byte[] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };*/
        String[] arr = {"123", "456", "789"};
        byte[][] resArr = Arrays.stream(arr)
                .map(str ->/* Arrays.stream(str.split(""))
                        .mapToInt(s -> Integer.parseInt(s)).toArray())*/
                {
                    byte[] tempArr = new byte[str.length()];
                    for (int i = 0; i < tempArr.length; i++) tempArr[i] = Byte.parseByte(str.charAt(i) + "");
                    return tempArr;
                })
                .toArray(x -> new byte[x][]);


        System.out.println(Arrays.deepToString(resArr));
    }
}
