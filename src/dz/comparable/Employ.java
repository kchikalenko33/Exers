package dz.comparable;

import dz.map.Employee;

import java.util.TreeSet;

public class Employ implements  Comparable<Employ> {
    private int id;
    private String name;
    private String department;

    public Employ(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employ e) {
        int result = this.name.compareTo(e.name);
        if (result == 0) {
            result = this.department.compareTo(e.department);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeSet<Employ> emp = new TreeSet<>(new EmployComparator());
        emp.add(new Employ(2, "имя2", "отдел2"));
        emp.add(new Employ(1, "имя", "я"));
        emp.add(new Employ(3, "имя3", "а"));

        System.out.println(emp);
    }
}
