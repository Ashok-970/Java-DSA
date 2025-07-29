import java.io.*;
import java.util.*;

class Voter implements Serializable {
    String voterId, name, constituency;
    boolean hasVoted;

    public Voter(String voterId, String name, String constituency) {
        this.voterId = voterId;
        this.name = name;
        this.constituency = constituency;
        this.hasVoted = false;
    }

    public String toString() {
        return "ID: " + voterId + ", Name: " + name + ", Constituency: " + constituency + ", Has Voted: " + hasVoted;
    }
}

class Candidate implements Serializable {
    String candidateId, name, constituency, partyName;
    int voteCount;

    public Candidate(String candidateId, String name, String constituency, String partyName) {
        this.candidateId = candidateId;
        this.name = name;
        this.constituency = constituency;
        this.partyName = partyName;
        this.voteCount = 0;
    }

    public String toString() {
        return "ID: " + candidateId + ", Name: " + name + ", Constituency: " + constituency + ", Party: " + partyName + ", Votes: " + voteCount;
    }
}

public class VotingSystemConsole {
    static List<Voter> voters = new ArrayList<>();
    static List<Candidate> candidates = new ArrayList<>();
    static final String VOTER_FILE = "voters.dat";
    static final String CANDIDATE_FILE = "candidates.dat";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        loadData();
        while (true) {
            System.out.println("\n===== Smart Voting System =====");
            System.out.println("1. Register Voter");
            System.out.println("2. Register Candidate");
            System.out.println("3. Cast Vote");
            System.out.println("4. View Voters");
            System.out.println("5. View Candidates");
            System.out.println("6. View Results");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> registerVoter();
                case 2 -> registerCandidate();
                case 3 -> castVote();
                case 4 -> viewVoters();
                case 5 -> viewCandidates();
                case 6 -> viewResults();
                case 7 -> {
                    saveData();
                    System.out.println("Thank you for using the voting system!");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    static void registerVoter() {
        System.out.print("Enter Voter ID: ");
        String id = sc.nextLine().trim();
        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter Constituency: ");
        String constituency = sc.nextLine().trim();
        voters.add(new Voter(id, name, constituency));
        saveData();
        System.out.println("Voter registered successfully.");
    }

    static void registerCandidate() {
        System.out.print("Enter Candidate ID: ");
        String id = sc.nextLine().trim();
        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter Constituency: ");
        String constituency = sc.nextLine().trim();
        System.out.print("Enter Party Name: ");
        String party = sc.nextLine().trim();
        candidates.add(new Candidate(id, name, constituency, party));
        saveData();
        System.out.println("Candidate registered successfully.");
    }

    static void castVote() {
        System.out.print("Enter Voter ID: ");
        String voterId = sc.nextLine().trim();
        Voter voter = voters.stream().filter(v -> v.voterId.equals(voterId)).findFirst().orElse(null);

        if (voter == null) {
            System.out.println("Voter not found.");
            return;
        }
        if (voter.hasVoted) {
            System.out.println("You have already voted.");
            return;
        }

        List<Candidate> localCandidates = new ArrayList<>();
        for (Candidate c : candidates) {
            if (c.constituency.equalsIgnoreCase(voter.constituency)) {
                localCandidates.add(c);
            }
        }

        if (localCandidates.isEmpty()) {
            System.out.println("No candidates available in your constituency.");
            return;
        }

        System.out.println("Choose a candidate to vote for:");
        int i = 1;
        for (Candidate c : localCandidates) {
            System.out.println(i++ + ". " + c.name + " (" + c.partyName + ")");
        }
        System.out.println(i + ". NOTA (None of the Above)");

        System.out.print("Your choice: ");
        int voteChoice = sc.nextInt();
        sc.nextLine();

        if (voteChoice >= 1 && voteChoice <= localCandidates.size()) {
            localCandidates.get(voteChoice - 1).voteCount++;
        } else if (voteChoice == i) {
            String notaId = "NOTA-" + voter.constituency;
            Candidate nota = candidates.stream()
                    .filter(c -> c.candidateId.equals(notaId))
                    .findFirst()
                    .orElseGet(() -> {
                        Candidate newNota = new Candidate(notaId, "NOTA", voter.constituency, "None");
                        candidates.add(newNota);
                        return newNota;
                    });
            nota.voteCount++;
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        voter.hasVoted = true;
        saveData();
        System.out.println("Vote cast successfully.");
    }

    static void viewVoters() {
        System.out.println("\n=== Voter Details ===");
        for (Voter v : voters) {
            System.out.println(v);
        }
    }

    static void viewCandidates() {
        System.out.println("\n=== Candidate Details ===");
        for (Candidate c : candidates) {
            System.out.println(c);
        }
    }

    static void viewResults() {
        System.out.println("\n=== Election Results ===");
        for (Candidate c : candidates) {
            System.out.printf("Name: %-15s | Party: %-10s | Constituency: %-10s | Votes: %d\n",
                    c.name, c.partyName, c.constituency, c.voteCount);
        }
    }

    static void saveData() {
        try (ObjectOutputStream outV = new ObjectOutputStream(new FileOutputStream(VOTER_FILE));
             ObjectOutputStream outC = new ObjectOutputStream(new FileOutputStream(CANDIDATE_FILE))) {
            outV.writeObject(voters);
            outC.writeObject(candidates);
        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    static void loadData() {
        try (ObjectInputStream inV = new ObjectInputStream(new FileInputStream(VOTER_FILE));
             ObjectInputStream inC = new ObjectInputStream(new FileInputStream(CANDIDATE_FILE))) {
            voters = (List<Voter>) inV.readObject();
            candidates = (List<Candidate>) inC.readObject();
        } catch (Exception e) {
            voters = new ArrayList<>();
            candidates = new ArrayList<>();
        }
    }
}
