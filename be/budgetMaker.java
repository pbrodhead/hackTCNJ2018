import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class budgetMaker{
    public static Scanner scnr = new Scanner(System.in);
    public static boolean error = false; //global error value for catch statments
	//Methods: setup(), createFile(), deposit(), withdrawl(), main()
   
public static void setup(){ // this method runs the first time the program is launched
    double salary, auxIncome, income, rent, mortgage, car, insurance, taxes, savings, fixedExpenses, budget = 0.0;
	
	// user inputs information
	do{
	    System.out.print("Enter your annual salary: $");
	    if(!scnr.hasNextDouble()){ //checks to see if number was entered
		System.out.println("Please enter a number");
		String temp = scnr.next(); //dumps garbage data to avoid infinite loops
		error = true;
	    }
	    else error = false;
	} while(error);
	salary = scnr.nextDouble();

	do{
	    System.out.print("Enter any monthly auxiliary income: $");
	    if(!scnr.hasNextDouble()){ //checks to see if number was entered
		System.out.println("Please enter a number");
		String temp = scnr.next(); //dumps garbage data to avoid infinite loops
		error = true;
	    }
	    else error = false;
	} while(error);
	auxIncome = scnr.nextDouble();

	income = (salary / 12) + auxIncome;

	do{
	    System.out.print("Enter your monthly rent: $");
	    if(!scnr.hasNextDouble()){ //see above do/while loop
		System.out.println("Please enter a number");
		String temp = scnr.next(); //see above do/while loop
		error = true;
	    }
	    else error = false;
	}while(error);
	rent = scnr.nextDouble();

	do{
	    System.out.print("Enter your monthly mortgage payment: $");
	    if(!scnr.hasNextDouble()){ //see above do/while loop
		System.out.println("Please enter a number");
		String temp = scnr.next(); //see above do/while loop
		error = true;
	    }
	    else error = false;
	}while(error);
	mortgage = scnr.nextDouble();

	do{
	    System.out.print("Enter your monthly car payment: $");
	    if(!scnr.hasNextDouble()){ //see above do/while loop
		System.out.println("Please enter a number");
		String temp = scnr.next(); //see above do/while loop
		error = true;
	    }
	    else error = false;
	}while(error);
	car = scnr.nextDouble();

	do{
	    System.out.print("Enter your monthly insurance payment: $");
	    if(!scnr.hasNextDouble()){ //see above do/while loop
		System.out.println("Please enter a number");
		String temp = scnr.next(); //see above do/while loop
		error = true;
	    }
	    else error = false;
	}while(error);
	insurance = scnr.nextDouble();

	do{
	    System.out.print("Enter your monthly property taxes: $");
	    if(!scnr.hasNextDouble()){ //see above do/while loop
		System.out.println("Please enter a number");
		String temp = scnr.next(); //see above do/while loop
		error = true;
	    }
	    else error = false;
	}while(error);
	taxes = scnr.nextDouble();

	do{
	    System.out.print("Enter your desired monthly savings rate: ");
	    if(!scnr.hasNextDouble()){ //see above do/while loop
		System.out.println("Please enter a number");
		String temp = scnr.next(); //see above do/while loop
		error = true;
	    }
	    else error = false;
	}while(error);
	savings = scnr.nextDouble();
	savings = savings / 100;
	savings = savings * income;

	fixedExpenses = rent + mortgage + car + insurance + taxes + savings;

	//total free money determined
	budget = income - fixedExpenses;
	System.out.println("Your budget is $" + budget);
	if(budget < 0.0){ //checks if user in poor financial state
	    System.out.println("You have more expenses than income. Please get a higher paying job"); //informs user that they are in poor financial state
	    setup();
	}

	createFile(budget); 
    }

public static void createFile(double budget){
	String budgetStr = Double.toString(budget); // numeric value converted to a string
    
	//to .txt method
	try {
			File file = new File("budget.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Budget:");
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
				File f = new File("budget.txt");
				FileWriter fw = new FileWriter(f, true);
				fw.write("+");
       			double money = ba-b;
				fw.write(Double.valueOf(money).toString());
				fw.write(System.getProperty( "line.separator" ));
				fw.write("Budget:");
				fw.write(Double.valueOf(ba).toString());
				fw.write(System.getProperty( "line.separator" ));
				fw.flush();
				fw.close();
			}
			else
			{
				File f = new File("budget.txt"); 
				FileWriter fw = new FileWriter(f,true);
				fw.write("-");
				double money = b-ba;
				fw.write(Double.valueOf(money).toString());
				fw.write(System.getProperty( "line.separator" ));
				fw.write("Budget:");
				fw.write(Double.valueOf(ba).toString());
				fw.write(System.getProperty( "line.separator" ));
				fw.flush();
				fw.close();
			}
			
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}

    public static double readBudget(File file){
	In in = new In(file);
	String[] temp = in.readAllStrings();
	String[] split = temp[temp.length-1].split(":");
	return Double.parseDouble(split[1]);
    }

    public static void deposit(File file){
	double deposit, budget = 0.0;
	
	budget = readBudget(file);
	
	do{
	    System.out.print("Enter deposit amount: $");
	    if(!scnr.hasNextDouble()){ //checks to see if number was entered
		System.out.println("Please enter a number");
		String temp12 = scnr.next(); //dumps garbage data to avoid infinite loop
		error = true;
	    }
	    else error = false;
	}while(error);
	deposit = scnr.nextDouble();
	
	double budgetA = budget + deposit;
	System.out.println("Your new budget is: $" + budgetA);
	appendFile(budgetA, budget, true);
    }

public static void withdrawl(File file){
	double withdrawl, budget = 0.0;

	budget = readBudget(file);
	
	do{
	    System.out.print("Enter withdrawal amount: $");
	    if(!scnr.hasNextDouble()){ //see above do/while loop
		System.out.println("Please enter a number");
		String temp123 = scnr.next(); //see above do/while loop
		error = true;
	    }
	    else error = false;
	}while(error);
	withdrawl = scnr.nextDouble();
	
	if(withdrawl < budget) //checks to see if user not overdrawing
	{
		double budgetA = budget - withdrawl;
		System.out.println("Your new budget is: $" + budgetA);
		appendFile(budgetA, budget, true);
	}
	else
	{
		System.out.println("Insufficient Funds");
		withdrawl(file);
	}
}

    public static boolean isFile(String fileName){
	return new File(fileName).isFile();
    }

    public static void main(String[] args)
    {
	boolean loop = true;
	while(loop)
	{
	    if(!isFile("./budget.txt")) 
		{	
			setup();
		}
		else
		{
			String editType;
			File budgetFile = new File("./budget.txt");
			System.out.print("Is this a deposit, withdrawal, or exit? d/w/e: ");
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
				System.out.println("That is not a valid option.");

			}
	
		}
	
	}
	}
}

