package Assignment1;

/**
 * Student
 * @author Pulkit
 * @since  13th August 15
 * Inherits properties of person class 
 */

public class Student extends Person {
    
    private int studentId;
    private String[] courses;
    
    /**
     * Student
     * @param{int} uid
     * @param{String} name
     * @param{int} studentId
     * Constructor for the Student class
     */
    
    public Student(int uid, String name, int studentId) {
        super(uid,name);
        this.studentId = studentId;
    }
    
    /**
     * getStudentId
     * @return{int} studentId
     * returns the studentId
     */
    
    public int getStudentId() {
    	return studentId;
    }
    
    /**
     * setStudentId
     * @param studentId
     * returns stdentId of student
     */
    
    public void setStudentId(int studentId) {
    	this.studentId = studentId;
    }
    
    /**
     * getCourses
     * @return{String[][]}
     * 
     */
    
    public String[] getCourses() {
    	return courses;
    }
    
    /**
     * setCourses
     * @param{String[]} courses
     * sets courses of the student
     */
    
    public void setCources(String[] courses) {
    	this.courses = courses;
    }
    
    /**
     * @return{String} 
     * returns the string of name ,Uid and studentId
     */
    
    public String toString() {        
        return super.toString() + ", StudentId:"+studentId;
    }
}

