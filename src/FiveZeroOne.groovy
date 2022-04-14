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

    public FiveZeroOne(){
        this.remainingScore = startingScore
        //this.startingScore = startingScore
    }
    public int getStartingScore(){
        return startingScore
    }

    public String removeScore(String inputScore){
        try{

            println "Your score is: $inputScore"
            int score = inputScore as int
            if (this.isValidScore(score)) {
                this.remainingScore = this.remainingScore - score
                dartsThrown+3
                dartsCounter++
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
            this.finalDarts = this.dartsThrown + finishingDarts
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
        return this.finalDarts = this.dartsThrown + this.finishingDarts
    }

    int addDoubleToTotal(){
        this.getDartsThrown()
        int this.finishingDarts = this.inputDarts as int

    }

















//static void main(String[] args){
//        def startingScore = 501
//        def remainingScore
//        println "Your starting score is $startingScore"
//        println "Please enter your score: "
//
//
//        def inputScore = System.in.newReader().readLine()
//        //int score = System.in.newReader().read()
//        println "Your score is: $inputScore"
//        int score = inputScore as int
////        if (validScore() == true){
////
////        }
//
//        remainingScore = startingScore - score
//        println "Your remaining score is $remainingScore"
//
//
//        //println "Your name is ${System.in.newReader().readLine()}"
//
//    }
//
////    boolean validScore(score, startingScore, remainingScore){
////        if(score>startingScore && score<remainingScore && score<=180){
////            return false
////        } else {
////            return true
////        }
}