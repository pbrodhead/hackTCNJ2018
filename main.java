import fe.*;
import be.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class main
{
	public static void main(String[] args)
	{
		budgetMaker bM = new budgetMaker(); // for use in if statement create file
		welcomeScreen wS = new welcomeScreen();
		ActionEvent e = wS.create(); // launches the welcome screen and therefore an action event to trigger the next window
		ActionEvent e2; //variable for later use
		
		if(!(new File("./budget.txt").isFile())) // if the .txt files dont exist
		{	
			wS.actionPerformed(e); //launch the profile input screen
			//PROGRAM STOPS HERE AND WONT GO FURTHER??????
			newProf nP = new newProf();
			nP.create();
			double[] data = nP.pull(); //use pull function to get data from newProf
			double fixedCost= 0.0;
			
			double income = data[0] + data[1]; // these are locations of aux income and salary
			fixedCost = data[2] + data[3] + data[4] + data[5]+ data[6]; // location of all other data sources
			 
			double leftover = income - fixedCost; //calculation of budget allotment
			bM.createFile(leftover); //create the .txt
			//go to homepage now
			//nP.actionPerformed(e2); //close the new prof page and launch the home page
		}
		
		else
		{ 
				homePage hP = new homePage(); //go straight to the home screen
		}
	
	}

}
	
