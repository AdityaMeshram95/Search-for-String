
public class Test1 {
	// main method 
	public static void main(String[] args) {
		
		String[] strList = {"tomorrow", "to", "toto", "timbakto", "the", "heat"}; // array using literal method
		
		String searchStr = "to";
		
		System.out.println("Searching for 'to'...");
		System.out.println("==== Using static method ====");
	
		Analyzer.searchArr(strList, searchStr, new ContainsAnalyzer());
	}
}
