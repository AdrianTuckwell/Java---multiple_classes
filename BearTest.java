import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BearTest{
  Bear bear;
  Salmon salmon;

  @Before 
  public void before()
  {
    bear = new Bear("Baloo");
    salmon = new Salmon();
  }

  @Test // 1 --------------------------------------------
  public void hasName()
  {
    assertEquals( "Baloo", bear.getName() ); 
  }

  @Test // 2 --------------------------------------------
  public void bellyStartsEmpty()
  {
    assertEquals( 0, bear.foodCount() ); 
  }

  @Test // 3 --------------------------------------------
  public void canEatSalmon()
  {
    // bear eats one salmon
    bear.eat(salmon);
    // check that bear only has one salmon is its belly
    assertEquals( 1, bear.foodCount() ); 
  }

  @Test // 4 --------------------------------------------
  public void cantEatWhenBellyFull()
  {
    for (int i = 0; i < 10; i++ ) 
    {
      bear.eat(salmon);
    }
    // check that bear has 5 salmon in its belly
    assertEquals( 5, bear.foodCount() ); 
  }

  @Test // 5 --------------------------------------------
  public void bellyIsFull()
  {
    for (int i = 0; i < 5; i++)
      bear.eat(salmon);
      assertEquals( true, bear.bellyFull() ); 
  }
}
