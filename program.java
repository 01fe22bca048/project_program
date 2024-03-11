import java.util.*;
class program
{
   public static void main(String args[])
{
 
    Course c=new Course();
    
   c.read_details();
   c.calculate();

}
}
   class student{

   
   String name;
   String program;
   int semester;

   Scanner sc=new Scanner(System.in);

   void read_details()
   {
    
    System.out.println("Enter Student name");
    name=sc.next();
    System.out.println("Enter Program name");
    program=sc.next();
    System.out.println("Enter Semester ");
    semester=sc.nextInt();
   }

   void display_detail()
   {
      System.out.println("Student name is  " + name);
      System.out.println("Students enrolled  program   is  " + program);
      System.out.println("Students current semester is  " + semester);

   }
}

class Course extends student{
   String course;
   int marks;

   void calculate()
   {
      System.out.println("Enter Course name : ");
      course=sc.next();
      System.out.println("Enter marks : ");
      marks=sc.nextInt();

      if(marks<40)
      {
         display_detail();
         System.out.println("Course name is " + course);
         System.out.println("Marks secured : " + marks);
      }
      else
      display_detail();
   }
}




