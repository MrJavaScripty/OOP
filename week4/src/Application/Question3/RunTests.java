package week4.src.Application.Question3;

public class RunTests {

    public static void main(String[] args) {
        VotingMachine votingMachine = new VotingMachine();

        votingMachine.voteLabour();
        votingMachine.voteLabour();
        votingMachine.voteConservative();
        votingMachine.voteConservative();
        votingMachine.voteConservative();
        votingMachine.voteConservative();

        System.out.println("Labour party votes:" + votingMachine.getLabour());
        System.out.println("Conservative party votes:" + votingMachine.getConservative());
    }
}
