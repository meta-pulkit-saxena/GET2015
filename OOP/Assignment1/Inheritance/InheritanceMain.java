package Assignment1;

/**
 * InheritanceMain
 * @author Pulkit
 * @since 13th August 15 Controls the person and student objects
 */

public class InheritanceMain {

	public static void main(String args[]) {

		Person per = new Person(20, "Name1");
		per.setName("ChangedName1");
		per.setUid(21);
		System.out.println("Name:" + per.getName());
		System.out.println("Uid:" + per.getUid());
		System.out.println(per.toString());

		Student stud = new Student(20, "Name2", 26);
		stud.setName("ChangedName2");
		stud.setUid(24);
		System.out.println("Name:" + stud.getName());
		System.out.println("Uid:" + stud.getUid());
		System.out.println(stud.toString());
	}
}
