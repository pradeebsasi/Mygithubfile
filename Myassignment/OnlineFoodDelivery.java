package Myassignment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OnlineFoodDelivery {
        public static void main(String[] args) {
            RestaurantDetails rd=new RestaurantDetails("Konguparotta","Erode");
            CustomerFoodDetails cf=new CustomerFoodDetails("Pradeebkumar","Nanjaiuthukuli",968849348);
            System.out.println("Restaurant Details");
            System.out.println("------------------");
            System.out.println("Name of restaurant:"+rd.RestName);
            System.out.println("Location:"+rd.Location);
            System.out.println("----------------");
            System.out.println("Customer Details");
            System.out.println("----------------");
            System.out.println("Name of Customer:"+cf.CustName);
            System.out.println("Location of customer:"+cf.Loc);
            System.out.println("Phone number:"+cf.PhoneNumber);
        }
    }
class RestaurantDetails
{
    String RestName;
    String Location;

    public RestaurantDetails(String restName, String location) {
       this.RestName = restName;
        this.Location = location;
    }
}
class CustomerFoodDetails
{
    String CustName;
    String Loc;
    long PhoneNumber;

    public CustomerFoodDetails(String custName, String loc, int phoneNumber) {
        this.CustName = custName;
        this.Loc = loc;
        this.PhoneNumber = phoneNumber;
    }
}
