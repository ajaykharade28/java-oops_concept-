package gettersettermethods;

public class driver 
{
	public static void main(String[] args) 
	{
	  car c1=new car();
	  c1.setcost(500000);
	  c1.setcolor("Black");
	  c1.setmodelk("Audi");
	  System.out.println(c1.getcost());
	  System.out.println(c1.getcolor());
	  System.out.println(c1.getmodel());
	}

}
