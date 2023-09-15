
public class ContainsAnalyzer implements StringAnalyzer {

	@Override
	public boolean Analyze(String target, String searchStr) {
		return target.contains(searchStr);
	}
}

/* In this class we have implemented the interface and added the implementation of abstract method which will return boolean value
 * 1st target will carry "to" and .contains() is an in built method whose work us to check if a certain value is present inside a given value or not */