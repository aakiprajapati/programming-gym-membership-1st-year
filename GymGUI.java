import java.util.ArrayList;     //importing arraylist from util package
import javax.swing.*;           //importing all components from swing package
import java.awt.*;              //importing all components from awt package
import javax.swing.border.MatteBorder;      //importing the border components
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class GymGUI implements ActionListener
{
    ArrayList<GymMember> members= new ArrayList<GymMember>();
    //creates an arraylist of the class GymMember which stores the object of the class GymMember and its subclasses

    //instance variables
    private JFrame frame;
    private JPanel addAMemberLeftPanel, memberManageLeftPanel, allMembersLeftPanel, addARegularMemberPanel, addAPremiumMemberPanel, regularMemberPanel, premiumMemberPanel, regularInfoPanel, premiumInfoPanel, allMembersRegularPanel, allMembersPremiumPanel, displayPanel1, displayPanel2, readFromFilePanel1, readFromFilePanel2;
    private JLabel quickAccess1, quickAccess2, quickAccess3, gymName1, gymName2, gymName3, gymName4, gymName5, gymName6, nameLabel1, nameLabel2, nameLabel3, nameLabel4, nameOutputLabel1, nameOutputLabel2, idLabel1, idOutputLabel1, idOutputLabel2, idLabel2, idLabel3, idLabel4, locationLabel1, locationLabel2, locationOutputLabel1, locationOutputLabel2, locationLabel3, locationLabel4, phoneNoLabel1, phoneNoLabel2, phoneNoLabel3, phoneNoLabel4, phoneOutputLabel1, phoneOutputLabel2, emailLabel1, emailLabel2, emailLabel3, emailLabel4, emailOutputLabel1, emailOutputLabel2, genderLabel1, genderLabel2, genderLabel3, genderLabel4, genderOutputLabel1, genderOutputLabel2, dateOfBirthLabel1, dateOfBirthLabel2, dateOfBirthLabel3, dateOfBirthLabel4, dobOutputLabel1, dobOutputLabel2, startDateLabel1, startDateLabel2, startDateLabel3, startDateLabel4, startDateOutputLabel1, startDateOutputLabel2, attendanceLabel1, attendanceLabel2, attendanceOutputLabel1, attendanceOutputLabel2, loyaltyPointsLabel1, loyaltyPointsLabel2, loyaltyPointsOutputLabel1, loyaltyPointsOutputLabel2, planLabel1, planLabel2, planOutputLabel,  priceLabel2, priceOutputLabel, referralSourceLabel1, referralSourceLabel2, referralSourceOutputLabel, removalReasonLabel, removalReasonOutputLabel, removalReasonLabel2, paidAmountLabel,paidAmountOutputLabel, discountLabel, discountOutputLabel, fullPaymentLabel, fullPaymentOutputLabel, personalTrainerLabel2,  personalTrainerLabel, personalTrainerOutputLabel2, totalChargeLabel, totalChargeOutputLabel;
    private JButton addAMemberButton1, addAMemberButton2, addAMemberButton3, membershipDetailsButton1, membershipDetailsButton2, membershipDetailsButton3, allMembersButton1, allMembersButton2, allMembersButton3, allMembersRegularButton1, allMembersRegularButton2, allMembersPremiumButton1, allMembersPremiumButton2, regularMemberInfoButton1, regularMemberInfoButton2, premiumMemberInfoButton1, premiumMemberInfoButton2, addARegularMemberButtonPanel1, addAPremiumMemberButtonPanel1, addARegularMemberButtonPanel2,addAPremiumMemberButtonPanel2, addARegularMemberButtonBottom, addAPremiumMemberButtonBottom, activateButton1,activateButton2, deactivateButton1, deactivateButton2, upgradePlanButton, attendanceButton1, attendanceButton2, revertButton1, revertButton2, displayButton1, displayButton2, addClearButton1, addClearButton2, memberClearButton1, memberClearButton2, discountButton, paymentButton, saveButton1, saveButton2, saveToFileButton1, saveToFileButton2, readFromFileButton1, readFromFileButton2, backbutton1, backbutton2, readBackButton1, readBackButton2;
    private JTextField nameText1, nameText2, locationText1, locationText2, idText1, idText2, phoneNoText1, phoneNoText2, emailText1, emailText2, personalTrainerText, referralSourceText, removalReasonText;
    private JRadioButton maleRadioButton1, femaleRadioButton1, maleRadioButton2, femaleRadioButton2;
    private JComboBox DOBYear1, DOBMonth1, DOBDay1, startDateYear1, startDateMonth1, startDateDay1, planComboBox, DOBYear2, DOBMonth2, DOBDay2, startDateYear2, startDateMonth2, startDateDay2;
    private JTextArea displayAreaRegular, displayAreaPremium, readAreaRegular, readAreaPremium;
    private JScrollPane scrollPane1, scrollPane2, scrollRead1, scrollRead2;
    private File file, file2;
    private FileReader reader;  
    private FileWriter writer;

    //creating a method for storing font styles
    public void labelFonts(JLabel label)             //creating a reference variable "label" for component JLabel
    {
        label.setFont(new Font("Century Gothic",Font.BOLD,18));
    }

    public void headingButtonFonts(JButton button1)
    {
        button1.setFont(new Font("Century Gothic",Font.BOLD,20));
        button1.setFocusPainted(false);             //to remove the border around text
    }

    public void otherButtonFonts(JButton button2)
    {
        button2.setFont(new Font("Century Gothic",Font.BOLD,18));
        button2.setFocusPainted(false);
    }

    public void comboBoxColour(JComboBox combo)
    {
        combo.setBackground(Color.WHITE);
    }
    //constructors
    public  GymGUI()
    {
        //frame
        frame=new JFrame();
        frame.setLayout(null);                  //setting layout null to use setbounds
        frame.setSize(1200,800);                //set size of frame: width, height

        //panels
        addAMemberLeftPanel=new JPanel();
        addAMemberLeftPanel.setLayout(null);
        addAMemberLeftPanel.setBackground(Color.decode("#F2E3BC"));             //setting the background color using hexcodes
        addAMemberLeftPanel.setBorder(new MatteBorder(0,0,0,3,Color.BLACK));    //top, left, bottom, right, color

        memberManageLeftPanel=new JPanel();
        memberManageLeftPanel.setLayout(null);
        memberManageLeftPanel.setBackground(Color.decode("#F2E3BC"));       
        memberManageLeftPanel.setBorder(new MatteBorder(0,0,0,3,Color.BLACK));

        allMembersLeftPanel=new JPanel();
        allMembersLeftPanel.setLayout(null);
        allMembersLeftPanel.setBackground(Color.decode("#F2E3BC"));       
        allMembersLeftPanel.setBorder(new MatteBorder(0,0,0,3,Color.BLACK));

        addARegularMemberPanel=new JPanel();
        addARegularMemberPanel.setLayout(null);
        addARegularMemberPanel.setBackground(Color.decode("#F2E3BC"));

        addAPremiumMemberPanel=new JPanel();
        addAPremiumMemberPanel.setLayout(null);
        addAPremiumMemberPanel.setBackground(Color.decode("#F2E3BC"));

        regularMemberPanel=new JPanel();
        regularMemberPanel.setLayout(null);
        regularMemberPanel.setBackground(Color.decode("#F2E3BC"));

        premiumMemberPanel=new JPanel();
        premiumMemberPanel.setLayout(null);
        premiumMemberPanel.setBackground(Color.decode("#F2E3BC"));

        allMembersRegularPanel=new JPanel();
        allMembersRegularPanel.setLayout(null);
        allMembersRegularPanel.setBackground(Color.decode("#F2E3BC"));

        allMembersPremiumPanel=new JPanel();
        allMembersPremiumPanel.setLayout(null);
        allMembersPremiumPanel.setBackground(Color.decode("#F2E3BC"));

        regularInfoPanel=new JPanel();
        regularInfoPanel.setLayout(null);
        regularInfoPanel.setBackground(Color.decode("#b08968"));

        premiumInfoPanel=new JPanel();
        premiumInfoPanel.setLayout(null);
        premiumInfoPanel.setBackground(Color.decode("#b08968"));

        displayPanel1=new JPanel();
        displayPanel1.setLayout(null);
        displayPanel1.setBackground(Color.decode("#F2E3BC"));

        displayPanel2=new JPanel();
        displayPanel2.setLayout(null);
        displayPanel2.setBackground(Color.decode("#F2E3BC"));

        readFromFilePanel1=new JPanel();
        readFromFilePanel1.setLayout(null);
        readFromFilePanel1.setBackground(Color.decode("#F2E3BC"));

        readFromFilePanel2=new JPanel();
        readFromFilePanel2.setLayout(null);
        readFromFilePanel2.setBackground(Color.decode("#F2E3BC"));

        //text area
        displayAreaRegular=new JTextArea();
        displayAreaRegular.setBackground(Color.decode("#F2E3BC"));
        displayAreaRegular.setFont(new Font("Consolas",Font.BOLD,18));
        displayAreaRegular.setEditable(false);

        displayAreaPremium=new JTextArea();
        displayAreaPremium.setBackground(Color.decode("#F2E3BC"));
        displayAreaPremium.setFont(new Font("Consolas",Font.BOLD,18));
        displayAreaPremium.setEditable(false);

        readAreaRegular=new JTextArea();
        readAreaRegular.setBackground(Color.decode("#F2E3BC"));
        readAreaRegular.setFont(new Font("Consolas",Font.BOLD,18));
        readAreaRegular.setEditable(false);

        readAreaPremium=new JTextArea();
        readAreaPremium.setBackground(Color.decode("#F2E3BC"));
        readAreaPremium.setFont(new Font("Consolas",Font.BOLD,18));
        readAreaPremium.setEditable(false);

        //labels
        quickAccess1=new JLabel("Quick Access");
        quickAccess1.setFont(new Font("Bernard MT Condensed", Font.PLAIN,29));

        quickAccess2=new JLabel("Quick Access");
        quickAccess2.setFont(new Font("Bernard MT Condensed", Font.PLAIN,29));

        quickAccess3=new JLabel("Quick Access");
        quickAccess3.setFont(new Font("Bernard MT Condensed", Font.PLAIN,29));

        //gym name
        gymName1=new JLabel("Elevate Gym");
        gymName1.setFont(new Font("Bernard MT Condensed", Font.PLAIN,32));

        gymName2=new JLabel("Elevate Gym");
        gymName2.setFont(new Font("Bernard MT Condensed", Font.PLAIN,32));

        gymName3=new JLabel("Elevate Gym");
        gymName3.setFont(new Font("Bernard MT Condensed", Font.PLAIN,32));

        gymName4=new JLabel("Elevate Gym");
        gymName4.setFont(new Font("Bernard MT Condensed", Font.PLAIN,32));

        gymName5=new JLabel("Elevate Gym");
        gymName5.setFont(new Font("Bernard MT Condensed", Font.PLAIN,32));

        gymName6=new JLabel("Elevate Gym");
        gymName6.setFont(new Font("Bernard MT Condensed", Font.PLAIN,32));

        //member names
        nameLabel1=new JLabel("Name:");
        labelFonts(nameLabel1);          //calling the method consisting of fonts

        nameLabel2=new JLabel("Name:");
        labelFonts(nameLabel2); 

        nameLabel3=new JLabel("Name:");
        labelFonts(nameLabel3);

        nameLabel4=new JLabel("Name:");
        labelFonts(nameLabel4); 

        nameOutputLabel1=new JLabel("");
        labelFonts(nameOutputLabel1); 

        nameOutputLabel2=new JLabel("");
        labelFonts(nameOutputLabel2); 

        //member id
        idLabel1=new JLabel("ID:");
        labelFonts(idLabel1);

        idLabel2=new JLabel("ID:");
        labelFonts(idLabel2);

        idLabel3=new JLabel("ID:");
        labelFonts(idLabel3);

        idLabel4=new JLabel("ID:");
        labelFonts(idLabel4);

        idOutputLabel1=new JLabel("");
        labelFonts(idOutputLabel1);

        idOutputLabel2=new JLabel("");
        labelFonts(idOutputLabel2);

        //location
        locationLabel1=new JLabel("Location:");
        labelFonts(locationLabel1);

        locationLabel2=new JLabel("Location:");
        labelFonts(locationLabel2);

        locationLabel3=new JLabel("Location:");
        labelFonts(locationLabel3);

        locationLabel4=new JLabel("Location:");
        labelFonts(locationLabel4);

        locationOutputLabel1=new JLabel("");
        labelFonts(locationOutputLabel1);

        locationOutputLabel2=new JLabel("");
        labelFonts(locationOutputLabel2);

        //phone number
        phoneNoLabel1=new JLabel("Phone No:");
        labelFonts(phoneNoLabel1);

        phoneNoLabel2=new JLabel("Phone No:");
        labelFonts(phoneNoLabel2);

        phoneNoLabel3=new JLabel("Phone No:");
        labelFonts(phoneNoLabel3);

        phoneNoLabel4=new JLabel("Phone No:");
        labelFonts(phoneNoLabel4);

        phoneOutputLabel1=new JLabel("");
        labelFonts(phoneOutputLabel1);

        phoneOutputLabel2=new JLabel("");
        labelFonts(phoneOutputLabel2);

        //email
        emailLabel1=new JLabel("Email:");
        labelFonts(emailLabel1);

        emailLabel2=new JLabel("Email:");
        labelFonts(emailLabel2);

        emailLabel3=new JLabel("Email:");
        labelFonts(emailLabel3);

        emailLabel4=new JLabel("Email:");
        labelFonts(emailLabel4);

        emailOutputLabel1=new JLabel("");
        labelFonts(emailOutputLabel1);

        emailOutputLabel2=new JLabel("");
        labelFonts(emailOutputLabel2);

        //gender
        genderLabel1=new JLabel("Gender:");
        labelFonts(genderLabel1);

        genderLabel2=new JLabel("Gender:");
        labelFonts(genderLabel2);

        genderLabel3=new JLabel("Gender:");
        labelFonts(genderLabel3);

        genderLabel4=new JLabel("Gender:");
        labelFonts(genderLabel4);

        genderOutputLabel1=new JLabel("");
        labelFonts(genderOutputLabel1);

        genderOutputLabel2=new JLabel("");
        labelFonts(genderOutputLabel2);

        //date of birth
        dateOfBirthLabel1=new JLabel("DOB:");
        labelFonts(dateOfBirthLabel1);

        dateOfBirthLabel2=new JLabel("DOB:");
        labelFonts(dateOfBirthLabel2);

        dateOfBirthLabel3=new JLabel("DOB:");
        labelFonts(dateOfBirthLabel3);

        dateOfBirthLabel4=new JLabel("DOB:");
        labelFonts(dateOfBirthLabel4);

        dobOutputLabel1=new JLabel("");
        labelFonts(dobOutputLabel1);

        dobOutputLabel2=new JLabel("");
        labelFonts(dobOutputLabel2);

        //start date
        startDateLabel1=new JLabel("Start Date:");
        labelFonts(startDateLabel1);

        startDateLabel2=new JLabel("Start Date:");
        labelFonts(startDateLabel2);

        startDateLabel3=new JLabel("Start Date:");
        labelFonts(startDateLabel3);

        startDateLabel4=new JLabel("Start Date:");
        labelFonts(startDateLabel4);

        startDateOutputLabel1=new JLabel("");
        labelFonts(startDateOutputLabel1);

        startDateOutputLabel2=new JLabel("");
        labelFonts(startDateOutputLabel2);

        //attendance
        attendanceLabel1=new JLabel("Attendance:");
        labelFonts(attendanceLabel1);

        attendanceLabel2=new JLabel("Attendance:");
        labelFonts(attendanceLabel2);

        attendanceOutputLabel1=new JLabel("");
        labelFonts(attendanceOutputLabel1);

        attendanceOutputLabel2=new JLabel("");
        labelFonts(attendanceOutputLabel2);

        //loyalty points
        loyaltyPointsLabel1=new JLabel("Loyalty Points:");
        labelFonts(loyaltyPointsLabel1);

        loyaltyPointsLabel2=new JLabel("Loyalty Points:");
        labelFonts(loyaltyPointsLabel2);

        loyaltyPointsOutputLabel1=new JLabel("");
        labelFonts(loyaltyPointsOutputLabel1);

        loyaltyPointsOutputLabel2=new JLabel("");
        labelFonts(loyaltyPointsOutputLabel2);

        //plan
        planLabel1=new JLabel("Plan:");
        labelFonts(planLabel1);

        planLabel2=new JLabel("Plan:");
        labelFonts(planLabel2);

        planOutputLabel=new JLabel("");
        labelFonts(planOutputLabel);

        //price
        priceLabel2=new JLabel("Price:");
        labelFonts(priceLabel2);

        priceOutputLabel=new JLabel("");
        labelFonts(priceOutputLabel);

        //referral source
        referralSourceLabel1=new JLabel("Referral Source:");
        labelFonts(referralSourceLabel1);

        referralSourceLabel2=new JLabel("Referral Source:");
        labelFonts(referralSourceLabel2); 

        referralSourceOutputLabel=new JLabel("");
        labelFonts(referralSourceOutputLabel);

        //removal reason
        removalReasonLabel=new JLabel("Removal Reason:");
        labelFonts(removalReasonLabel);

        removalReasonLabel2=new JLabel("Removal Reason:");
        labelFonts(removalReasonLabel2);

        removalReasonOutputLabel=new JLabel("");
        labelFonts(removalReasonOutputLabel);

        //paid amount
        paidAmountLabel=new JLabel("Paid Amount:");
        labelFonts(paidAmountLabel);

        paidAmountOutputLabel=new JLabel("");
        labelFonts(paidAmountOutputLabel);

        //discount
        discountLabel=new JLabel("Discount:");
        labelFonts(discountLabel);

        discountOutputLabel=new JLabel("");
        labelFonts(discountOutputLabel);

        //full payment
        fullPaymentLabel=new JLabel("Full Payment:");
        labelFonts(fullPaymentLabel);

        fullPaymentOutputLabel=new JLabel("");
        labelFonts(fullPaymentOutputLabel);

        //personal trainer
        personalTrainerLabel=new JLabel("Trainer:");
        labelFonts(personalTrainerLabel);

        personalTrainerLabel2=new JLabel("Trainer:");
        labelFonts(personalTrainerLabel2);

        personalTrainerOutputLabel2=new JLabel("");
        labelFonts(personalTrainerOutputLabel2);

        //total charge
        totalChargeLabel=new JLabel("Total Charge:");
        labelFonts(totalChargeLabel);

        totalChargeOutputLabel=new JLabel("50000");
        labelFonts(totalChargeOutputLabel);

        //buttons
        addAMemberButton1=new JButton("Add a Member");
        headingButtonFonts(addAMemberButton1);            
        addAMemberButton1.addActionListener(this);           //registering the source to the listener, and creating he object of the present class

        addAMemberButton2=new JButton("Add a Member");
        headingButtonFonts(addAMemberButton2);            
        addAMemberButton2.addActionListener(this);

        addAMemberButton3=new JButton("Add a Member");
        headingButtonFonts(addAMemberButton3);            
        addAMemberButton3.addActionListener(this);

        membershipDetailsButton1=new JButton("Membership Details");
        headingButtonFonts(membershipDetailsButton1);
        membershipDetailsButton1.addActionListener(this);

        membershipDetailsButton2=new JButton("Membership Details");
        headingButtonFonts(membershipDetailsButton2);
        membershipDetailsButton2.addActionListener(this);

        membershipDetailsButton3=new JButton("Membership Details");
        headingButtonFonts(membershipDetailsButton3);
        membershipDetailsButton3.addActionListener(this);

        allMembersButton1=new JButton("Member Information");
        headingButtonFonts(allMembersButton1);
        allMembersButton1.addActionListener(this);

        allMembersButton2=new JButton("Member Information");
        headingButtonFonts(allMembersButton2);
        allMembersButton2.addActionListener(this);

        allMembersButton3=new JButton("Member Information");
        headingButtonFonts(allMembersButton3);
        allMembersButton3.addActionListener(this);

        regularMemberInfoButton1=new JButton("Regular Member");
        headingButtonFonts(regularMemberInfoButton1);
        regularMemberInfoButton1.addActionListener(this);  

        regularMemberInfoButton2=new JButton("Regular Member");
        headingButtonFonts(regularMemberInfoButton2);
        regularMemberInfoButton2.addActionListener(this); 

        premiumMemberInfoButton1=new JButton("Premium Member");
        headingButtonFonts(premiumMemberInfoButton1);
        premiumMemberInfoButton1.addActionListener(this);

        premiumMemberInfoButton2=new JButton("Premium Member");
        headingButtonFonts(premiumMemberInfoButton2);
        premiumMemberInfoButton2.addActionListener(this);

        addARegularMemberButtonPanel1=new JButton("Regular Member");
        headingButtonFonts(addARegularMemberButtonPanel1);
        addARegularMemberButtonPanel1.addActionListener(this);

        addAPremiumMemberButtonPanel1=new JButton("Premium Member");
        headingButtonFonts(addAPremiumMemberButtonPanel1);
        addAPremiumMemberButtonPanel1.addActionListener(this);

        addARegularMemberButtonPanel2=new JButton("Regular Member");
        headingButtonFonts(addARegularMemberButtonPanel2);
        addARegularMemberButtonPanel2.addActionListener(this);

        addAPremiumMemberButtonPanel2=new JButton("Premium Member");
        headingButtonFonts(addAPremiumMemberButtonPanel2);
        addAPremiumMemberButtonPanel2.addActionListener(this);

        allMembersRegularButton1=new JButton("Regular Member");
        headingButtonFonts(allMembersRegularButton1);
        allMembersRegularButton1.addActionListener(this);

        allMembersRegularButton2=new JButton("Regular Member");
        headingButtonFonts(allMembersRegularButton2);
        allMembersRegularButton2.addActionListener(this);

        allMembersPremiumButton1=new JButton("Premium Member");
        headingButtonFonts(allMembersPremiumButton1);
        allMembersPremiumButton1.addActionListener(this);

        allMembersPremiumButton2=new JButton("Premium Member");
        headingButtonFonts(allMembersPremiumButton2);
        allMembersRegularButton2.addActionListener(this);

        addClearButton1=new JButton("Clear");
        otherButtonFonts(addClearButton1);
        addClearButton1.addActionListener(this);

        addClearButton2=new JButton("Clear");
        otherButtonFonts(addClearButton2);
        addClearButton2.addActionListener(this);

        memberClearButton1=new JButton("Clear");
        otherButtonFonts(memberClearButton1);
        memberClearButton1.addActionListener(this);

        memberClearButton2=new JButton("Clear");
        otherButtonFonts(memberClearButton2);
        memberClearButton2.addActionListener(this);

        saveButton1=new JButton("Save");
        otherButtonFonts(saveButton1);
        saveButton1.addActionListener(this);

        saveButton2=new JButton("Save");
        otherButtonFonts(saveButton2);
        saveButton2.addActionListener(this);

        saveToFileButton1=new JButton("Save to File");
        otherButtonFonts(saveToFileButton1);
        saveToFileButton1.addActionListener(this);

        saveToFileButton2=new JButton("Save to File");
        otherButtonFonts(saveToFileButton2);
        saveToFileButton2.addActionListener(this);

        readFromFileButton1=new JButton("Read from File");
        otherButtonFonts(readFromFileButton1);
        readFromFileButton1.addActionListener(this);

        readFromFileButton2=new JButton("Read from File");
        otherButtonFonts(readFromFileButton2);
        readFromFileButton2.addActionListener(this);

        addARegularMemberButtonBottom=new JButton("Add a Regular Member");
        otherButtonFonts(addARegularMemberButtonBottom);
        addARegularMemberButtonBottom.addActionListener(this);

        addAPremiumMemberButtonBottom=new JButton("Add a Premium Member");
        otherButtonFonts(addAPremiumMemberButtonBottom);
        addAPremiumMemberButtonBottom.addActionListener(this);

        activateButton1=new JButton("Activate Membership");
        otherButtonFonts(activateButton1);
        activateButton1.addActionListener(this);

        activateButton2=new JButton("Activate Membership");
        otherButtonFonts(activateButton2);
        activateButton2.addActionListener(this);

        deactivateButton1=new JButton("Deactivate Membership");
        otherButtonFonts(deactivateButton1);
        deactivateButton1.addActionListener(this);

        deactivateButton2=new JButton("Deactivate Membership");
        otherButtonFonts(deactivateButton2);
        deactivateButton2.addActionListener(this);

        upgradePlanButton=new JButton("Upgrade Plan");
        otherButtonFonts(upgradePlanButton);
        upgradePlanButton.addActionListener(this);

        attendanceButton1=new JButton("Mark Attendance");
        otherButtonFonts(attendanceButton1);
        attendanceButton1.addActionListener(this);

        attendanceButton2=new JButton("Mark Attendance");
        otherButtonFonts(attendanceButton2);
        attendanceButton2.addActionListener(this);

        revertButton1=new JButton("Revert");
        otherButtonFonts(revertButton1);
        revertButton1.addActionListener(this);

        revertButton2=new JButton("Revert");
        otherButtonFonts(revertButton2);
        revertButton2.addActionListener(this);

        displayButton1=new JButton("Display all Members");
        otherButtonFonts(displayButton1);
        displayButton1.addActionListener(this);

        displayButton2=new JButton("Display all Members");
        otherButtonFonts(displayButton2);
        displayButton2.addActionListener(this);

        discountButton=new JButton("Discount");
        otherButtonFonts(discountButton);
        discountButton.addActionListener(this);

        paymentButton=new JButton("Payment");
        otherButtonFonts(paymentButton);
        paymentButton.addActionListener(this);

        backbutton1=new JButton("Back");
        otherButtonFonts(backbutton1);
        backbutton1.addActionListener(this);

        backbutton2=new JButton("Back");
        otherButtonFonts(backbutton2);
        backbutton2.addActionListener(this);
        
        readBackButton1=new JButton("Back");
        otherButtonFonts(readBackButton1);
        readBackButton1.addActionListener(this);
        
        readBackButton2=new JButton("Back");
        otherButtonFonts(readBackButton2);
        readBackButton2.addActionListener(this);

        //radio button
        maleRadioButton1=new JRadioButton("Male");
        maleRadioButton1.setOpaque(false);              //blends the radio buttons background with the panel's background
        maleRadioButton1.setFont(new Font("Century Gothic", Font.PLAIN,17));

        maleRadioButton2=new JRadioButton("Male");
        maleRadioButton2.setOpaque(false);              //blends the radio buttons background with the panel's background
        maleRadioButton2.setFont(new Font("Century Gothic", Font.PLAIN,17));

        femaleRadioButton1=new JRadioButton("Female");
        femaleRadioButton1.setOpaque(false);            //blends the radio buttons background with the panel's background
        femaleRadioButton1.setFont(new Font("Century Gothic", Font.PLAIN,17)); 

        femaleRadioButton2=new JRadioButton("Female");
        femaleRadioButton2.setOpaque(false);            //blends the radio buttons background with the panel's background
        femaleRadioButton2.setFont(new Font("Century Gothic", Font.PLAIN,17)); 

        ButtonGroup group=new ButtonGroup();    
        //creating a button group, since without adding radio buttons to it, both the buttons would be selectable, when there must be restriction to choosing only 1
        group.add(maleRadioButton1);
        group.add(femaleRadioButton1);
        group.add(maleRadioButton2);
        group.add(femaleRadioButton2);

        //combo boxes
        //date of birth
        String [] dobYear={"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009"};
        DOBYear1=new JComboBox(dobYear);
        comboBoxColour(DOBYear1);

        DOBYear2=new JComboBox(dobYear);
        comboBoxColour(DOBYear2);

        String [] dobMonth={"1","2","3","4","5","6","7","8","9","10","11","12"};
        DOBMonth1=new JComboBox(dobMonth);
        comboBoxColour(DOBMonth1);

        DOBMonth2=new JComboBox(dobMonth);
        comboBoxColour(DOBMonth2);

        String [] dobDay={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        DOBDay1=new JComboBox(dobDay);
        comboBoxColour(DOBDay1);

        DOBDay2=new JComboBox(dobDay);
        comboBoxColour(DOBDay2);

        //start date
        String [] startYear={"2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
        startDateYear1=new JComboBox(startYear);
        comboBoxColour(startDateYear1);

        startDateYear2=new JComboBox(startYear);
        comboBoxColour(startDateYear2);

        String [] startMonth={"1","2","3","4","5","6","7","8","9","10","11","12"};
        startDateMonth1=new JComboBox(startMonth);
        comboBoxColour(startDateMonth1);

        startDateMonth2=new JComboBox(startMonth);
        comboBoxColour(startDateMonth2);

        String [] startDay={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        startDateDay1=new JComboBox(startDay);
        comboBoxColour(startDateDay1);

        startDateDay2=new JComboBox(startDay);
        comboBoxColour(startDateDay2);

        //plan
        String [] gymPlan={"Basic","Standard","Deluxe"};
        planComboBox=new JComboBox(gymPlan);
        comboBoxColour(planComboBox);

        //textfields
        nameText1=new JTextField();
        nameText2=new JTextField();
        locationText1=new JTextField();
        locationText2=new JTextField();
        idText1=new JTextField();
        idText2=new JTextField();
        phoneNoText1=new JTextField();
        phoneNoText2=new JTextField();
        emailText1=new JTextField();
        emailText2=new JTextField();
        personalTrainerText=new JTextField();
        referralSourceText= new JTextField(); 
        removalReasonText=new JTextField();

        //add a member left panel
        addAMemberLeftPanel.setBounds(1,1,250,800); //x,y,width,height

        //quick access
        quickAccess1.setBounds(50,120,150,25);
        addAMemberLeftPanel.add(quickAccess1);

        //buttons
        //add a member
        addAMemberButton1.setBounds(1,190,245,70);
        addAMemberButton1.setBackground(Color.decode("#b08968"));
        addAMemberButton1.setBorder(new MatteBorder(2,0,2,0,Color.BLACK));          //top, left, bottom, right, color
        addAMemberLeftPanel.add(addAMemberButton1);

        //membership details
        membershipDetailsButton1.setBounds(1,260,245,70);
        membershipDetailsButton1.setBackground(Color.decode("#F2E3BC"));
        membershipDetailsButton1.setBorder(new MatteBorder(0,0,2,0,Color.BLACK));    //top, left, bottom, right, color
        addAMemberLeftPanel.add(membershipDetailsButton1);

        //all members
        allMembersButton1.setBounds(1,330,245,70);
        allMembersButton1.setBackground(Color.decode("#F2E3BC"));
        allMembersButton1.setBorder(new MatteBorder(0,0,2,0,Color.BLACK));           //top, left, bottom, right, color       
        addAMemberLeftPanel.add(allMembersButton1);

        //add a member panel
        //regular member
        addARegularMemberPanel.setBounds(250,1,950,800);
        //heading
        gymName1.setBounds(380,20,180,30);
        addARegularMemberPanel.add(gymName1);
        //member buttons
        addARegularMemberButtonPanel1.setBounds(1,80,470,45);
        addARegularMemberButtonPanel1.setBackground(Color.decode("#b08968"));
        addARegularMemberButtonPanel1.setBorder(new MatteBorder(2,0,2,1,Color.BLACK));    //top, left, bottom, right, color
        addARegularMemberPanel.add(addARegularMemberButtonPanel1);

        addAPremiumMemberButtonPanel1.setBounds(470,80,470,45);
        addAPremiumMemberButtonPanel1.setBackground(Color.WHITE);
        addAPremiumMemberButtonPanel1.setBorder(new MatteBorder(2,1,2,0,Color.BLACK));    //top, left, bottom, right, color
        addARegularMemberPanel.add(addAPremiumMemberButtonPanel1);

        //name
        nameLabel1.setBounds(15,250,70,20);
        addARegularMemberPanel.add(nameLabel1);

        nameText1.setBounds(110,250,170,25);
        addARegularMemberPanel.add(nameText1);

        //location
        locationLabel1.setBounds(315,250,90,20);
        addARegularMemberPanel.add(locationLabel1);

        locationText1.setBounds(440,250,170,25);
        addARegularMemberPanel.add(locationText1);

        //id
        idLabel1.setBounds(650,250,90,20);
        addARegularMemberPanel.add(idLabel1);

        idText1.setBounds(740,250,170,25);
        addARegularMemberPanel.add(idText1);

        //phone number
        phoneNoLabel1.setBounds(15,350,95,20);
        addARegularMemberPanel.add(phoneNoLabel1);

        phoneNoText1.setBounds(110,350,170,25);
        addARegularMemberPanel.add(phoneNoText1);

        //email address
        emailLabel1.setBounds(315,350,90,20);
        addARegularMemberPanel.add(emailLabel1);

        emailText1.setBounds(440,350,170,25);
        addARegularMemberPanel.add(emailText1);

        //gender
        genderLabel1.setBounds(650,350,90,20);
        addARegularMemberPanel.add(genderLabel1);

        //radio buttons
        maleRadioButton1.setBounds(740,350,70,20);
        maleRadioButton1.setFocusPainted(false); 
        addARegularMemberPanel.add(maleRadioButton1);

        femaleRadioButton1.setBounds(820,350,90,20);
        femaleRadioButton1.setFocusPainted(false); 
        addARegularMemberPanel.add(femaleRadioButton1);

        //date of birth
        dateOfBirthLabel1.setBounds(15,450,70,20);
        addARegularMemberPanel.add(dateOfBirthLabel1);

        //combo boxes
        DOBYear1.setBounds(115,450,60,25);
        addARegularMemberPanel.add(DOBYear1);

        DOBMonth1.setBounds(180,450,45,25);
        addARegularMemberPanel.add(DOBMonth1);

        DOBDay1.setBounds(230,450,50,25);
        addARegularMemberPanel.add(DOBDay1);

        //start date
        startDateLabel1.setBounds(315,450,90,20);
        addARegularMemberPanel.add(startDateLabel1);

        //combo boxes
        startDateYear1.setBounds(440,450,60,25);
        addARegularMemberPanel.add(startDateYear1);

        startDateMonth1.setBounds(505,450,45,25);
        addARegularMemberPanel.add(startDateMonth1);

        startDateDay1.setBounds(555,450,50,25);
        addARegularMemberPanel.add(startDateDay1);

        referralSourceLabel1.setBounds(650,450,140,20);
        addARegularMemberPanel.add(referralSourceLabel1);

        referralSourceText.setBounds(795,450,115,25);
        addARegularMemberPanel.add(referralSourceText);

        //add button
        addARegularMemberButtonBottom.setBounds(530,550,240,35);
        addARegularMemberButtonBottom.setBackground(Color.decode("#b08968"));
        addARegularMemberButtonBottom.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));
        addARegularMemberPanel.add(addARegularMemberButtonBottom);

        //clear button
        addClearButton1.setBounds(780,550,120,35);
        addClearButton1.setBackground(Color.decode("#b08968"));
        addClearButton1.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));
        addARegularMemberPanel.add(addClearButton1);

        //add a premium member panel
        addAPremiumMemberPanel.setBounds(250,1,950,800);
        //heading
        gymName2.setBounds(380,20,180,30);
        addAPremiumMemberPanel.add(gymName2);
        //member buttons
        addARegularMemberButtonPanel2.setBounds(1,80,470,45);
        addARegularMemberButtonPanel2.setBackground(Color.WHITE);
        addARegularMemberButtonPanel2.setBorder(new MatteBorder(2,0,2,1,Color.BLACK));      //top, left, bottom, right, color
        addAPremiumMemberPanel.add(addARegularMemberButtonPanel2);

        addAPremiumMemberButtonPanel2.setBounds(470,80,470,45);
        addAPremiumMemberButtonPanel2.setBackground(Color.decode("#b08968"));
        addAPremiumMemberButtonPanel2.setBorder(new MatteBorder(2,1,2,0,Color.BLACK));      //top, left, bottom, right, color
        addAPremiumMemberPanel.add(addAPremiumMemberButtonPanel2);

        //name
        nameLabel2.setBounds(15,250,70,20);
        addAPremiumMemberPanel.add(nameLabel2);

        nameText2.setBounds(110,250,170,25);
        addAPremiumMemberPanel.add(nameText2);

        //location
        locationLabel2.setBounds(315,250,90,20);
        addAPremiumMemberPanel.add(locationLabel2);

        locationText2.setBounds(440,250,170,25);
        addAPremiumMemberPanel.add(locationText2);

        //id
        idLabel2.setBounds(650,250,90,20);
        addAPremiumMemberPanel.add(idLabel2);

        idText2.setBounds(740,250,170,25);
        addAPremiumMemberPanel.add(idText2);

        //phone number
        phoneNoLabel2.setBounds(15,350,95,20);
        addAPremiumMemberPanel.add(phoneNoLabel2);

        phoneNoText2.setBounds(110,350,170,25);
        addAPremiumMemberPanel.add(phoneNoText2);

        //email address
        emailLabel2.setBounds(315,350,90,20);
        addAPremiumMemberPanel.add(emailLabel2);

        emailText2.setBounds(440,350,170,25);
        addAPremiumMemberPanel.add(emailText2);

        //gender
        genderLabel2.setBounds(650,350,90,20);
        addAPremiumMemberPanel.add(genderLabel2);

        //radio buttons
        maleRadioButton2.setBounds(740,350,70,20);
        maleRadioButton2.setFocusPainted(false); 
        addAPremiumMemberPanel.add(maleRadioButton2);

        femaleRadioButton2.setBounds(820,350,90,20);
        femaleRadioButton2.setFocusPainted(false); 
        addAPremiumMemberPanel.add(femaleRadioButton2);

        //date of birth
        dateOfBirthLabel2.setBounds(15,450,70,20);
        addAPremiumMemberPanel.add(dateOfBirthLabel2);

        //combo boxes
        DOBYear2.setBounds(115,450,60,25);
        addAPremiumMemberPanel.add(DOBYear2);

        DOBMonth2.setBounds(180,450,45,25);
        addAPremiumMemberPanel.add(DOBMonth2);

        DOBDay2.setBounds(230,450,50,25);
        addAPremiumMemberPanel.add(DOBDay2);

        //start date
        startDateLabel2.setBounds(315,450,90,20);
        addAPremiumMemberPanel.add(startDateLabel2);

        //combo boxes
        startDateYear2.setBounds(440,450,60,25);
        addAPremiumMemberPanel.add(startDateYear2);

        startDateMonth2.setBounds(505,450,45,25);
        addAPremiumMemberPanel.add(startDateMonth2);

        startDateDay2.setBounds(555,450,50,25);
        addAPremiumMemberPanel.add(startDateDay2);

        //trainer
        personalTrainerLabel.setBounds(650,450,90,20);
        addAPremiumMemberPanel.add(personalTrainerLabel);

        personalTrainerText.setBounds(740,450,170,25);
        addAPremiumMemberPanel.add(personalTrainerText);

        //add button
        addAPremiumMemberButtonBottom.setBounds(530,550,240,35);
        addAPremiumMemberButtonBottom.setBackground(Color.decode("#b08968"));
        addAPremiumMemberButtonBottom.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));
        addAPremiumMemberPanel.add(addAPremiumMemberButtonBottom);

        //clear button
        addClearButton2.setBounds(780,550,120,35);
        addClearButton2.setBackground(Color.decode("#b08968"));
        addClearButton2.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));
        addAPremiumMemberPanel.add(addClearButton2);

        //MEMBER MANAGEMENT
        //add a member left panel
        memberManageLeftPanel.setBounds(1,1,250,800);

        //quick access
        quickAccess2.setBounds(50,120,150,25);
        memberManageLeftPanel.add(quickAccess2);

        //buttons
        //membership details
        addAMemberButton2.setBounds(1,190,245,70);
        addAMemberButton2.setBackground(Color.decode("#F2E3BC"));
        addAMemberButton2.setBorder(new MatteBorder(2,0,2,0,Color.BLACK));       //top, left, bottom, right, color
        memberManageLeftPanel.add(addAMemberButton2);

        //membership details
        membershipDetailsButton2.setBounds(1,260,245,70);
        membershipDetailsButton2.setBackground(Color.decode("#b08968"));
        membershipDetailsButton2.setBorder(new MatteBorder(0,0,2,0,Color.BLACK));   //top, left, bottom, right, color
        memberManageLeftPanel.add(membershipDetailsButton2);

        //all members
        allMembersButton2.setBounds(1,330,245,70);
        allMembersButton2.setBackground(Color.decode("#F2E3BC"));
        allMembersButton2.setBorder(new MatteBorder(0,0,2,0,Color.BLACK));      //top, left, bottom, right, color
        memberManageLeftPanel.add(allMembersButton2);

        //REGULAR MEMBER 
        //panel
        regularMemberPanel.setBounds(250,1,950,800);
        regularMemberPanel.add(regularInfoPanel);
        //heading
        gymName3.setBounds(380,20,180,30);
        regularMemberPanel.add(gymName3);
        //member buttons
        regularMemberInfoButton1.setBounds(1,80,470,45);
        regularMemberInfoButton1.setBackground(Color.decode("#b08968"));
        regularMemberInfoButton1.setBorder(new MatteBorder(2,0,2,1,Color.BLACK));     //top, left, bottom, right, color
        regularMemberPanel.add(regularMemberInfoButton1);

        premiumMemberInfoButton1.setBounds(470,80,470,45);
        premiumMemberInfoButton1.setBackground(Color.WHITE);
        premiumMemberInfoButton1.setBorder(new MatteBorder(2,1,2,0,Color.BLACK));     //top, left, bottom, right, color
        regularMemberPanel.add(premiumMemberInfoButton1);

        //name
        nameLabel3.setBounds(50,170,95,20);
        regularMemberPanel.add(nameLabel3);

        nameOutputLabel1.setBounds(150,170,310,25);
        regularMemberPanel.add(nameOutputLabel1);

        //id
        idLabel3.setBounds(470,170,95,20);
        regularMemberPanel.add(idLabel3);

        idOutputLabel1.setBounds(580 ,170,95,25);
        regularMemberPanel.add(idOutputLabel1);

        //location
        locationLabel3.setBounds(50,220,95,20);
        regularMemberPanel.add(locationLabel3);

        locationOutputLabel1.setBounds(150,220,310,25);
        regularMemberPanel.add(locationOutputLabel1);

        //phone no
        phoneNoLabel3.setBounds(470,220,95,20);
        regularMemberPanel.add(phoneNoLabel3);

        phoneOutputLabel1.setBounds(580,220,150,25);
        regularMemberPanel.add(phoneOutputLabel1);

        //email
        emailLabel3.setBounds(50,270,95,20);
        regularMemberPanel.add(emailLabel3);

        emailOutputLabel1.setBounds(150,270,460,25);
        regularMemberPanel.add(emailOutputLabel1);

        //gender
        genderLabel3.setBounds(470,270,95,20);
        regularMemberPanel.add(genderLabel3);

        genderOutputLabel1.setBounds(580,270,105,25);
        regularMemberPanel.add(genderOutputLabel1);

        //date of birth
        dateOfBirthLabel3.setBounds(50,320,95,20);
        regularMemberPanel.add(dateOfBirthLabel3);

        dobOutputLabel1.setBounds(150,320,300,25);
        regularMemberPanel.add(dobOutputLabel1);

        //start date
        startDateLabel3.setBounds(470,320,95,20);
        regularMemberPanel.add(startDateLabel3);

        startDateOutputLabel1.setBounds(580,320,300,25);
        regularMemberPanel.add(startDateOutputLabel1);

        //buttons
        activateButton1.setBounds(50,400,200,40);
        activateButton1.setBackground(Color.decode("#b08968"));
        activateButton1.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));         //top, left, bottom, right, color
        regularMemberPanel.add(activateButton1);

        deactivateButton1.setBounds(255,400,220,40);
        deactivateButton1.setBackground(Color.decode("#b08968"));
        deactivateButton1.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));         //top, left, bottom, right, color
        regularMemberPanel.add(deactivateButton1);

        upgradePlanButton.setBounds(50,450,200,40);
        upgradePlanButton.setBackground(Color.decode("#b08968"));
        upgradePlanButton.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));          //top, left, bottom, right, color
        regularMemberPanel.add(upgradePlanButton);

        attendanceButton1.setBounds(255,450,220,40);
        attendanceButton1.setBackground(Color.decode("#b08968"));
        attendanceButton1.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));          //top, left, bottom, right, color
        regularMemberPanel.add(attendanceButton1);

        revertButton1.setBounds(50,500,200,40);
        revertButton1.setBackground(Color.decode("#b08968"));
        revertButton1.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));              //top, left, bottom, right, color
        regularMemberPanel.add(revertButton1);

        regularInfoPanel.setBounds(495,400,420,140);
        regularInfoPanel.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));           //top, left, bottom, right, color
        regularInfoPanel.setLayout(null);

        planLabel1.setBounds(10,20,160,20);
        regularInfoPanel.add(planLabel1);

        planOutputLabel.setBounds(180,20,160,20);
        regularInfoPanel.add(planOutputLabel);

        priceLabel2.setBounds(10,60,160,20);
        regularInfoPanel.add(priceLabel2);

        priceOutputLabel.setBounds(180,60,180,25);
        regularInfoPanel.add(priceOutputLabel);

        removalReasonLabel2.setBounds(10,100,160,20);
        regularInfoPanel.add(removalReasonLabel2);

        removalReasonOutputLabel.setBounds(180,100,180,25);
        regularInfoPanel.add(removalReasonOutputLabel);

        attendanceLabel1.setBounds(50,580,140,25);
        regularMemberPanel.add(attendanceLabel1);

        attendanceOutputLabel1.setBounds(200,580,90,25);
        regularMemberPanel.add(attendanceOutputLabel1);

        loyaltyPointsLabel1.setBounds(370,580,140,25);
        regularMemberPanel.add(loyaltyPointsLabel1);

        loyaltyPointsOutputLabel1.setBounds(520,580,90,25);
        regularMemberPanel.add(loyaltyPointsOutputLabel1);

        planLabel2.setBounds(600,580,60,25);
        regularMemberPanel.add(planLabel2);

        planComboBox.setBounds(670,580,90,25);
        regularMemberPanel.add(planComboBox);

        removalReasonLabel.setBounds(50,635,160,25);
        regularMemberPanel.add(removalReasonLabel);
        removalReasonText.setBounds(220,635,130,35);
        regularMemberPanel.add(removalReasonText);

        referralSourceLabel2.setBounds(370,635,140,25);
        regularMemberPanel.add(referralSourceLabel2);
        referralSourceOutputLabel.setBounds(520,635,130,25);
        regularMemberPanel.add(referralSourceOutputLabel);

        memberClearButton1.setBounds(150,680,100,30);
        memberClearButton1.setBackground(Color.decode("#b08968"));
        memberClearButton1.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));     //top, left, bottom, right, color
        regularMemberPanel.add(memberClearButton1);

        saveButton1.setBounds(270,680,100,30);
        saveButton1.setBackground(Color.decode("#b08968"));
        saveButton1.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));            //top, left, bottom, right, color
        regularMemberPanel.add(saveButton1);

        saveToFileButton1.setBounds(390, 680,150,30);
        saveToFileButton1.setBackground(Color.decode("#b08968"));
        saveToFileButton1.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));            //top, left, bottom, right, color
        regularMemberPanel.add(saveToFileButton1);

        readFromFileButton1.setBounds(560, 680,150,30);
        readFromFileButton1.setBackground(Color.decode("#b08968"));
        readFromFileButton1.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));            //top, left, bottom, right, color
        regularMemberPanel.add(readFromFileButton1);

        displayButton1.setBounds(730,680,190,30);
        displayButton1.setBackground(Color.decode("#b08968"));
        displayButton1.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));            //top, left, bottom, right, color
        regularMemberPanel.add(displayButton1);

        //PREMIUM MEMBER
        //panel
        premiumMemberPanel.setBounds(250,1,950,800);
        premiumMemberPanel.add(premiumInfoPanel);
        //heading
        gymName4.setBounds(380,20,180,30);
        premiumMemberPanel.add(gymName4);

        //member buttons
        regularMemberInfoButton2.setBounds(1,80,470,45);
        regularMemberInfoButton2.setBackground(Color.WHITE);
        regularMemberInfoButton2.setBorder(new MatteBorder(2,0,2,1,Color.BLACK));      //top, left, bottom, right, color
        premiumMemberPanel.add(regularMemberInfoButton2);

        premiumMemberInfoButton2.setBounds(470,80,470,45);
        premiumMemberInfoButton2.setBackground(Color.decode("#b08968"));
        premiumMemberInfoButton2.setBorder(new MatteBorder(2,1,2,0,Color.BLACK));      //top, left, bottom, right, color
        premiumMemberPanel.add(premiumMemberInfoButton2);

        //name
        nameLabel4.setBounds(50,170,95,20);
        premiumMemberPanel.add(nameLabel4);

        nameOutputLabel2.setBounds(150,170,310,25);
        premiumMemberPanel.add(nameOutputLabel2);

        //id
        idLabel4.setBounds(470,170,95,20);
        premiumMemberPanel.add(idLabel4);

        idOutputLabel2.setBounds(580,170,95,25);
        premiumMemberPanel.add(idOutputLabel2);

        //location
        locationLabel4.setBounds(50,220,95,20);
        premiumMemberPanel.add(locationLabel4);

        locationOutputLabel2.setBounds(150,220,310,25);
        premiumMemberPanel.add(locationOutputLabel2);

        //phone no
        phoneNoLabel4.setBounds(470,220,95,20);
        premiumMemberPanel.add(phoneNoLabel4);

        phoneOutputLabel2.setBounds(580,220,150,25);
        premiumMemberPanel.add(phoneOutputLabel2);

        //email
        emailLabel4.setBounds(50,270,95,20);
        premiumMemberPanel.add(emailLabel4);

        emailOutputLabel2.setBounds(150,270,460,25);
        premiumMemberPanel.add(emailOutputLabel2);

        //gender
        genderLabel4.setBounds(470,270,95,20);
        premiumMemberPanel.add(genderLabel4);

        genderOutputLabel2.setBounds(580,270,95,25);
        premiumMemberPanel.add(genderOutputLabel2);

        //date of birth
        dateOfBirthLabel4.setBounds(50,320,95,20);
        premiumMemberPanel.add(dateOfBirthLabel4);

        dobOutputLabel2.setBounds(150,320,300,25);
        premiumMemberPanel.add(dobOutputLabel2);

        //start date
        startDateLabel4.setBounds(470,320,95,20);
        premiumMemberPanel.add(startDateLabel4);

        startDateOutputLabel2.setBounds(580,320,300,25);
        premiumMemberPanel.add(startDateOutputLabel2);

        //buttons
        activateButton2.setBounds(50,400,200,40);
        activateButton2.setBackground(Color.decode("#b08968"));
        activateButton2.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));     //top, left, bottom, right, color
        premiumMemberPanel.add(activateButton2);

        deactivateButton2.setBounds(255,400,220,40);
        deactivateButton2.setBackground(Color.decode("#b08968"));
        deactivateButton2.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));   //top, left, bottom, right, color
        premiumMemberPanel.add(deactivateButton2);

        discountButton.setBounds(50,450,200,40);
        discountButton.setBackground(Color.decode("#b08968"));
        discountButton.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));     //top, left, bottom, right, color
        premiumMemberPanel.add(discountButton);

        attendanceButton2.setBounds(255,450,220,40);
        attendanceButton2.setBackground(Color.decode("#b08968"));
        attendanceButton2.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));   //top, left, bottom, right, color
        premiumMemberPanel.add(attendanceButton2);

        paymentButton.setBounds(50,500,200,40);
        paymentButton.setBackground(Color.decode("#b08968"));
        paymentButton.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));      //top, left, bottom, right, color
        premiumMemberPanel.add(paymentButton);

        revertButton2.setBounds(255,500,220,40);
        revertButton2.setBackground(Color.decode("#b08968"));
        revertButton2.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));      //top, left, bottom, right, color
        premiumMemberPanel.add(revertButton2);

        premiumInfoPanel.setBounds(495,400,420,140);
        premiumInfoPanel.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));   //top, left, bottom, right, color
        premiumInfoPanel.setLayout(null);

        personalTrainerLabel2.setBounds(10,20,130,25);
        premiumInfoPanel.add(personalTrainerLabel2);

        personalTrainerOutputLabel2.setBounds(150,20,130,25);
        premiumInfoPanel.add(personalTrainerOutputLabel2);

        paidAmountLabel.setBounds(10,60,130,25);
        premiumInfoPanel.add(paidAmountLabel);

        paidAmountOutputLabel.setBounds(150,60,160,25);
        premiumInfoPanel.add(paidAmountOutputLabel);

        fullPaymentLabel.setBounds(10,100,130,25);
        premiumInfoPanel.add(fullPaymentLabel);

        fullPaymentOutputLabel.setBounds(150,100,160,25);
        premiumInfoPanel.add(fullPaymentOutputLabel);

        attendanceLabel2.setBounds(50,585,140,25);
        premiumMemberPanel.add(attendanceLabel2);

        attendanceOutputLabel2.setBounds(200,585,90,25);
        premiumMemberPanel.add(attendanceOutputLabel2);

        loyaltyPointsLabel2.setBounds(360,585,140,25);
        premiumMemberPanel.add(loyaltyPointsLabel2);

        loyaltyPointsOutputLabel2.setBounds(510,585,90,25);
        premiumMemberPanel.add(loyaltyPointsOutputLabel2);

        totalChargeLabel.setBounds(670,585,140,25);
        premiumMemberPanel.add(totalChargeLabel);

        totalChargeOutputLabel.setBounds(820,585,90,25);
        premiumMemberPanel.add(totalChargeOutputLabel);

        memberClearButton2.setBounds(150,650,100,30);
        memberClearButton2.setBackground(Color.decode("#b08968"));
        memberClearButton2.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));  //top, left, bottom, right, color
        premiumMemberPanel.add(memberClearButton2);

        saveButton2.setBounds(270,650,100,30);
        saveButton2.setBackground(Color.decode("#b08968"));
        saveButton2.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));        //top, left, bottom, right, color
        premiumMemberPanel.add(saveButton2);

        saveToFileButton2.setBounds(390, 650,150,30);
        saveToFileButton2.setBackground(Color.decode("#b08968"));
        saveToFileButton2.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));            //top, left, bottom, right, color
        premiumMemberPanel.add(saveToFileButton2);

        readFromFileButton2.setBounds(560, 650,150,30);
        readFromFileButton2.setBackground(Color.decode("#b08968"));
        readFromFileButton2.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));            //top, left, bottom, right, color
        premiumMemberPanel.add(readFromFileButton2);

        displayButton2.setBounds(730,650,190,30);
        displayButton2.setBackground(Color.decode("#b08968"));
        displayButton2.setBorder(new MatteBorder(1,1,1,1,Color.BLACK));            //top, left, bottom, right, color
        premiumMemberPanel.add(displayButton2);

        //left panel
        allMembersLeftPanel.setBounds(1,1,250,800);
        allMembersLeftPanel.setBackground(Color.decode("#F2E3BC"));
        quickAccess3.setBounds(50,120,150,25);
        allMembersLeftPanel.add(quickAccess3);

        //add a member
        addAMemberLeftPanel.add(quickAccess1);
        addAMemberButton3.setBounds(1,190,245,70);
        addAMemberButton3.setBackground(Color.decode("#F2E3BC"));
        addAMemberButton3.setBorder(new MatteBorder(2,0,2,0,Color.BLACK));           //top, left, bottom, right, color
        allMembersLeftPanel.add(addAMemberButton3);

        //membership details
        membershipDetailsButton3.setBounds(1,260,245,70);
        membershipDetailsButton3.setBackground(Color.decode("#F2E3BC"));
        membershipDetailsButton3.setBorder(new MatteBorder(0,0,2,0,Color.BLACK));      //top, left, bottom, right, color
        allMembersLeftPanel.add(membershipDetailsButton3);

        //all members
        allMembersButton3.setBounds(1,330,245,70);
        allMembersButton3.setBackground(Color.decode("#b08968"));
        allMembersButton3.setBorder(new MatteBorder(0,0,2,0,Color.BLACK));              //top, left, bottom, right, color
        allMembersLeftPanel.add(allMembersButton3);
        
        //REGULAR MEMBER
        allMembersRegularPanel.setBounds(250,1,950,800);
        //heading
        gymName5.setBounds(380,20,180,30);
        allMembersRegularPanel.add(gymName5);
        //member buttons
        allMembersRegularButton1.setBounds(1,80,470,45);
        allMembersRegularButton1.setBackground(Color.decode("#b08968"));
        allMembersRegularButton1.setBorder(new MatteBorder(2,0,2,1,Color.BLACK));      //top, left, bottom, right, color
        allMembersRegularPanel.add(allMembersRegularButton1);

        allMembersPremiumButton1.setBounds(470,80,470,45);
        allMembersPremiumButton1.setBackground(Color.WHITE);
        allMembersPremiumButton1.setBorder(new MatteBorder(2,1,2,0,Color.BLACK));      //top, left, bottom, right, color
        allMembersRegularPanel.add(allMembersPremiumButton1);

        //PREMIUM MEMBER
        allMembersPremiumPanel.setBounds(250,1,950,800);
        //heading
        gymName6.setBounds(380,20,180,30);
        allMembersPremiumPanel.add(gymName6);
        //member buttons
        allMembersRegularButton2.setBounds(1,80,470,45);
        allMembersRegularButton2.setBackground(Color.WHITE);
        allMembersRegularButton2.setBorder(new MatteBorder(2,0,2,1,Color.BLACK));      //top, left, bottom, right, color
        allMembersPremiumPanel.add(allMembersRegularButton2);

        allMembersPremiumButton2.setBounds(470,80,470,45);
        allMembersPremiumButton2.setBackground(Color.decode("#b08968"));
        allMembersPremiumButton2.setBorder(new MatteBorder(2,1,2,0,Color.BLACK));      //top, left, bottom, right, color
        allMembersPremiumPanel.add(allMembersPremiumButton2);

        //DISPLAY PANEL- REGULAR
        displayPanel1.setBounds(0,0,1200,800);

        backbutton1.setBounds(10,10,80,45);
        backbutton1.setBackground(Color.decode("#b08968"));
        backbutton1.setBorder(new MatteBorder(2,1,2,0,Color.BLACK));      //top, left, bottom, right, color
        displayPanel1.add(backbutton1);

        //adding the headings to the text area
        displayAreaRegular.append(String.format("%-6s %-25s %-25s %-15s %-30s %-10s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-25s %-25s\n",
                "ID", "Name", "Location", "Phone", "Email","Gender","DOB","Membership Start Date",
                "Attendance", "Loyalty Points", "ActiveStatus","Plan", "Price","Eligible for Upgrade",
                "Referral Source"));

        //adding text area to the scroll pane
        scrollPane1= new JScrollPane(displayAreaRegular);
        //providing dimensions for scrollpane which also includes the text area
        scrollPane1.setBounds(10,65,1170,700);
        scrollPane1.setBorder(new MatteBorder(2,2,2,2,Color.BLACK));      //top, left, bottom, right, color
        //adding scroll pane to the panel
        displayPanel1.add(scrollPane1);

        //READ FROM FILE PANEL-REGULAR
        readFromFilePanel1.setBounds(0,0,1200,800);

        readBackButton1.setBounds(10,10,80,45);
        readBackButton1.setBackground(Color.decode("#b08968"));
        readBackButton1.setBorder(new MatteBorder(2,1,2,0,Color.BLACK));      //top, left, bottom, right, color
        readFromFilePanel1.add(readBackButton1);

        //adding text area to the scroll pane
        scrollRead1= new JScrollPane(readAreaRegular);
        //providing dimensions for scrollpane which also includes the text area
        scrollRead1.setBounds(10,65,1170,700);
        scrollRead1.setBorder(new MatteBorder(2,2,2,2,Color.BLACK));      //top, left, bottom, right, color
        //adding scroll pane to the panel
        readFromFilePanel1.add(scrollRead1);

        //DISPLAY PANEL- PREMIUM
        displayPanel2.setBounds(0,0,1200,800);

        backbutton2.setBounds(10,10,80,45);
        backbutton2.setBackground(Color.decode("#b08968"));
        backbutton2.setBorder(new MatteBorder(2,1,2,0,Color.BLACK));      //top, left, bottom, right, color
        displayPanel2.add(backbutton2);

        //adding the headings to the text area
        displayAreaPremium.append(String.format("%-6s %-25s %-15s %-20s %-30s %-10s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-18s %-25s\n",
                "ID", "Name", "Location", "Phone", "Email","Gender","DOB","Membership Start Date",
                "Attendance", "Loyalty Points", "ActiveStatus","Full Payment", "Paid Amount","Discount Amount",
                "Premium Charge"));
        //adding text area to the scroll pane
        scrollPane2= new JScrollPane(displayAreaPremium);
        //providing dimensions for scrollpane which also includes the text area
        scrollPane2.setBounds(10,65,1170,700);
        scrollPane2.setBorder(new MatteBorder(2,2,2,2,Color.BLACK));      //top, left, bottom, right, color
        //adding scroll pane to the panel
        displayPanel2.add(scrollPane2);

        //READ FROM FILE PANEL- PREMIUM
        readFromFilePanel2.setBounds(0,0,1200,800);

        readBackButton2.setBounds(10,10,80,45);
        readBackButton2.setBackground(Color.decode("#b08968"));
        readBackButton2.setBorder(new MatteBorder(2,1,2,0,Color.BLACK));      //top, left, bottom, right, color
        readFromFilePanel2.add( readBackButton2);

        //adding text area to the scroll pane
        scrollRead2= new JScrollPane(readAreaPremium);
        //providing dimensions for scrollpane which also includes the text area
        scrollRead2.setBounds(10,65,1170,700);
        scrollRead2.setBorder(new MatteBorder(2,2,2,2,Color.BLACK));      //top, left, bottom, right, color
        //adding scroll pane to the panel
        readFromFilePanel2.add(scrollRead2);

        frame.add(addARegularMemberPanel);
        frame.add(addAMemberLeftPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);             //setting the frame visibility as true
        frame.setResizable(false);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==addAMemberButton1)
        {
            //adding and removing panels according to need
            frame.add(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.add(addAMemberLeftPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component/ refresh the window
        }
        else if(e.getSource()==addAMemberButton2)
        {
            frame.add(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(memberManageLeftPanel);
            frame.add(addAMemberLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(allMembersRegularPanel);
            frame.remove(allMembersPremiumPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component           
        }
        else if(e.getSource()==addAMemberButton3)
        {
            frame.add(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(memberManageLeftPanel);
            frame.add(addAMemberLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(allMembersRegularPanel);
            frame.remove(allMembersPremiumPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component
        }
        else if(e.getSource()==addARegularMemberButtonPanel1)
        { 
            frame.add(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component 
        }
        else if(e.getSource()==addARegularMemberButtonPanel2)
        { 
            frame.add(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.revalidate();        //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();           //this is used to re-draw the component
        }
        else if(e.getSource()==addAPremiumMemberButtonPanel1)
        {
            frame.remove(addARegularMemberPanel);
            frame.add(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component
        }
        else if(e.getSource()==addAPremiumMemberButtonPanel2)
        {
            frame.remove(addARegularMemberPanel);
            frame.add(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component
        }
        else if(e.getSource()==membershipDetailsButton1)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.add(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.add(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(allMembersRegularPanel);
            frame.remove(allMembersPremiumPanel);
            frame.revalidate();               //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component

            try{
                int regularInputId=Integer.parseInt(JOptionPane.showInputDialog(regularMemberPanel, "Enter your ID:")); 
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==regularInputId && member instanceof RegularMember)      //if the id returned from getter is equal to the id entered and if it belongs to regular member
                    {
                        //setting the values in labels
                        nameOutputLabel1.setText(member.getName());                 
                        idOutputLabel1.setText(String.valueOf(member.getId()));      //converting to string
                        locationOutputLabel1.setText(member.getLocation());
                        phoneOutputLabel1.setText(member.getPhone());
                        emailOutputLabel1.setText(member.getEmail());
                        genderOutputLabel1.setText(member.getGender());
                        dobOutputLabel1.setText(member.getDOB());
                        startDateOutputLabel1.setText(member.getMembershipStartDate());
                        //casting from gym member to regular member
                        RegularMember regularMember=(RegularMember) member;
                        referralSourceOutputLabel.setText(regularMember.getReferralSource());
                        planOutputLabel.setText(regularMember.getPlan());
                        priceOutputLabel.setText(String.valueOf(regularMember.getPrice()));

                        return;         //to immediately exit the method when information is displayed else, the second dialog box will also pop up
                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists      
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(regularMemberPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);  
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(regularMemberPanel,"ID must be a number!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==membershipDetailsButton2)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.add(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.add(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(allMembersRegularPanel);
            frame.remove(allMembersPremiumPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component  

            try
            {
                int regularInputId=Integer.parseInt(JOptionPane.showInputDialog(regularMemberPanel, "Enter your ID:"));         
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==regularInputId && member instanceof RegularMember)      //if the id returned from getter is equal to the id entered
                    {
                        //setting the values in labels
                        nameOutputLabel1.setText(member.getName());   
                        idOutputLabel1.setText(String.valueOf(member.getId()));      //converting to string
                        locationOutputLabel1.setText(member.getLocation());
                        phoneOutputLabel1.setText(member.getPhone());
                        emailOutputLabel1.setText(member.getEmail());
                        genderOutputLabel1.setText(member.getGender());
                        dobOutputLabel1.setText(member.getDOB());
                        startDateOutputLabel1.setText(member.getMembershipStartDate());
                        //casting from gym member to regular member
                        RegularMember regularMember=(RegularMember) member;
                        referralSourceOutputLabel.setText(regularMember.getReferralSource());
                        planOutputLabel.setText(regularMember.getPlan());
                        priceOutputLabel.setText(String.valueOf(regularMember.getPrice()));
                        return;         //to immediately exit the method when information is displayed else, the second dialog box will also pop up

                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists      
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(regularMemberPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);   
            }  
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(regularMemberPanel,"ID must be a number","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==membershipDetailsButton3)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.add(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.add(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(allMembersRegularPanel);
            frame.remove(allMembersPremiumPanel);
            frame.revalidate();     //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();        //this is used to re-draw the component

            try
            {
                int regularInputId=Integer.parseInt(JOptionPane.showInputDialog(regularMemberPanel, "Enter your ID:"));         
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==regularInputId && member instanceof RegularMember)      //if the id returned from getter is equal to the id entered and if it belongs to regular member
                    {
                        //setting the values in labels
                        nameOutputLabel1.setText(member.getName());   
                        idOutputLabel1.setText(String.valueOf(member.getId()));      //converting to string
                        locationOutputLabel1.setText(member.getLocation());
                        phoneOutputLabel1.setText(member.getPhone());
                        emailOutputLabel1.setText(member.getEmail());
                        genderOutputLabel1.setText(member.getGender());
                        dobOutputLabel1.setText(member.getDOB());
                        startDateOutputLabel1.setText(member.getMembershipStartDate());
                        //casting from gym member to regular member
                        RegularMember regularMember=(RegularMember) member;
                        referralSourceOutputLabel.setText(regularMember.getReferralSource());
                        planOutputLabel.setText(regularMember.getPlan());
                        priceOutputLabel.setText(String.valueOf(regularMember.getPrice()));
                        return;         //to immediately exit the method when information is displayed else, the second dialog box will also pop up

                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists      
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(regularMemberPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);   
            }  
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(regularMemberPanel,"ID must be a number","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==regularMemberInfoButton1)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.add(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.add(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.revalidate();            //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();               //this is used to re-draw the component

            try{
                int regularInputId=Integer.parseInt(JOptionPane.showInputDialog(regularMemberPanel, "Enter your ID:"));            
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==regularInputId && member instanceof RegularMember)      //if the id returned from getter is equal to the id entered
                    {
                        //setting the values in labels
                        nameOutputLabel1.setText(member.getName());   
                        idOutputLabel1.setText(String.valueOf(member.getId()));      //converting to string
                        locationOutputLabel1.setText(member.getLocation());
                        phoneOutputLabel1.setText(member.getPhone());
                        emailOutputLabel1.setText(member.getEmail());
                        genderOutputLabel1.setText(member.getGender());
                        dobOutputLabel1.setText(member.getDOB());
                        startDateOutputLabel1.setText(member.getMembershipStartDate());
                        //casting from gym member to regular member
                        RegularMember regularMember=(RegularMember) member;
                        referralSourceOutputLabel.setText(regularMember.getReferralSource());
                        planOutputLabel.setText(regularMember.getPlan());
                        priceOutputLabel.setText(String.valueOf(regularMember.getPrice()));
                        return;         //to immediately exit the method when information is displayed else, the second dialog box will also pop up
                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists      
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(regularMemberPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);     
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(regularMemberPanel,"ID must be a number","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }

        else if(e.getSource()==regularMemberInfoButton2)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.add(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.add(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component

            try{
                int regularInputId=Integer.parseInt(JOptionPane.showInputDialog(regularMemberPanel, "Enter your ID:"));         
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==regularInputId && member instanceof RegularMember)      //if the id returned from getter is equal to the id entered 
                    {                                                                          //instanceof keyword checks whether an object belongs to a specific class or an interface. The return value is either true or false.
                        //setting the values in labels
                        nameOutputLabel1.setText(member.getName());   //set the value of name from setter method
                        idOutputLabel1.setText(String.valueOf(member.getId()));      //converting to string
                        locationOutputLabel1.setText(member.getLocation());
                        phoneOutputLabel1.setText(member.getPhone());
                        emailOutputLabel1.setText(member.getEmail());
                        genderOutputLabel1.setText(member.getGender());
                        dobOutputLabel1.setText(member.getDOB());
                        startDateOutputLabel1.setText(member.getMembershipStartDate());

                        //casting from gym member to regular member
                        RegularMember regularMember=(RegularMember) member;
                        referralSourceOutputLabel.setText(regularMember.getReferralSource());
                        planOutputLabel.setText(regularMember.getPlan());
                        priceOutputLabel.setText(String.valueOf(regularMember.getPrice()));

                        return; //to immediately exit the method when information is displayed else, the second dialog box will also pop up  
                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists      
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(regularMemberPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);  

            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(regularMemberPanel, "ID must be a number!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }

        else if(e.getSource()==premiumMemberInfoButton1)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.add(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.add(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.revalidate();           //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();             //this is used to re-draw the component
            try{
                int premiumInputId=Integer.parseInt(JOptionPane.showInputDialog(premiumMemberPanel, "Enter your ID:"));         
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==premiumInputId && member instanceof PremiumMember)      //if the id returned from getter is equal to the id entered
                    {                                               //instanceof keyword checks whether an object belongs to a specific class or an interface. The return value is either true or false.
                        //setting the values in labels
                        nameOutputLabel2.setText(member.getName());   //set the value of name from setter method
                        idOutputLabel2.setText(String.valueOf(member.getId()));      //converting to string
                        locationOutputLabel2.setText(member.getLocation());
                        phoneOutputLabel2.setText(member.getPhone());
                        emailOutputLabel2.setText(member.getEmail());
                        genderOutputLabel2.setText(member.getGender());
                        dobOutputLabel2.setText(member.getDOB());
                        startDateOutputLabel2.setText(member.getMembershipStartDate());

                        //casting to set trainer
                        PremiumMember premiumMember = (PremiumMember) member;
                        personalTrainerOutputLabel2.setText(premiumMember.getPersonalTrainer()); 

                        return; //to immediately exit the method when information is displayed else, the second dialog box will also pop up  
                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists      
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(premiumMemberPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);  
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(premiumMemberPanel, "ID must be a number!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }

        else if(e.getSource()==premiumMemberInfoButton2)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.add(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.add(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();             //this is used to re-draw the component

            try{
                int premiumInputId=Integer.parseInt(JOptionPane.showInputDialog(premiumMemberPanel, "Enter your ID:"));
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==premiumInputId && member instanceof PremiumMember)      //if the id returned from getter is equal to the id entered
                    {
                        //setting the values in labels
                        nameOutputLabel2.setText(member.getName());   
                        idOutputLabel2.setText(String.valueOf(member.getId()));      //converting to string
                        locationOutputLabel2.setText(member.getLocation());
                        phoneOutputLabel2.setText(member.getPhone());
                        emailOutputLabel2.setText(member.getEmail());
                        genderOutputLabel2.setText(member.getGender());
                        dobOutputLabel2.setText(member.getDOB());
                        startDateOutputLabel2.setText(member.getMembershipStartDate());

                        //casting to set trainer
                        PremiumMember premiumMember = (PremiumMember) member;
                        personalTrainerOutputLabel2.setText(premiumMember.getPersonalTrainer()); 
                        return; //to immediately exit the method when information is displayed else, the second dialog box will also pop up  
                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists      
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(premiumMemberPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);  
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(premiumMemberPanel, "ID must be a number!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }

        else if(e.getSource()==addARegularMemberButtonBottom)
        {
            //getting value from fields
            String regularName= nameText1.getText();
            String regularLocation=locationText1.getText();
            String regularId=idText1.getText();
            String regularPhone= phoneNoText1.getText();
            String regularEmail= emailText1.getText();
            String regularReferralSource=referralSourceText.getText();
            String regularGender;
            if(maleRadioButton1.isSelected())
            {
                regularGender="Male";
            }
            else{
                regularGender="Female";
            }
            String regularDOBYear= (String) DOBYear1.getSelectedItem();
            String regularDOBMonth=(String) DOBMonth1.getSelectedItem();
            String regularDOBDay=(String) DOBDay1.getSelectedItem();
            String regularStartYear=(String) startDateYear1.getSelectedItem();
            String regularStartMonth=(String) startDateMonth1.getSelectedItem();
            String regularStartDay=(String) startDateDay1.getSelectedItem();

            //confirmation message to ensure all fields are filled and the member is added
            //.equals is used to compare strings                 
            if(regularName.equals("") || regularLocation.equals("") || regularId.equals("") || regularPhone.equals("") || regularEmail.equals("") ||regularReferralSource.equals("") ) //isEmpty() checks if the field is empty
            {
                JOptionPane.showMessageDialog(addARegularMemberPanel, "Please fill out all the fields.","Empty field(s)",JOptionPane.ERROR_MESSAGE);
                return;            //immediately exits this method when empty fields are found. otherwise, the other dialog boxes will also pop up
            }
            try 
            {
                int regularIdInteger = Integer.parseInt(regularId);
                //checking if the id entered by the user is within the range
                if (regularIdInteger<=0 || regularIdInteger>90000)
                {
                    throw new InvalidIdException("ID must be within 1 to 90000! Please enter a valid ID.");
                }
                if(regularPhone.length()<10 || regularPhone.length()>10)
                {
                    throw new InvalidPhoneException("Phone number must be of 10 digits!");
                }
                //checking for duplicate ID 
                for (GymMember member : members) 
                {
                    if (member.getId() == regularIdInteger && member instanceof RegularMember)      //if member is an object of regular member
                    {
                        JOptionPane.showMessageDialog(addARegularMemberPanel, "A member with ID " + regularIdInteger + " already exists!\nPlease enter another ID.","Existing ID",JOptionPane.ERROR_MESSAGE);
                        //place of display, message, title and type
                        return;        //immediately exits this method when duplicate id is found. if not written so, it will show the error message and also add the member with same id
                    }
                }

                // Create and add new member
                //calling the constructor of regular member which is a subclass of the class gym member
                GymMember rMember = new RegularMember(regularIdInteger,regularName, regularLocation, regularPhone, 
                        regularEmail, regularGender, regularDOBYear+ "-" + regularDOBMonth+ "-" + regularDOBDay, 
                        regularStartYear+ "-" +regularStartMonth+ "-" + regularStartDay, regularReferralSource);
                members.add(rMember);       //adds the new object created to the arraylist
                
                //success message
                JOptionPane.showMessageDialog(addARegularMemberPanel, "You have been added as a regular member!");
            
                //setting all fields empty
                nameText1.setText("");
                locationText1.setText("");
                idText1.setText("");
                phoneNoText1.setText("");
                emailText1.setText("");  
                DOBYear1.setSelectedIndex(0);                   //selects the first option
                DOBMonth1.setSelectedIndex(0);
                DOBDay1.setSelectedIndex(0);
                startDateYear1.setSelectedIndex(0);
                startDateMonth1.setSelectedIndex(0);
                startDateDay1.setSelectedIndex(0);
                referralSourceText.setText("");
                }
            catch (NumberFormatException ex) {                     //if the user enters such risky code, catch catches the exception, and allows the user to be informed about what is to be changed
                JOptionPane.showMessageDialog(addARegularMemberPanel, "ID must be a number!","Invalid ID", JOptionPane.ERROR_MESSAGE);
                //checking if ID entered is a number
            }
            catch(InvalidIdException i)
            {
                JOptionPane.showMessageDialog(addARegularMemberPanel, i.getMessage(),"Invalid ID",JOptionPane.ERROR_MESSAGE);
                //if the ID is a number, checking if it is within the range as required
            }
            catch(InvalidPhoneException p)
            {
                JOptionPane.showMessageDialog(addARegularMemberPanel,p.getMessage(),"Invalid phone number", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==addAPremiumMemberButtonBottom)
        {
            //getting value from fields
            String premiumName= nameText2.getText();
            String premiumLocation=locationText2.getText();
            String premiumId=idText2.getText();
            String premiumPhone= phoneNoText2.getText();
            String premiumEmail= emailText2.getText();
            String premiumGender;
            if(maleRadioButton2.isSelected())
            {
                premiumGender="Male";
            }
            else
            {
                premiumGender="Female";
            }
            String premiumDOBYear= (String) DOBYear2.getSelectedItem();
            String premiumDOBMonth=(String) DOBMonth2.getSelectedItem();
            String premiumDOBDay=(String) DOBDay2.getSelectedItem();
            String premiumStartYear=(String) startDateYear2.getSelectedItem();
            String premiumStartMonth=(String) startDateMonth2.getSelectedItem();
            String premiumStartDay=(String) startDateDay2.getSelectedItem();
            String trainer= personalTrainerText.getText();

            //confirmation message to ensure all fields are filled and the member is added
            //.equals is used to compare strings                 
            if(premiumName.equals("") || premiumLocation.equals("") || premiumId.equals("") || premiumPhone.equals("") || premiumEmail.equals("") || trainer.equals(""))
            {
                JOptionPane.showMessageDialog(addAPremiumMemberPanel, "Please fill out all the fields.","Empty field(s)", JOptionPane.ERROR_MESSAGE);
                return;            //immediately exits this method when empty fields are found. otherwise, the other dialog boxes will also pop up
            }
            try
            {
                int premiumIdInteger = Integer.parseInt(premiumId);
                if (premiumIdInteger<=0 || premiumIdInteger>90000)
                {
                    throw new InvalidIdException("ID must be within 1 to 90000! Please enter a valid ID.");
                }
                if(premiumPhone.length()<10 || premiumPhone.length()>10)
                {
                    throw new InvalidPhoneException("Phone number must be of 10 digits!");
                }
                //checking for duplicate ID 
                for (GymMember member : members) 
                {
                    if (member.getId() == premiumIdInteger && member instanceof PremiumMember)      //if member is an object of premium member class
                    {
                        JOptionPane.showMessageDialog(addAPremiumMemberPanel, "A member with ID " + premiumIdInteger + " already exists!\nPlease enter another ID.","Existing ID",JOptionPane.ERROR_MESSAGE);
                        return;        //immediately exits this method when duplicate id is found. if not written so, it will show the error message and also add the member with same id
                    }
                }
                // Create and add new member
                //calling the constructor of premium member which is a subclass of the class gym member
                GymMember pMember = new PremiumMember(premiumIdInteger,premiumName, premiumLocation, premiumPhone, 
                        premiumEmail, premiumGender, premiumDOBYear+ "-" + premiumDOBMonth+ "-" + premiumDOBDay, 
                        premiumStartYear+ "-" +premiumStartMonth+ "-" + premiumStartDay, trainer);
                members.add(pMember);       //adds the new object created to the arraylist
                
                //success message
                JOptionPane.showMessageDialog(addAPremiumMemberPanel, "You have been added as a premium member!");
            
                //setting all fields empty
                nameText2.setText("");
                locationText2.setText("");
                idText2.setText("");
                phoneNoText2.setText("");
                emailText2.setText("");
                DOBYear2.setSelectedIndex(0);                   //selects the first option
                DOBMonth2.setSelectedIndex(0);
                DOBDay2.setSelectedIndex(0);
                startDateYear2.setSelectedIndex(0);
                startDateMonth2.setSelectedIndex(0);
                startDateDay2.setSelectedIndex(0);
                personalTrainerText.setText("");
            }
            catch (NumberFormatException ex) {                     //if the user enters such risky code, catch catches the exception, and allows the user to be informed about what is to be changed
                JOptionPane.showMessageDialog(addAPremiumMemberPanel, "ID must be a number!","Invalid ID",JOptionPane.ERROR_MESSAGE);
            }
            catch(InvalidIdException i)
            {
                JOptionPane.showMessageDialog(addAPremiumMemberPanel, i.getMessage(),"Invalid ID",JOptionPane.ERROR_MESSAGE);
            }
            catch(InvalidPhoneException p)
            {
                JOptionPane.showMessageDialog(addAPremiumMemberPanel,p.getMessage(),"Invalid phone number", JOptionPane.ERROR_MESSAGE);
            }
        }

        else if(e.getSource()==allMembersButton1)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.remove(memberManageLeftPanel);
            frame.add(allMembersRegularPanel);
            frame.add(allMembersLeftPanel);
            frame.remove(allMembersPremiumPanel);
            frame.revalidate();           //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();             //this is used to re-draw the component

            try
            {
                int regularInputId=Integer.parseInt(JOptionPane.showInputDialog(allMembersRegularPanel, "Enter your ID:"));         
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==regularInputId && member instanceof RegularMember)      //if the id returned from getter is equal to the id entered
                    {
                        //casting from gym member to regular member
                        RegularMember regularMember=(RegularMember) member;
                        regularMember.display();
                        return;        //immediately exits the method if id is found
                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists in premium     
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(allMembersRegularPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
            catch (NumberFormatException ex) {                     //if the user enters such risky code, catch catches the exception, and allows the user to be informed about what is to be changed
                JOptionPane.showMessageDialog(allMembersRegularPanel, "ID must be a number!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }   

        else if(e.getSource()==allMembersButton2)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.remove(memberManageLeftPanel);
            frame.add(allMembersLeftPanel);
            frame.add(allMembersRegularPanel);
            frame.remove(allMembersPremiumPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component

            try{
                int regularInputId=Integer.parseInt(JOptionPane.showInputDialog(allMembersRegularPanel, "Enter your ID:"));         
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==regularInputId && member instanceof RegularMember)      //if the id returned from getter is equal to the id entered
                    {
                        //casting from gym member to regular member
                        RegularMember regularMember=(RegularMember) member;
                        regularMember.display();
                        return;        //immediately exits the method if id is found
                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists in premium  
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(allMembersRegularPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
            catch (NumberFormatException ex) {                     //if the user enters such risky code, catch catches the exception, and allows the user to be informed about what is to be changed
                JOptionPane.showMessageDialog(allMembersRegularPanel, "ID must be a number!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }   

        else if(e.getSource()==allMembersButton3)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.remove(memberManageLeftPanel);
            frame.add(allMembersLeftPanel);
            frame.add(allMembersRegularPanel);
            frame.remove(allMembersPremiumPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component

            try{
                int regularInputId=Integer.parseInt(JOptionPane.showInputDialog(allMembersRegularPanel, "Enter your ID:"));         
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==regularInputId && member instanceof RegularMember)      //if the id returned from getter is equal to the id entered
                    {
                        //casting from gym member to regular member
                        RegularMember regularMember=(RegularMember) member;
                        regularMember.display();
                        return;        //immediately exits the method if id is found
                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists in premium     
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(allMembersRegularPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
            catch (NumberFormatException ex) {                     //if the user enters such risky code, catch catches the exception, and allows the user to be informed about what is to be changed
                JOptionPane.showMessageDialog(allMembersRegularPanel, "ID must be a number!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==allMembersRegularButton1)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.remove(memberManageLeftPanel);
            frame.add(allMembersLeftPanel);
            frame.add(allMembersRegularPanel);
            frame.remove(allMembersPremiumPanel);
            frame.revalidate();      //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();         //this is used to re-draw the component

            try{
                int regularInputId=Integer.parseInt(JOptionPane.showInputDialog(allMembersRegularPanel, "Enter your ID:"));         
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==regularInputId && member instanceof RegularMember)      //if the id returned from getter is equal to the id entered
                    {
                        //casting from gym member to regular member
                        RegularMember regularMember=(RegularMember) member;
                        regularMember.display();
                        return;        //immediately exits the method if id is found
                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists in premium     
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(allMembersRegularPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
            catch (NumberFormatException ex) {                     //if the user enters such risky code, catch catches the exception, and allows the user to be informed about what is to be changed
                JOptionPane.showMessageDialog(allMembersRegularPanel, "ID must be a number!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }   
        }
        else if(e.getSource()==allMembersRegularButton2)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.remove(memberManageLeftPanel);
            frame.add(allMembersLeftPanel);
            frame.add(allMembersRegularPanel);
            frame.remove(allMembersPremiumPanel);
            frame.revalidate();      //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();         //this is used to re-draw the component
            try
            {
                int regularInputId=Integer.parseInt(JOptionPane.showInputDialog(allMembersRegularPanel, "Enter your ID:"));         
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==regularInputId && member instanceof RegularMember)      //if the id returned from getter is equal to the id entered and if it belongs to regular member
                    {
                        //casting from gym member to regular member
                        RegularMember regularMember=(RegularMember) member;
                        regularMember.display();
                        return;        //immediately exits the method if id is found
                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists in premium    
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(allMembersRegularPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
            catch (NumberFormatException ex) {                     //if the user enters such risky code, catch catches the exception, and allows the user to be informed about what is to be changed
                JOptionPane.showMessageDialog(allMembersRegularPanel, "ID must be a number!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }  

        else if(e.getSource()==allMembersPremiumButton1)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.remove(memberManageLeftPanel);
            frame.add(allMembersLeftPanel);
            frame.remove(allMembersRegularPanel);
            frame.add(allMembersPremiumPanel);
            frame.revalidate();      //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();         //this is used to re-draw the component
            try{
                int premiumInputId=Integer.parseInt(JOptionPane.showInputDialog(allMembersPremiumPanel, "Enter your ID:"));         
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==premiumInputId && member instanceof PremiumMember)      //if the id returned from getter is equal to the id entered and if it belongs to premium member
                    {
                        //casting from gym member to regular member
                        PremiumMember premiumMember=(PremiumMember) member;
                        premiumMember.display();
                        return;        //immediately exits the method if id is found
                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists in regular      
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(allMembersPremiumPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
            catch (NumberFormatException ex) {                     //if the user enters such risky code, catch catches the exception, and allows the user to be informed about what is to be changed
                JOptionPane.showMessageDialog(allMembersPremiumPanel, "ID must be a number!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }   

        else if(e.getSource()==allMembersPremiumButton2)
        {
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(addAMemberLeftPanel);
            frame.remove(memberManageLeftPanel);
            frame.add(allMembersLeftPanel);
            frame.remove(allMembersRegularPanel);
            frame.add(allMembersPremiumPanel);
            frame.revalidate();      //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();         //this is used to re-draw the component
            try{
                int premiumInputId=Integer.parseInt(JOptionPane.showInputDialog(allMembersPremiumPanel, "Enter your ID:"));         
                for (GymMember member: members)         //for each member in arraylist members
                {
                    if(member.getId()==premiumInputId && member instanceof PremiumMember)      //if the id returned from getter is equal to the id entered
                    {
                        //casting from gym member to regular member
                        PremiumMember premiumMember=(PremiumMember) member;
                        premiumMember.display();
                        return;        //immediately exits the method if id is found
                    }
                }
                //else is not written since it shows this dialog box everytime an id doesnt match even though it exists in regular    
                //only if no member was found, i.e if the member doesn't exist at all
                JOptionPane.showMessageDialog(allMembersPremiumPanel, "Member not found!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
            catch (NumberFormatException ex) {                     //if the user enters such risky code, catch catches the exception, and allows the user to be informed about what is to be changed
                JOptionPane.showMessageDialog(allMembersPremiumPanel, "ID must be a number!","Invalid ID", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==addClearButton1)
        {
            //setting all fields empty
            nameText1.setText("");
            locationText1.setText("");
            idText1.setText("");
            phoneNoText1.setText("");
            emailText1.setText("");
            referralSourceText.setText("");
            DOBYear1.setSelectedIndex(0);                   //selects the first option
            DOBMonth1.setSelectedIndex(0);
            DOBDay1.setSelectedIndex(0);
            startDateYear1.setSelectedIndex(0);
            startDateMonth1.setSelectedIndex(0);
            startDateDay1.setSelectedIndex(0);
            //confirmation message
            JOptionPane.showMessageDialog(addARegularMemberPanel, "Welcome! Please enter information about the new member.");
        }
        else if(e.getSource()==addClearButton2)
        {
            //setting all fields empty
            nameText2.setText("");
            locationText2.setText("");
            idText2.setText("");
            phoneNoText2.setText("");
            emailText2.setText("");
            personalTrainerText.setText("");
            DOBYear2.setSelectedIndex(0);                   //selects the first option
            DOBMonth2.setSelectedIndex(0);
            DOBDay2.setSelectedIndex(0);
            startDateYear2.setSelectedIndex(0);
            startDateMonth2.setSelectedIndex(0);
            startDateDay2.setSelectedIndex(0);

            //confirmation message
            JOptionPane.showMessageDialog(addAPremiumMemberPanel, "Welcome! Please enter information about the new member.");
        }
        else if(e.getSource()==memberClearButton1)
        {
            //setting all fields empty
            nameOutputLabel1.setText("");
            locationOutputLabel1.setText("");
            idOutputLabel1.setText("");
            phoneOutputLabel1.setText("");
            emailOutputLabel1.setText("");
            planOutputLabel.setText("");
            dobOutputLabel1.setText("");
            startDateOutputLabel1.setText("");
            attendanceOutputLabel1.setText("");
            loyaltyPointsOutputLabel1.setText("");
            genderOutputLabel1.setText("");
            priceOutputLabel.setText("");
            removalReasonText.setText("");
            referralSourceOutputLabel.setText("");
            removalReasonOutputLabel.setText("");
        }
        else if(e.getSource()==memberClearButton2)
        {
            //setting all fields empty
            nameOutputLabel2.setText("");
            locationOutputLabel2.setText("");
            idOutputLabel2.setText("");
            phoneOutputLabel2.setText("");
            emailOutputLabel2.setText("");
            personalTrainerOutputLabel2.setText("");
            dobOutputLabel2.setText("");
            startDateOutputLabel2.setText("");
            attendanceOutputLabel2.setText("");
            loyaltyPointsOutputLabel2.setText("");
            genderOutputLabel2.setText("");
            fullPaymentOutputLabel.setText("");
            paidAmountOutputLabel.setText("");
        }
        else if(e.getSource()==attendanceButton1)
        {
            String regularId=idOutputLabel1.getText();              //getting the id from the displayed label
            int regularIdInteger = Integer.parseInt(regularId);

            for (GymMember member: members)         //for each member in arraylist members
            {
                if(member.getId()==regularIdInteger && member instanceof RegularMember)      //if the id returned from getter is equal to the id from the panel and if it belongs to regular member
                {
                    if(member.getActiveStatus()==true)
                    {
                        member.markAttendance();
                        int updatedAttendance=member.getAttendance();
                        attendanceOutputLabel1.setText(String.valueOf(updatedAttendance));
                        double updatedLoyaltyPoints=member.getLoyaltyPoints();
                        loyaltyPointsOutputLabel1.setText(String.valueOf(updatedLoyaltyPoints));
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(regularMemberPanel,"Please activate your membership first to mark attendance!","Membership Activation", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }  
        }
        else if(e.getSource()==attendanceButton2)
        {
            String premiumId=idOutputLabel2.getText();              //getting the id from the displayed label
            int premiumIdInteger = Integer.parseInt(premiumId);

            for (GymMember member: members)         //for each member in arraylist members
            {
                if(member.getId()==premiumIdInteger && member instanceof PremiumMember)      //if the id returned from getter is equal to the id from the panel and if it belongs to premium member
                {
                    if(member.getActiveStatus()==true)
                    {
                        member.markAttendance();
                        int updatedAttendance=member.getAttendance();
                        attendanceOutputLabel2.setText(String.valueOf(updatedAttendance));
                        double updatedLoyaltyPoints=member.getLoyaltyPoints();
                        loyaltyPointsOutputLabel2.setText(String.valueOf(updatedLoyaltyPoints));
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(premiumMemberPanel,"Please activate your membership first to mark attendance!","Membership Activation", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }  
        }

        else if(e.getSource()==activateButton1)
        {
            String regularId=idOutputLabel1.getText();              //getting the id from the displayed label
            int regularIdInteger = Integer.parseInt(regularId);

            for (GymMember member: members)         //for each member in arraylist members
            {
                if(member.getId()==regularIdInteger && member instanceof RegularMember)      //if the id returned from getter is equal to the id from the panel and if it belongs to regular member
                {
                    member.activateMembership();
                    JOptionPane.showMessageDialog(regularMemberPanel,"Your account has been activated!");
                }
            }  
        }
        else if(e.getSource()==activateButton2)
        {
            String premiumId=idOutputLabel2.getText();              //getting the id from the displayed label
            int premiumIdInteger = Integer.parseInt(premiumId);

            for (GymMember member: members)         //for each member in arraylist members
            {
                if(member.getId()==premiumIdInteger && member instanceof PremiumMember)      //if the id returned from getter is equal to the id from the panel and if it belongs to premium member
                {
                    member.activateMembership();
                    JOptionPane.showMessageDialog(premiumMemberPanel,"Your account has been activated!");
                }
            }  
        }
        else if(e.getSource()==deactivateButton1)
        {
            String regularId=idOutputLabel1.getText();              //getting the id from the displayed label
            int regularIdInteger = Integer.parseInt(regularId);

            for (GymMember member: members)         //for each member in arraylist members
            {
                if(member.getId()==regularIdInteger && member instanceof RegularMember)      //if the id returned from getter is equal to the id from the panel and if it belongs to regular member
                {
                    member.deactivateMembership();
                }
            }  
        }
        else if(e.getSource()==deactivateButton2)
        {
            String premiumId=idOutputLabel2.getText();              //getting the id from the displayed label
            int premiumIdInteger = Integer.parseInt(premiumId);

            for (GymMember member: members)         //for each member in arraylist members
            {
                if(member.getId()==premiumIdInteger && member instanceof PremiumMember)      //if the id returned from getter is equal to the id from the panel and if it belongs to premium member
                {
                    member.deactivateMembership();
                }
            }  
        }
        else if(e.getSource()==saveButton1)
        {
            String regularId=idOutputLabel1.getText();              //getting the id from the displayed label
            int regularIdInteger = Integer.parseInt(regularId);

            for (GymMember member: members)         //for each member in arraylist members
            {
                if(member.getId()==regularIdInteger && member instanceof RegularMember)      //if the id returned from getter is equal to the id from the panel and if it belongs to regular member
                {
                    String regularRemovalReason= removalReasonText.getText();
                    removalReasonOutputLabel.setText(regularRemovalReason);
                }
            }
        }
        else if(e.getSource()==upgradePlanButton)
        {
            String regularId=idOutputLabel1.getText();              //getting the id from the displayed label
            int regularIdInteger = Integer.parseInt(regularId);

            for (GymMember member: members)         //for each member in arraylist members
            {
                if(member.getId()==regularIdInteger && member instanceof RegularMember)      //if the id returned from getter is equal to the id from the panel and if it belongs to regular member
                {
                    String newPlan=(String) planComboBox.getSelectedItem();
                    //casting
                    RegularMember regularMember = (RegularMember) member;
                    String upgradedPlan=regularMember.upgradePlan(newPlan);
                    JOptionPane.showMessageDialog(regularMemberPanel,upgradedPlan);      //calling the method through dialog box so that the returned statements can be displayed
                    planOutputLabel.setText(regularMember.getPlan());
                    priceOutputLabel.setText(String.valueOf(regularMember.getPlanPrice(regularMember.getPlan())));
                    //sets the value obtained from getPlanPrice method which again takes the plan as parameter
                }
            }  
        }
        else if(e.getSource()==revertButton1)
        {
            String regularId=idOutputLabel1.getText();              //getting the id from the displayed label
            int regularIdInteger = Integer.parseInt(regularId);

            for (GymMember member: members)         //for each member in arraylist members
            {
                if(member.getId()==regularIdInteger && member instanceof RegularMember)      //if the id returned from getter is equal to the id from the panel
                {
                    String reason=removalReasonText.getText();
                    RegularMember regularMember = (RegularMember) member;
                    regularMember.revertRegularMember(reason);
                    planOutputLabel.setText(regularMember.getPlan());
                    planComboBox.setSelectedIndex(0);
                    priceOutputLabel.setText(String.valueOf(regularMember.getPrice()));
                    attendanceOutputLabel1.setText("");
                    loyaltyPointsOutputLabel1.setText("");
                    removalReasonText.setText("");
                    removalReasonOutputLabel.setText("");
                    JOptionPane.showMessageDialog(regularMemberPanel,"Your membership has been reset.");
                }
            }
        }
        else if(e.getSource()==revertButton2)
        {
            String premiumId=idOutputLabel2.getText();              //getting the id from the displayed label
            int premiumIdInteger = Integer.parseInt(premiumId);

            for (GymMember member: members)         //for each member in arraylist members
            {
                if(member.getId()==premiumIdInteger && member instanceof PremiumMember)      //if the id returned from getter is equal to the id from the panel and if it belongs to premium member
                {
                    PremiumMember premiumMember = (PremiumMember) member;
                    premiumMember.revertPremiumMember();
                    attendanceOutputLabel1.setText("");
                    loyaltyPointsOutputLabel1.setText("");
                    discountOutputLabel.setText("");
                    paidAmountOutputLabel.setText("");
                    personalTrainerOutputLabel2.setText("");
                    fullPaymentOutputLabel.setText("");
                    attendanceOutputLabel2.setText("");
                    loyaltyPointsOutputLabel2.setText("");
                    JOptionPane.showMessageDialog(regularMemberPanel,"Your membership has been reset.");
                }
            }
        }
        else if(e.getSource()==discountButton)
        {
            String premiumId=idOutputLabel2.getText();              //getting the id from the displayed label
            int premiumIdInteger = Integer.parseInt(premiumId);

            for (GymMember member: members)         //for each member in arraylist members
            {
                if(member.getId()==premiumIdInteger && member instanceof PremiumMember)      //if the id returned from getter is equal to the id from the panel and if it belongs to premium member
                {
                    PremiumMember premiumMember = (PremiumMember) member;
                    premiumMember.calculateDiscount();
                }
            }
        }
        else if(e.getSource()==paymentButton)
        {
            String premiumId=idOutputLabel2.getText();              //getting the id from the displayed label
            int premiumIdInteger = Integer.parseInt(premiumId);
            String paidAmount=JOptionPane.showInputDialog(premiumMemberPanel,"Enter the amount you want to pay.");
            int premiumPaidAmt=Integer.parseInt(paidAmount);    //converting amount entered by user from String to int
            for (GymMember member: members)         //for each member in arraylist members
            {
                if(member.getId()==premiumIdInteger && member instanceof PremiumMember)      //if the id returned from getter is equal to the id from the panel
                {
                    PremiumMember premiumMember = (PremiumMember) member;
                    String payAmt=premiumMember.payDueAmount(premiumPaidAmt);

                    JOptionPane.showMessageDialog(premiumMemberPanel, payAmt);      //calling the method through dialog box so that the returned statements can be displayed
                    paidAmountOutputLabel.setText(String.valueOf(premiumMember.getPaidAmount()));
                    fullPaymentOutputLabel.setText(String.valueOf(premiumMember.getIsFullPayment()));

                }
            }
        }
        else if(e.getSource()==saveToFileButton1)
        {
            file=new File("MemberDetailsRegular.txt");    //making file in same directory
            //to actually create a file
            try{   
                if(file.createNewFile())    //doesnt exist--> true
                {
                    System.out.println("File is created");
                }
                else{   //MemberDetails.txt exists
                    System.out.println("File already exists");
                }
                writer=new FileWriter(file, true);    //location is stored in file variable
                //getting the values in string format
                //using String format
                String headInFormat=String.format("%-6s %-25s %-15s %-20s %-30s %-10s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-25s %-25s\n",
                        "ID", "Name", "Location", "Phone", "Email","Gender","DOB","Membership Start Date",
                        "Attendance", "Loyalty Points", "ActiveStatus","Plan", "Price","Eligible for Upgrade",
                        "Referral Source");
                writer.write(headInFormat+"\n"); 
                for (GymMember member: members)         //for each member in arraylist members
                { 
                    if(member instanceof RegularMember)      //if the id belongs to regular member
                    {    
                        //casting
                        RegularMember regularMember = (RegularMember) member;
                        String infoInFormat=String.format("%-6s %-25s %-15s %-20s %-30s %-10s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-25s %-25s\n",
                                member.getId(), member.getName(), member.getLocation(), member.getPhone(), member.getEmail(), member.getGender(), member.getDOB(), member.getMembershipStartDate(),
                                member.getAttendance(), member.getLoyaltyPoints(), member.getActiveStatus(), regularMember.getPlan(), regularMember.getPrice(), regularMember.getisEligibleForUpgrade(),
                                regularMember.getReferralSource());

                        writer.write(infoInFormat);
                    }
                }
            }
            catch(IOException f)
            {
                System.out.println("An error has occurred while writing. Please try again.");
            }
            finally{
                //an exception might occur here too, so using try and catch blocks
                try{
                    writer.close();
                }
                catch(IOException f)
                {
                    System.out.println("Sorry! File couldn't be closed properly. Please try again");
                }
            }
        }
        else if(e.getSource()==readFromFileButton1)
        {
            frame.add(readFromFilePanel1);
            frame.remove(readFromFilePanel2);
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(addAMemberLeftPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component
            try{
                //to read
                reader=new FileReader(file);
                int ch; //reads in asci value which is stored in ch
                while((ch=reader.read())!=-1)  //until it is not the end of file (until the asci value is not -1)
                {
                    char c=(char) ch;         //converting the ascii value to char, to obtain data represented by ascii value
                    readAreaRegular.append(String.valueOf(c));   //printing the data in the form of string
                }
            }
            catch(IOException f)
            {
                System.out.println("An error has occurred while reading. Please try again.");
            }
            finally{
                //an exception might occur here too, so using try and catch blocks
                try{
                    reader.close();
                }
                catch(IOException f)
                {
                    System.out.println("Sorry! File couldn't be closed properly. Please try again");
                }
            }
        }
        else if(e.getSource()==saveToFileButton2)
        {
            file2=new File("MemberDetailsPremium.txt");    //making file in same directory
            //to actually create a file
            try{   
                if(file2.createNewFile())    //doesnt exist--> true
                {
                    System.out.println("File is created");
                }
                else{   //MemberDetails.txt exists
                    System.out.println("File already exists");
                }
                writer=new FileWriter(file2, true);    //location is stored in file variable
                //getting the values in string format
                //using String format
                String headInFormat=String.format("%-6s %-25s %-15s %-20s %-30s %-10s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-18s %-25s\n",
                        "ID", "Name", "Location", "Phone", "Email","Gender","DOB","Membership Start Date",
                        "Attendance", "Loyalty Points", "ActiveStatus","Full Payment", "Paid Amount","Discount Amount",
                        "Premium Charge");
                writer.write(headInFormat+"\n"); 
                for (GymMember member: members)         //for each member in arraylist members
                { 
                    if(member instanceof PremiumMember)      //if the id belongs to regular member
                    {    
                        //casting
                        PremiumMember premiumMember = (PremiumMember) member;
                        String infoInFormat=String.format("%-6s %-25s %-15s %-20s %-30s %-10s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-18s %-25s\n",
                                member.getId(), member.getName(), member.getLocation(), member.getPhone(), member.getEmail(), member.getGender(), member.getDOB(), member.getMembershipStartDate(),
                                member.getAttendance(), member.getLoyaltyPoints(), member.getActiveStatus(), premiumMember.getIsFullPayment(), premiumMember.getPaidAmount(), premiumMember.getDiscountAmount(),
                                premiumMember.getPremiumCharge());

                        writer.write(infoInFormat);
                    }
                }
            }
            catch(IOException f)
            {
                System.out.println("An error has occurred while writing. Please try again.");
            }
            finally{
                //an exception might occur here too, so using try and catch blocks
                try{
                    writer.close();
                }
                catch(IOException f)
                {
                    System.out.println("Sorry! File couldn't be closed properly. Please try again");
                }
            }
        }

        else if(e.getSource()==readFromFileButton2)
        {
            frame.add(readFromFilePanel2);
            frame.remove(readFromFilePanel1);
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(addAMemberLeftPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component
            try{
                //to read
                reader=new FileReader(file2);
                int ch; //reads in asci value which is stored in ch
                while((ch=reader.read())!=-1)  //until it is not the end of file (until the asci value is not -1)
                {
                    char c=(char) ch;         //converting the ascii value to char, to obtain data represented by ascii value
                    readAreaPremium.append(String.valueOf(c));   //printing the data in the form of string
                }
            }
            catch(IOException f)
            {
                System.out.println("An error has occurred while reading. Please try again.");
            }
            finally{
                //an exception might occur here too, so using try and catch blocks
                try{
                    reader.close();
                }
                catch(IOException f)
                {
                    System.out.println("Sorry! File couldn't be closed properly. Please try again");
                }
            }
        }
        else if(e.getSource()==displayButton1)
        {
            frame.add(displayPanel1);
            frame.remove(displayPanel2);
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(addAMemberLeftPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component
            for (GymMember member: members)         //for each member in arraylist members
            { 
                if(member instanceof RegularMember)      //if the id belongs to regular member
                {    
                    //casting
                    RegularMember regularMember = (RegularMember) member;
                    displayAreaRegular.append(String.format("%-6s %-25s %-25s %-15s %-30s %-10s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-25s %-25s\n",
                            member.getId(), member.getName(), member.getLocation(), member.getPhone(), member.getEmail(), member.getGender(), member.getDOB(), member.getMembershipStartDate(),
                            member.getAttendance(), member.getLoyaltyPoints(), member.getActiveStatus(), regularMember.getPlan(), regularMember.getPrice(), regularMember.getisEligibleForUpgrade(),
                            regularMember.getReferralSource()));                        
                }
            }
        }
        else if(e.getSource()==displayButton2)
        {
            frame.add(displayPanel2);
            frame.remove(displayPanel1);
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.remove(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(addAMemberLeftPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component

            for (GymMember member: members)         //for each member in arraylist members
            { 
                if(member instanceof PremiumMember)      //if the id belongs to regular member
                {    
                    //casting
                    PremiumMember premiumMember = (PremiumMember) member;
                    displayAreaPremium.append(String.format("%-6s %-25s %-15s %-20s %-30s %-10s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-18s %-25s\n",
                            member.getId(), member.getName(), member.getLocation(), member.getPhone(), member.getEmail(), member.getGender(), member.getDOB(), member.getMembershipStartDate(),
                            member.getAttendance(), member.getLoyaltyPoints(), member.getActiveStatus(), premiumMember.getIsFullPayment(), premiumMember.getPaidAmount(), premiumMember.getDiscountAmount(),
                            premiumMember.getPremiumCharge()));

                }
            }
        }
        else if(e.getSource()==backbutton1)
        {
            frame.remove(displayPanel2);
            frame.remove(displayPanel1);
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.add(regularMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.add(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(addAMemberLeftPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component
        }
        else if(e.getSource()==backbutton2)
        {
            frame.remove(displayPanel2);
            frame.remove(displayPanel1);
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.add(premiumMemberPanel);
            frame.add(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(addAMemberLeftPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component
        }
        else if(e.getSource()==readBackButton1)
        {
            frame.remove(readFromFilePanel1);
            frame.remove(readFromFilePanel2);
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(premiumMemberPanel);
            frame.add(regularMemberPanel);
            frame.add(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(addAMemberLeftPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component
        }
        else if(e.getSource()==readBackButton2)
        {
            frame.remove(readFromFilePanel1);
            frame.remove(readFromFilePanel2);
            frame.remove(addARegularMemberPanel);
            frame.remove(addAPremiumMemberPanel);
            frame.remove(regularMemberPanel);
            frame.add(premiumMemberPanel);
            frame.add(memberManageLeftPanel);
            frame.remove(allMembersLeftPanel);
            frame.remove(addAMemberLeftPanel);
            frame.revalidate();         //this is used to re-calculate the layout/ ensures that the layout updates properly
            frame.repaint();            //this is used to re-draw the component
        }
    }
    //main method
    public static void main (String[] args)
    {
        new GymGUI();
    }
}


