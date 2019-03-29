package Offer;

/*
 * 牛客最近来了一个新员工Fish，
 * 每天早晨总是会拿着一本英文杂志
 * ，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，
 * 有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，
 * 这家伙原来把句子单词的顺序翻转了，正确的句子应该是
 * “I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class String_5 {
	
    public String ReverseSentence(String str) {
    	StringBuilder sb=new StringBuilder();
    	if(str.equals(" ")) {
    		sb.append(" ");
    		return sb.toString();
    	}
    	String[] fields = str.split(" ");
    	for(int i=fields.length-1;i>=0;i--) {
    		if(i!=0)
    			sb.append(fields[i]).append(" ");
    		else {
    			sb.append(fields[i]);
    		}
    	}
    	
    	return sb.toString();
    }
    
    public static void main(String[] args) {
		
    	String_5 obj = new String_5();
    	System.out.println(obj.ReverseSentence(" "));
	}
}
