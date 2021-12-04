import java.util.Vector;

public class Course{
   private Department dept;
   private String title; // title of the course (e.g. Intro to programming);
   private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
   private int number; // course number, e.g. 1200, 2710, 2800, etc.
   private Vector<Student> classList; // contains all students registered in this course

   public Course(String code, int number, Department dept, String title)
   {
       // also initialize the classList;
       this.dept = dept;
       this.title = title;
       this.code = code;
       this.number = number;
       this.classList = new Vector<Student>();
   }

   public Course() {
	// TODO Auto-generated constructor stub
   }

   //getter for department
   public Department getDept() {
       return this.dept;
   }

   //getter for title
   public String getTitle() {
       return this.title;
   }

   //getter for code
   public String getCode() {
       return this.code;
   }

   //getter for number
   public int getNumber() {
       return this.number;
   }

   //getter for classlist
   public Vector<Student> getClassList() {
        return this.classList;
   }

   //adds student to classList if student does not take course
   public void addStudentToCourse(Student student)
   {
       this.classList.add(student);
   }

    public String toString() {
     // return a string representation of the course with the course code,
     // name, and number of people registered in the course in the following
     // format:
     // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260

     return(this.code + "" + this.number + "" + this.title + ", Enrollment: " + classList.size());

  }
}
