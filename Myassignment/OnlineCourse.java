package Myassignment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OnlineCourse {
        public static void main(String[] args) {
            CourseDetails cd=new CourseDetails("Java",20000);
            StudentTrainee st=new StudentTrainee("Pradeebkumar","MCA","Erode");
            TrainerDetails td=new TrainerDetails("Hemalatha","Java",15000);
            System.out.println("Course Details");
            System.out.println("--------------");
            System.out.println("Name of course"+cd.CourseName);
            System.out.println("Fee:"+cd.FeeDetails);
            System.out.println("---------------");
            System.out.println("Student Details");
            System.out.println("---------------");
            System.out.println("Name of Student:"+st.Name);
            System.out.println("Qualification:"+st.Qualification);
            System.out.println("Location:"+st.loc);
            System.out.println("---------------");
            System.out.println("Trainer Details");
            System.out.println("---------------");
            System.out.println("Name of Trainer:"+td.name);
            System.out.println("Subject:"+td.sub);
            System.out.println("Salary of Trainer:"+td.sal);


        }
    }

class CourseDetails
{
    String CourseName;
    long FeeDetails;

    public CourseDetails(String courseName, long feeDetails) {
        this.CourseName = courseName;
        this.FeeDetails = feeDetails;
    }
}
class StudentTrainee {
    String Name;
    String Qualification;
    String loc;

    public StudentTrainee(String name, String qualification, String loc) {
        this.Name = name;
        this.Qualification = qualification;
        this.loc = loc;
    }
}
class TrainerDetails {
    String name;
    String sub;
    long sal;

    public TrainerDetails(String name, String sub, long sal) {
        this.name = name;
        this.sub = sub;
        this.sal = sal;
    }
}