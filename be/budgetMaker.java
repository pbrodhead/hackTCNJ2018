import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class budgetMaker{
    public static Scanner scnr = new Scanner(System.in);
   
   public static void setup(){ // this method runs the first time the program is launched
	double income, fixedExpenses, budget = 0.0;
	
	// user inputs information
	System.out.print("Enter your income: $");
	income = scnr.nextDouble();
	System.out.print("Enter your fixed expenses: $");
	fixedExpenses = scnr.nextDouble();

	//total free money determined
	budget = income - fixedExpenses;
	System.out.println("Your budget is $" + budget);

	writeToFile(budget);
    }

    public static void writeToFile(double budget){
	String budgetStr = Double.toString(budget); // numeric value converted to a string
    
	//to .txt method
	try {
			File file = new File("budget.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Budget: ");
			fileWriter.write(budgetStr);
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public static void deposit(double budget){
	double deposit = 0.0;

	System.out.print("Enter deposit amount: $");
	deposit = scnr.nextDouble();

	budget = budget + deposit;
	System.out.println("Your new budget is: $" + budget);
	writeToFile(budget);
    }

    public static void withdrawl(double budget){
	double withdrawl = 0.0;

	System.out.print("Enter withdrawl amount: $");
	withdrawl = scnr.nextDouble();

	budget = budget - withdrawl;
	System.out.println("Your new budget is: $" + budget);
	writeToFile(budget);
    }
    
    public static void main(String[] args){
	if(new File("./budget.txt").isFile()) setup();
	else;

	String editType;
	double budget = 1000.0;
	System.out.print("Is this a deposit or a withdrawl? d/w: ");
	editType = scnr.next();
	if(editType.equals("d")) deposit(budget);
	else if(editType.equals("w")) withdrawl(budget);
	else System.out.println("That is not a valid option. Goodbye");
    }
}
