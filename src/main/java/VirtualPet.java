public class VirtualPet
{
	public int hunger = 0;
	public int fun = 0;
	public int energy = 0;
	private static String name = "pet";
	
	private int intMAX_ATTRIBUTE_VALUE = 100;
	private int intMIN_ATTRIBUTE_VALUE = 0;
	
	private int MAX_PET_NAME_LENGTH = 16;
	
	private int intSTATUS_EFFECT_VALUE = 80;
	
	private int intMIN_VALUE_OF_ENERGY = 15;
	
	public VirtualPet(String newName, int hunger, int fun, int exhaustion)
	{
		name = newName;
		this.hunger = hunger;
		this.fun = fun;
		this.energy = exhaustion;
	}

	public boolean isHungry(int hungerLevel)
	{
		if(hungerLevel <= intSTATUS_EFFECT_VALUE)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean isBored(int funLevel)
	{
		if (funLevel <= intSTATUS_EFFECT_VALUE)
		{
			return true;			
		}
		
		return false;
	}
	
	public boolean hasLowEnergy(int energyLevel)
	{
		if (energyLevel <= intMIN_VALUE_OF_ENERGY)
		{
			return true;		
		}
		
		return false;
	}
	
	public boolean petNameIsGreaterThanMaxLength(String petNameLength)
	{
		if (petNameLength.length() <= MAX_PET_NAME_LENGTH)
		{
			return false;
		}

		return true;
	}
	
	public void getPetStatus() {
		System.out.println("Hunger: " + getHungerLevel() 
				+ "\nFun: " + getFunLevel()
				+ "\nEnergy: " + getEnergyLevel() );
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getPetName() {
		return name;
	}
	
	public int getHungerLevel()
	{
		return hunger;
	}
	
	public void feed()
	{
		hunger = getHungerLevel() + 15;
		if (hunger > intMAX_ATTRIBUTE_VALUE)
		{
			hunger = intMAX_ATTRIBUTE_VALUE;
		}		
		System.out.println("You feed " + name);
	}
	
	public int getFunLevel()
	{
		return fun;
	}
	
	public int getEnergyLevel()
	{
		return energy;
	}
}
