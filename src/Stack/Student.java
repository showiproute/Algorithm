package Stack;

public class Student {

	private String name;
	private String id;
	private int age;
	
	Student(){
		this.name="test";
		this.id="test";
		this.age=1;
	}
	
	Student(String name,String id,int age){
		
		this.name=name;
		this.age=age;
		this.id=id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	
	
}
