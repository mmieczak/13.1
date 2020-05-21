package data;

import java.util.Comparator;

public class CompetitiorNickComparator implements Comparator<Participant> {

    @Override
    public int compare(Participant o1, Participant o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
