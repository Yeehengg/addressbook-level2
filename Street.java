package seedu.addressbook.data.address.info;

public class Street {
	private String street;
	
	public Street(){
		street = null;
	}
	
	public void addInfo(String street){
		this.street = street;
	}
	
	public String getInfo(){
		return this.street;
	}
}