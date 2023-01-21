// This defines a simple class of critters that infect whenever they can and
// otherwise just spin around, looking for critters to infect.  This simple
// strategy turns out to be surpisingly successful.

import java.awt.*;

public class Bear extends Critter {
   private boolean polar;
   private boolean slash;
    
    
   public Bear (boolean polar) {
      this.polar = polar;
      slash = true;
  } // end of Bear
    
   public Action getMove(CritterInfo info) {
      slash = !slash;
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } 
      else if (info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      }
      else {
         return Action.LEFT;
      }
   } // End of Action

   public Color getColor() {
      if (polar) {
         return Color.WHITE;
      }
      else {
         return Color.BLACK;
      }
  } // end of color

   public String toString() {
      if (slash) {
         return "/";
      }
      else {
         return "\\";
      }
  } // end of string 
  
} // end of class