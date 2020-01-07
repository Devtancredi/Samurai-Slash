import java.util.Random;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Timer;

/* Frank Tancredi
   Date:Apr 16, 2014
   Program:SamuraiGame.java
   Description:
 */

public class SamuraiGame 
{


public int a, b, c, d, e, f, g ,h, p1, p2, pointCounter;

SamuraiGraphics graphics;


   /**
    * @param args
    *
    */
public SamuraiGame()
{
   
   a=0;
   b=0;
   c=0;
   d=0;
   e=0;
   f=0;
   g=0;
   h=0;
   p1=0;
   p2=0;
  

  }
 
   

   
   
   public int fight() //Whichever button is pressed first decides which player wins the fight
      {
         if (graphics.getEnter() == 1)
              {
                pointCounter = 1;
              }
         else if (graphics.getCapsLock() == 1)
              {
                pointCounter = 2;
              }
      return pointCounter;
      }
   
   
   public void scoreCount() //Keeps track of player score
      {
         if (pointCounter == 1)
         {
            p1 += 1;
         }
         
         if (pointCounter ==2)
         {
            p2 += 1;
         }   
         
      }
   
   //WAIT METHODS
    public void preFight() //The amount of time before "Ready..." Disappears and the game starts
      {
         try {
              Thread.sleep(2000);
             }
         catch (InterruptedException e)
             {
              e.printStackTrace();    
             }
      }
    
    public void reactionBegin() //The amount of time before the reaction mark appears and the game begins
    {
       Random random = new Random();
       int reactionStart = random.nextInt(7500)+2500;
       try {
          Thread.sleep(reactionStart);
         }
     catch (InterruptedException e)
         {
          e.printStackTrace();    
         }      
    }
    
    public void roundIntermission()
    {
       try {
          Thread.sleep(2000);
         }
     catch (InterruptedException e)
         {
          e.printStackTrace();    
         }
    }
    
   //RETURN METHODS
    public int getP1Score() //Returns Player 1's Score
    {
       return p1;
    }
     
    public int getP2Score() //Returns Player 2's Score
    {
       return p2;
    }
 
   
 
   
   
   

}

  


