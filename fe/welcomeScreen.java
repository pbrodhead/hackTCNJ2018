import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import .*;

public class welcomeScreen extends JFrame implements ActionListener
{
	private JLabel welMsg;
	private JButton welBtn;
	

    public welcomeScreen() 
	{
        super("Welcome Screen");
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
    }

	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("myButton"))
		{
			new newProf();
		}
		
	}
	
	
    public static void main(String[] args) 
	{
		new welcomeScreen();
    }
}