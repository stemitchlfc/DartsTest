class BobsTwentySeven {

    private int startingScore = 27
    private int currentScore
    private int aimingDouble
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

    int userInputB27(int doubles) {
                if (this.isScoreValid(doubles)) {
                    if (doubles === 0) {
                        this.currentScore -= this.aimingDouble * 2
                        if (this.isGameOver()) {
                            println "Game Over"
                            //System.exit(0)
                        }
                        println "Your current score is $currentScore"
                    } else {
                        this.currentScore += (this.aimingDouble * 2) * doubles
                        println "Your current score is $currentScore"
                    }
                    aimingDouble++
                    return doubles
                }
    }

    boolean isScoreValid(int doubles){
        if(doubles <= 3){
            return true
        }
        println "Score is not valid"
        return false
    }

    boolean isGameOver(){
        if(this.currentScore<=0){
            return true
        }
        return false
    }

    boolean isOnBull(){
        if(aimingDouble > 20){
            return true
        }
        return false
    }

    int getBullInputB27(int doubles){
        if(doubles === 0){
            this.currentScore -= 50
        } else {
            this.currentScore += (doubles * 50)
        }
        return currentScore

    }
    String gameWinB27(){
        println"You Won! Winning score is $currentScore"
        System.exit(0)
    }



}