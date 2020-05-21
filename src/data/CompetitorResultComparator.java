package data;

import java.util.Comparator;

public class CompetitorResultComparator implements Comparator<Participant> {
    @Override
    public int compare(Participant o1, Participant o2) {
        return Integer.compare(o1.getResult(), o2.getResult());
    }
}
