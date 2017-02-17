import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

public class ImageUtil
{
   public static BufferedImage loadImage(String ref)
   {  
      BufferedImage bimg = null;  
      try {  
         bimg = ImageIO.read(new File(ref));  
      } catch (Exception e) {  
         e.printStackTrace();  
      }  
      return bimg;
   }  
}