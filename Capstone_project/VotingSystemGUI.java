import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

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

public class VotingSystemGUI extends JFrame {
    private java.util.List<Voter> voters;
    private java.util.List<Candidate> candidates;
    private final String voterFile = "voters.dat";
    private final String candidateFile = "candidates.dat";

    public VotingSystemGUI() {
        setTitle("Smart Voting System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        loadVoters();
        loadCandidates();

        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Smart Voting System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(0, 102, 204));
        titlePanel.add(titleLabel);
        titlePanel.setBorder(new EmptyBorder(20, 10, 10, 10));

        JPanel buttonPanel = new JPanel(new GridLayout(7, 1, 10, 10));
        JButton registerVoterBtn = new JButton("Register Voter");
        JButton registerCandidateBtn = new JButton("Register Candidate");
        JButton voteBtn = new JButton("Cast Vote");
        JButton viewResultsBtn = new JButton("View Results");
        JButton viewVotersBtn = new JButton("View Voters");
        JButton viewCandidatesBtn = new JButton("View Candidates");
        JButton exitBtn = new JButton("Exit");
        exitBtn.setPreferredSize(new Dimension(60, 25));

        buttonPanel.add(registerVoterBtn);
        buttonPanel.add(registerCandidateBtn);
        buttonPanel.add(voteBtn);
        buttonPanel.add(viewResultsBtn);
        buttonPanel.add(viewVotersBtn);
        buttonPanel.add(viewCandidatesBtn);
        buttonPanel.add(exitBtn);

        registerVoterBtn.addActionListener(e -> registerVoter());
        registerCandidateBtn.addActionListener(e -> registerCandidate());
        voteBtn.addActionListener(e -> castVote());
        viewResultsBtn.addActionListener(e -> showResults());
        viewVotersBtn.addActionListener(e -> showVoterDetails());
        viewCandidatesBtn.addActionListener(e -> showCandidateDetails());
        exitBtn.addActionListener(e -> System.exit(0));

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(buttonPanel, BorderLayout.CENTER);
        centerPanel.setBorder(new EmptyBorder(10, 50, 10, 50));

        add(titlePanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void registerVoter() {
        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField constituencyField = new JTextField();
        Object[] fields = {
                "Voter ID:", idField,
                "Name:", nameField,
                "Constituency:", constituencyField
        };
        int result = JOptionPane.showConfirmDialog(this, fields, "Register Voter", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            Voter v = new Voter(idField.getText().trim(), nameField.getText().trim(), constituencyField.getText().trim());
            voters.add(v);
            saveVoters();
            JOptionPane.showMessageDialog(this, "Voter registered successfully!");
        }
    }

    private void registerCandidate() {
        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField constituencyField = new JTextField();
        JTextField partyField = new JTextField();
        Object[] fields = {
                "Candidate ID:", idField,
                "Name:", nameField,
                "Constituency:", constituencyField,
                "Party Name:", partyField
        };
        int result = JOptionPane.showConfirmDialog(this, fields, "Register Candidate", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            Candidate c = new Candidate(idField.getText().trim(), nameField.getText().trim(), constituencyField.getText().trim(), partyField.getText().trim());
            candidates.add(c);
            saveCandidates();
            JOptionPane.showMessageDialog(this, "Candidate registered successfully!");
        }
    }

    private void castVote() {
        String voterId = JOptionPane.showInputDialog(this, "Enter Voter ID:");
        Voter v = findVoter(voterId);
        if (v == null) {
            JOptionPane.showMessageDialog(this, "Voter not found!");
            return;
        }
        if (v.hasVoted) {
            JOptionPane.showMessageDialog(this, "You have already voted!");
            return;
        }

        java.util.List<Candidate> localCandidates = new ArrayList<>();
        for (Candidate c : candidates) {
            if (c.constituency.equalsIgnoreCase(v.constituency)) {
                localCandidates.add(c);
            }
        }

        if (localCandidates.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No candidates available for your constituency!");
            return;
        }

        java.util.List<String> candidateNames = new ArrayList<>();
        for (Candidate c : localCandidates) {
            candidateNames.add(c.name + " (" + c.partyName + ")");
        }
        candidateNames.add("NOTA (None of the Above)");

        String selected = (String) JOptionPane.showInputDialog(this, "Choose Candidate:", "Voting",
                JOptionPane.PLAIN_MESSAGE, null, candidateNames.toArray(), candidateNames.get(0));

        if (selected != null) {
            if (selected.contains("NOTA")) {
                Candidate nota = findCandidateById("NOTA-" + v.constituency);
                if (nota == null) {
                    nota = new Candidate("NOTA-" + v.constituency, "NOTA", v.constituency, "None");
                    candidates.add(nota);
                }
                nota.voteCount++;
            } else {
                for (Candidate c : localCandidates) {
                    if (selected.contains(c.name)) {
                        c.voteCount++;
                        break;
                    }
                }
            }
            v.hasVoted = true;
            saveVoters();
            saveCandidates();
            JOptionPane.showMessageDialog(this, "Vote cast successfully!");
        }
    }

    private void showResults() {
        StringBuilder result = new StringBuilder("Election Results:\n\n");
        for (Candidate c : candidates) {
            result.append(c.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(this, result.toString());
    }

    private void showVoterDetails() {
        StringBuilder details = new StringBuilder("Voter Details:\n\n");
        for (Voter v : voters) {
            details.append(v.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(this, details.toString());
    }

    private void showCandidateDetails() {
        StringBuilder details = new StringBuilder("Candidate Details:\n\n");
        for (Candidate c : candidates) {
            details.append(c.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(this, details.toString());
    }

    private Voter findVoter(String id) {
        return voters.stream().filter(v -> v.voterId.equals(id)).findFirst().orElse(null);
    }

    private Candidate findCandidateById(String id) {
        return candidates.stream().filter(c -> c.candidateId.equals(id)).findFirst().orElse(null);
    }

    private void loadVoters() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(voterFile))) {
            voters = (ArrayList<Voter>) ois.readObject();
        } catch (Exception e) {
            voters = new ArrayList<>();
        }
    }

    private void saveVoters() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(voterFile))) {
            oos.writeObject(voters);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadCandidates() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(candidateFile))) {
            candidates = (ArrayList<Candidate>) ois.readObject();
        } catch (Exception e) {
            candidates = new ArrayList<>();
        }
    }

    private void saveCandidates() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(candidateFile))) {
            oos.writeObject(candidates);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VotingSystemGUI::new);
    }
}
