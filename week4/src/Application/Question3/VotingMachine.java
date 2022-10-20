package week4.src.Application.Question3;

import java.util.Random;

public class VotingMachine {
    private int labour;
    private int conservative;


    public VotingMachine() {
        clearState();
    }

    /**
     * Clear the state of the variables by assignment to 0
     */
    public void clearState() {
        labour = 0;
        conservative = 0;
    }

    /**
     * Add a vote for the labour party
     */
    public void voteLabour() {
        labour++;
    }

    /**
     * Add a vote (rigged) for the conservative party
     */
    public void voteConservative() {
        Random random = new Random();
        conservative += random.nextInt(5);
    }

    public int getLabour() {
        return labour;
    }

    public int getConservative() {
        return conservative;
    }
}
