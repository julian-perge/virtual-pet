import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest
{
	VirtualPet vPet = new VirtualPet(50,50,50);
	
	@Test
	public void shouldReturnTrueWhenHungry()
	{	
		
		boolean underTestHungry = vPet.isHungry(2);
		
		Assert.assertEquals(true, underTestHungry);
	}
}
