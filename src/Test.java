public class Test {

	public static void main(String args[]){
		
		Point topRight1 = new Point(1,3);
		Point bottomLeft1 = new Point(6,8);
		
		Point topRight2 = new Point(6,8);
		Point bottomLeft2 = new Point(11,15);
		
		Rectangle one = new Rectangle(topRight1,bottomLeft1);
		
		Rectangle two = new Rectangle(topRight2, bottomLeft2);
		
		System.out.println(one.toString());
		System.out.println(two.toString());
		
		Rectangle three = new Rectangle (one.topRight,two.bottomLeft); 
		
		System.out.println("\n"+three.toString());
	}
	
	
}