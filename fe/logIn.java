import java.awt.*;
import java.awt.event.*;
 
public class logIn extends Frame
      implements ActionListener, WindowListener 
	  {
		  private Button btnNew;  
		  private Button btnOld;
 
   public logIn() 
   {
      setLayout(new FlowLayout()); 
 
      add(new Label("You appear to be a new user! Please fill in your new profile below: "));
	  
	  add(new Label("Salary: "));
	  
	  add(new Label("Auxillary Income: "));
	  
	  add(new Label("Rent/Mortgage: "));
	  
	  add(new Label("Car: "));
	  
	  add(new Label("Taxes: "));
	  
	  add(new Label("Insurance: "));
	  
	  add(new Label("Food: "));
	  
	  add(new Label("Other: "));
	  
	  add(new Label(""));
 
 
 
 
      btnStart = new Button("Begin");  
      add(btnStart);                   
 
      btnStart.addActionListener(this);

      addWindowListener(this);
	  
      setTitle("");
      setSize(800, 1200);          
      setVisible(true);             
   }
 
   // The entry main() method
   public static void main(String[] args) 
   {
      new logIn();  // Let the construct do the job
   }
 
   /* ActionEvent handler */
   @Override
   public void actionPerformed(ActionEvent evt) 
   {
      new logIn();
   }
 
   /* WindowEvent handlers */
   // Called back upon clicking close-window button
   @Override
   public void windowClosing(WindowEvent evt) 
   {
      System.exit(0);  // Terminate the program
   }
 
   // Not Used, but need to provide an empty body to compile.
   @Override public void windowOpened(WindowEvent evt) { }
   @Override public void windowClosed(WindowEvent evt) { }
   @Override public void windowIconified(WindowEvent evt) { }
   @Override public void windowDeiconified(WindowEvent evt) { }
   @Override public void windowActivated(WindowEvent evt) { }
   @Override public void windowDeactivated(WindowEvent evt) { }
}