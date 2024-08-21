import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static Student[] studentArr = new Student[60];

    public static Student getStudentInfo()throws IOException{
        System.out.print("Enter the Student Name : ");
        String name = br.readLine();
        System.out.print("Enter the Student Nickname : ");
        String nickName = br.readLine();
        System.out.print("Enter the Student Address1 : ");
        String address1 = br.readLine();
        System.out.print("Enter the Student Address2 ( Type Enter to skip ) : ");
        String address2 = br.readLine();

        int[] marks = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ":");
            int mark = Integer.parseInt(br.readLine());
            marks[i] = mark;
        }
        Student student;
        if (address2.isEmpty()) {
            student= new Student(name,nickName,address1,marks);
        }else{
            student = new Student(name,nickName,address1,address2,marks);
        }
        return null;
    }

    public static void main(String[] args)throws IOException {
        getStudentInfo();
        String flag ="";

        do {
            Student student = getStudentInfo();
            studentArr[Student.getStudentCount()-1]=student;
            System.out.print("Do u want to enter new Student? (Yes/No)");
            flag = br.readLine();
        }
        while(flag.equalsIgnoreCase("yes"));
            display();

    }
    public static void display(){
        for(int i = 0; i<Student.getStudentCount()-1;i++){
            studentArr[i].display();
        }
        System.out.print("Mean Mark :"+Student.getMeanMarks() +"\n");
        System.out.print("Total Students : "+ Student.getStudentCount());
        System.out.println(Student.getStudentCount());
    }
}
