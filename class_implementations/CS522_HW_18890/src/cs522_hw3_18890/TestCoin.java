package cs522_hw3_18890;

public class TestCoin {
	public static void main(String[] args) {
		 //testing square - Hole class
		Hole coinSq = new Hole(3);
		System.out.println(coinSq.area() + " sq.units is area of the hole(square) inside my coin");
		System.out.println(coinSq.circumference()+ " units is perimeter of the hole(square) inside my coin");
		
		if(coinSq.isLarge()) {
			System.out.println("my square is large  with length greater than 10");
		}else
			System.out.println("my square is not larger as required.");
		
		
		coinSq.setSide(11);
		System.out.println(coinSq.getSide() + " units is my new length of the hole");
		
		if(coinSq.isLarge()) {
			System.out.println("my square is now large  with length greater than 10");
		}else
			System.out.println("my square is not large");
		
		
		//-----------------------------------------------------------------------------------
		//Testing coin
		Coin chCoin = new Coin(4, 7);
		
		System.out.println(chCoin.area() + " sq.units is area of my coin.");
		
		if(chCoin.isNormal()) {
			System.out.println("my coin looks normal.");
		}else
			System.out.println("my coin looks abnormal.");
		
		
		chCoin.setHoleObj(2);
		System.out.println(chCoin.getHoleObj().getSide() + " is new length of the hole inside the coin");
		
		chCoin.setRadius(5);
		System.out.println(chCoin.getRadius() + " is new radius of the coin");
	}
	
}
