package utils;

import data.CompetitiorNickComparator;
import data.CompetitorNameComparator;
import data.CompetitorResultComparator;
import data.Participant;

import java.util.*;

public class Utilities {

    public static List<Participant> registerParticipants() {
        List<Participant> participantList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Give details for another participant (or type: stop)");
                String[] userData = scanner.nextLine().split(" ");
                boolean stopDecision = Arrays.asList(userData).contains("stop");
                if (stopDecision) {
                    runSortAction(participantList, scanner);
                    break;
                }
                String name = userData[0] + " " + userData[1];
                String nick = userData[2];
                int result = Integer.parseInt(userData[3]);
                participantList.add(new Participant(name, nick, result));
            } catch (RuntimeException ex) {
                System.out.println("Wrong input data format, try again using such format:  Name Surname Nick Points ");
            }
        }
        while (true);
        return participantList;
    }

    private static void runSortAction(List<Participant> participantList, Scanner scanner) {
        if (participantList.size() != 0) {
            System.out.println("SORTING ORDER");
            System.out.println("A.Points -> Nick -> Name");
            System.out.println("B.Points -> Name -> Nick");
            System.out.println("C.Nick -> Points -> Name");
            System.out.print("Choose your preferred sorting order A/B/C: ");
            switch (scanner.nextLine().toUpperCase()) {
                case "A" -> Collections.sort(participantList, Comparator.comparing(Participant::getResult).thenComparing(Participant::getNick).thenComparing(Participant::getName).reversed());
                case "B" -> Collections.sort(participantList, Comparator.comparing(Participant::getResult).thenComparing(Participant::getName).thenComparing(Participant::getNick));
                case "C" -> Collections.sort(participantList, new CompetitiorNickComparator().thenComparing(new CompetitorResultComparator().reversed()).thenComparing(new CompetitorNameComparator()));
                default -> System.out.println("No sorting");
            }
        }
    }
}
