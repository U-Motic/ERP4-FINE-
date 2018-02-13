package cn.itcast.invoice.emp.action;
/**
 * this class is the model for the User
 *
 */
public class UserModel {
	/**
	 * this is the constructor of the class
	 */
	public UserModel(){
		System.out.println("object instance....");
	}
	private Long segreto;
	private String name;
	private Integer age;
	
	/**
	 * this method is the getter for the id
	 * @return
	 */
	public Long getUuid() {
		return segreto;
	}
	
	/**
	 * this method is the setter for id
	 * @param segreto
	 */
	public void setUuid(Long segreto) {
		System.out.println("uuid...");
		this.segreto = segreto;
	}
	
	/**
	 * this method is the getter for the name
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * this method is the setter for the name
	 * @param name
	 */
	public void setName(String name) {
		System.out.println("name...");
		this.name = name;
	}
	
	/**
	 * this method is the getter for the age
	 * @return
	 */
	public Integer getAge() {
		return age;
	}
	
	/**
	 * this method is the setter for the age
	 * @param age
	 */
	public void setAge(Integer age) {
		System.out.println("age....");
		this.age = age;
	}
	
}
