package Assignment1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Name: TowerOfHanoi
 * @author Pulkit
 * Since: 11th August 15
 *  Arranges the peg in ascending order
 **/

	public class TowerOfHanoi {																									// TowerOfHanoi Constructor
		int noOfDisk;
		List<String> diskMovementList;

	/**
	 * Constructor
	 * @param{int} noOfdisks
	 */

	public TowerOfHanoi(int noOfdisks) {
		this.noOfDisk = noOfdisks;
		diskMovementList = new ArrayList<String>();
	}


	/**
	 * towerOfHanoi
	 * @param{String} source peg
	 * @param{String} destination peg
	 * @param{String} intermediate peg
	 * @param{int} noOfDisk
	 * @return{List<String>} List of
	 * Performs the movement of pegs
	 */


	public List<String> towerOfHanoi(String source, String destination,String intermediate, int noOfDisk) {
		int disks = this.noOfDisk - noOfDisk + 1;
		if (noOfDisk == 1) {
			String content = "Move Disk " + disks + " from " + source + " to "+ destination;
			diskMovementList.add(content);
		}
		else {
			towerOfHanoi(source, intermediate, destination, noOfDisk - 1);
			String content = "Move Disk " + disks + " from " + source + " to "+ destination;
			diskMovementList.add(content);
			towerOfHanoi(intermediate, destination, source, noOfDisk - 1);														//recursion call

		}
		return diskMovementList;
	}

	public static void main(String[] args) throws IOException {
		int noOfDisk;
		Scanner scan = new Scanner(System.in);
		System.out.println("Tower of Hanoi problem");
		System.out.println("Enter no of disc\t");																				//input
		try {
			noOfDisk = scan.nextInt();
			if(noOfDisk < 0) throw new IllegalArgumentException("Illegal Input"); {
				scan.close();
			}
			TowerOfHanoi towerOfHanoi = new TowerOfHanoi(noOfDisk);
			List<String> diskMovementList = towerOfHanoi.towerOfHanoi("A", "B","C", noOfDisk);
			for (int index = 0; index < diskMovementList.size(); index++) {
				System.out.println(diskMovementList.get(index));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
