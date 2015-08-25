/**
 * @class Person
 * @author Pulkit
 * @since 13th August 15
 * Contains properties of person and functions
 */ 

package Assignment1;

public class Person {
    private int uid;																// Private members
    private String name;
    
    /**
     * @param{int} uid
     * @param{String} name
     * Person is a Constructor of class Person. It initializes the uid and 
     * name members of the object
     */
    
    public Person(int uid, String name){
        this.uid = uid;																// Initializes the uid	
        this.name = name;															// Initializes the name 
    }
    
    /** 
     * getUid function returns the Uid of person object
     * @return{int} Uid
     */
    
    public int getUid() {
    	return uid;
    }
    
    /**
     * setUid sets the value of Uid of object
     * @param{int} Uid
     */
    
    public void setUid(int uid) {
    	this.uid = uid;																// sets the value of uid member of object 													
    }
    
    /**
     * It sets the name of person object
     * @return{String}
     */
    
    public String getName() {
    	return name;
    }
    
    /**
     * It sets the name of the person
     * @param{String} name
     */
    
    public void setName(String name) {
    	this.name = name;															// sets the value of name member of object 
    }    
    
    /**
     * This method overrides the inbuilt toString function and returns a string of name and Uid
     * @override toString
     * @return{String}
     */
    
    public String toString() {
        return "Name:"+name+", uid:"+uid;        
    }
}

