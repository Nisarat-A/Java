package com.nisar;

public class Main {
    private static int highScore;

    public static void main(String[] args) {
        /**
         * Why method's better
         * 1.make sure code is duplicated
         * 2.easier to maintain
         */
        boolean gameOver = true;
        int score = 1500;
        String name = "Gawin" ;
        int highScore = calculateScore(gameOver, score);
        System.out.println("Your final score was" + highScore);
        int position = calculateHighScorePosition(highScore);
        displayScorePosition(name,position);

        name="Win";
        score = 900;

        highScore = calculateScore(gameOver, score);
        System.out.println("Your final score was" + highScore);
        position =  calculateHighScorePosition(highScore);
        displayScorePosition(name,position);

        name="Bright";
        score = 400;

        highScore = calculateScore(gameOver, score);
        System.out.println("Your final score was" + highScore);
        position =  calculateHighScorePosition(highScore);
        displayScorePosition(name,position);

        name="NuNew";
        score = 50;

        highScore = calculateScore(gameOver, score);
        System.out.println("Your final score was" + highScore);
        position =  calculateHighScorePosition(highScore);
        displayScorePosition(name,position);

        /**
         * Create a method called "displayHighScorePosition"
         * it should a plauers name as a parameter, and a 2nd parameter as a position in the high score table
         * You should display name along with a message like "managed to get into position" and the\
         * position they got  and a furthur massege " on the high score table".
         *
         * Create a 2nd method called calculateHighScorePosition
         * it should be sent one argument only, the player score
         * it should be return an int
         * the return data should be
         *1 if score is>1000
         * 2 if score is >500 and<1000
         * 3 if the score is >100 and <500
         * 4 in all other cases
         * call both method and display the results of the following
         * a score 1500 900 400 50
         */

    }

    public static int calculateScore(boolean gameOver, int score) {

        if (gameOver) {
            int finalScore = score ;
            return finalScore;
        }
        return -1;
    }

    public static int calculateHighScorePosition(int highScore){
    /*if (HighScore>=1000){
        return 1;
    } else if (HighScore>=500 ) {
        return 2;
    } else if (HighScore>=100 ) {
        return 3;
    }return 4;*/
        int position=4;
        if (highScore>=1000){
            position=1;
        }else if (highScore>=500){
            position=2;
        } else if (highScore>=100); {
            position=3;
        }
        return position;
    }

    public static void displayScorePosition(String names,int position){
        System.out.println(names+" managed to get into position "+position+" on the high score table");
    }
}
        