import java.util.*;
import java.lang.*;
import java.io.*;
import be.*;
import fe.*;

public class budget{
    public static void main(String args[]){
	budgetMaker budget = new budgetMaker();
	homePage home = new homePage();
	newProf np = new newProf();

	if(!new File("./budget.txt").isFile()){
	    np.showPage();
	}
	else{
	    home.showPage();
	}
    }
}
