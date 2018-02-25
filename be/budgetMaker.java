import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class budgetMaker{
    public static Scanner scnr = new Scanner(System.in);
	
	//Methods: setup(), createFile(), deposit(), withdrawl(), main()
   
   public static void setup(){ // this method runs the first time the program is launched
	double income, fixedExpenses, budget = 0.0;
	
	// user inputs information
	System.out.print("Enter your income: $");
	if(!scnr.hasNextDouble()){
	    System.out.println("Please enter a number");
	    //setup();
	}
	income = scnr.nextDouble();
	System.out.print("Enter your fixed expenses: $");
	if(!scnr.hasNextDouble()){
	    System.out.println("Please enter a number");
	    //setup();
	}
	fixedExpenses = scnr.nextDouble();

	//total free money determined
	budget = income - fixedExpenses;
	System.out.println("Your budget is $" + budget);

	createFile(budget); 
    }

    public static void createFile(double budget){
	String budgetStr = Double.toString(budget); // numeric value converted to a string
    
	//to .txt method
	try {
			File file = new File("budget.txt");
			FileWriter fileWriter = new FileWriter(file);
			//fileWriter.write("+" + budgetStr);
			fileWriter.write("Budget: ");
			fileWriter.write(budgetStr);
			fileWriter.write(System.getProperty( "line.separator" ));
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//append to file
	public static void appendFile(double ba, double b, boolean add)
	{
	try {
			if (add == true)
			{
				File f = new File("budget.txt");//TODO make it change vs delete
				FileWriter fw = new FileWriter(f, true);
				//fw.write("+");
       				//double money = ba-b;
				//fw.write(Double.valueOf(money).toString());
				fw.write("Budget:");
				fw.write(Double.valueOf(ba).toString());
				fw.write(System.getProperty( "line.separator" ));
				fw.flush();
				fw.close();
			}
			else
			{
				File f = new File("budget.txt"); //TODO make it change vs delete
				FileWriter fw = new FileWriter(f,true);
				fw.write("-");
				double money = b-ba;
				fw.write("$");
				fw.write(Double.valueOf(money).toString());
				fw.write("Budget: ");
				fw.write(Double.valueOf(ba).toString());
				fw.write(System.getProperty( "line.separator" ));
				fw.flush();
				fw.close();
			}
			
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}

    public static void deposit(File file){
	double deposit, budget = 0.0;

	In in = new In(file);
	/*
	while(in.hasNextLine()){
	    String temp1 = in.readString();
	    double temp2 = in.readDouble();
	    } */
	String[] temp = in.readAllStrings();
	String[] split = temp[temp.length-1].split(":");
	budget = Double.parseDouble(split[1]);

	System.out.print("Enter deposit amount: $");
	deposit = scnr.nextDouble();

	budget = budget + deposit;
	System.out.println("Your new budget is: $" + budget);
	appendFile(budget, deposit, true);
    }

    public static void withdrawl(File file){
	double withdrawl, budget = 0.0;

	In in = new In(file);
	String[] temp = in.readAllStrings();
	String[] split = temp[temp.length-1].split(":");
	budget = Double.parseDouble(split[1]);

	System.out.print("Enter deposit amount: $");
	withdrawl = scnr.nextDouble();

	budget = budget - withdrawl;
	System.out.println("Your new budget is: $" + budget);
	appendFile(budget, withdrawl, true);
    }
    
    public static void main(String[] args)
	{
	boolean loop = true;
	while(loop)
	{
		if(!(new File("./budget.txt").isFile())) 
		{	
			setup();
		}
		else
		{
			String editType;
			File budgetFile = new File("./budget.txt");
			System.out.print("Is this a deposit, withdrawl, or exit? d/w/e: ");
			editType = scnr.next();
		
			if(editType.equals("d")) 
			{
				deposit(budgetFile);
			}
		
			else if(editType.equals("w")) 
			{
				withdrawl(budgetFile);
			}
			else if(editType.equals("e")) 
			{
				loop = false;
			}
	
			else{
				System.out.println("That is not a valid option. Goodbye");
			}
	
		}
	
	}
	}
}
