import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test //Test that we can initiate a Task object
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myPet = new Tamagotchi("april");
    assertEquals("april", myPet.getName());
    assertEquals(10, myPet.getFoodLevel());
    assertEquals(10, myPet.getSleepLevel());
    assertEquals(10, myPet.getActivityLevel());
  }

  @Test
  public void timePasses_foodDecreasesByOne_9() {
    Tamagotchi myPet = new Tamagotchi("april");
    myPet.timePasses();
    assertEquals(9, myPet.getFoodLevel());
  }

  @Test
  public void isAlive_foodLevelAbove0_true() {
    Tamagotchi myPet = new Tamagotchi("april");
    assertEquals(true, myPet.isAlive());
}

}
