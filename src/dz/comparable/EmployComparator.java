package dz.comparable;

import java.util.Comparator;

public class EmployComparator implements Comparator<Employ> {
    @Override
    public int compare(Employ t1, Employ t2) {
        return t1.getDepartment().compareTo(t2.getDepartment());
    }
}
