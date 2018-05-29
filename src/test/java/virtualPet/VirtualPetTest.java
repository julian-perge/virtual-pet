package virtualPet;
import org.junit.Assert;
import org.junit.Test;

import virtualPet.VirtualPet;

public class VirtualPetTest
{
	VirtualPet vPet = new VirtualPet("pet",50,50,50);
	
	@Test
	public void shouldReturnPetHungerLevel()
	{
		int testExpectedHungerValue = 50;
		int testPetHungerLevel = vPet.getHungerLevel();
		Assert.assertEquals(testExpectedHungerValue, testPetHungerLevel);
	}

	@Test
	public void shouldReturnPetFunLevel()
	{
		int testExpectedFunValue = 50;
		int testPetFunLevel = vPet.getFunLevel();
		Assert.assertEquals(testExpectedFunValue, testPetFunLevel);
	}
	
	@Test
	public void shouldReturnPetEnergyLevel()
	{
		int testExpectedEnergyValue = 50;
		int testPetEnergyLevel = vPet.getEnergyLevel();
		Assert.assertEquals(testExpectedEnergyValue, testPetEnergyLevel);
	}
	
	@Test
	public void shouldReturnPetName()
	{
		String testExpectedPetName = "pet";
		String testPetName = vPet.getPetName();
		Assert.assertEquals(testExpectedPetName, testPetName);
	}
	
	@Test
	public void shouldReturnTrueWhenHungry()
	{	
		boolean underTestHungry = vPet.isHungry(49);
		Assert.assertEquals(true, underTestHungry);
	}
	
	@Test
	public void shouldReturnFalseWhenHungry()
	{
		boolean underTestHungry = vPet.isHungry(81);
		Assert.assertEquals(false, underTestHungry);
	}
	
	@Test
	public void shouldReturnTrueWhenIsBored()
	{
		boolean underTestThirst = vPet.isBored(40);
		Assert.assertEquals(true, underTestThirst);
	}
	
	@Test
	public void shouldReturnFalseWhenIsBored()
	{
		boolean underTestThirst = vPet.isBored(81);
		Assert.assertEquals(false, underTestThirst);
	}
	
	@Test
	public void shouldReturnTrueWhenLowEnergy()
	{
		boolean testEnergy = vPet.hasLowEnergy(15);
		Assert.assertEquals(true, testEnergy);
	}
	
	@Test
	public void shouldReturnFalseWhenLowEnergy()
	{
		boolean underTestSleep = vPet.hasLowEnergy(50);
		Assert.assertEquals(false, underTestSleep);
	}
	
	@Test
	public void shouldReturnTrueWhenPetNameIsNotValid()
	{
		String testPetName = "12345678912345678"; // 17 chars
		boolean testPetNameLength = vPet.petNameIsGreaterThanMaxLength(testPetName);
		Assert.assertEquals(true, testPetNameLength);
	}
	
	@Test
	public void shouldReturnFalseWhenPetNameIsNotValid()
	{
		String testPetName = "1234567891234567"; // 16 chars
		boolean testPetNameLength = vPet.petNameIsGreaterThanMaxLength(testPetName);
		Assert.assertEquals(false, testPetNameLength);
	}
	
	@Test
	public void shouldSetAttributeToMaxValueFromMenuAction()
	{
		int testExpectedValue = 100;
		vPet.feed();
		vPet.feed();
		vPet.feed();
		vPet.feed();
		int testValue = vPet.getHungerLevel();
		Assert.assertEquals(testExpectedValue, testValue);
	}
	
	@Test
	public void shouldDecrementAttributeValuesWhenTickMethodIsCalled()
	{
		int testExpectedValue = 40;
		int testValue = vPet.hunger;
		Assert.assertEquals(testExpectedValue, testValue);
	}
}
