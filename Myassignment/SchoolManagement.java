package Myassignment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SchoolManagement {
        public static void main(String[] args)
        {
            Studentdetails sd=new Studentdetails("Pradeebkumar","MCA",001,968849348);
            TeacherDetails td=new TeacherDetails("Hemalatha","M.phil",101,971570762);
            System.out.println("Student Details");
            System.out.println("---------------");
            System.out.println("Name of student is :"+sd.StudentName);
            System.out.println("Class :"+sd.Class);
            System.out.println("Student id is :"+sd.StudentId);
            System.out.println("Student phone number is :"+sd.PhoneNumber);
            System.out.println("Teacher Details");
            System.out.println("---------------");
            System.out.println("Name of teacher is :"+td.TeacherName);
            System.out.println("Qualification :"+td.Qualification);
            System.out.println("Teacher id is :"+td.TeacherId);
            System.out.println("Teacher phone number is :"+td.PhoneNumber1);


        }
    }
class Studentdetails
{
    String StudentName;
    String Class;
    int StudentId;
    int PhoneNumber;

    public Studentdetails(String studentName, String Class, int studentId, int phoneNumber) {
        this.StudentName = studentName;
        this.Class = Class;
        this.StudentId = studentId;
        this.PhoneNumber = phoneNumber;

    }
}
class TeacherDetails {
    String TeacherName;
    String Qualification;
    int TeacherId;
    int PhoneNumber1;

    public TeacherDetails(String teacherName, String qualification, int teacherId, int phoneNumber1) {
        this.TeacherName = teacherName;
        this.Qualification = qualification;
        this.TeacherId = teacherId;
        this.PhoneNumber1 = phoneNumber1;
    }
}