package set_get;

public class SetGet01_Method {
	private String name=null, addr=null;
	private int age=0;
	
	//set
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//get
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public int getAge() {
		return age;
	}
	
	
}
