package constructor;

public class supercalltwo extends supercallone
{
	
	
		supercalltwo(String sname,int sid)
		{
			super(sname);//constructor called outside of class using super()call statement....
			this.id=sid;
			System.out.println(id);
		}
	

}

//class supercalltwo extend supercallone
//class supercallthree extend supercalltwo
//class superdriver create object of supercallthree