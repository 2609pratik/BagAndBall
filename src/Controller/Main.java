package Controller;

import java.util.Scanner;

import Entity.Bag;

public class Main {
	public static void main(String[] args) {
		Bag bag = new Bag();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter colour of ball "
					+ "eg: Red-r "
					+ "Green-g "
					+ "Yellow-y");
			char color = sc.next().charAt(0);
			switch (color) {
			case 'r':
				System.out.println(bag.addRed());
				System.out.println("Currently bag contains " + bag.getBagInfo());
				break;
			case 'g':
				System.out.println(bag.addGreen());
				System.out.println("Currently bag contains " + bag.getBagInfo());
				break;
			case 'y':
				System.out.println(bag.addYellow());
				System.out.println("Currently bag contains " + bag.getBagInfo());
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
		} while (bag.getBagcount()<12);
		System.out.println("bag full");
	}
}
