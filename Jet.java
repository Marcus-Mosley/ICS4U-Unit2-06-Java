/**
* This class extends Airplane to create a Jet.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-06-01
*/
public class Jet extends Airplane {
  private static final int MULTIPLIER = 2;
  
  // Constructors
  
  /**
  * The Jet method constructs a Jet.
  */
  public Jet() {
    super();
  }
  
  // Setters
  
  public void setSpeed(int speed) {
    super.setSpeed(speed * MULTIPLIER);
  }
  
  // Methods
  
  public void accelerate() {
    super.setSpeed(getSpeed() * 2);
  }
}