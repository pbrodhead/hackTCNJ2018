
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
 
public class homePage extends JFrame implements ActionListener
{
	private JLabel foodLbl;
	private JLabel gasLbl;
	private JLabel funLbl;
	private JLabel luxuryLbl;
	
	private JButton foodBtn;
	private JButton gasBtn;
	private JButton funBtn;
	private JButton luxuryBtn;
	
	private JTextField Food;
	private JTextField Gas;
	private JTextField Fun;
	private JTextField Luxury;
	
	public double foodNum = 0.00;
	public double gasNum = 0.00;
	public double funNum = 0.00;
	public double luxuryNum = 0.00;
	
	public double totalBudget = 0.00;
	
	
	public homePage() 
	{
		super("Homepage");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 600));
	    ((JPanel) getContentPane()).setBorder(new EmptyBorder(13, 13, 13, 13) );
        setLayout(new GridLayout(0, 3));
		
		
		foodLbl = new JLabel("Food/Drink: $" + foodNum);
		foodBtn = new JButton("Ok");
		foodBtn.setActionCommand("foodBtn");
		foodBtn.addActionListener(this);
		Food = new JTextField("", 5);
		
		gasLbl = new JLabel("Gas: $" + gasNum);
		gasBtn = new JButton("Ok");
		gasBtn.setActionCommand("gasBtn");
		gasBtn.addActionListener(this);
		Gas = new JTextField("", 5);
		
		funLbl = new JLabel("Entertainment: $" + funNum);
		funBtn = new JButton("Ok");
		funBtn.setActionCommand("funBtn");
		funBtn.addActionListener(this);
		Fun = new JTextField("", 5);
		
		luxuryLbl = new JLabel("Savings: " + luxuryNum + "%");
		luxuryBtn = new JButton("Ok");
		luxuryBtn.setActionCommand("luxuryBtn");
		luxuryBtn.addActionListener(this);
		Luxury = new JTextField("", 5);
		
		JLabel depositLbl = new JLabel("Deposit");
		JButton depositBtn = new JButton("Ok");
		depositBtn.setActionCommand("depositBtn");
		depositBtn.addActionListener(this);
		JTextField Deposit = new JTextField("", 5); 
		
		JLabel budgetLbl = new JLabel("Funds Remaining: $" + totalBudget);
		
		JButton editBtn = new JButton("Edit Profile");
		editBtn.setActionCommand("editBtn");
		editBtn.addActionListener(this);
		
		
		add(foodLbl);
		add(Food);
		add(foodBtn);
		
		add(gasLbl);
		add(Gas);
		add(gasBtn);
		
		add(funLbl);
		add(Fun);
		add(funBtn);
		
		add(luxuryLbl);
		add(Luxury);
		add(luxuryBtn);
		
		add(depositLbl);
		add(Deposit);
		add(depositBtn);
		
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		
		
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); 
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("foodBtn"))
		{
			foodNum = Double.parseDouble(Food.getText());
			totalBudget = totalBudget - foodNum;
			budgetLbl.setText("Funds Remaining: " + budgetTotal);
			foodLbl.setText("Food: $" + Food.getText());
		}
		if (e.getActionCommand().equals("gasBtn"))
		{
			gasNum = Double.parseDouble(Gas.getText());
			totalBudget = totalBudget - gasNum;
			budgetLbl.setText("Funds Remaining: " + budgetTotal);
			gasLbl.setText("Gas: $" + Gas.getText());
		}
		if (e.getActionCommand().equals("funBtn"))
		{
			funNum = Double.parseDouble(Fun.getText());
			totalBudget = totalBudget - funNum;
			budgetLbl.setText("Funds Remaining: " + budgetTotal);
			funLbl.setText("Fun: $" + Fun.getText());
			
		}
		if (e.getActionCommand().equals("luxuryBtn"))
		{
			luxuryNum = Double.parseDouble(Luxury.getText());
			totalBudget = totalBudget - luxuryNum;
			budgetLbl.setText("Funds Remaining: " + budgetTotal);
			luxuryLbl.setText("Home: $" + Luxury.getText());
			
		}
	}
	
	public static void main(String[] args)
	{
		new homePage();
	}
	
}
	  
