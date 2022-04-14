class BobsTwentySeven {

    private int startingScore = 27
    private int currentScore
    private int aimingDouble
    private int doublesHit
    private int doubles


    public BobsTwentySeven() {
        this.aimingDouble = 1
        this.currentScore = startingScore
    }

    int getCurrentScore() {
        this.currentScore
    }

    int getAimingDouble() {
        this.aimingDouble
    }

    int getUserInput(String userInput) {
        try {
            int doublesHit = userInput as int
            if (this.isScoreValid(doublesHit)) {
                return doublesHit
            }
        } catch (Exception err) {
            println err.getMessage()
        }
    }

    public boolean isScoreValid(int doublesHit){
        if(doublesHit <= 3){
            println "Score is valid"
            return true
        }
        println "Score is not valid"
        return false
    }

}