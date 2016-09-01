package seedu.addressbook.data.address.info;
 
 public class Block {
 	private String block;
 	
 	public Block(){
 		block = null;
 	}
 	
 	public void addInfo(String block){
 		this.block = block;
 	}
 	
 	public String getInfo(){
 		return this.block;
 	}
 }