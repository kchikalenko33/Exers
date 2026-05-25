package record.example2;

public record User(String username, String password) {
    public User {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Имя не должно быть пустым");
        }
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Пароль не может быть менее 6 символов");
        }
    }
}
