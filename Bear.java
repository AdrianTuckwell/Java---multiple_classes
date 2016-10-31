public class Bear{
  private String name;
  private Salmon[] belly;
  
  public Bear(String name)
  {
    this.name = name;
    this.belly = new Salmon[5];
  }

  public String getName()
  {
    return this.name;
  }

  public int foodCount()
  {
    int counter = 0;
    for (Salmon food : belly)
    {
      if (food != null) 
      {
        counter++;
      }
    }
    return counter;
  }

  public void eat(Salmon salmon) 
  {
    if ( bellyFull() ) {
        return;
    }
    int nextEmptyIndex = foodCount();
    // takes in salmon and puts it into the first element
    belly[nextEmptyIndex] = salmon;

  }
  public boolean bellyFull() {
    return foodCount() == belly.length;
  }







}
