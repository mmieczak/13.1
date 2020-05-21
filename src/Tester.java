import data.Competition;
import data.Participant;
import utils.Utilities;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tester {

    public static void main(String[] args) {

        Queue<Competition> competitions = new LinkedList<>();
        List<Participant> participantList = Utilities.registerParticipants();

        //System collecting historical events and results
        competitions.offer(new Competition("Chess Masters", "20200601", participantList));

        //Process from queue
        for (Competition competition : competitions) {
            System.out.println(competitions.poll());
        }
    }
}
