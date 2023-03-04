package constructor;

public class thiscallstatement

{    
	String name;
	int id;
	int sal;
	thiscallstatement(String sname)
	{
		this.name=sname;
		System.out.println(name);
	}
	thiscallstatement(String sname,int sid)
	{
		this(sname);//constructor called within same class using this()call statement....
		this.id=sid;
		System.out.println(id);
	}
	thiscallstatement(String sname,int sid,int ssal)
	{
		this(sname,sid);//constructor called within same class using this()call statement....
		this.sal=ssal;
		System.out.println(sal);
	}
	public static void main(String[] args) 
	{
		thiscallstatement c1=new thiscallstatement("Ajay",28,50000);
	}
}
//....constructor called within same class using this()call statement....//