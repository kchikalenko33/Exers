package practical_task.file13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Map<String[], String> book = new TreeMap<String[], String>(new Comparator<String[]>() {
                @Override
                public int compare(String[] a, String[] b) {
                    int genderCompareResult = a[0].compareTo(b[0]);
                    if (genderCompareResult != 0) return genderCompareResult;
                    return a[1].compareTo(b[1]);
                }
            });

            while (true) {
                String input = reader.readLine().trim();

                if (input.equalsIgnoreCase("stop")) break;

                String lowerInput = input.toLowerCase();
                if (lowerInput.startsWith("search ")) {
                    String searchText = lowerInput.substring(7).trim();
                    List<String> contacts = new ArrayList<>();
                    for (Map.Entry<String[], String> e : book.entrySet()) {
                        if (e.getKey()[1].toLowerCase().indexOf(searchText) >= 0) { //e.getKey()[1].toLowerCase().indexOf(searchText) >= 0
                            contacts.add(e.getValue() + " - " + e.getKey()[1] + ", " + e.getKey()[0]);
                        }
                    }
                    if (contacts.isEmpty()) {
                        System.out.println("no phones");
                    } else {
                        Collections.sort(contacts, new Comparator<String>() {
                            @Override
                            public int compare(String s1, String s2) {
                                return s1.compareToIgnoreCase(s2);
                            }
                        });
                        for (String contact : contacts) {
                            System.out.println(contact);
                        }
                    }
                    continue;
                }

                if (lowerInput.equals("boys") || lowerInput.equals("girls")) {
                    String needGender = lowerInput.equals("boys") ? "m" : "w";
                    List<String> contacts = new ArrayList<>();
                    for (Map.Entry<String[], String> e : book.entrySet()) {
                        if (e.getKey()[0].equals(needGender)) {
                            contacts.add(e.getValue() + " - " + e.getKey()[1]);
                        }
                    }
                    if (contacts.isEmpty()) {
                        System.out.println("no phones");
                    } else {
                        for (String contact : contacts) {
                            System.out.println(contact);
                        }
                    }
                    continue;
                }

                String[] parts = input.split(", ", 3);
                if (parts.length == 3) {
                    String[] key = {parts[0], parts[1]};
                    book.put(key, parts[2]);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
