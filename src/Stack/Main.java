package Stack;

public class Main {

	public static void main(String[] args) {
		StackArray stackArray=new StackArray();
		Student stu1=new Student("a","a",1);
		Student stu2=new Student("b","b",2);
		stackArray.push(stu1);
		stackArray.push(stu2);
		
//		Student obj;
//		try {
//			obj = (Student)stackArray.pop();
//			System.out.println(obj);
//		} catch (StackEmptyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		stackArray.printStack();

		try {
			Student obj=(Student)stackArray.peek();
			System.out.println(obj);
		} catch (StackEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
