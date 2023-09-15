
public class Test2 { /*Here we will use Anonymous inner class due to which we will not be needing the containsAnalyzer class 
 						which was carrying the unimplemented abstract method*/
	// main method
	public static void main(String[] args) {
		
		String[] strList = {"tomorrow", "to", "toto", "timbakto", "the", "heat"}; // array using literal method
		
		String searchStr = "to";
		
		System.out.println("Searching for 'to'...");
		System.out.println("==== Anonymous Class ====");
		//Anonymous inner class
		//calling static method containing encapsulating forEach loop
		Analyzer.searchArr(strList, searchStr, new StringAnalyzer(){ /*Anonymous class starts after creating the object 
		 																but here we are continuing anonymous class inside
		 																method call so we have to write inside the method bracket 
		 																only with continuation and then terminate the method at end*/
			@Override
			public boolean Analyze(String target, String searchStr) {
				return target.contains(searchStr);
			}
		});
	}
}
