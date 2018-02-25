package fe;
package be;

public class main(){
	public static void main(String[] args)
	{
		budgetMaker bM = new budgetMaker();
		welcomeScreen wS = new welcomeScreen();
		ActionEvent e = wS.create(); // launches the welcome screen and therefore an action event to trigger the next window

		if(!(new File("./budget.txt").isFile())) 
		{	
			wS.actionPerformed(e); //launch the profile info input
			double[] data = nP.pull();
			double fixedCost= 0.0;
			
			double income = data[0] + data[1];
			double fixedCost = data[2] + data[3] + data[4] + data[5]+ data[6];
			 
			double leftover = income - fixedCost;
			bM.creatFile(leftover);
			//use bM.createFile(total budget) to create the .txt file
			//TODO go to homepage
		}
		else
		{ 
				//should go straight to the home screen
		}
	
	}



	}
	
