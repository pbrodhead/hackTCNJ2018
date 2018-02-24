import java.awt.*;
import java.awt.event.*;
 
public class welcomeScreen extends Frame
      implements ActionListener, WindowListener 
	  {
   private Button btnStart;    
 
   public welcomeScreen() 
   {
      setLayout(new FlowLayout()); 
 
      add(new Label("Welcome to BudgetMaster Extreme! Click here to begin."));
 
      btnStart = new Button("Begin");  
      add(btnStart);                   
 
      btnStart.addActionListener(this);

      addWindowListener(this);
	  
      setTitle("Welcome");
      setSize(800, 1200);          
      setVisible(true);             
   }
 
   // The entry main() method
   public static void main(String[] args) 
   {
      new welcomeScreen();  // Let the construct do the job
   }
 
   /* ActionEvent handler */
   @Override
   public void actionPerformed(ActionEvent evt) 
   {
      new welcomeScreen();
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