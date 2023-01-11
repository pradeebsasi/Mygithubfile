package Myassignment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpDetails {
        public static void main(String[] args)
        {
            Qualification eq=new Qualification("Pradeenkumar","MCA");
            Interview i=new Interview("SoftwizTech","Tester");
            System.out.println("----------------");
            System.out.println("Employee Details");
            System.out.println("----------------");
            System.out.println("Name of Employee:"+eq.Name);
            System.out.println("Qualification of Employee:"+eq.EduQualification);
            System.out.println("-----------------");
            System.out.println("Interview Details");
            System.out.println("-----------------");
            System.out.println("Name of Company:"+i.CompanyName);
            System.out.println("Designation:"+i.post);
        }
    }
class Qualification
{
    String Name;
    String EduQualification;

    public Qualification(String name, String eduQualification) {
        this.Name = name;
        this.EduQualification = eduQualification;
    }
}
class Interview
{
    String CompanyName;
    String post;

    public Interview(String companyName, String post) {
        CompanyName = companyName;
        this.post = post;
    }
}
