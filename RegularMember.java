public class RegularMember extends GymMember
{
    //instance variables
    private final int attendanceLimit;
    private boolean isEligibleForUpgrade;
    private String removalReason;
    private String referralSource;
    private String plan;
    private double price;
    
    //constructor
    public RegularMember(int id, String name, String location, String phone,String email, String gender, String DOB, String membershipStartDate, String referralSource) throws InvalidIdException, InvalidPhoneException
    {
        super(id, name, location, phone, email, gender, DOB, membershipStartDate);  //calls the instance variables from the parent class
        this.referralSource=referralSource;
        this.attendanceLimit=30;
        this.isEligibleForUpgrade=false;
        this.removalReason="";
        this.plan="Basic";
        this.price=6500;
    }
    
    //accessor methods
    public int getattendanceLimit()
    {
        return this.attendanceLimit;
    }
    
    public boolean getisEligibleForUpgrade()
    {
        return this.isEligibleForUpgrade;
    }
    
    public String getRemovalReason()
    {
        return this.removalReason;
    }
    
    public String getReferralSource()
    {
        return this.referralSource;
    }
    
    public String getPlan()
    {
        return this.plan;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    @Override
    public void markAttendance()     //overriding the abstract method from parent class 
    {   
        this.attendance++;           //increases attendance by 1 
        this.loyaltyPoints+=5;      //increases loyalty points by 5
        if(this.attendance>=this.attendanceLimit)
        {
            this.isEligibleForUpgrade=true;                 //the member is eligible for upgrade only if their attendance is equals to or greater than 30
        }
    }
    //switch case for price of various plans
    public double getPlanPrice(String plan)
    {
        switch(plan.toLowerCase())      //converts plan entered by user to lower case
        {
          case "basic":         //it checks whether the plan entered by the user is "basic"
              return 6500;  
             // here when a return statement is written, break statement is omitted because whenever "return" is written, it immediately exits the case, effectively acting like "break"
          case "standard":      //it checks whether the plan entered by the user is "standard"
                return 12500;
          case "deluxe":
                return 18500;   //it checks whether the plan entered by the user is "deluxe"
          default:
                return -1;      //it returns the value -1 if invalid plan was entered
            }
    }
    
    //method to upgrade plan
    public String upgradePlan(String plan)
    {                                  
        if(this.isEligibleForUpgrade==false)
        {
            //if the user is ineligible
            return "Sorry! Ineligible for upgrade. Attendance must be atleast 30!";
        }
        else
        {
          if(this.plan.equalsIgnoreCase(plan))              //.equalsIgnoreCase ignores the case of the plan entered by the user to compare with the previous plans
          {
            //if the user enters the same plan
            return "You have already subscribed to this plan.";
          }
          
          else if(this.plan.equalsIgnoreCase("standard")&& plan.equalsIgnoreCase("basic"))
          {
              /*this is done to compare if the user is trying to upgrade from standard to basic which is
                 not possible*/
              return "You cannot upgrade from "+this.plan + " to "+plan;
          }
          
          else if((this.plan.equalsIgnoreCase("deluxe")&& plan.equalsIgnoreCase("basic"))||(this.plan.equalsIgnoreCase("deluxe")&& plan.equalsIgnoreCase("standard")))
          /*this is done to compare if the user is trying to upgrade from deluxe to basic or standard which is
             not possible*/
          {
              return "You cannot upgrade from "+this.plan + " to "+plan;
          }
          
          else{
              double newPrice=this.getPlanPrice(plan);   /*this.getPlanPrice(plan) is used to input plan from user, and get the respective price through the method calling,
                                                          whose value is stored in the local variable newPrice*/
              if(newPrice==-1){
                  return "Invalid plan selected!";
                }
              else{
                  this.plan=plan;           //this.plan represents the instance variable whereas plan represents the method's local variable
                  this.price = newPrice;    //this.price is updated with the new price according to the user's updated plan
                  return "You have successfully upgraded to "+this.plan+". Thank You!";
              }
            } 
        }
    }
    
    public void revertRegularMember(String removalReason)       //asks the user to enter removal reason
    {
        super.resetMember();               //calls the resetMember method from the GymMember class
        this.removalReason=removalReason;
        this.isEligibleForUpgrade=false;
        this.plan="Basic";
        this.price=6500;
        System.out.println("Your plan has successfully been reverted");
    }
    
    @Override
    public void display()
    {
        super.display();                                     //calls the display method from the GymMember class
        System.out.println("The plan is "+this.plan +".");        //it displays the plan of the member
        System.out.println("The price is "+this.price +".");      //it displays the price of the respective plan
        if(!this.removalReason.equals(""))
        {
        System.out.println("The removal reason is "+this.removalReason);                  //it displays the removal reason only if it isn't empty
        }   
    }
}
    
    
    
    
    
    
    
    
