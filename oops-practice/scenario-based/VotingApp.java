import java.util.*;

// custom exception
class DuplicateVoteException extends Exception {
    public DuplicateVoteException(String msg) {
        super(msg);
    }
}

// voter class
class Voter {
    int id;
    String name;
    boolean voted;

    public Voter(int id, String name) {
        this.id = id;
        this.name = name;
        this.voted = false;
    }
}

// candidate class
class Candidate {
    int id;
    String name;
    int votes;

    public Candidate(int id, String name) {
        this.id = id;
        this.name = name;
        this.votes = 0;
    }
}

// abstraction
abstract class ElectionService {
    abstract void addVoter(Voter v);
    abstract void addCandidate(Candidate c);
    abstract void castVote(int vid, int cid) throws DuplicateVoteException;
    abstract void showResult();
}

// election implementation
class Election extends ElectionService {

    List<Voter> voters = new ArrayList<>();
    List<Candidate> candidates = new ArrayList<>();

    public void addVoter(Voter v) {
        voters.add(v);
    }

    public void addCandidate(Candidate c) {
        candidates.add(c);
    }

    private Voter findVoter(int vid) {
        for (Voter v : voters) {
            if (v.id == vid)
                return v;
        }
        return null;
    }

    private Candidate findCandidate(int cid) {
        for (Candidate c : candidates) {
            if (c.id == cid)
                return c;
        }
        return null;
    }

    public void castVote(int vid, int cid) throws DuplicateVoteException {
        Voter v = findVoter(vid);
        Candidate c = findCandidate(cid);

        if (v == null || c == null) {
            System.out.println("Invalid voter or candidate ID");
            return;
        }

        if (v.voted)
            throw new DuplicateVoteException("Voter already voted!");

        c.votes++;
        v.voted = true;
    }

    public void showResult() {
        System.out.println("\n---- Election Results ----");
        for (Candidate c : candidates) {
            System.out.println(c.name + " : " + c.votes + " votes");
        }
    }
}

// main class
public class VotingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ElectionService es = new Election();

        // input voters
        System.out.print("Enter number of voters: ");
        int vCount = sc.nextInt();

        for (int i = 0; i < vCount; i++) {
            System.out.print("Enter voter id and name: ");
            int id = sc.nextInt();
            String name = sc.next();
            es.addVoter(new Voter(id, name));
        }

        // input candidates
        System.out.print("Enter number of candidates: ");
        int cCount = sc.nextInt();

        for (int i = 0; i < cCount; i++) {
            System.out.print("Enter candidate id and name: ");
            int id = sc.nextInt();
            String name = sc.next();
            es.addCandidate(new Candidate(id, name));
        }

        // voting
        System.out.print("Enter number of votes: ");
        int votes = sc.nextInt();

        for (int i = 0; i < votes; i++) {
            try {
                System.out.print("Enter voterId and candidateId: ");
                int vid = sc.nextInt();
                int cid = sc.nextInt();
                es.castVote(vid, cid);
            } catch (DuplicateVoteException e) {
                System.out.println(e.getMessage());
            }
        }

        es.showResult();
        sc.close();
    }
}
