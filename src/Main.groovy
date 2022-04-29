class Main {

    public static void main(String[] args) {
        int gameChoice = userInput("Press 1 to play 501 and 2 to play Bob's 27 and 3 to play a match of 501: ")
        switch (gameChoice){
            case 1:
                playFiveZeroOne()
                break;
            case 2:
                playBobs27()
                break;
            case 3:
                playMatch501()
                break
            default:
                println "Please enter a valid game choice"
        }
    }

    static void playFiveZeroOne(){
        FiveZeroOne game501 = new FiveZeroOne()
        while (!game501.legComplete()) {
            int score = userInput("Please enter your score: ")
            game501.removeScore(score)
        }
        int inputDarts = userInput("Please enter the number of doubles: ")
        game501.dartsAtDouble(inputDarts)
    }

    static void playBobs27() {
        BobsTwentySeven B27 = new BobsTwentySeven()
        while (!B27.isGameOver()) {
            if (B27.isOnBull()) {
                int doubles = userInput("Please enter how many Bulls you have hit: ")
                B27.getBullInputB27(doubles)
                B27.gameWinB27()
            } else {
                int doubles = userInput("Please enter the number of double $B27.aimingDouble hit: ")
                B27.userInputB27(doubles)
            }
        }
    }
    static void playMatch501(){
        String player1Name = getName("Please enter the name of player one: ")
        Match501 player1 = new Match501(player1Name)
        String player2Name = getName("Please enter the name of player two: ")
        Match501 player2 = new Match501(player2Name)
        while (!player1.legCompleteMatch() && !player2.legCompleteMatch()) {
            int score = userInput("$player1Name please enter your score: ")
            player1.removeScoreMatch(score)
            if(!player1.legCompleteMatch()){
                int player2Score = userInput("$player2Name please enter your score: ")
                player2.removeScoreMatch(player2Score)
            }
        }
        if(player1.legCompleteMatch()){
            println("$player1Name Wins")
            player1.resetLeg()
            player2.resetLeg()
        } else {
            println("$player2Name Wins")
            player1.resetLeg()
            player2.resetLeg()
        }
        println("$player1Name you have won $player1.legsWon")
        println("$player2Name  you have won $player2.legsWon")
        while (!player1.legCompleteMatch() && !player2.legCompleteMatch()) {
            int player2Score = userInput("$player2Name please enter your score: ")
            player2.removeScoreMatch(player2Score)
            if(!player2.legCompleteMatch()){
                int score = userInput("$player1Name please enter your score: ")
                player1.removeScoreMatch(score)
            }
        }
        if(player1.legsWon === 2){
            println "$player1Name Wins"
        } else if(player2.legsWon === 2){
            println "$player2Name Wins"
        } else {
            player1.resetLeg()
            player2.resetLeg()
            println("$player1Name you have won $player1.legsWon")
            println("$player2Name  you have won $player2.legsWon")
            while (player1.legsWon != 2 && player2.legsWon != 2) {
                int score = userInput("$player1Name please enter your score: ")
                player1.removeScoreMatch(score)
                if (!player1.legCompleteMatch()) {
                    int player2Score = userInput("$player2Name please enter your score: ")
                    player2.removeScoreMatch(player2Score)
                }
            }
            if(player1.legsWon === 2){
                println "$player1Name Wins"
            } else {
                println "$player2Name Wins"
            }
        }
        println "Final score is $player1Name $player1.legsWon and $player2Name $player2.legsWon"
    }
    static int userInput(String message){
        println message
        try {
            def userScore =System.in.newReader().readLine()
            return userScore as int
        } catch (Exception error){
            println error.getMessage()
            userInput("Please enter a valid score: ")
        }
    }

    static String getName(String message){
        println message
        try {
            def name = System.in.newReader().readLine()
        } catch (Exception err){
            println err.getMessage()
            getName("Please enter a valid name: ")
        }
    }
}
