package training.enums;

import java.awt.event.PaintEvent;
import java.util.Set;

public enum UserRole {
    ADMIN("Администратор", 5, Set.of("create_user", "delete_user", "edit_any_content", "manage_roles")),
    MODERATOR("Модератор", 4, Set.of("edit_post", "ban_user", "approve_comments")),
    EDITOR("Редактор", 3, Set.of("create_post", "edit_own_content", "schedule_post")),
    USER("Пользователь", 2, Set.of("comment", "like_post", "update_profile")),
    GUEST("Гость", 1, Set.of("view_content", "read_articles"));

    private final String displayName;
    private final int priorityLevel;
    private final Set<String> permissions;

    UserRole(String displayName, int priorityLevel, Set<String> permissions) {
        this.displayName = displayName;
        this.priorityLevel = priorityLevel;
        this.permissions = permissions;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public Set<String> getPermissions() {
        return permissions;
    }

    public boolean hasPermission(String permission) {
        return permissions.contains(permission);
    }

    public boolean canManage(UserRole otherRole) {
        return this.priorityLevel > otherRole.getPriorityLevel();
    }

    public String describe() {
        return "Роль: " + this.getDisplayName() + " (приоритет: " + this.getPriorityLevel()
                + ") \nРазрешения: " + this.getPermissions();
    }

    public static void main(String[] args) {
        UserRole[] userRoles = {ADMIN, MODERATOR, EDITOR, USER, GUEST};
        UserRole maxPriorityRole = null;

        for (UserRole role : userRoles) {
            System.out.println(role.describe());
            System.out.println(role.hasPermission("comment"));
            System.out.println(role.canManage(UserRole.USER));
            System.out.println();

            if(maxPriorityRole == null || maxPriorityRole.getPriorityLevel() < role.getPriorityLevel()) {
                maxPriorityRole = role;
            }

        }

        if (maxPriorityRole != null) {
            System.out.println("Роль с максимальным приоритетом: " + maxPriorityRole.getDisplayName());
        } else {
            System.out.println("Список ролей пуст.");
        }
    }
}
