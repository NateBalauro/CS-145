// This defines a simple class of critters that infect whenever they can and
// otherwise just spin around, looking for critters to infect.  This simple
// strategy turns out to be surpisingly successful.

import java.awt.*;

public class Giant extends Critter {
   private int nameCounter = 0;
   private int counter = 1;
   private String giantsName = "fee";
    
   public Giant () {
 
  } // end of Giant
    
   public Action getMove(CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } 
      else if (info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      }
      else {
         return Action.RIGHT;
      }
   } // End of Action

   public Color getColor() {
         return Color.GRAY;
   } // end of color

   public String toString() {
      if (counter % 6 == 0) {
         nameCounter++;
         if (nameCounter == 4) {
            nameCounter = 0;
         }
         switch (nameCounter) {
            case 0:
               giantsName = "fee";
               break;
            case 1:
               giantsName = "fie";
               break; 
            case 2:
               giantsName = "foe";
               break;  
            case 3:
               giantsName = "fum";
               break; 
         }
      }  
      counter++;
      return giantsName;    
   } // end of string 
  
} // end of class