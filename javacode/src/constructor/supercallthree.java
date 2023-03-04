package constructor;

public class supercallthree extends supercalltwo
{
	supercallthree(String sname,int sid,int ssal)
	{
		super(sname,sid);//constructor called outside of class using super()call statement....
		this.sal=ssal;
		System.out.println(sal);
	}
}
