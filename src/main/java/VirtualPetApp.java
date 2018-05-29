import java.util.Scanner;
import java.util.Set;

public class VirtualPetApp {
	private static String petName = "";
	static VirtualPet pet = new VirtualPet(petName, 50, 50, 50);

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the start of owning your own digital pet!"
				+ "\nRemember, a digital pet needs love and care like a real life pet."
				+ "\nMake sure you feed it, play with it, and give it enough rest!");

		System.out.println("\nWhat would you like to name your new friend? (Max of 16 characters)");

		petName = input.nextLine();
		
		while (pet.petNameIsGreaterThanMaxLength(petName)) {
			System.out.println("You have exceeded the max amount of characters! Please try again\n");
			petName = input.nextLine();
		}
		
		pet.setName(petName);
		pet.getPetStatus();

		System.out.println("\nWhat do you want to do with " + petName+ "?\n");
		petMenu();

		String userMenuChoice = input.nextLine();
		
		while (isValidUserReponse(userMenuChoice)) 
		{
			switch (userMenuChoice) 
			{
				case "1":
					if (!pet.isHungry(pet.hunger))
					{
						System.out.println(petName + " is not hungry!");
					}
					else
					{
						pet.feed();						
					}
					break;
				case "2":

					break;
				case "3":

					break;
				default:
					while (!isValidUserReponse(userMenuChoice))
					{
						System.out.println("That is not a valid response. Please try again.");
						userMenuChoice = input.nextLine();
					}
					break;
			}
			
			pet.getPetStatus();
			
			System.out.println("\nWhat else would you like to do?");
			userMenuChoice = input.nextLine();
		}
		


		input.close();
	}

	public static void petMenu() {
		System.out.println("1. Feed " + petName);
		System.out.println("2. Play with " + petName);
		System.out.println("3. Put  " + petName + " to bed");
		System.out.println("4. Do nothing");
	}

	public static boolean isValidUserReponse(String userResponse) {
		if (userResponse.equals("4")) 
		{
			System.out.println("You decide to do nothing. A few hours go by.");
		} 
		else if (!userResponse.equals("1") 
				&& !userResponse.equals("2") 
				&& !userResponse.equals("3")) {
			return false;
		}
		return true;
	}
}
