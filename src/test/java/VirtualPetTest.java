import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest
{
	VirtualPet vPet = new VirtualPet(50,50,50);
	
	@Test
	public void shouldReturnTrueWhenHungry()
	{	
		boolean underTestHungry = vPet.isHungry(74);
		Assert.assertEquals(true, underTestHungry);
	}
	
	@Test
	public void shouldReturnFalseWhenHungry()
	{
		boolean underTestHungry = vPet.isHungry(81);
		Assert.assertEquals(false, underTestHungry);
	}
	
	@Test
	public void shouldReturnTrueWhenThirsty()
	{
		boolean underTestThirst = vPet.isThirsty(74);
		Assert.assertEquals(true, underTestThirst);
	}
	
	@Test
	public void shouldReturnFalseWhenThirsty()
	{
		boolean underTestThirst = vPet.isThirsty(81);
		Assert.assertEquals(false, underTestThirst);
	}
	
	@Test
	public void shouldReturnTrueWhenSleepy()
	{
		boolean underTestSleep = vPet.isSleepy(15);
		Assert.assertEquals(true, underTestSleep);
	}
	
	@Test
	public void shouldReturnFalseWhenSleepy()
	{
		boolean underTestSleep = vPet.isSleepy(16);
		Assert.assertEquals(false, underTestSleep);
	}
	
	@Test
	public void shouldReturnPetHungerLevel()
	{
		int testExpectedHungerValue = vPet.hunger;
		int testPetHungerLevel = vPet.getHungerLevel(testExpectedHungerValue);
		Assert.assertEquals(testExpectedHungerValue, testPetHungerLevel);
	}

	@Test
	public void shouldReturnPetThirstLevel()
	{
		int testExpectedThirstValue = vPet.thirst;
		int testPetThirstLevel = vPet.getThirstLevel(testExpectedThirstValue);
		Assert.assertEquals(testExpectedThirstValue, testPetThirstLevel);
	}
	
	@Test
	public void shouldReturnPetSleepLevel()
	{
		int testExpectedSleepValue = vPet.sleep;
		int testPetSleepLevel = vPet.getSleepLevel(testExpectedSleepValue);
		Assert.assertEquals(testExpectedSleepValue, testPetSleepLevel);
	}

}
