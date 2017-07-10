package StringFeatures;

public class StringJoin {

	public static void main(String args[]) {

		//First Type
		String firstType = String.join(" and ", "PGeorge", "James Harden", "Lebron James");
		System.out.println(firstType);
		//result
		//PGeorge and James Harden and Lebron James.
		
		//Second Type
		String[] secondType = {"California", "Indiana", "Montana"};
		System.out.println(String.join(" and ", secondType));
		//result
		//California and Indiana and Montana

	}
}
