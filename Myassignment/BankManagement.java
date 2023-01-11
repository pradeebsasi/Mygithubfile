package Myassignment;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class BankManagement {


        public static void main(String[] args) {
            CustomerDetails cd=new CustomerDetails("pradeebkumar",12345678);
            BankDetails bd=new BankDetails("Canara Bank","Erode");
            System.out.println("----------------");
            System.out.println("Customer Details");
            System.out.println("----------------");
            System.out.println("Name of customer is:"+cd.CustomerName);
            System.out.println("Account number is:"+cd.AccountNumber);
            System.out.println("------------");
            System.out.println("Bank Details");
            System.out.println("------------");
            System.out.println("Name of Bank:"+bd.BankName);
            System.out.println("Branch name:"+bd.Branch);
        }
    }

class BankDetails {
    String BankName;
    String Branch;

    public BankDetails(String bankName, String branch) {
        this.BankName = bankName;
        this.Branch = branch;
    }
}

class CustomerDetails {
    String CustomerName;
    int AccountNumber;

    public CustomerDetails(String customerName, int accountNumber) {
        this.CustomerName = customerName;
        this.AccountNumber = accountNumber;
    }
}

