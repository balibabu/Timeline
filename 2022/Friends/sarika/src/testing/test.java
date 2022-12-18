package testing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

	public static void main(String[] args) {
		System.out.println(isAnagram("HEAT", "EARTH"));
		List<String> words=new ArrayList<>();
		words.add("duel");
		words.add("speed");
		words.add("dule");
		words.add("cars");
		List<String> queries=new ArrayList<>();
		queries.add("spede");
		queries.add("deul");
		System.out.println(getSearchResults(words, queries));

	}
	public static List<List<String>> getSearchResults(List<String> words, List<String> queries){
		List<List<String>> result = new ArrayList<>();
		for(String str:queries) {
			List<String> row=new ArrayList<>();
			for(String str2:words) {
				if(isAnagram(str, str2)) 
					row.add(str2);
			}
			result.add(row);
		}
		return result;
		
	}
	public static boolean isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		}
		else {
			char[] arrayS1 = s1.toLowerCase().toCharArray();
			char[] arrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			status = Arrays.equals(arrayS1, arrayS2);
		}
		return status;
	}

}
