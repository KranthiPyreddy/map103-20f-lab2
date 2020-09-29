package map103lab2;

import java.io.PrintStream;
import java.util.Scanner;

public class RandomQuizHelper {

    // Declaring two arrays with 5 literals to put in
    String[] questions = new String[5];
    String[] answers = new String[5];

    //Constructor that will initialize the String arrays and set the values.
    public RandomQuizHelper() {
        questions[0] = "What is 5+5? ";
        questions[1] = "What is 3+5? ";
        questions[2] = "What is 10+4? ";
        questions[3] = "What is 9+5? ";
        questions[4] = "What is 2+5? ";

        answers[0] = "10";
        answers[1] = "8";
        answers[2] = "14";
        answers[3] = "14";
        answers[4] = "7";
    }

    /**
     *
     * @param questionIndex
     * @return
     */
    public String getQuestion(int questionIndex) {
        System.out.printf("The random number generated is %d \n \n", questionIndex);
        return questions[questionIndex];  
    }

    public boolean getResult(int questionNumber, String answer) {
        return answers[questionNumber].equals(answer);

    }
}
