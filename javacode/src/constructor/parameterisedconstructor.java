package constructor;

public class parameterisedconstructor 
{
	String name;
	int id;
	
	parameterisedconstructor(String sname,int sid)//------construtor
	{
		this.name=sname;
		this.id=sid;
	}
	public void print() 
	{
		System.out.println(name);
		System.out.println(id);
	}
	public static void main(String[] args) 
	{
		parameterisedconstructor p1=new parameterisedconstructor("Ajay",28);//when object is created constructor called..
		p1.print();
	}
}
