package fe;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
 
public class newProf extends JFrame implements ActionListener
{
	private JLabel salaryLbl;
	private JLabel auxIncLbl;
	private JLabel homeLbl;
	private JLabel carLbl;
	private JLabel taxLbl;
	private JLabel insuranceLbl;
	private JLabel foodLbl;
	private JLabel funLbl;
	private JLabel extraLbl;
	
	private JButton salaryBtn;   
	private JButton auxIncBtn;
	private JButton homeBtn;
	private JButton carBtn;
	private JButton taxBtn;
	private JButton insuranceBtn;
	private JButton foodBtn;
	private JButton funBtn;
	private JButton extraBtn;
	
	private JTextField Salary;
	private JTextField auxInc;
	private JTextField Home;
	private JTextField Car;
	private JTextField Tax;
	private JTextField Insurance;
	private JTextField Food;
	private JTextField Fun;
	private JTextField Extra;
	
	public double salaryNum = 0.00;
	public double auxIncNum = 0.00;
	public double homeNum = 0.00;
	public double carNum = 0.00;
	public double taxNum = 0.00;
	public double insuranceNum = 0.00;
	public double foodNum = 0.00;
	public double funNum = 0.00;
	public double extraNum = 0.00;
	
	public newProf() 
	{
		super("New Profile");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 600));
	    ((JPanel) getContentPane()).setBorder(new EmptyBorder(13, 13, 13, 13) );
        setLayout(new GridLayout(0, 3));
		
		
		salaryLbl = new JLabel("Salary: $" + salaryNum);
		salaryBtn = new JButton("Set");
		salaryBtn.setActionCommand("salaryBtn");
		salaryBtn.addActionListener(this);
		Salary = new JTextField("", 5);

		auxIncLbl = new JLabel("Auxillary Income: $" + auxIncNum);
		auxIncBtn = new JButton("Set");
		auxIncBtn.setActionCommand("auxIncBtn");
		auxIncBtn.addActionListener(this);
		auxInc = new JTextField("", 5);
		
		homeLbl = new JLabel("Home: $" + homeNum);
		homeBtn = new JButton("Set");
		homeBtn.setActionCommand("homeBtn");
		homeBtn.addActionListener(this);
		Home = new JTextField("", 5);
		
		carLbl = new JLabel("Car: $" + carNum);
		carBtn = new JButton("Set");
		carBtn.setActionCommand("carBtn");
		carBtn.addActionListener(this);
		Car = new JTextField("", 5);
		
		taxLbl = new JLabel("Tax: $" + taxNum);
		taxBtn = new JButton("Set");
		taxBtn.setActionCommand("taxBtn");
		taxBtn.addActionListener(this);
		Tax = new JTextField("", 5);
		
		insuranceLbl = new JLabel("Insurance: $" + insuranceNum);
		insuranceBtn = new JButton("Set");
		insuranceBtn.setActionCommand("insuranceBtn");
		insuranceBtn.addActionListener(this);
		Insurance = new JTextField("", 5);
		
		foodLbl = new JLabel("Food: $" + foodNum);
		foodBtn = new JButton("Set");
		foodBtn.setActionCommand("foodBtn");
		foodBtn.addActionListener(this);
		Food = new JTextField("", 5);
		
		funLbl = new JLabel("Entertainment: $" + funNum);
		funBtn = new JButton("Set");
		funBtn.setActionCommand("funBtn");
		funBtn.addActionListener(this);
		Fun = new JTextField("", 5);
		
		extraLbl = new JLabel("Savings: " + extraNum + "%");
		extraBtn = new JButton("Set");
		extraBtn.setActionCommand("extraBtn");
		extraBtn.addActionListener(this);
		Extra = new JTextField("", 5);
		
		add(salaryLbl);
		add(Salary);
		add(salaryBtn);
		
		add(auxIncLbl);
		add(auxInc);
		add(auxIncBtn);
		
		add(homeLbl);
		add(Home);
		add(homeBtn);
		
		add(carLbl);
		add(Car);
		add(carBtn);
		
		add(taxLbl);
		add(Tax);
		add(taxBtn);
		
		add(insuranceLbl);
		add(Insurance);
		add(insuranceBtn);
		
		add(extraLbl);
		add(Extra);
		add(extraBtn);
		
		
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		
		
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); 
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("salaryBtn"))
		{
			salaryLbl.setText("Salary: $" + Salary.getText());
			salaryNum = Double.parseDouble(Salary.getText());
		}
		if (e.getActionCommand().equals("auxIncBtn"))
		{
			auxIncLbl.setText("Auxillary Income: $" + auxInc.getText());
			auxIncNum = Double.parseDouble(auxInc.getText());
		}
		if (e.getActionCommand().equals("carBtn"))
		{
			carLbl.setText("Car: $" + Car.getText());
			carNum = Double.parseDouble(Car.getText());
		}
		if (e.getActionCommand().equals("homeBtn"))
		{
			homeLbl.setText("Home: $" + Home.getText());
			homeNum = Double.parseDouble(Home.getText());
		}
		if (e.getActionCommand().equals("taxBtn"))
		{
			taxLbl.setText("Tax: $" + Tax.getText());
			taxNum = Double.parseDouble(Tax.getText());
		}
		if (e.getActionCommand().equals("insuranceBtn"))
		{
			insuranceLbl.setText("Insurance: $" + Insurance.getText());
			insuranceNum = Double.parseDouble(Insurance.getText());
		}
		if (e.getActionCommand().equals("extraBtn"))
		{
			extraLbl.setText("Savings: " + Extra.getText() + "%");
			extraNum = Double.parseDouble(Extra.getText());
			extraNum = extraNum / 100;
			extraNum = extraNum * (salaryNum + auxIncNum);
		}
	}
	
	/* public static void main(String[] args)
	{
		new newProf();
	}*/
	
}
	  
