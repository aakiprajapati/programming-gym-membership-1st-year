public abstract class GymMember
{
    //instance variables
    protected int id;
    protected String name;
    protected String location;
    protected String phone;
    protected String email;
    protected String gender;
    protected String DOB;
    protected String membershipStartDate;
    protected int attendance;
    protected double loyaltyPoints;
    protected boolean activeStatus;
    
    //constructor
    public GymMember(int id, String name, String location, String phone,String email, String gender, String DOB, String membershipStartDate)
    {
       this.id=id;
       this.name=name;
       this.location=location;
       this.phone=phone;
       this.email=email;
       this.gender=gender;
       this.DOB=DOB;
       this.membershipStartDate=membershipStartDate;
       this.attendance= 0;
       this.loyaltyPoints= 0;
       this.activeStatus= false;
    }
    
    //accessor methods
    public int getId()
    {
        return this.id;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getLocation()
    {
        return this.location;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public String getGender()
    {
        return this.gender;
    }
    
    public String getDOB()
    {
        return this.DOB;
    }
    
    public String getMembershipStartDate()
    {
        return this.membershipStartDate;
    }
    
    public int getAttendance()
    {
        return this.attendance;
    }
    
    public double getLoyaltyPoints()
    {
        return this.loyaltyPoints;
    }
    
    public boolean getActiveStatus()
    {
        return this.activeStatus;
    }
    
    //methods
    public abstract void markAttendance();  //creates an abstract method which is implemented in the subclasses
    
    public void activateMembership()
    {
        this.activeStatus= true;                 //active status is set to true when the membership is activated
        System.out.println("Your membership has been activated successfully");
    }
    
    public void deactivateMembership()
    {
        if(this.activeStatus==true)                    //sets the condition that deactivation is only possible when active status is initially true
        {
            this.activeStatus= false;                 //active status is set to false when the membership is deactivated
            System.out.println("Your membership has been deactivated successfully");
        }
        else
        {
            System.out.println("Please activate your membership first");
        }
    }
    
    public void resetMember()
    {
        this.activeStatus= false;                // active status is set to false when the membership is reset
        this.loyaltyPoints=0;                    // loyalty points status is set to zero when the membership is reset
        this.attendance=0;                       // attendance is set to zero when the membership is reset
    }
    
    //display method
    public void display()
    {
        System.out.println("The id is "+this.id +".");                                       //it displays the id of the member
        System.out.println("The name is "+this.name +".");                                   //it displays the name of the member
        System.out.println("The location is "+this.location +".");                           //it displays the location of the member
        System.out.println("The phone number is "+this.phone +" .");                          //it displays the phone number of the member
        System.out.println("The email is "+this.email +".");                                 //it displays the email of the member
        System.out.println("The gender is "+this.gender +".");                               //it displays the gender of the member
        System.out.println("The DOB is "+this.DOB +".");                                     //it displays the dob of the member
        System.out.println("The membership start date is "+this.membershipStartDate +".");  //it displays the start date of the member
        System.out.println("The attendance is "+this.attendance +".");                       //it displays the of the member
        System.out.println("The loyalty points is "+this.loyaltyPoints +".");                //it displays the of the member
        System.out.println("The active status is "+this.activeStatus +".");                  //it displays the of the member
    }
}