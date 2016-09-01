package seedu.addressbook.data.address.info;
 
 public class PostalCode {
 	private int postalCode;
 
 	public PostalCode(){
 		postalCode = 0;
	}
 	
 	public void addInfo(int postalCode){
 		this.postalCode = postalCode;
 	}
 	
 	public int getInfo(){
 		return this.postalCode;
 	}
 }