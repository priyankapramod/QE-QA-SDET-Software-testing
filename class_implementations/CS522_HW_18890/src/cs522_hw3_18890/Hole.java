package cs522_hw3_18890;

public class Hole {
	private int side;
	
	//Member functions************
	//Manager function-- constructor
	Hole(int side){
		this.side = side;
	}
	
	
	//Helping functions
	private int square(int i) {
		//return i*i;
		return (int)Math.pow(i, 2);
	}
	
	
	
	public int getSide() {
		return side;
	}


	public void setSide(int side) {
		this.side = side;
	}
	public boolean isLarge() {
		return (side > 10);//this.side
	}

	//Implementor functions
	public int area() {
		return square(side);//this.side
	}
	
	public int  circumference() {
		return 4*side;
	}
	
}
