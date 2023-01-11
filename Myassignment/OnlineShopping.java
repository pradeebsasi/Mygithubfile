package Myassignment;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class OnlineShopping {
        public static void main(String[] args) {
            CustDetails cd=new CustDetails("Pradeebkumar",968849348,"Mobile Phone");
            ItemDetails id=new ItemDetails("iphone",65000,"pink");
            System.out.println("Customer Details");
            System.out.println("----------------");
            System.out.println("Name of customer:"+cd.name);
            System.out.println("Phone number:"+cd.phnum);
            System.out.println("Name of item:"+cd.itemname);
            System.out.println("------------");
            System.out.println("Item Details");
            System.out.println("------------");
            System.out.println("Name of item"+id.itemname);
            System.out.println("Price:"+id.price);
            System.out.println("Color of product:"+id.color);
        }

    }
class CustDetails {
    String name;
    long phnum;
    String itemname;

    public CustDetails(String name, long phnum, String itemname) {
        this.name = name;
        this.phnum = phnum;
        this.itemname = itemname;
    }
}

class ItemDetails {
    String itemname;
    float price;
    String color;

    public ItemDetails(String itemname, float price, String color) {
        this.itemname = itemname;
        this.price = price;
        this.color = color;
    }
}
