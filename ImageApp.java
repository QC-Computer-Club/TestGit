import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class ImageApp
{  
   public void loadAndDisplayImage(JFrame frame)
   {  
      // Load the img  
      BufferedImage loadImg = ImageUtil.loadImage("PAX-East-logo.gif");  
      frame.setBounds(0, 0, loadImg.getWidth(), loadImg.getHeight()); 
      System.out.printf("Width: %d, Height: %d%n",
         loadImg.getWidth(), loadImg.getHeight());
         
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JImagePanel panel = new JImagePanel(loadImg, 0, 0);  
      frame.add(panel); 
        
      // Set the panel visible and add it to the frame  
      frame.setVisible(true); 
   }  
      
   public static void main(String[] args) {  
      ImageApp ia = new ImageApp();
      JFrame frame = new JFrame("Tutorials");  
      ia.loadAndDisplayImage(frame);  
   }  
}  