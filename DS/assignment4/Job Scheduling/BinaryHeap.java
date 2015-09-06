
/**
 * This class contains all the functions related to max heap.
 * @class  BinaryHeap
 * @author Pulkit
 * @since  30th August 15
 */

package assignment4;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap {
     private Job jobObj;
     private List heap = new ArrayList();
   
    /**
     * This function sets the job object of the class.
	 * @return{Job} jobObj
	 */
	
    public void setJobObj(Job jobObj) {
	this.jobObj =  jobObj;
    }
	
    /**
     * This function is a default constructor.
     */
	
    public BinaryHeap(){
    }
     
    /**
     * This function adds a element in the heap.
     */
    
    public void add(){
    	heap.add(null);
        int location = heap.size()-1;
        while (location > 0){
            int parent = (location-1)/2;
            int parentValue = new Integer(heap.get(parent).toString()).intValue();
            if(jobObj.getPriority() <= parentValue){
                break;
            }
            heap.set(location,parentValue);
            location = parent;
        }
        heap.set(location,jobObj.getPriority());
    }
    
    /**
     * This function percolate up .
     * @param{int} location
     * @param{priority} key
     */
    
    public void percolateUp(int location, int key){
        if(heap.isEmpty())
            return ;

        while(location < heap.size() /2){
            int child = 2*location + 1; 
            if(child < heap.size() -1 &&
               (new Integer(heap.get(child).toString()).intValue() <
                new Integer(heap.get(child+1).toString()).intValue()    )){
                child++;
            }
            if(key >= new Integer(heap.get(child).toString()).intValue()){
                break;
            }
            heap.set(location,new Integer(heap.get(child).toString()).intValue());
            location = child;
        }
        heap.set(location,key);
    }
    
    
    /**
     * This function removes the max node from the heap.
     * @return{int} removeNode
     */
    
    public int remove()
    {
        int removeNode = new Integer(heap.get(0).toString()).intValue();
        int lastNode = new Integer(heap.remove(heap.size()-1).toString()).intValue();
        percolateUp(0,lastNode);
        return removeNode;
    }
    
    /** 
     * This function checks if the heap is empty. 
     * @return{boolean}
     */
    
    public boolean isEmpty()
    {
        return heap.isEmpty();
    }
}
