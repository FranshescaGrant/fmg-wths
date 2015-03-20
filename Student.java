public class Student{
private String firstName;
private String lastName;
private int gradeLevel;
private static int count = 0;
private double gpa;
int id;

public Student( ){
   this("Placeholder", "Placehoolder",0,0);
}
public Student (String fn, String ln,int gl,double g){
   firstName=fn;
   lastName=ln;
   gradeLevel=gl;
   gpa=g;
   count++;
   id = count;
}
public Student(String fn){
   firstName=fn;
}
public void setfName(String fn){
   firstName=fn;
}
public void serGradeLevel(int gl){
   gradeLevel+=gl;
   if(gl<=12);
}
public void setGPA(double g){
   gpa+=g;
   if(g<=4.5);
}

public String toString(){
   return "First Name: "+firstName+" Grade Level: "+gradeLevel+" GPA: "+gpa+" Student ID: "+count;
   }
}