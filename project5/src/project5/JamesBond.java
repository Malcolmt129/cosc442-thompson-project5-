package project5;

public class JamesBond {
	
	
	public boolean bondRegex(String input) {
		return input.matches("(\\(.*007.*\\)).*");
	}
}
