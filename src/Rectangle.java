public class Rectangle {

	Point topRight;
	Point bottomLeft;
	
	public Rectangle(){
		
		topRight = new Point();
		bottomLeft = new Point();
		
	}
	
	public Rectangle(Point topRight, Point bottomLeft)
	{
		this.topRight=new Point(topRight.getX(),topRight.getY());
		this.bottomLeft=new Point(bottomLeft.getX(),bottomLeft.getY());
	}
	
	public Rectangle(Rectangle another){
		
		this.topRight = another.topRight;
		this.bottomLeft = another.bottomLeft;
		
	}
	
	
	public String toString(){
		
		return ("Top Right x = "+topRight.getX()+" TopRight y = "+topRight.getY()+" Bottom Left x = "+bottomLeft.getX()+" Bottom Left y = "+bottomLeft.getY());
		
	}

}
