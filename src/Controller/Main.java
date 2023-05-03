package Controller;

import java.util.Scanner;

import Entity.Bag;
import Entity.Balls;

public class Main {
	public static void main(String[] args) {
		Bag bag = new Bag();
		Balls balls = new Balls();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter colour of ball "
					+ "eg: Red-r "
					+ "Green-g "
					+ "Yellow-y");
			char color = sc.next().charAt(0);
			switch (color) {
			case 'r':
				System.out.println(bag.addRed(balls.getColour().RED));
				System.out.println("Currently bag contains " + bag.getBagInfo());
				break;
			case 'g':
				System.out.println(bag.addGreen(balls.getColour().GREEN));
				System.out.println("Currently bag contains " + bag.getBagInfo());
				break;
			case 'y':
				System.out.println(bag.addYellow(balls.getColour().YELLOW));
				System.out.println("Currently bag contains " + bag.getBagInfo());
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
		} while (bag.getBagcount()<bag.getCAPACITY());
		System.out.println("bag full");
	}
}
