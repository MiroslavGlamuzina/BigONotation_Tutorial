import java.util.regex.Matcher;

public class terst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "as\\df\\\\asdf";
		
		s.replace(Matcher.quoteReplacement("?<!\\\\u005C") , Matcher.quoteReplacement("\\u005C"));
		
		System.out.println(s);
	}

}
