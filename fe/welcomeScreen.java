import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class welcomeScreen extends JFrame implements ActionListener
{
	private JLabel welMsg;
	private JButton welBtn;
	

    public welcomeScreen() 
	{
        super("Welcome Screen");
    }
	
	
	// When the button is pressed open the next frame
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("myButton"))
		{
			newProf np = new newProf();
			setVisible(false); //you can't see me!
			dispose(); //Destroy the JFrame object
			System.out.println("OPEN");
		}	
	}
	
	public ActionEvent create()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 200));
	    ((JPanel) getContentPane()).setBorder(new EmptyBorder(13, 13, 13, 13) );
        setLayout(new FlowLayout());
	   
	    JButton welcome = new JButton("Click here to get started!");
		welcome.setActionCommand("myButton");
		welcome.addActionListener(this);
		
		welMsg = new JLabel("Welcome to BudgetMakerXtreme!");
		
		add(welMsg);
		add(welcome);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		ActionEvent e = new ActionEvent(welcome,1,null);

		return e;		
	}
	
	
    public static void main(String[] args) 
	{
		welcomeScreen ws = new welcomeScreen();
		ActionEvent e;
		//newPRof np = new newProf();
		e = ws.create();
		//ActionEvent e = new ActionEvent(null);
		
		ws.actionPerformed(e);
			
		//new welcomeScreen();
		return;
		
		//System.out.print("Hello World");
    }
}