
public class Analyzer { // Encapsulating for each loop inside a static method.
	// static method
	public static void searchArr(String[] strList, String searchStr, StringAnalyzer analyzer) {
		for(String currentStr : strList) {
			if(analyzer.Analyze(currentStr, searchStr)) { // calling method inside if statement.
				System.out.println("Matched: "+ currentStr);
			}
		}
	}
}
