
/**
 * @class  College
 * @author Pulkit
 * @since  25th August 15
 * This class contains the properties of the college.
 */

public class College {
	
		private String name;
		private int seatsAvailable;
		
		/**
		 * This a is a default constructor.
		 */
		
		public College() {
		}
		
		/**
		 * This is a constructor of college object.
		 * @param{String} name
		 * @param{int} seatsAvailable
		 */
		
		public College(String name, int seatsAvailable)
		{
			this.name = name;
			this.seatsAvailable = seatsAvailable;
		}
		
		/**
		 * @return{String} name
		 */
		
		public String getName() {
			return name;
		}

		/**
		 * @param{String} name 
		 */
		
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return{int} seatsAvailable
		 */
		
		public int getSeatsAvailable() {
			return seatsAvailable;
		}

		/**
		 * This function sets the available seats of the college.
		 * @param{int} seatsAvailable
		 */
		
		public void setSeatsAvailable(int seatsAvailable) {
			this.seatsAvailable = seatsAvailable;
		}

		
}
