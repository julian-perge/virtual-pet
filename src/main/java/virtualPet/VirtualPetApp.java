package virtualPet;
import java.util.Scanner;

public class VirtualPetApp {
	private static String petName = "";
	static VirtualPet pet = new VirtualPet(petName, 50, 50, 20);

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
		getPetStatus();

		System.out.println("\nWhat do you want to do with " + petName+ "?\n");
		petMenu();

		String userMenuChoice = input.nextLine();
		
		do
		{
			userMenuChoice = gameLoop(input, userMenuChoice);
			while (!isValidUserReponse(userMenuChoice))
			{
				System.out.println("That is not correct, please try again.");
				userMenuChoice = input.nextLine();
			}
		} while (isValidUserReponse(userMenuChoice));

		input.close();
	}

	private static String gameLoop(Scanner input, String userMenuChoice)
	{
		while (isValidUserReponse(userMenuChoice)) 
		{
			switch (userMenuChoice) 
			{
				case "1":
					if (!pet.isHungry(pet.hunger))
					{
						System.out.println(petName + " is not hungry!\n");
						break;
					}
					else
					{
						System.out.println("You feed " + petName);
						pet.feed();
					}
					pet.tick(1);
					break;
				case "2":
					if (!pet.isBored(pet.fun))
					{
						System.out.println(petName + " doesn't want to play to right now.\n");
						break;
					} 
					else 
					{
						System.out.println("You play with " + petName);
						pet.playWith();
					}
					pet.tick(2);
					break;
				case "3":
					if (!pet.hasLowEnergy(pet.energy))
					{
						System.out.println(petName + " is already well rested.\n");
						break;
					}
					else
					{
						System.out.println(petName + " goes to sleep");
						pet.rest();
					}
					pet.tick(3);
					break;
				case "4":
					System.out.println("You decide to do nothing. A few hours go by.");
					pet.tick(4);
					break;
				default:
					System.out.println("Not a valid choice.");
					break;
			}
			getPetStatus();
			userMenuChoice = input.nextLine();
		}
		return userMenuChoice;
	}

	public static void petMenu() {
		System.out.println("1. Feed " + petName);
		System.out.println("2. Play with " + petName);
		System.out.println("3. Put " + petName + " to bed");
		System.out.println("4. Do nothing");
	}

	public static boolean isValidUserReponse(String userResponse)
	{
		switch (userResponse)
		{
			case "1":
			case "2":
			case "3":
			case "4":
				return true;
			default:
				return false;
		}
	}
	
	public static void getPetStatus() {
		System.out.println("Hunger: " + pet.getHungerLevel() 
				+ "\nFun: " + pet.getFunLevel()
				+ "\nEnergy: " + pet.getEnergyLevel() );
	}
}
