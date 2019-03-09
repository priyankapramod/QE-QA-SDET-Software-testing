package cs522_hw3_18890;

public class Coin {
	
	private double radius;
	private Hole holeObj;
	
	
	//Member functions
	//Manager function
	Coin(int s1, double r1){
		holeObj = new Hole(s1); 
		this.radius = r1;
	}
	
	//Access methods
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public Hole getHoleObj() {
		return holeObj;
	}


	public void setHoleObj(int s1) {
		this.holeObj.setSide(s1);
	}
	
	//predicate
	//coin is normal--true = diameter of circle(coin) > diagonal of square(hole)
	// 2*pi*r          >   s1 * square root of 2
	public boolean isNormal() {
		boolean flag = false;
		if((2*pi()*radius) > (holeObj.getSide() * Math.sqrt(2))) {
			flag = true;
		}
		return flag;
	}
	
	
	//Helping functions
	private double pi() {
		return 3.1416;
	}
	
	
	//implementor function
	//area of circle - area of square
	//(pi*r*r) - (r*r)
	public double area() {
		return (pi()*radius*radius) - (holeObj.area());
	}


	
	

}
