class Instanceclass {

	// Declaring and initializing string
	 String name = "GeeksForGeeks";

	// Main driver method
	public static void main(String[] args) 
	{
		// Try block to check for exceptions
		try {
			@SuppressWarnings("rawtypes")
			Class cls = Class.forName("Instanceclass");
			// Creating object of main class
			// using instance method
			Instanceclass obj = (Instanceclass)cls.newInstance();
			// Print and display
			System.out.println(obj.name);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (InstantiationException e) {

			e.printStackTrace();
		}
		catch (IllegalAccessException e) {

			e.printStackTrace();
		}
	}
}
