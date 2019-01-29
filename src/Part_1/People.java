package Part_1;

public class People {

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	private String name;
	private String id;
	
	//Constructor
	public People() {
		this.name="aa";
		this.id="123";
	}
	
	public People(String name,String id) {
		this.name=name;
		this.id=id;
	}
	
	public void sayHello() {
		System.out.println("Hello! My name isaaa");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "People [name=" + name + ", id=" + id + "]";
	}
	
	
	
}
