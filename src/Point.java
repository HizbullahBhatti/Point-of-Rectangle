public class Point {

	private double x;
	private double y;
	
	public Point(){
		
		x=0;
		y=0;
		
	}
	
	public Point(double x, double y){
		
		this.x = x;
		this.y = y;
	}
	
	public void SetX(double x){
		
		this.x = x;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void SetY(double y){
		
		this.y = y;
	}
	
	public String toString(){
		
		return ("x = "+x+" y = "+y);
		
	}
	
	public boolean equals(Point another){
		
		if ((this.x==another.getX())&&(this.y==another.getY())){
			return true;
		}
		else{
			return false;
		}
	}
	
}
