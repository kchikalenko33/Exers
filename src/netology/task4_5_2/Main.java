package netology.task4_5_2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> list = Files.readAllLines(Path.of("src/netology/task4_5_2/users.db"));
            Map<Long, User> users = new HashMap<>();
            Map<Long, Set<String>> userIps = new HashMap<>();

            for (int i = 1; i < list.size(); i++) {
                String[] line = list.get(i).split(";");
                String ip = line[0];
                long id = Long.parseLong(line[1]);
                String[] fio = line[2].split(" ");
                String lastName = fio[0];
                String firstName = fio[1];
                String middleName = fio[2];
                String address = line[3];
                users.put(id, new User(id, lastName, firstName, middleName, address));

                if (userIps.containsKey(id)) {
                    userIps.get(id).add(ip);
                } else {
                    userIps.put(id, new HashSet<>(Set.of(ip)));
                }
            }

            List<String> server = Files.readAllLines(Path.of("src/netology/task4_5_2/server.log"));
            Map<String, Integer> ips = new HashMap<>();

            for (int i = 0; i < server.size(); i++) {
                String ipServ = server.get(i).split(":")[0];
                ips.put(ipServ, ips.getOrDefault(ipServ, 0) + 1);
            }
            // найти Ip который встречяается чаще всего из ips (Map)
            // понять к какому id принадлежит ip из userIps
            // получить пользователя по id из user

            String ip = null;
            int count = 0;

            for (Map.Entry<String, Integer> entry : ips.entrySet()) { // найден Ip который встречяается чаще всего
                if (entry.getValue() > count) {
                    count = entry.getValue();
                    ip = entry.getKey();
                }
            }

            long id = 0;

            for (Map.Entry<Long, Set<String>> entry : userIps.entrySet()) { // найден id принадлежащий ip max
                if (entry.getValue().contains(ip)) {
                    id = entry.getKey();
                }
            }

            System.out.println(users.get(id));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
