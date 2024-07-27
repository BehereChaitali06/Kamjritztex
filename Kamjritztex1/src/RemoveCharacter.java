
public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  inputString ="java Programming";
		char charToRemove ='o';
		String resultString = removeCharacter(inputString, charToRemove);
		System.out.println("Original String: " +inputString);
		System.out.println("String after removing '" + charToRemove + "': " +resultString);
		

	}
	public static String removeCharacter(String str , char ch) {
		StringBuilder result =new StringBuilder();
		for(int i =0 ; i< str.length();i++) {
			if(str.charAt(i) != ch)
				result.append(str.charAt(i));
		}
		return result.toString();
		
	}

}
