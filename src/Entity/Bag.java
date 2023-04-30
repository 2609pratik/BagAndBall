package Entity;

import java.util.ArrayList;

public class Bag {
	private ArrayList<Character> bagInfo ;
	public ArrayList<Character> getBagInfo() {
		return bagInfo;
	}
	public void setBagInfo(ArrayList<Character> bagInfo) {
		this.bagInfo = bagInfo;
	}
	private int redCount = 0; 
	private int greenCount = 0; 
	private int yellowCount = 0; 

	public Bag() {
		this.bagInfo = new ArrayList<>();
		this.redCount = 0;
		this.greenCount = 0;
		this.yellowCount = 0;
	}
	public int getBagcount() {
		return redCount+greenCount+yellowCount;
	}
	public String addRed() {
		bagInfo.add('r');
		redCount++;
		return "Red added";
	}
	public String addGreen() {
		greenCount++;
		if (greenCount<redCount) {
			bagInfo.add('g');
			return "green added";
		}else {
			greenCount--;
			return "green not added";
		}
	}
	public String addYellow() {
		yellowCount++;
		float compare = (float) (0.4*getBagcount());
		if (yellowCount<compare) {
			bagInfo.add('y');
			return "yellow added";
		}else {
			yellowCount--;
		return "yellow not added";
		}
	}
}
