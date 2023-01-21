// This defines a simple class of critters that infect whenever they can and
// otherwise just spin around, looking for critters to infect.  This simple
// strategy turns out to be surpisingly successful.

import java.awt.*;
import java.util.Random; // imports the random number


public class Orca extends Critter {
   private Color lColor = Color.MAGENTA;
   private boolean switchCase; // boolean to change string text back and forth

   public Orca () {
      switchCase = true;

   } // end of Orca
    
   public Action getMove(CritterInfo info) {
      switchCase = !switchCase;

      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      }
      else if (info.getFront() == Neighbor.SAME) {
         return Action.LEFT;      
      }
      else if (info.getFront() == Neighbor.WALL) {
         return Action.LEFT;
      }
      else if (info.getRight() == Neighbor.WALL) {
         return Action.LEFT;
      }
      else {
         return Action.HOP;
      }

   } // End of Action

   public Color getColor() {
      Random random = new Random();   
      int randomNumber = random.nextInt(4);
      
         if (randomNumber == 0 || randomNumber == 1) {
            lColor = Color.MAGENTA;
         }
         else {
            lColor = Color.PINK;
         }
      return lColor;
      
   } // end of color

   public String toString() {
      if (switchCase) {
         return "orCA";
      }
      else {
      }
      return "ORca";
  } // end of string 
  
} // end of class