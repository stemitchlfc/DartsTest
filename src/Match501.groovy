class Match501 {

    private int startingScore = 501
    private int currentScore
    private int legsWon = 0
    private int score
    private int finishingDarts
    private int dartsThrown
    private int dartsCounter
    private int finalDarts
    private int counter = 0
    private String inputScore
    private String inputDarts
    private String name

    public  Match501(String name){
        this.currentScore = startingScore
        this.inputScore = inputScore
        this.inputDarts = inputDarts
        this.legsWon = legsWon
        this.name = name
    }

    public int getStartingScoreMatch(){
        return this.startingScore
    }

    int getCurrentScoreMatch(){
        println "$name, your score is $currentScore"

        return this.currentScore
    }

    int getLegsWon(){
        return this.legsWon
    }

    String removeScoreMatch(int score){
            if(this.isScoreValid(score)){
                if (isFinishAvailable()) {
                    println "$name is on a finish, remaining score is $currentScore"
                }
                this.counter += 3
                this.currentScore -= score
                this.getCurrentScoreMatch()
                if(this.legCompleteMatch()){
                    this.legsWon++
                }
            } else {
                println "Invalid Score"
                return "Invalid Score"
            }
        return score
        }

    public boolean isScoreValid(int score){
        if(score < 181 && score <= this.currentScore){
            return true
        }
        return false
    }

    boolean isFinishAvailable(){
        if(this.currentScore<=170 && this.currentScore != 169 && this.currentScore != 168
                && this.currentScore != 166 && this.currentScore != 165 && this.currentScore != 163
                && this.currentScore != 162 && this.currentScore != 159){
            return true
        }
        return false
    }

    boolean legCompleteMatch(){
        if(this.currentScore === 0){
            return true
        }
        return false
    }

    String dartsAtDoubleMatch(int inputDarts){
        if (this.isDoubleValidMatch(inputDarts)) {
            this.counter += inputDarts
            println "Your total darts thrown is $counter"
            return inputDarts
        }
        println "Invalid Score"
        return "Invalid Score"
    }

    boolean isDoubleValidMatch(int finishingDarts){
        if(finishingDarts <= 3){
            return true
        }
        return false
    }

    int getDartsThrownMatch(){
        return this.counter
    }

    int totalDartsAtLegMatch(){
        return this.counter
    }

    int resetLeg(){
        this.currentScore = startingScore
    }

}