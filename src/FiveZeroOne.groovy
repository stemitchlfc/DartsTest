import org.junit.After
import org.junit.Before

class FiveZeroOne {

    private int startingScore = 501
    private int remainingScore
    private int tempCounter = 0
    private String inputScore
    private String inputDarts
    private int enteredScore

    FiveZeroOne() {
        this.remainingScore = startingScore
    }

    int getStartingScore() {
        return startingScore
    }

    void inputScore(int enteredScore) {
        this.removeScore(enteredScore)
    }

    String removeScore(int score) {
        if (this.isValidScore(score)) {
            this.remainingScore = this.remainingScore - score
            this.tempCounter += 3
            this.getCurrentScore()
            if (isOnFinish()) {
                println "You are on a finish, remaining score is $remainingScore"
            }
            return inputScore
        }


        println "Invalid Score"
        return "Invalid Score"
    }


    boolean isValidScore(int score) {
        if (score >= 0 && score <= 180 && score <= this.remainingScore) {
            return true
        }
        return false
    }

    int getCurrentScore() {
        println "Your remaining score is $remainingScore"
        return this.remainingScore
    }

    boolean isOnFinish() {
        if (this.remainingScore <= 170 && this.remainingScore != 169 && this.remainingScore != 168
                && this.remainingScore != 166 && this.remainingScore != 165 && this.remainingScore != 163
                && this.remainingScore != 162 && this.remainingScore != 159) {
            return true
        }
        return false
    }

    boolean legComplete() {
        if (this.remainingScore === 0) {
            println "Leg Complete"
            return true
        }
        return false
    }

    int getDartsThrown() {
        this.tempCounter
    }

    String dartsAtDouble(int inputDarts) {
        println "Your darts at a double are: $inputDarts"
        if (this.isDoubleValid(inputDarts)) {
            this.tempCounter += inputDarts - 3
            println "Your total darts thrown is $tempCounter"
            return this.tempCounter
        }
        println "Invalid Score"
        return "Invalid Score"
    }

    boolean isDoubleValid(inputDarts) {
        if (inputDarts <= 3) {
            return true
        }
        return false
    }

    int totalDartsForLeg() {
        println this.tempCounter
        return this.tempCounter
    }


}