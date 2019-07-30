package annotations;

@Food(name="Pizza", price=300)
public class Pizza implements FoodClass{
	private String name;
	private int price;
	private int prepareTime;
	private int cookTime;
	private int sendTime;
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
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the prepareTime
	 */
	
	@Time(prepareTime = 20, cookTime = 30, sendTime = 40)
	public int getPrepareTime() {
		return prepareTime;
	}
	/**
	 * @param prepareTime the prepareTime to set
	 */
	public void setPrepareTime(int prepareTime) {
		this.prepareTime = prepareTime;
	}
	/**
	 * @return the cookTime
	 */
	
	public int getCookTime() {
		return cookTime;
	}
	/**
	 * @param cookTime the cookTime to set
	 */
	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}
	/**
	 * @return the sendTime
	 */
	
	public int getSendTime() {
		return sendTime;
	}
	/**
	 * @param sendTime the sendTime to set
	 */
	public void setSendTime(int sendTime) {
		this.sendTime = sendTime;
	}
	@Override
	public String toString() {
		return " food name=" + name + "\n price=" + price + "\n prepareTime=" + prepareTime + "\n cookTime=" + cookTime
				+ "\n sendTime=" + sendTime + "";

	}
	
}
