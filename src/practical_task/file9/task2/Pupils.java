package practical_task.file9.task2;

public class Pupils extends Human {
    private int classNumber;
    private boolean gender;

    public Pupils(String firstName, String lastName, int classNumber, boolean gender) {
        super(firstName, lastName);
        this.classNumber = classNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        String genderText = gender ? "boy" : "girl";
        return "Pupils{" +
                "classNumber=" + classNumber +
                ", gender=" + gender +
                '}';
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        if (classNumber < 1 || classNumber > 11) {
            throw new IllegalArgumentException("Invalid class number!");
        }
        this.classNumber = classNumber;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
