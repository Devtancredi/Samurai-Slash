import javax.swing.JFrame;


/* Frank Tancredi
   Date:Apr 16, 2014
   Program:SamuraiTester.java
   Description:
 */

public class SamuraiTester
{

   public static void main(String[] args)
   {
      
     
      
      JFrame frame = new JFrame();
      frame.requestFocus();
      frame.requestFocusInWindow();
      frame.setTitle("Samurai Slash");
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1450,800);
      SamuraiGraphics gameGraphics = new SamuraiGraphics();
      frame.add(gameGraphics);
      frame.requestFocusInWindow(); 
      frame.setVisible(true);
      
      
      

   }

}
