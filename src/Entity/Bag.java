package Entity;

import java.util.ArrayList;

public class Bag {
	private ArrayList<Colour> ballsInBag ;
	private final byte CAPACITY = 12;
	private int redCount = 0; 
	private int greenCount = 0; 
	private int yellowCount = 0; 
	
	public byte getCAPACITY() {
		return CAPACITY;
	}
	public ArrayList<Colour> getBagInfo() {
		return ballsInBag;
	}
	public void setBagInfo(ArrayList<String> bagInfo) {
		this.ballsInBag = ballsInBag;
	}
	
	public Bag() {
		this.ballsInBag = new ArrayList<>();
		this.redCount = 0;
		this.greenCount = 0;
		this.yellowCount = 0;
	}
	public int getBagcount() {
		return redCount+greenCount+yellowCount;
	}
	public String addRedd(Colour red) {
		ballsInBag.add(red);
		redCount++;
		return "Red added";
	}
	public String addGreen(Colour green) {
		greenCount++;
		if (greenCount<redCount) {
			ballsInBag.add(green);
			return "green added";
		}else {
			greenCount--;
			return "green not added";
		}
	}
	public String addYellow(Colour yellow) {
		yellowCount++;
		float compare = (float) (0.4*getBagcount());
		if (yellowCount<compare) {
			ballsInBag.add(yellow);
			return "yellow added";
		}else {
			yellowCount--;
		return "yellow not added";
		}
	}	
}
