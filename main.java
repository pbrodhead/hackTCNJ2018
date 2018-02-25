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
			//TODO make a function that pulls all the data from the UI
			//TODO use bM.createFile(total budget) to create the .txt file
		}
		else
		{ 
				//should go straight to the home screen
		}
	
	}



	}
	
