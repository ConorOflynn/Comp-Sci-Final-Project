import java.util.Random;
// This file is an object that stores methods to be easily pulled and reused in the main code segment
public class DiceObject {
public int score = 0, min=1, max=6;
public int score2 = 0, min2=1, max2=6;
public int dice1, dice2, dice3, dice4;

//This method rolls the dice before they are called
public void setRoll(){
    dice1 = min + (int)(Math.random() * ((max - min) + 1));
    dice2 = min + (int)(Math.random() * ((max - min) + 1));
    dice3 = min2 + (int)(Math.random() * ((max2 - min2) + 1));
    dice4 = min2 + (int)(Math.random() * ((max2 - min2) + 1));
}
// This method calls the roll of Player 1's first die
public int getRoll1(){
    return dice1;
}
// This method calls the roll of Player 1's second die
public int getRoll2(){
    return dice2;
}
//This method calls the roll of Player 2's first die
public int getRoll3(){
    return dice3;
}
//This method calls the roll of Player 2's second die
public int getRoll4(){
    return dice4;
}

// this method keeps track and adds up the first players score if they choose the first die
public void setScoreOne(){
        score=score+dice1;

}
// this method keeps track and adds up the first players score if they choose the second die
public void setScoreTwo(){
        score=score+dice2;

}
// this method keeps track and adds up the first players score if they choose both dice
public void setScoreBoth(){
   score = score+dice1+dice2;

}
    // this method keeps track and adds up the second players score if they choose the first die
public void setScore2One(){
    score2=score2+dice3;

}
    // this method keeps track and adds up the second players score if they choose the second die
public void setScore2Two(){
    score2=score2+dice4;
}
    // this method keeps track and adds up the second players score if they choose both dice
public void setScore2Both(){
    score2 = score2+dice3+dice4;

}
// Returns the score of Player 1
public int getScore(){
    return score;

}
// Returns the score of Player 2
public int getScore2(){
    return score2;

}
// Resets Player 1's score
public void resetScore(){
    score = 0;
}
//Resets Player 2's score
public void resetScore2(){
        score2 = 0;
}
}
