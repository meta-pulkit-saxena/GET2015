
/**
 * @class  College
 * @author Pulkit
 * @since  25th August 15
 * This class contains the properties of the college.
 */

public class College {
	
		private String name;
		private int seatsAvailable;
		private int rank;
		private int collegeId;
		
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
		
		public College(String name, int seatsAvailable, int rank, int collegeId) {
			this.name = name;
			this.seatsAvailable = seatsAvailable;
			this.rank = rank;
			this.collegeId = collegeId;
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


		/**
		 * This function returns the rank of the college. 
		 * @return{int} rank
		 */
		
		public int getRank() {
			return rank;
		}

		/**
		 * This function sets the rank of the college.
		 * @param rank the rank to set
		 */
		
		public void setRank(int rank) {
			this.rank = rank;
		}

		/**
		 * This function returns the college id of the college.
		 * @return{int} the collegeId
		 */
		
		public int getCollegeId() {
			return collegeId;
		}

		/**This function sets the collegeId of the college.
		 * @param{int} collegeId the collegeId to set
		 */
		
		public void setCollegeId(int collegeId) {
			this.collegeId = collegeId;
		}
}
