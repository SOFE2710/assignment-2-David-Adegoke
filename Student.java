import java.util.Vector;

public class Student extends Person{
  private String id;
  private String name;
  private Vector<Course> courses; // contains all courses the student is registered in

	public Student(String stdName, String stdId)
	{
		//Initialize
	   this.id = stdId;
	   this.name = stdName;
	   this.courses = new Vector<Course>();
	}

	public String getName()
	{
		return this.name;
	}

	public String getId()
	{
		return this.id;
	}

	// constructors
	public void registerFor(Course course)
	{
		// checks if course is present in courses
		if(!this.courses.contains(course))
			{
				this.courses.add(course);						// adds course if not present in student's list
			}
	}

	// returns a boolean value if student is registered in course or not
	public boolean isRegisteredInCourse(Course course)
	{
		if(this.courses.contains(course))
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	public String toString() {
     // return a string representation of a student using the following format:
     // 100234546 John McDonald
     // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
		return this.id + " " + this.name + " | Registered courses: " + courses.toString();
  }
}
