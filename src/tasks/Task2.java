package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> emails = List.of("user1@mail.com", "admin@yandex.ru", "user2@mail.com");

        System.out.println(getUniqueDomains(emails));

        List<String> res = emails.stream()
                .map(s -> s.substring(s.indexOf("@") + 1, s.length()))
                .distinct()
                .toList();

        System.out.println(res);
    }

   public static List<String> getUniqueDomains(List<String> emails) {

        List<String> res = new ArrayList();

        for (int i = 0; i < emails.size(); i++) {
            String email = emails.get(i).substring(emails.get(i).indexOf("@") + 1, emails.get(i).length());

            if (!res.contains(email)) {
                res.add(email);
            }
        }

        return res;

    }
}
