package assignment.pkg1;

import java.util.Scanner;

public class Assignmentone {

    
    public static void main(String[] args) {
        
        //declaring the variables used in the program//
        double grade1, grade2, grade3, grade4, grade5;
        
        //calling a method getGrade() for each variable, so the method can run and store the datas
        grade1= getGrade();
        grade2= getGrade();
        grade3= getGrade();
        grade4= getGrade();
        grade5= getGrade();
        
        // Simple prinft calling the variable stored in the method with the letterGrade method that calculates the letter of the Grade
        System.out.printf("%nThe mark for the first course was: %.1f%% , the letter grade is %s. %n", grade1 , letterGrade(grade1));
        System.out.printf("The mark for the second course was: %.1f%% , the letter grade is %s. %n", grade2 , letterGrade(grade2));
        System.out.printf("The mark for the third course was: %.1f%% , the letter grade is %s. %n", grade3 , letterGrade(grade3));
        System.out.printf("The mark for the fourth course was: %.1f%% , the letter grade is %s. %n", grade4 , letterGrade(grade4));
        System.out.printf("The mark for the fifth course was: %.1f%% , the letter grade is %s. %n" , grade5 , letterGrade(grade5));
        
       //Final printf of the overall average calling a method that calculates the final grade average, and calling the letterGrade method that returns the letter of the Average//
        System.out.printf("The overall average mark is: %.1f%%, which is a letter grade of %s %n ", askFinalGrad( grade1,  grade2,  grade3,  grade4,  grade5), letterGrade(askFinalGrad( grade1,  grade2,  grade3,  grade4,  grade5)));
         
    }
    //Creating the first method to ask the grade and store it//
    private static double getGrade() {
        
        System.out.print("Please, enter a grade: ");
        Scanner keyboard = new Scanner(System.in);
        double newGrade = keyboard.nextDouble();
        return newGrade;

    }
    //Creating a method to calculate the Letter of the grade//
    public static String letterGrade(double gradeLetter)
    {
        //using a logic if to discover which letter belongs to the grade input//
        if (gradeLetter >= 80 && gradeLetter <=100) return "A";
        else if (gradeLetter >= 70 && gradeLetter < 80) return "B";
        else if (gradeLetter >= 60 && gradeLetter < 70) return "C";
        else if (gradeLetter >= 50 && gradeLetter < 60) return "D";
        else return "F";
    }
    
    //Creating the third method that calculates the average of all grades//
    public static double askFinalGrad(double g1, double g2, double g3, double g4, double g5)
    {
       
        //return the users' response to the calling method
        return (g1+g2+g3+g4+g5)/5;
     
    }
    
}
    