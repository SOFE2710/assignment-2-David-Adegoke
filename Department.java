import java.util.HashSet;
import java.util.Vector;


public class Department {
   private String name;                   // the name of school Dept of Computing and Info Science
   private String id;                     // short name for courses SOFE, ELEE, STAT, etc
   private Vector<Course>courseList;     // all courses offered by the department
   private Vector<Student>registerList;  // all students taking courses in the department.


   public Department(String name, String id)
   {
	      // also initialize the vectors
      this.name = name;
      this.id = id;
      this.courseList = new Vector<Course>();
      this.registerList = new Vector<Student>();
   }

   public String getName()
   {
	   return this.name;
   }

   public String getId()
   {
	  return this.id;
   }

   // adds course to department
   public void offerCourse(Course course)
   {
      this.courseList.add(course);
   }

   // displays arbitrarily the courses offered by department
   public void  printCoursesOffered()
   {
      for(Course course: this.courseList)
         {
            System.out.println(course.toString());
         }
   }

   // displays list of student taking courses in department
   public void printStudentsByName()
   {
      for(Student student: this.registerList)
         {
            System.out.println(student.toString());
         }
   }

   // returns boolean value whether student is registered or not
   public boolean isStudentRegistered(Student student)
   {
      return this.registerList.contains(student);
   }

   // returns vector containing students who registered for course within a given code
   public Vector<Student> studentsRegisteredInCourse(int code)
   {
      Vector<Student> classList = new Vector<Student>();
      for (Course course : courseList)
      {
         if(course.getNumber()==code)
         {
            classList = course.getClassList();
         }
      }
      return classList;
   }
   // prints student registered in a course
   public void printStudentsRegisteredInCourse(int code)
   {
      if (studentsRegisteredInCourse(code).isEmpty())
      {
         System.out.println("No student registered for course");
      }
      else
      {
         for (Student student : studentsRegisteredInCourse(code))
         {
            System.out.println(student.getId() + " " + student.getName());
         }
      }

   }

   // registers student if student takes course but is not registered
   public void registerStudentCourseInDepartment(Student student, Course course)
   {
      if (courseList.contains(course) && !registerList.contains(student))
      {
         registerList.add(student);
      }
   }

   // determines the largest number of registered student in a course


   public String toString() {
      // returns a string representation of department name, number
      // of courses offered and number of students registered in the
      // department. Use the format:
      // ECSE: 53 courses, 460 students

      return this.id + ": " + courseList.size() + " courses, " + registerList.size() + " students";

   }


}
