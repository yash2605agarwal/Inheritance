
//public class Player
//{
	
	//private int pno;
//}
class Hockey extends Player
{
	void hockey()
	{
		System.out.println("This is hockey!");
	}
	
	
	
}
class Cricket extends Player
{
	void cricket()
	{
		System.out.println("This is Cricket!");
	}
	
}
class Football extends Player
{
	void football()
	{
		System.out.println("This is Football!");
	}
	
	
}
class player
{
		public static void main(String[] args) 
	{
		System.out.println("\n\nnew program\n\n");
		
		Football f=new Football();
		f.football();
		Cricket c= new Cricket();
		c.cricket();
		Hockey o= new Hockey();
		o.hockey();	
	}
}