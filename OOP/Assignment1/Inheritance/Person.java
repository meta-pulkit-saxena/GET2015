package Assignment1;

/**
 * Person
 * @author Pulkit
 * @since 13th August 15
 * Contains properties of person
 */ 

public class Person {
    private int uid;
    private String name;
    
    /**
     * Person
     * @param{int} uid
     * @param{String} name
     * Constructor of Person class
     */
    
    public Person(int uid, String name){
        this.uid = uid;
        this.name = name;
    }
    
    /**
     * getUid 
     * @return{int} Uid
     * it returns the Uid of person
     */
    
    public int getUid() {
    	return uid;
    }
    
    /**
     * setUid
     * @param{int} Uid
     * It sets the value of Uid
     */
    
    public void setUid(int uid) {
    	this.uid = uid;
    }
    
    /**
     * getName
     * @return{String}
     * It sets the name of person
     */
    
    public String getName() {
    	return name;
    }
    
    /**
     * setName
     * @param{String} name
     * It sets the name of the person
     */
    
    public void setName(String name) {
    	this.name = name;
    }    
    
    /**
     * toString
     * @return{String}
     * returns a string of name and Uid
     */
    
    public String toString() {
        return "Name:"+name+", uid:"+uid;        
    }
}

