import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest
{
	VirtualPet vPet = new VirtualPet();
	
	@Test
	public void shouldReturnTrueWhenHungry()
	{	
		
		boolean underTestHungry = vPet.isHungry();
		
		Assert.assertEquals(true, underTestHungry);
	}
}
