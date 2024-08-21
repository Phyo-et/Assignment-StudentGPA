import java.util.Arrays;

public class Student {
    private String name;
    private String nickname;
    private int[] marks;
    private String address1;
    private String address2;

    private static int studentCount =0;
    private static int allTotalMarks;

    public Student(String name,String nickname,String address1,int[] marks){
        this.name=name;
        this.nickname=nickname;
        this.address1=address1;
        this.marks= marks;
        studentCount++;
        allTotalMarks += this.totalMark();
    }

    public Student(String name,String nickname,String address1,String address2,int[] marks){
        this.name=name;
        this.nickname=nickname;
        this.address1=address1;
        this.address2=address2;
        this.marks= marks;
        studentCount++;
        allTotalMarks += this.totalMark();
    }

    private int totalMark(){
        int total=0;
        for (int i=0; i<this.marks.length;i++){
            total= total+this.marks[i];
        }
        return total;
    }
    public static double getMeanMarks(){
        double mean= allTotalMarks/studentCount;
        return mean;
    }
    public double calculateGPA(){
        int total=this.totalMark();
        double gpa= total/this.marks.length;
        return gpa;
    }
    public void display(){
        System.out.println("Student Name : "+ name);
        System.out.println("Student Nickname : "+ nickname);
        System.out.println("Student Address1 : "+ address1);
        System.out.println("Student Address2 : "+ address2);
        System.out.println("Marks : "+ Arrays.toString(this.marks));
        System.out.println("GPA : "+ this.calculateGPA());
    }
    public static int getStudentCount(){
        return studentCount;
    }
}