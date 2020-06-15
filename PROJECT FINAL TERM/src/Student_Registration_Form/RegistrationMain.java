package Student_Registration_Form ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


public class RegistrationMain extends JFrame implements ActionListener

{
	
	private Container c;
	private JLabel title;

	private JLabel FirstName;
	private JTextField TextFirstName;

	private JLabel LastName;
	private JTextField TextLastName;

	private JLabel FatherName;
	private JTextField TextFatherName ;

	private JLabel MotherName ;
	private JTextField TextMotherName;
	
	private JLabel CurrentAddress;
	private JTextField TextCurrentAddress;

    private JLabel PermanentAddress;
	private JTextField TextPermanentAddress;
	
	private JLabel Email;
	private JTextField TextEmail;
	
	private JLabel Mobile;
	private JTextField TextMobile;
	
	private JLabel Country;
	private JTextField TextCountry;
	
	
	private JLabel Blood;
	private JRadioButton Apos;
    private JRadioButton Aneg;
    private JRadioButton Bpos;
    private JRadioButton Bneg;
    private JRadioButton ABpos;
    private JRadioButton ABneg;
    private JRadioButton Opos;
    private JRadioButton Oneg;
	private ButtonGroup Bloodgroup;

	private JLabel DOB;
	private JComboBox Date;
	private JComboBox Month;
	private JComboBox Year;

	private JLabel Gender;
	private JRadioButton Male;
    private JRadioButton Female;
	private ButtonGroup Gendergroup;
	 
	private JLabel Department ;
	private JRadioButton CSE;
    private JRadioButton EEE;
    private JRadioButton Civil;
    private JRadioButton ECE;
    private JRadioButton ME;
    private JRadioButton Architecture;
    private JRadioButton BBA;
    private ButtonGroup Deptgroup;
     
	 

	private JCheckBox term;  // term is the place for tick mark to accept the terms and condition
	
	private JButton submit;
	private JButton reset;

	private JTextArea tout;  // tout is the space to show the registration information

	private JLabel res;
	private JTextArea resadd;

	private String dates[] =

			{ "Select Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
					"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

	private String months[] = { "Select Month" ,"January", "February", "March", "April", "May", "June", "July", "August",

			"September", "October", "November", "December" , };

	private String years[] = {"Select Year", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990",
			"1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
			"2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016",
			"2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029" };



	public RegistrationMain()

	{   
		
		  setTitle(" Registration Form ");
		  setBounds(400, 10, 1250, 1100); 
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
		  setResizable(false);

		  c = getContentPane();
		  c.setBackground(Color.pink); 
		  c.setLayout(null);

		  title = new JLabel("      Online Student Registration Form ");
		  title.setFont(new Font("Arial", Font.PLAIN, 30));
		  title.setBounds(300, 30, 700, 30); 
		  c.add(title);

		  FirstName = new JLabel(" Student First Name :");
		  FirstName.setFont(new Font("Arial", Font.PLAIN, 20));
		  FirstName.setBounds(10, 90, 300, 40);
		  c.add(FirstName);

		  TextFirstName = new JTextField();
		  TextFirstName.setFont(new Font("Arial", Font.PLAIN, 19));
		  TextFirstName.setSize(275, 25); // text field size x, y
		  TextFirstName.setLocation(250, 100);
		  c.add(TextFirstName);

		  LastName = new JLabel(" Student Last Name :");
		  LastName.setFont(new Font("Arial", Font.PLAIN, 20));
		  LastName.setBounds(10, 130, 300, 40);
		  c.add(LastName);

		  TextLastName = new JTextField();
		  TextLastName.setFont(new Font("Arial", Font.PLAIN, 19));
		  TextLastName.setSize(275, 25); 
		  TextLastName.setLocation(250, 140);
		  c.add(TextLastName);

		  FatherName = new JLabel(" Father's Name :");
		  FatherName.setFont(new Font("Arial", Font.PLAIN, 20));
		  FatherName.setBounds(10, 170, 300, 40);
		  c.add(FatherName);

		  TextFatherName = new JTextField();
		  TextFatherName.setFont(new Font("Arial", Font.PLAIN, 19));
		  TextFatherName.setSize(275, 25);
		  TextFatherName.setLocation(250, 180);
		  c.add(TextFatherName);

		  MotherName = new JLabel(" Mother's Name :");
		  MotherName.setFont(new Font("Arial", Font.PLAIN, 20));
		  MotherName.setBounds(10, 210, 300, 40);
		  c.add(MotherName);

		  TextMotherName = new JTextField();
		  TextMotherName.setFont(new Font("Arial", Font.PLAIN, 19));
		  TextMotherName.setSize(275, 25);
		  TextMotherName.setLocation(250, 220);
		  c.add(TextMotherName);

		  CurrentAddress = new JLabel(" Current Address :");
		  CurrentAddress.setFont(new Font("Arial", Font.PLAIN, 20));
		  CurrentAddress.setBounds(10, 250, 300, 40);
		  c.add(CurrentAddress);

		  TextCurrentAddress = new JTextField();
		  TextCurrentAddress.setFont(new Font("Arial", Font.PLAIN, 19));
		  TextCurrentAddress.setSize(275, 25);
		  TextCurrentAddress.setLocation(250, 260);
		  c.add(TextCurrentAddress);

		  PermanentAddress = new JLabel(" Permanent Address :");
		  PermanentAddress.setFont(new Font("Arial", Font.PLAIN, 20));
		  PermanentAddress.setBounds(10, 290, 300, 40);
		  c.add(PermanentAddress);

		  TextPermanentAddress = new JTextField();
		  TextPermanentAddress.setFont(new Font("Arial", Font.PLAIN, 19));
		  TextPermanentAddress.setSize(275, 25);
		  TextPermanentAddress.setLocation(250, 300);
		  c.add(TextPermanentAddress);
		
		  Email = new JLabel(" Email :");
		  Email.setFont(new Font("Arial", Font.PLAIN, 20));
		  Email.setBounds(10, 330, 300, 40);
		  c.add(Email);

		  TextEmail = new JTextField();
		  TextEmail.setFont(new Font("Arial", Font.PLAIN, 19));
		  TextEmail.setSize(275, 25);
		  TextEmail.setLocation(250, 340);
		  c.add(TextEmail);
		
		  Mobile = new JLabel(" Mobile :");
		  Mobile.setFont(new Font("Arial", Font.PLAIN, 20));
		  Mobile.setBounds(10, 370, 300, 40);
		  c.add(Mobile);

		  TextMobile = new JTextField();
		  TextMobile.setFont(new Font("Arial", Font.PLAIN, 19));
		  TextMobile.setSize(275, 25);
		  TextMobile.setLocation(250, 380);
		  c.add(TextMobile);
		
		  Country = new JLabel(" Country :");
		  Country.setFont(new Font("Arial", Font.PLAIN, 20));
		  Country.setBounds(10, 410, 300, 40);
		  c.add(Country);

		  TextCountry = new JTextField();
		  TextCountry.setFont(new Font("Arial", Font.PLAIN, 19));
		  TextCountry.setSize(275, 25);
		  TextCountry.setLocation(250, 420);
		  c.add(TextCountry);
		
		
		  Blood = new JLabel(" Blood Group : "); 
		  Blood.setFont(new Font("Arial", Font.PLAIN,20)); 
		  Blood.setBounds(10, 455, 400, 40); 
		  c.add(Blood);
		  
		  Apos = new JRadioButton(" A(+ve) "); 
		  Apos.setFont(new Font("Arial", Font.PLAIN,20)); 
		  Apos.setSelected(false); 
		  Apos.setSize(110, 20);
		  Apos.setLocation(250,465);
		  c.add(Apos);
		  
		  Aneg = new JRadioButton(" A(-ve) "); 
		  Aneg.setFont(new Font("Arial",Font.PLAIN, 20));
		  Aneg.setSelected(false); 
		  Aneg.setSize(110, 20); 
		  Aneg.setLocation(395, 465); 
		  c.add(Aneg);
		  
		  Bpos = new JRadioButton(" B(+ve) "); 
		  Bpos.setFont(new Font("Arial", Font.PLAIN,20)); 
		  Bpos.setSelected(false); 
		  Bpos.setSize(110, 20);
		  Bpos.setLocation(535,465);
		  c.add(Bpos);
		  
		  Bneg = new JRadioButton(" B(-ve) "); 
		  Bneg.setFont(new Font("Arial",Font.PLAIN, 20));
		  Bneg.setSelected(false); 
		  Bneg.setSize(110, 20);
		  Bneg.setLocation(675, 465); 
		  c.add(Bneg);
		  
		  
		  ABpos = new JRadioButton(" AB(+ve) "); 
		  ABpos.setFont(new Font("Arial", Font.PLAIN,20)); 
		  ABpos.setSelected(false); 
		  ABpos.setSize(110, 20); 
		  ABpos.setLocation(250,500); 
		  c.add(ABpos);
		  
		  ABneg = new JRadioButton(" AB(-ve) "); 
		  ABneg.setFont(new Font("Arial",Font.PLAIN, 20));
		  ABneg.setSelected(false); 
		  ABneg.setSize(110, 20);
		  ABneg.setLocation(395, 500);
		  c.add(ABneg);
		  
		  Opos = new JRadioButton(" O(+ve) "); 
		  Opos.setFont(new Font("Arial", Font.PLAIN,20)); 
		  Opos.setSelected(false); 
		  Opos.setSize(110, 20); 
		  Opos.setLocation(535,500); 
		  c.add(Opos);
		  
		  Oneg = new JRadioButton(" O(-ve) "); 
		  Oneg.setFont(new Font("Arial",Font.PLAIN, 20));
		  Oneg.setSelected(false); 
		  Oneg.setSize(110, 20);
		  Oneg.setLocation(675, 500);  
		  c.add(Oneg);
		  
		  
		  Bloodgroup = new ButtonGroup(); 
		  Bloodgroup.add(Apos); 
		  Bloodgroup.add(Aneg);
		  Bloodgroup.add(Bpos);
		  Bloodgroup.add(Bneg);
		  Bloodgroup.add(ABpos);
		  Bloodgroup.add(ABneg);
		  Bloodgroup.add(Opos);
		  Bloodgroup.add(Oneg);


		
		  DOB= new JLabel(" Date Of Birth : "); 
		  DOB.setFont(new Font("Arial", Font.PLAIN, 20));
		  DOB.setBounds(10, 530, 300, 40);   
		  c.add(DOB);
		 
		  Date = new JComboBox(dates); 
		  Date.setFont(new Font("Arial", Font.PLAIN,17));
		  Date.setSize(120, 20); 
		  Date.setLocation(250, 540);  
		  c.add(Date);
		 
	      Month = new JComboBox(months);
		  Month.setFont(new Font("Arial", Font.PLAIN,17));
		  Month.setSize(125, 20); 
		  Month.setLocation(420, 540); 
		  c.add(Month);
		 
		  Year = new JComboBox(years); 
		  Year.setFont(new Font("Arial", Font.PLAIN, 17));
		  Year.setSize(125, 20); 
		  Year.setLocation(580, 540); 
		  c.add(Year);
		 
		  Gender = new JLabel(" Gender : "); 
		  Gender.setFont(new Font("Arial", Font.PLAIN,20)); 
		  Gender.setBounds(10, 575, 400, 40); 
		  c.add(Gender);
		  
		  Male = new JRadioButton(" Male "); 
		  Male.setFont(new Font("Arial", Font.PLAIN,20)); 
		  Male.setSelected(false); 
		  Male.setSize(100, 20); 
		  Male.setLocation(250,583); 
		  c.add(Male);
		  
		  Female = new JRadioButton(" Female "); 
		  Female.setFont(new Font("Arial",Font.PLAIN, 20));
		  Female.setSelected(false); 
		  Female.setSize(110, 20);
		  Female.setLocation(420, 583);
		  c.add(Female);
		  
		  Gendergroup = new ButtonGroup(); 
		  Gendergroup.add(Male); 
		  Gendergroup.add(Female);
		  
		  
		  Department = new JLabel(" Department : "); 
		  Department.setFont(new Font("Arial", Font.PLAIN,20));
		  Department.setBounds(10, 618, 200, 40);      
		  c.add(Department);
		  
		  CSE = new JRadioButton(" Computer Science And Engineering (CSE) "); 
		  CSE.setFont(new Font("Arial", Font.PLAIN,20)); 
		  CSE.setSelected(false); 
		  CSE.setSize(450, 20); 
		  CSE.setLocation(250,628); 
		  c.add(CSE);
		  
		  EEE = new JRadioButton(" Electrical And Electronic Engineering (EEE) "); 
		  EEE.setFont(new Font("Arial", Font.PLAIN,20)); 
		  EEE.setSelected(false); 
		  EEE.setSize(450, 20); 
		  EEE.setLocation(250,669); 
		  c.add(EEE);
		  
		  Civil = new JRadioButton(" Civil Engineering "); 
		  Civil.setFont(new Font("Arial", Font.PLAIN,21)); 
		  Civil.setSelected(false); 
		  Civil.setSize(450, 20); 
		  Civil.setLocation(250,710); 
		  c.add(Civil);
		  
		  ME = new JRadioButton(" Mechanical Engineering (ME) "); 
		  ME.setFont(new Font("Arial", Font.PLAIN,21)); 
		  ME.setSelected(false); 
		  ME.setSize(450, 20); 
		  ME.setLocation(250,750); 
		  c.add(ME);
		  
		  Architecture = new JRadioButton(" Architecture "); 
		  Architecture.setFont(new Font("Arial", Font.PLAIN,21)); 
		  Architecture.setSelected(false); 
		  Architecture.setSize(450, 20); 
		  Architecture.setLocation(250,790); 
		  c.add(Architecture);
		  
		  BBA = new JRadioButton(" BBA "); 
		  BBA .setFont(new Font("Arial", Font.PLAIN,20)); 
		  BBA .setSelected(false); 
		  BBA .setSize(450, 20); 
		  BBA .setLocation(250,830);  //250,558
		  c.add(BBA );
		  
		  Deptgroup = new ButtonGroup(); 
		  Deptgroup.add(CSE); 
		  Deptgroup.add(EEE);
		  Deptgroup.add(Civil); 
		  Deptgroup.add(ME);
		  Deptgroup.add(Architecture); 
		  Deptgroup.add(BBA);
		  
		  

		term = new JCheckBox(" Accept Terms And Conditions "); //check box for accepting terms and condition
		term.setFont(new Font("Arial", Font.PLAIN, 25));
		term.setSize(400, 20); 
		term.setLocation(150, 880); 
		c.add(term);

		submit = new JButton("Submit");
		submit.setFont(new Font("Arial", Font.PLAIN, 22));
		submit.setSize(110, 30);
		submit.setLocation(150, 920);
		submit.addActionListener(this);
		c.add(submit);

		reset = new JButton("Cancel"); 
		reset.setFont(new Font("Arial", Font.PLAIN, 22));
		reset.setSize(110, 30);
		reset.setLocation(450, 920);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea("                   Information Box : ");
		tout.setFont(new Font("Arial", Font.PLAIN, 20));
		tout.setSize(380, 650); 
		tout.setLocation(830, 200); 
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(700, 25);
		res.setLocation(730, 150); 
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 20));
		resadd.setSize(200, 75);
		resadd.setLocation(850, 505);
		resadd.setLineWrap(true);
		c.add(resadd);

		setVisible(true);
	}

	
	
	public void actionPerformed(ActionEvent e)

	{
		if (e.getSource() == submit) 
		
		{
			if (term.isSelected()) 
			
			{
				String data1 = " First Name : " + TextFirstName.getText() + "\n" + "\n"
				        + " Last Name : "+ TextLastName.getText() + "\n" + "\n"
						+ " Father's Name : " + TextFatherName.getText() + "\n" + "\n"
						+ " Mother's Name : " + TextMotherName.getText() + "\n" + "\n"
						+ " Current Address : " + TextCurrentAddress.getText() + "\n" + "\n"
						+ " Permanent Address  : " + TextPermanentAddress.getText() + "\n" + "\n"
				        + " Email  : " + TextEmail.getText() + "\n" + "\n"
				        + " Mobile  : " + TextMobile.getText() + "\n" + "\n"
				        + " Country  : " + TextCountry.getText() + "\n" + "\n";
				        
				       
				       String data2 = " Date Of Birth : " + (String)Year.getSelectedItem() 
				  + " - " + (String)Month.getSelectedItem() 
				  + " - " + (String)Date.getSelectedItem() + "\n" + "\n"; 
				
			 
				String data3;
				
				if (Male.isSelected())
					 
				 {
				  data3 = " Gender : Male" + "\n" + "\n";
				 }
				 
			     else if (Female.isSelected())
			    	 
			     {	 
				   data3 = " Gender : Female" + "\n" + "\n";
			     }
				
			     else
			     {
			    	 data3 = " Gender : Not Selected " + "\n" + "\n";
			    	 
			     }
				
				
				 String data4;
				 
                 if (Apos.isSelected())
					 
				 {
                	 data4 = " Blood Group : A (+ve)" + "\n" + "\n";
				 }
                 
                 else if (Aneg.isSelected())
					 
				 {
                	 data4 = " Blood Group : A (-ve)" + "\n" + "\n";
				 }
                 
                 else if (Bpos.isSelected())
					 
				 {
                	 data4 = " Blood Group : B (+ve)" + "\n" + "\n";
				 }
                 
                 else if (Bneg.isSelected())
					 
				 {
                	 data4 = " Blood Group : B (-ve)" + "\n" + "\n";
				 }
                 
                 else if (ABpos.isSelected())
					 
				 {
                	 data4 = " Blood Group : AB (+ve)" + "\n" + "\n";
				 }
                 
                 else if (ABneg.isSelected())
					 
				 {
                	 data4 = " Blood Group : AB (-ve)" + "\n" + "\n";
				 }
                 
                 else if (Opos.isSelected())
					 
				 {
                	 data4 = " Blood Group : O (+ve)" + "\n" + "\n";
				 }
                 
                 else if (Oneg.isSelected())
					 
				 {
                	 data4 = " Blood Group : O (-ve)" + "\n" + "\n";
				 }
				 
			     
				
			     else
			     {
			    	 data4 = " Blood Group : Not Selected " + "\n" + "\n";
			    	 
			     }
				 
				
				 String data5;  
				 
				 if (CSE.isSelected()) // condition to select department
					 
				 {
					 data5 = " Department : CSE " + "\n" + "\n";
				 }
				 
				 else if  (EEE.isSelected())
			    	 
			     {	 
					 data5 = " Department : EEE " + "\n" + "\n";
			     }
			     
				 else if (Civil.isSelected())
			    	 
			     {	 
					 data5 = " Department : Civil " + "\n" + "\n";
			     }
                 
				 else if (ME.isSelected())
			    	 
			     {	 
					 data5 = " Department : Mechanical " + "\n" + "\n";
			     }
                 
				 else if (Architecture.isSelected())
			    	 
			     {	 
					 data5 = " Department : Architecture " + "\n" + "\n";
			     }
                 
                 else if (BBA.isSelected())
                 {	 
                	 data5 = " Department : BBA " + "\n" + "\n";
   			     } 
				 
                 else
                 {
                	 
                	 data5 = " Department :  Not Selected  ";
                 }
                
		
				tout.setText(data1 + data2 +  data3 + data4 + data5);
				tout.setEditable(false);
				res.setText("                 Registration  Done Successfully ...");
					
			} 
			
			else 
			{
				tout.setText("");
				resadd.setText("");
				res.setText("                 Please Accept The Terms And Conditions...");
			}
			
		}

		else if (e.getSource() == reset) 
		
		{
			String def = "";
			TextFirstName.setText(def);
            // tadd.setText(def);
			TextLastName.setText(def);
			TextFatherName.setText(def);
			TextMotherName.setText(def);
			TextCurrentAddress.setText(def);
			TextPermanentAddress.setText(def);
			TextEmail.setText(def);
			TextMobile.setText(def);
			TextCountry.setText(def);
			
			
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			Year.setSelectedIndex(0);
			Month.setSelectedIndex(0);
			Date.setSelectedIndex(0);
		
			
		    resadd.setText(def);
			
			
		}
	}

	public static void main(String[] args)

	{

		RegistrationMain f = new RegistrationMain();
		
		
	}

}
