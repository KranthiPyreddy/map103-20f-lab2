package map103lab2;

import java.util.Scanner;

public class MAP103Lab2 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
    employees[0] = new Employee(15, "Jack", "Smith", 54);
    employees[1] = new Employee(32, "April", "Doe", 33);
    employees[2] = new Employee(24, "Pamela", "Smith", 36);
    
    employees[1].setEmployeeNumber(22);
    
        // Create a Scanner to obtain information from the user
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
// Pulls a random number between 0 and 4
    System.out.println("Which employee is answering this question (between 1 and 3)?");
        int employeeIndex = input.nextInt() - 1; 
        
        int questionNumber = (int) (Math.random() * 5);
        RandomQuizHelper helper = new RandomQuizHelper();
// Uses a method in class RandomQuizHelper that takes
// a question number and returns the question.
        String question = helper.getQuestion(questionNumber);
// A variable to store the users answer
        String answer = "";
        
        System.out.print(question);
        
        answer = input2.nextLine();
        
        if (helper.getResult(questionNumber, answer) == true) {
            //System.out.print("You are correct!");
            
            System.out.printf( "%s is correct!\n\n" , employees[employeeIndex].getFirstName() );
            
        } else {
           // System.out.print("You are not correct.");
           
           System.out.printf( "%s is not correct.\n\n", employees[employeeIndex].getFirstName() );
        }
        input.close();
        
        System.out.println("Employee Details:");
        System.out.printf("Number: %s\n", employees[employeeIndex].getEmployeeNumber());
        System.out.printf("First: %s\n", employees[employeeIndex].getFirstName());
        System.out.printf("Last: %s\n", employees[employeeIndex].getLastName());
        System.out.printf("Age: %s\n", employees[employeeIndex].getAge());
}
    }


    

