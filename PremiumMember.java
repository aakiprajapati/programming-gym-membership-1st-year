public class PremiumMember extends GymMember
{
    private final double premiumCharge;
    private String personalTrainer;
    private boolean isFullPayment;
    private double paidAmount;
    private double discountAmount;
    
    //constructor
    public PremiumMember(int id, String name, String location, String phone,String email, String gender, String DOB, String membershipStartDate, String personalTrainer) throws InvalidIdException, InvalidPhoneException
    {
        super(id, name, location, phone, email, gender, DOB, membershipStartDate);
        this.personalTrainer=personalTrainer;
        this.premiumCharge=50000;
        this.isFullPayment=false;
        this.paidAmount=0;
        this.discountAmount=0;
        
    }
    
    //accessor methods
    public double getPremiumCharge()
    {
        return this.premiumCharge;
    }
    
    public String getPersonalTrainer()
    {
        return this.personalTrainer;
    }
    
    public boolean getIsFullPayment()
    {
        return this.isFullPayment;
    }
    
    public double getPaidAmount()
    {
        return this.paidAmount;
    }
    
    public double getDiscountAmount()
    {
        return this.discountAmount;
    }
    
    @Override
    public void markAttendance()     //overriding the abstract method from parent class 
    {   
        this.attendance++;          //increases attendance by 1 
        this.loyaltyPoints+=10;     //increases loyalty points by 10
    }
    
    //method to determine the paid amount
    public String payDueAmount(int paidAmount)
    {
        this.paidAmount+=paidAmount;            //it adds the new paid amount to the already paid amount 
        if(this.paidAmount==this.premiumCharge)
        {
            //checking if the user has already done the full payment
            this.isFullPayment=true;
        }
        else{
            this.isFullPayment=false;
        }
        
        if(this.isFullPayment==true)
        {
            //when full payment is done
            return "You have paid the full payment.";
        }
        else if(this.paidAmount>this.premiumCharge)
        {
            //when the customer pays extra amount than required
            double extraAmount=this.paidAmount-this.premiumCharge;
            return "The payment has exceeded the premium charge. The extra amount you have paid is "+extraAmount;
        }
        else{
            //returning the remaining amount to be paid by the user
            double remainingAmount= this.premiumCharge-this.paidAmount;
            return "The remaining amount is "+remainingAmount;
        }
    }
        
    //method to calculate discount
    public void calculateDiscount()
    {
        if(isFullPayment==true)
            {
                //showing the discount amount to the premium customers if the full payment has been done
                this.discountAmount= this.premiumCharge/10;         // 10% of premium charge=(10/100)*premium charge
                System.out.println("The discount amount is "+this.discountAmount);
            }
        else{
            System.out.println("Sorry! Discount not possible. Full payment must be done.");
        }
    }
    
    public void revertPremiumMember()
    {
        super.resetMember();            //it calls the resetMember method from parent class and performs the required functions
        this.personalTrainer="";        //it sets the personal trainer to empty
        this.isFullPayment=false;       //it sets the full payment value to false
        this.paidAmount=0;              //it sets the paid amount to 0
        this.discountAmount=0;          //it sets the discount amount to 0
        System.out.println("Your plan has successfully been reverted");
    }
    
    @Override
    public void display()
    {
        super.display();              //it displays all the attributes of parent class
        System.out.println("The personal trainer is "+this.personalTrainer +".");
        System.out.println("The paid amount is "+this.paidAmount +".");
        System.out.println("The full payment is "+this.isFullPayment +".");
        double remainingAmount= this.premiumCharge-this.paidAmount;
        System.out.println("The remaining amount is "+remainingAmount);
        if(isFullPayment==true)
        {
            System.out.println("The discount amount is "+this.discountAmount +".");
            //it displays the discount amount only if the customer has completed the payment
        }
    }
}