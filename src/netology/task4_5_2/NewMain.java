package netology.task4_5_2;

import java.nio.file.Path;

public class NewMain {
    public static void main(String[] args) {
        Service service = new Service();
        Path pathUsers = Path.of("src/netology/task4_5_2/users.db");
        Path pathLogs = Path.of("src/netology/task4_5_2/server.log");

        service.readUsers(pathUsers);
        service.readLogs(pathLogs);
        String ip = service.findMaxCount();
        long id = service.getIdByIp(ip);
        System.out.println(service.getUserById(id));
    }
}
