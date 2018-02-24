import java.util.*;

public class budgetMaker{
    public static void main(String[] args){
	Scanner scnr = new Scanner(System.in);
	double income, fixedExpenses, budget = 0.0;

	System.out.print("Enter your income: $");
	income = scnr.nextDouble();
	System.out.print("Enter your fixed expenses: $");
	fixedExpenses = scnr.nextDouble();

	budget = income - fixedExpenses;
	System.out.println("Your budget is $" + budget);
    
	try {
			File file = new File("budget.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Budget: ");
			fileWriter.write(budget);
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
