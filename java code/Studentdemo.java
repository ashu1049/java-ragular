public class Studentdemo {
    int rollno;
    String name, course;
    float fee;

    Studentdemo(int rollno, String name, String course)
    {
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }

    Studentdemo(int rollno, String name, String course, float fee)
    {
        this(rollno,name,course);  // reusing the constructor or constructor chaining
        this.fee=fee;
        
    }

    void display()
    {
        System.out.println("Roll no:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Course:"+course);
        System.out.println("Fee:"+fee);
    }

    public static void main(String args[])
    {
        Studentdemo s1= new Studentdemo(101,"Ashu" , "Btech");
        Studentdemo s2= new Studentdemo(102,"ashutosh","btech",1000);
        s1.display();
        s2.display();

    }
     
}
