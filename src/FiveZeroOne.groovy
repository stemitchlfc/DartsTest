import org.junit.After
import org.junit.Before

class FiveZeroOne {

    private int startingScore = 501
    private int remainingScore
    private int score
    private int finishingDarts
    private int dartsThrown
    private int dartsCounter
    private int finalDarts
    private int tempCounter = 0
    private String inputScore
    private String inputDarts

    public FiveZeroOne(){
        this.remainingScore = startingScore
        this.inputScore = inputScore
        this.inputDarts = inputDarts
    }
    public int getStartingScore(){
        return startingScore
    }



    public String userInput(){
        println "Please enter your score: "
        def inputScore=System.in.newReader().readLine()
        this.inputScore = inputScore
        this.removeScore(this.inputScore)
    }

    public String removeScore(String inputScore){
        try{

            println "Your score is: $inputScore"
            int score = inputScore as int
            if (this.isValidScore(score)) {
                this.remainingScore = this.remainingScore - score
                this.tempCounter += 3
                this.getCurrentScore()
                if(legComplete()){
                    println "Please enter the number of darts at a double: "
                    def inputDarts = System.in.newReader().readLine()
                    this.inputDarts = inputDarts
                    this.dartsAtDouble(inputDarts)
                } else {
                    if(isOnFinish()){
                        println "You are on a finish, remaining score is $remainingScore"
                    }
                    this.userInput()
                }
                //println "The darts counter $dartsCounter"
                return inputScore
            }
                println "Invalid Score"
                return "Invalid Score"
        }
        catch (Exception error){
            println error.getMessage()
        }
    }

    public boolean isValidScore(int score){
        if(score < 181 && score <= this.remainingScore){
            return true
        }
        return false
    }

    public int getCurrentScore(){
        println remainingScore
        return this.remainingScore
    }

    public boolean isOnFinish(){
        if(this.remainingScore<=170 && this.remainingScore != 169 && this.remainingScore != 168
                && this.remainingScore != 166 && this.remainingScore != 165 && this.remainingScore != 163
                && this.remainingScore != 162 && this.remainingScore != 159){
            return true
        }
        return false
    }

    boolean legComplete(){
        if(this.remainingScore === 0){
            println "Leg Complete"
            return true
        }
        return false
    }

    int getDartsThrown(){
        this.dartsThrown = this.dartsCounter * 3
    }

    String dartsAtDouble(String inputDarts){
        println "Your darts at a double are: $inputDarts"
        int finishingDarts = inputDarts as int
        if (this.isDoubleValid(finishingDarts)) {
            this.tempCounter += finishingDarts
            //this.finalDarts = this.dartsThrown + finishingDarts
            return finishingDarts
        }
        println "Invalid Score"
        return "Invalid Score"
    }

    boolean isDoubleValid(finishingDarts){
        if(finishingDarts <= 3){
            return true
        }
        return false
    }

    int totalDartsForLeg(){
        println this.tempCounter
        return this.tempCounter
    }
}