package Offer;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，
 * 第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，
 * 第一个只出现一次的字符是"l"。
 */
public class String_10 {

    LinkedHashMap<Character, Integer> linkedHashMap=new LinkedHashMap<>();
	//Insert one char from stringstream
    public void Insert(char ch) {
        if(linkedHashMap.get(ch)==null) {
        	linkedHashMap.put(ch, 1);
        }else {
        	linkedHashMap.put(ch,linkedHashMap.get(ch)+1);
        }
    	
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
    	for (Entry<Character, Integer> keyValue : linkedHashMap.entrySet()) {
			if(keyValue.getValue()==1) {
				return keyValue.getKey();
			}
		}
    	
    	return '#';
    }
    
    public static void main(String[] args) {
    	String_10 obj = new String_10();
    	char[] array= {'g','o','o','g','l','e'};
    	for (char c : array) {
			obj.Insert(c);
			System.out.println(obj.FirstAppearingOnce());
		}
    	
    	
	}
    
    
}
