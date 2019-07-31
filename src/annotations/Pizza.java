package annotations;

/**
 * This is class for a specific food
 * @author tejaswi.pote
 *
 */
@Food(name="Pizza", price=300)
public class Pizza implements FoodInterface{
	private String name;
	private int price;
	private int prepareTime;
	private int cookTime;
	private int sendTime;
	
	 // This method return the name
	 public String getName() {
		return name;
	}
	
	//  This method set the name to argument
	 public void setName(String name) {
		this.name = name;
	}
	
	//  This method return the price
	 public int getPrice() {
		return price;
	}
	
	
	
	 //This method set the price to argument
	 public void setPrice(int price) {
		this.price = price;
	}
	
	// This method return  the prepareTime
	@Time(prepareTime = 20, cookTime = 30, sendTime = 40)
	public int getPrepareTime() {
		return prepareTime;
	}
	
	 //This method set the prepareTime to argument
	 public void setPrepareTime(int prepareTime) {
		this.prepareTime = prepareTime;
	}
	
	// this method return the cookTime
	 
	
	public int getCookTime() {
		return cookTime;
	}
	
	 // This method set the cookTime to argument
	 
	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}
	
	 //  This method return the sendTime
	 
	
	public int getSendTime() {
		return sendTime;
	}
	
	 // This method set the sendTime to argument
	public void setSendTime(int sendTime) {
		this.sendTime = sendTime;
	}
	
	//This is overrided metnod
	@Override
	public String toString() {
		return " food name=" + name + "\n price=" + price + "\n prepareTime=" + prepareTime + "\n cookTime=" + cookTime
				+ "\n sendTime=" + sendTime + "";

	}
	
}
