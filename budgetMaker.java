import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class budgetMaker{
    public static Scanner scnr = new Scanner(System.in);
    public static void setup(){
	double income, fixedExpenses, budget = 0.0;

	System.out.print("Enter your income: $");
	income = scnr.nextDouble();
	System.out.print("Enter your fixed expenses: $");
	fixedExpenses = scnr.nextDouble();

	budget = income - fixedExpenses;
	System.out.println("Your budget is $" + budget);
	String budgetStr = Double.toString(budget);
    
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
    
    public static void main(String[] args){
	String setup;
	System.out.print("Is this your first time? y/n: ");
	setup = scnr.next();
	if(setup.equals("y")) setup();
	else;
    }
}
