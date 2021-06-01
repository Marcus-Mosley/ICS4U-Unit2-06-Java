/**
* This class uses the Airplane.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-06-01
*/
public class FlyTest {
  /**
  * The Main method receives input and checks viability.
  */
  public static void main(String[] args) {
    Airplane biplane = new Airplane();
    biplane.setSpeed(212);
    System.out.println(biplane.getSpeed());
    
    Jet boeing = new Jet();
    boeing.setSpeed(422);
    System.out.println(boeing.getSpeed());
    
    int x = 0;
    
    while (x < 4) {
      boeing.accelerate();
      System.out.println(boeing.getSpeed());
      
      if (boeing.getSpeed() > 5000) {
        biplane.setSpeed(biplane.getSpeed() * 2);
      } else {
        boeing.accelerate();
      }
      
      x++;
    }

    System.out.println(biplane.getSpeed());
  }
}