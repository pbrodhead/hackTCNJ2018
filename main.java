package fe;
package be;

public class main(){
	public static void main(String[] args)
	{
		welcomeScreen wS = new welcomeScreen();
		ActionEvent e = wS.create(); // launches the welcome screen and therefore an action event to trigger the next window

		if(!(new File("./budget.txt").isFile())) 
		{	
			wS.actionPerformed(e); //launch the profile info input
		}
		else
		{ 
				//should go straight to the home screen
		}
	
	}



	}
	
