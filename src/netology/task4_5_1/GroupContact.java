package netology.task4_5_1;

public enum GroupContact {
    JOB("Работа"),
    FRIENDS("Друзья"),
    FAMILY("Семья");
    private final String groupName;

    GroupContact(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
}
