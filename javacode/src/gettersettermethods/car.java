package gettersettermethods;

public class car
{
	private int cost;
	private String color;
	private String model;
	//setter
	public void setcost(int cost) 
	{
		this.cost=cost;
		
	}
	public void setcolor(String color) 
	{
		this.color=color;
		
	}
	public void setmodelk(String model) 
	{
		this.model=model;
		
	}
	//getter
	public int getcost() 
	{
		return this.cost;
		
	}
	public String getcolor() 
	{
		return this.color;
		
	}
	public String getmodel() 
	{
		return this.model;
		
	}
}
