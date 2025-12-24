package practical_task.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        List<Integer> train = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] wagons = reader.readLine().split("\\s+");
        int limit = Integer.parseInt(reader.readLine());

        for (int i = 0; i < wagons.length; i++) {
            int temp = Integer.parseInt(wagons[i]);
            if (temp <= limit) {
                train.add(temp);
            } else {
                train.add(limit);
            }
        }

        while (true) {
            String input = reader.readLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            } else if (input.startsWith("add")) {
                int passengers = Integer.parseInt(input.split(" ")[1]);
                train.add(Math.min(passengers, limit));
            } else {
                int passengers = Integer.parseInt(input);
                for (int i = 0; i < train.size(); i++) {
                    int freeSlots = limit - train.get(i);
                    if(freeSlots >= passengers) {
                        train.set(i, train.get(i) + passengers);
                        break;
                    }
                }
            }
        }

        for (int passengersInWagon : train) {
            System.out.println(passengersInWagon + " ");
        }
    }
}
