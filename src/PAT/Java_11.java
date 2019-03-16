package PAT;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Java_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] fields = line.split("");
		HashMap<String, Integer> hashMap=new HashMap<>();
		for (String word : fields) {
			if(hashMap.get(word)==null) {
				hashMap.put(word, 1);
			}else {
				hashMap.put(word,hashMap.get(word)+1);
			}
		}
		
		Set<Entry<String,Integer>> entrySet = hashMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
	}
	
	
}
