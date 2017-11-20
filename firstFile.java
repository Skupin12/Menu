import java.util.Scanner;

public class learningLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu;
		int character;
		Scanner reader = new Scanner(System.in);
		Boolean again = true;
		System.out.println("Welcome to TEAM FORTRESS 3\nYou are on a team RED");
		while(again == true) {
			System.out.println("Select your character: \n(1) - Scout, (2) - Soldier, "
					+ "(3) - Pyro, (4) - Demoman, (5) - Heavy, (6) - Engineer");
			character = reader.nextInt();
			System.out.println("You are playing as:");
			switch(character) {
			case 1:
				System.out.println("Scout");
				break;
			case 2:
				System.out.println("Soldier");
				break;
			case 3:
				System.out.println("Pyro");
				break;
			case 4:
				System.out.println("Demoman");
				break;
			case 5:
				System.out.println("Heavy");
				break;
			case 6:
				System.out.println("Engineer");
				break;
			default:
				System.out.println("Invalid character");
			}
			again = false;
			while(again == false) {
				System.out.println("Press (0) to choose diffrent character");
			
			menu = reader.nextInt();
			if (menu == 0) {
				System.out.println("CHARACTER MENU *theme music playing in the background*");
				again = true;
			}
			else {
				System.out.println("You are still in the game!");
				again = false;
			}
			}
		}
		
}
}
