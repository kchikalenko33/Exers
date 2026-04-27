package netology.task4_4_2;

import java.util.Comparator;

public class CandidateComparator implements Comparator<Candidate> {
    @Override
    public int compare(Candidate o1, Candidate o2) {
        int rel = Integer.compare(o2.getRelevance(), o1.getRelevance());
        if (rel == 0) {
            rel = Integer.compare(o2.getRating(), o1.getRating());
            if (rel == 0) {
                rel = o2.getFullName().compareTo(o1.getFullName());
            }
        }

        return rel;
    }
}
