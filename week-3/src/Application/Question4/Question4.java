package Application.Question4;

import Application.Question3.Question3;
import Domain.Question.Question;

public class Question4  {
    private int cans;
    private int tokens;

    public Question4(){
        this.cans = 0;
        this.tokens = 0;
    }

    public Question4(int cans){
        this.cans = cans;
        this.tokens = 0;
    }

    public void fillCans(int cans) {
        this.cans += cans;
    }

    public void insertToken() throws Exception {
        this.tokens += 1;

        if (this.cans > 0){
            --this.cans;
            return;
        }

        throw new Exception("Not enough cans");
    }

    public void returnToken(){
        if(tokens > 0){
            this.tokens -= 1;
        }
    }

    public int getCans() {
        return cans;
    }

    public int getTokens() {
        return tokens;
    }
}
