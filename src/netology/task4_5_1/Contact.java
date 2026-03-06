package netology.task4_5_1;

public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private GroupContact group;

    public Contact(String firstName, String lastName, String phone, GroupContact group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public GroupContact getGroup() {
        return group;
    }

    public void setGroup(GroupContact group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", group=" + group +
                '}';
    }
}
