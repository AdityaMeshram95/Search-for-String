import Interface2.Analyzer;

public class Test3 { /* Using LAMBDA EXPRESSION */
	// main method 
	public static void main(String[] args) {
		String[] strList = {"tomorrow", "to", "toto", "timbakto", "the", "heat"}; // array using literal method
		
		String searchStr = "to";
		
		System.out.println("Searching for 'to'...");
		System.out.println("==== Lambda expression ====");
		// calling static method and also using lambda expression
		Analyzer.searchArr(strList, searchStr, (String target, String search)->target.contains(searchStr));
	}
}
