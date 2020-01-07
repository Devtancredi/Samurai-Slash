import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

/* Frank Tancredi
   Date:Apr 16, 2014
   Program:SamuraiGraphics.java
   Description:
 */

public class SamuraiGraphics extends JComponent implements ActionListener, KeyListener
{
   //IMAGES USED
   private Image BG1;
   private Image pc1, pc2, pc1W, pc2W, pc1L, pc2L;
   private Image gameSelect1, gameSelect2, gameStart, mainPic; //Menu selection images
   private Image ready, exclamation, explosion, select, round1, round2, round3, round4, round5, player1Wins, player2Wins; //Misc text
   private Image gameOver, results, p1Text, p2Text, zero, one, two, three, four, five, outOfOrder;
   
   //VARIABLES USED
   private int shift, enter, capsLock, left, right;
   private int gameSelectDecider,gameSelectDeciderDebug, gameStartDecider, starter, rounds;
   private int roundEnder, roundCount, p1, p2;
   
   //STRINGS USED
   String p1Score, p2Score;
    
 

   //Allows methods from SamuraiGame to be used in this class   
   SamuraiGame game;
   Graphics g;
   
   

      
   public SamuraiGraphics()// throws IOException
   {
      rounds = 5;
      game = new SamuraiGame();
      this.requestFocus();
      this.requestFocusInWindow();
      addKeyListener(this);      
      setFocusable(true);
      
   
   //Below are all pictures used in the game
   //this.getClass().getResource("gameTitle.jpg")
   //Background   
   ImageIcon startScreen= new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/BG1.jpg");
   BG1 = startScreen.getImage();
   
   //Title Picture
   ImageIcon titlePicture = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/gameTitle.jpg");
   mainPic = titlePicture.getImage();

   //1 Player
   ImageIcon onePlayerGame = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/1Player.jpg");
   gameSelect1 = onePlayerGame.getImage();
   
   //2 Player
   ImageIcon twoPlayerGame = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/2Player.jpg");
   gameSelect2 = twoPlayerGame.getImage();
   
   //Press Enter
   ImageIcon startGame = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/start.jpg");
   gameStart = startGame.getImage();
   
   //Out of Order
   ImageIcon ooO = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/OutOfOrder.jpg");
   outOfOrder = ooO.getImage();
   
   //Ready...
   ImageIcon readyPopUp = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/ready.jpg");
   ready = readyPopUp.getImage();
   
   //Exclamation Point
   ImageIcon exclamationPoint = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/alert.jpg");
   exclamation = exclamationPoint.getImage();
   
   //Explosion
   ImageIcon explosionPic = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/explosion.jpg");
   explosion = explosionPic.getImage();
   
   //Sword Select
   ImageIcon selectUnderscore = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/select.jpg");
   select = selectUnderscore.getImage();
   
   //Round 1
   ImageIcon roundOne = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/Round1.jpg");
   round1 = roundOne.getImage();
   
   //Round 2
   ImageIcon roundTwo = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/Round2.jpg");
   round2 = roundTwo.getImage();
   
   //Round 3
   ImageIcon roundThree = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/Round3.jpg");
   round3 = roundThree.getImage();
   
   //Round 4
   ImageIcon roundFour = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/Round4.jpg");
   round4 = roundFour.getImage();
   
   //Round 5
   ImageIcon roundFive = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/RoundFinal.jpg");
   round5 = roundFive.getImage();
   
   //Player 1 Wins
   ImageIcon p1Win = new ImageIcon("/Users/tancrefr/Desktop/JavaFinal/Images/Player1Wins.jpg");
   player1Wins = p1Win.getImage();
   
   //Player 2 Wins
   ImageIcon p2Win = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/Player2Wins.jpg");
   player2Wins = p2Win.getImage();
   
   //Game Over
   ImageIcon endGame = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/GameOver.jpg");
   gameOver = endGame.getImage();
   
   //Results
   ImageIcon finalResults = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/results.jpg");
   results = finalResults.getImage();
   
   //P1Text
   ImageIcon p1Txt = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/P1.jpg");
   p1Text = p1Txt.getImage();
   
   //P2Text
   ImageIcon p2Txt = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/P2.jpg");
   p2Text = p2Txt.getImage();
   
   //0
   ImageIcon scoreZero = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/0.jpg");
   zero = scoreZero.getImage();
   
   //1
   ImageIcon scoreOne = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/1.jpg");
   one = scoreOne.getImage();
   
   //2
   ImageIcon scoreTwo = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/2.jpg");
   two = scoreTwo.getImage();
   
   //3
   ImageIcon scoreThree = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/3.jpg");
   three = scoreThree.getImage();
   
   //4
   ImageIcon scoreFour = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/4.jpg");
   four = scoreFour.getImage();
   
   //5
   ImageIcon scoreFive = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/5.jpg");
   five = scoreFive.getImage();

   //Player 1 Character
   ImageIcon playerChar1 = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/PC1.jpg");
   pc1 = playerChar1.getImage();
   
   //Player 1 Character (Win Round)
   ImageIcon playerChar1W = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/PC1W.jpg");
   pc1W = playerChar1W.getImage();
   
   //Player 1 Character(Lose Round)
   ImageIcon playerChar1L = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/PC1L.jpg");
   pc1L = playerChar1L.getImage();
   
   //Player 2 Character
   ImageIcon playerChar2 = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/PC2.jpg");
   pc2 = playerChar2.getImage();
   
   //Player 2 Character(Win Round)
   ImageIcon playerChar2W = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/PC2W.jpg");
   pc2W = playerChar2W.getImage();
   
   //Player 2 Character(Lose Round)
   ImageIcon playerChar2L = new ImageIcon ("/Users/tancrefr/Desktop/JavaFinal/Images/PC2L.jpg");
   pc2L = playerChar2L.getImage();
   }
   
   public void paintComponent(Graphics g) //Paints screens for the game
   {
      
      //PRINTS STARTING SCREEN
      super.paintComponent(g);
      Graphics2D g2= (Graphics2D) g;
      g2.drawImage(BG1, 0, 0,1450,800, this);
      g2.drawImage(gameStart, 600,500, this);
      g2.drawImage(mainPic, 250, 120, this);
     
      
      
     //GAME SELECTION SCREENS
     //PRINTS GAME SELECTIONS IF PLAYER PRESSES ENTER
      if (enter == 1 && gameSelectDecider == 0)
      {
         g2.drawImage(BG1, 0, 0,1450,800, this);
         g2.drawImage(mainPic, 250, 120, this);
         g2.drawImage(gameSelect1, 400, 500, this);
         g2.drawImage(outOfOrder, 400, 500, this);
         g2.drawImage(gameSelect2, 800, 489, this);
         g2.drawImage(select, 330, 540, 300, 200, this);
         enter=0;
         gameSelectDecider=1;
         gameSelectDeciderDebug=2;
      }
      
      //PRINTS GAME SELECTIONS WITH OPTION 1 HIGHLIGHTED IF PLAYER PRESSES EITHER ARROW KEY
      if ((left == 1 || right == 1) && gameSelectDecider == 1)
      {
         g2.drawImage(BG1, 0, 0, 1450, 800, this);
         g2.drawImage(mainPic, 250, 120, this);
         g2.drawImage(gameSelect2, 800, 489, this);
         g2.drawImage(gameSelect1, 400, 500, this);
         g2.drawImage(outOfOrder, 400, 500, this);
         g2.drawImage(select, 760, 500, 300, 200, this);
         gameSelectDecider=2;
         left=0;
         right=0;
      }
      
      //PRINTS GAME SELECTIONS WITH OPTION 2 HIGHLIGHTED IF PLAYER PRESSES EITHER ARROW KEY
      if ((left == 1 || right == 1) && gameSelectDecider == 2)
      {
         g2.drawImage(BG1, 0, 0, 1450, 800, this);
         g2.drawImage(mainPic, 250, 120, this);
         g2.drawImage(gameSelect1, 400, 500, this);
         g2.drawImage(gameSelect2, 800, 489, this);
         g2.drawImage(outOfOrder, 400, 500, this);
         g2.drawImage(select, 330, 540, 300, 200, this);
         gameSelectDecider=1;
         left=0;
         right=0;
         gameStartDecider=2;
      }
      
      
      //GAME PLAYING SCREENS
      //PRINTS "ROUND 1" SCREEN
      if ((gameStartDecider == 2 || gameSelectDeciderDebug == 2) && enter == 1)     
      {
         g2.drawImage(BG1, 0, 0, 1450, 800, this);
         g2.drawImage(round1, 500, 300, this);        
         enter = 0;
         gameStartDecider = 3;
         gameSelectDecider = 90; //Prevents the game select screen from painting again
         gameSelectDeciderDebug =90; //Prevents the game select screen from painting again
         callRepaint();        
      }
         
         
         //PRE FIGHT SCREEN (READY...)
         //PRINTS TWO PLAYERS ON SCREEN WITH THE WORD "READY" ON TOP.
         else if (gameStartDecider == 3)
         { 
            g2.drawImage(BG1, 0, 0, 1450, 800, this);
            g2.drawImage(pc1, 400, 575, this);
            g2.drawImage(pc2, 900, 615, this);
            g2.drawImage(ready, 650, 50, this);
            callRepaint();
            game.preFight();
            enter = 0;
            gameStartDecider = 4;
            gameSelectDecider = 90;
         }
    
         //FIGHT SCREEN
         //PRINTS TWO PLAYERS ON SCREEN WITHOUT THE WORD "READY" ON TOP.
         else if (gameStartDecider == 4)
         {
            g2.drawImage(BG1, 0, 0, 1450, 800, this);
            g2.drawImage(pc1, 400, 575, this);
            g2.drawImage(pc2, 900, 615, this);
            callRepaint();
            game.preFight();
            gameStartDecider = 5;
         }
      
         //ACTION FIGHT SCREEN
         //PRINTS TWO PLAYERS ON SCREEN WITH A WARNING SIGN IN THE CENTER, INDICATING IT IS TIME FOR THE ACTION.
         else if (gameStartDecider == 5)
         {
            g2.drawImage(BG1, 0, 0, 1450, 800, this);
            g2.drawImage(pc1, 400, 575, this);
            g2.drawImage(pc2, 900, 615, this);
            callRepaint();
            game.reactionBegin();
            g2.drawImage(exclamation, 620, 110, 200, 200, this);
            callRepaint();
            enter = 0;
            gameStartDecider=6;          
         }
      
      //PRINTS TWO PLAYERS ON SCREEN WITH A WARNING SIGN IN THE CENTER
      if (gameStartDecider == 6 && (enter != 1 || capsLock != 1))
      {
         g2.drawImage(BG1, 0, 0, 1450, 800, this);
         g2.drawImage(pc1, 400, 575, this);
         g2.drawImage(pc2, 900, 615, this);
         g2.drawImage(explosion, 490, 0, 450, 450, this);
         g2.drawImage(exclamation, 620, 110, 200, 200, this);
         callRepaint();
      }
      
      if (gameStartDecider == 6 && shift == 1)
      {
      g2.drawImage(BG1, 0, 0, 1450, 800, this);
      g2.drawImage(pc1, 400, 575, this);
      g2.drawImage(pc2, 900, 615, this);
      g2.drawImage(exclamation, 620, 110, 200, 200, this);
      callRepaint();
      gameStartDecider = 7; //Activates the "Player 1 Wins" else if statement
      }
      
      if ( gameStartDecider == 6 && enter == 1)
      {
      g2.drawImage(BG1, 0, 0, 1450, 800, this);
      g2.drawImage(pc1, 400, 575, this);
      g2.drawImage(pc2, 900, 615, this);
      g2.drawImage(exclamation, 620, 110, 200, 200, this);
      callRepaint();
      gameStartDecider = 8; //Activates the "Player 2 Wins" else if statement
      }
     
      //PRINTS A SCREEN INDICATING THAT PLAYER 1 WON THE ROUND
      else if (gameStartDecider == 7)
      {
         g2.drawImage(BG1, 0, 0, 1450, 800, this);
         g2.drawImage(pc1W, 1000, 630, this);
         g2.drawImage(pc2L, 900, 595, this);
         g2.drawImage(explosion, 490, 0, 450, 450, this);
         g2.drawImage(exclamation, 620, 110, 200, 200, this);
         g2.drawImage(player1Wins, 475, 320, this);
         callRepaint();
         p1 += 1;
         gameStartDecider = 9;
         enter = 0;
      }
      
      //PRINTS A SCREEN INDICATING THAT PLAYER 2 WON THE ROUND
      else if (gameStartDecider == 8)
      {
         g2.drawImage(BG1, 0, 0, 1450, 800, this);
         g2.drawImage(pc1L, 390, 580, this);
         g2.drawImage(pc2W, 300, 595, this);
         g2.drawImage(explosion, 490, 0, 450, 450, this);
         g2.drawImage(exclamation, 620, 110, 200, 200, this);
         g2.drawImage(player2Wins, 475, 320, this);
         callRepaint();
         p2 += 1;
         gameStartDecider = 9;
         shift = 0;
      }
   
      //DECIDES WHICH ROUND NUMBER TO PRINT DEPENDING ON HOW MANY HAVE PASSED
      else if(gameStartDecider == 9)
      {
         game.roundIntermission();
         g2.drawImage(BG1, 0, 0, 1450, 800, this);
         if (roundCount == 0)
         {
            g2.drawImage(round2, 500, 300, this);
         }
         if (roundCount == 1)
         {
            g2.drawImage(round3, 500, 300, this);
         }
         if (roundCount == 2)
         {
            g2.drawImage(round4, 500, 300, this);
         }
         if (roundCount == 3)
         {
            g2.drawImage(round5, 400, 300, this);
         }
         callRepaint();
         gameStartDecider = 10;
         roundCount++; //Increments rounds to keep track of which round # it will print in the intermission
      }
      
      //DECIDES WHICH ROUND NUMBER TO PRINT DEPENDING ON HOW MANY HAVE PASSED (DEBUG)
      else if(gameStartDecider == 10)
      {
         //game.roundIntermission();
         g2.drawImage(BG1, 0, 0, 1450, 800, this);
         if (roundCount == 0)
         {
            g2.drawImage(round2, 500, 300, this);
         }
         if (roundCount == 1)
         {
            g2.drawImage(round3, 500, 300, this);
         }
         if (roundCount == 2)
         {
            g2.drawImage(round4, 500, 300, this);
         }
         if (roundCount == 3)
         {
            g2.drawImage(round5, 400, 300, this);
         }
         callRepaint();
         game.preFight();
         gameStartDecider = 11;
      }
      
      //STARTS SERIES OF FIGHTING SCREENS AGAIN
      if(gameStartDecider == 11)
      {
         g2.drawImage(BG1, 0, 0, 1450, 800, this);
         g2.drawImage(pc1, 400, 575, this);
         g2.drawImage(pc2, 900, 615, this);
         g2.drawImage(ready, 650, 50, this);
         callRepaint();
         enter = 0;
         gameStartDecider = 4;
         gameSelectDecider = 90;
         roundEnder += 1; //Increments rounds until it reaches 5, in which case it will end the game.
      }
      
    //PRINTS "GAME OVER" SCREEN
      if (roundEnder == 5)
      {
        g2.drawImage(BG1, 0, 0, 1450, 800, this);
        g2.drawImage(gameOver, 450, 300, this);
        callRepaint();
        gameStartDecider = 99;
        roundEnder = 6;
      }
      
      //PRINTS "GAME OVER" SCREEN (DEBUG)
      else if (roundEnder == 6)
      {
         g2.drawImage(BG1, 0, 0, 1450, 800, this);
         g2.drawImage(gameOver, 450, 300, this);
         callRepaint();
         roundEnder=7;
      }
      //PRINTS RESULTS SCREEN. TELLS EACH PLAYER THEY'RE SCORE AND RESETS GAME IF PLAYER PRESSES "ENTER"
      else if (roundEnder == 7) 
      {
         game.preFight();
         g2.drawImage(BG1, 0, 0, 1450, 800, this);
         g2.drawImage(results, 500, 100, this);
         g2.drawImage(p1Text, 225, 300, this);
         g2.drawImage(p2Text, 1050, 300, this);
         g2.drawImage(gameStart, 600,500, this);
        
         if (p1 == 0 && p2 == 5)// Score 0/5
         {
           g2.drawImage(zero, 235, 450, this);
           g2.drawImage(five, 1075, 450, this);
         }
         else if (p1 == 1 && p2 == 4)// Score 1/4
         {
           g2.drawImage(one, 250, 450, this);
           g2.drawImage(four, 1075, 450, this);
         }
         else if (p1 == 2 && p2 == 3)// Score 2/3
         {
           g2.drawImage(two, 250, 450, this);
           g2.drawImage(three, 1075, 450, this);
         }
         else if (p1 == 3 && p2 == 2)// Score 3/2
         {
           g2.drawImage(three, 250, 450, this);
           g2.drawImage(two, 1075, 450, this);
         }
         else if (p1 == 4 && p2 == 1)//Score 4/1
         {
           g2.drawImage(four, 250, 450, this); 
           g2.drawImage(one, 1075, 450, this);
         }
         else if (p1 == 5 && p2 == 0)// Score 5/0
         {
           g2.drawImage(five, 235, 450, this);
           g2.drawImage(zero, 1050, 450, this);
         }
         
         
         
         game.roundIntermission();
         p1=0;
         p2=0;
         gameStartDecider=0;
         gameSelectDecider=0;
         gameSelectDeciderDebug=0;
         roundCount=0;
         roundEnder=0;
              
      }
      
   }
    
   
 
   public void callRepaint()
   {
      repaint();
   }
   
   
  
   public void keyPressed(KeyEvent arg0) //Logs the key pressed so it can be used to advance the game
   {
      
      int keyCode=arg0.getKeyCode();
      if (keyCode == 16) shift = 1;     //Shift key
      if (keyCode == 10) enter = 1;     //Enter key
      if (keyCode == 20) capsLock = 1;  //Caps lock key
      if (keyCode == 37) left = 1;      //Left arrow key
      if (keyCode == 39) right = 1;     //Right arrow key
      repaint();
   }
   
  
   @Override
   public void keyReleased(KeyEvent arg0) //Logs when the key the player pressed is released
   {
      int keyCode=arg0.getKeyCode();
      if (keyCode == 16) shift = 0;     //Shift key
      if (keyCode == 10) enter = 0;     //Enter key
      if (keyCode == 20) capsLock = 0;  //Caps lock key
      if (keyCode == 37) left = 0;      //Left arrow key
      if (keyCode == 39) right = 0;     //Right arrow key
      
   }
   
   

   
   @Override
   public void actionPerformed(ActionEvent arg0) //Every time a keyboard action is done
   {
      repaint();    
   }
   

   @Override
   public void keyTyped(KeyEvent arg0)
   {
      
      
   }
   
   
   //List of methods to return in value of different key presses
   public int getEnter()
   {
      return enter;
   }
   public int getCapsLock()
   {
      return capsLock;
   }
 

   

  

   
   
}


