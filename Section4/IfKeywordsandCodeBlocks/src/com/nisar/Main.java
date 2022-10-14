package com.nisar;
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score =800, levelcomplete=5, bonus=100;

     /*   if(score<5000 && score >1000) {
            System.out.println("Your score less than 5000 but grater than 1000");
        } else if (score<1000) {
            System.out.println("you score was less than 1000");
        } else {
            System.out.println("Got here");
        }*/

        if(gameOver) {
            int finalScore = score+(levelcomplete*bonus);
            finalScore += 1000;
            System.out.println("Your final score was "+ finalScore);
        } //once code blocks finished it automatically delete itself
          //so cant recall the variable in code blocks

        /**
         * challenge Time!!
         * Print out a second score on the screen with the following
         * score set to 10000
         * levelComplete set to 8
         * bonus set to 200
         * but make sure the first printout above still display as well
         */

        //NoeyDid
      /*  if(gameOver){
            int secondScore = 10000,secondLevelComplete =8,secondBonus=200;
            int secondFinalScore=secondScore+(secondLevelComplete*secondBonus);
            System.out.println("Your final score was "+ secondFinalScore);
        }*/

        //Tim 1st method
       /* boolean newGameOver = true;
        int newScore =10000, newLevelComplete=8, newBonus=200;
        if(newGameOver) {
            int finalScore = newScore+(newBonus*newLevelComplete);
            System.out.println("Your final score was "+ finalScore);
        }*/

        //Tim 2nd method
        score =10000;
        levelcomplete=8;
        bonus=200;
        if(gameOver) {
            int finalScore = score + (levelcomplete * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        }
}