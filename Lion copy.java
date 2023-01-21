// This defines a simple class of critters that infect whenever they can and
// otherwise just spin around, looking for critters to infect.  This simple
// strategy turns out to be surpisingly successful.

import java.awt.*;
import java.util.Random; // imports the random number


public class Lion extends Critter {
   private Color lColor = Color.BLUE;
    
    
   public Lion () {

  } // end of Lion
    
   public Action getMove(CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } 
      else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
         return Action.LEFT;
      }
      else if (info.getFront() == Neighbor.SAME) {
         return Action.RIGHT;
      }
      else {
         return Action.HOP;
      }
   } // End of Action

   public Color getColor() {
      Random random = new Random();   
      int randomNumber = random.nextInt(3);
      
         if (randomNumber == 0) {
            lColor = Color.RED;
         }
         else if (randomNumber == 1) {
            lColor = Color.GREEN;
         }
         else {
            lColor = Color.BLUE;
         }
      return lColor; 
      
  } // end of color

   public String toString() {

         return "L";

   } // end of string 
  
} // end of class