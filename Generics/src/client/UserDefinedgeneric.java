package client;

public class UserDefinedgeneric {
	
	public static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName()
				+ " = " + element);
	}

	public static void main(String[] args) {
		//UserDefinedgeneric userDefined = new UserDefinedgeneric();
		genericDisplay("Shubham");

	}

}
