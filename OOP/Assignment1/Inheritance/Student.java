
/**
 * @class Student
 * @author Pulkit
 * @since  13th August 15
 * Inherits properties of person class 
 */
 
package Assignment1;

public class Student extends Person {
    
    private int studentId;
    private String[] courses;
    
    /**
     * Constructor for the Student class
     * @param{int} uid
     * @param{String} name
     * @param{int} studentId
     */
    
    public Student(int uid, String name, int studentId) {
        super(uid,name);																// Passing on value to parent class constructor
        this.studentId = studentId;														// Initializes the studentUid of student object
    }
    
    /**
     * getStudentId function returns the studentId
     * @return{int} studentId
     */
    
    public int getStudentId() {
    	return studentId;
    }
    
    /**
     * setStudentId returns stdentId of student
     * @param{int} studentId
     */
    
    public void setStudentId(int studentId) {
    	this.studentId = studentId;														// Sets the studentId
    }
    
    /**
     * getCourses function returns string of courses.
     * @return{String[][]}
     */
    
    public String[] getCourses() {
    	return courses;
    }
    
    /**
     * setCourses function sets courses of the student
     * @param{String[]} courses
     */
    
    public void setCourses(String[] courses) {
    	this.courses = courses;															// Sets the courses.
    }
    
    /**
     * toString function overrides the inbuilt function and returns the string of name ,Uid and studentId
     * @override toString
     * @return{String} 
     */
    
    public String toString() {        
        return super.toString() + ", StudentId:"+studentId;
    }
}

