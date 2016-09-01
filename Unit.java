package seedu.addressbook.data.address.info;

public class Unit {
	private String unit;
	
	public Unit(){
		unit = null;
	}
	
	public void addInfo(String unit){
		this.unit = unit;
	}
	
	public String getInfo(){
		return this.unit;
	}
}