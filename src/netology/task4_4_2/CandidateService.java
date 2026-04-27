package netology.task4_4_2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CandidateService {
    private Set<Candidate> candidates = new TreeSet<>(new CandidateComparator());

    public boolean add(Candidate candidate) {
        return candidates.add(candidate);
    }

    public void print() {
        Iterator<Candidate> candidateIterator = candidates.iterator();

        while (candidateIterator.hasNext()) {
            System.out.println(candidateIterator.next());
        }
    }
}
