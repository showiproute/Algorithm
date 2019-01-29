package Part_1;

public class Student extends People implements Compare{
	private String sId;


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student id:"+this.sId+"Student name:"+this.getName()+"People id"+this.getId();
	}

	/**
	 * @return the sId
	 */
	public String getsId() {
		return sId;
	}

	/**
	 * @param sId the sId to set
	 */
	public void setsId(String sId) {
		this.sId = sId;
	}

	public Student() {
		this.sId="111";
	}

	public Student(String name,String id,String sId) {
		super(name,id);
		this.sId=sId;
	}
	
	public void sayHello() {
		super.sayHello();
	}
	
	
	public int compare(Object otherObj) {
		Student other=(Student)otherObj;
		return this.sId.compareTo(other.sId);
	}
	
	
}
