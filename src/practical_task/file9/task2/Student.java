package practical_task.file9.task2;

import java.time.Year;

public class Student extends Human{
    private String recordBookNumber;
    private String faculty;

    public Student(String firstName, String lastName, String recordBookNumber, String faculty) {
        super(firstName, lastName);
        setRecordBookNumber(recordBookNumber);
        setFaculty(faculty);
    }

    public String calculateFacultyNumber () {
        int yearOfPost = Integer.parseInt(recordBookNumber.substring(0,4));
        String lastDigitsNumberGroup = recordBookNumber.substring(5,7);
        int currentYear = Year.now().getValue();
        String numberGroup = currentYear - yearOfPost + lastDigitsNumberGroup;
        return faculty + "-" + numberGroup;
    }

    public String getRecordBookNumber() {
        return recordBookNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "recordBookNumber='" + recordBookNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    public void setRecordBookNumber(String recordBookNumber) {
        if (recordBookNumber == null || !recordBookNumber.matches("\\d{4}-\\d{2}-.*")) {
            throw new IllegalArgumentException("Invalid record book number!");
        }
        this.recordBookNumber = recordBookNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        if (faculty.length() != 3 || !faculty.matches("[A-Za-zА-Яа-я]{3}")) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: faculty");
        }
        this.faculty = faculty;
    }
}
