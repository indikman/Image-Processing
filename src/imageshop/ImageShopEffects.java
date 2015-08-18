/*
 * Here contains all the image effects and functions
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageshop;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.image.BufferedImage;

/**
 *
 * @author Indika
 */
public class ImageShopEffects {
    
    //global variables for an image
    int imageWidth;
    int imageHeight;
    
    // Turning the image int to its Channels
    
    //BufferedImage pixel consists of a 32 bit number for Alpha, Red, Green and Blue
    //Here the rgb values are taken and the bit number is shifted to get the correct channel output
    //This method gets the image as input as well as the colour string to return correct channel    
    
    public BufferedImage getChannel(BufferedImage image, String colour){
        
        
        BufferedImage tempImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        tempImage.setData(image.getData());
        
        //getting the size of the image
        imageWidth = tempImage.getWidth();
        imageHeight = tempImage.getHeight();
        
        //getting the RGB number for each pixel and return it with a corresponding pixel value only with its channel
        // AAAAAAAA RRRRRRRR GGGGGGGG BBBBBBBB
        for (int x = 0; x < imageWidth; x++) {
            for (int y = 0; y < imageHeight; y++) {
                
                int pixel = tempImage.getRGB(x, y);
                int alpha = (pixel >> 24) & 0xff;
                
                if(colour.equalsIgnoreCase("red"))
                {
                    int red = (pixel >> 16) & 0xff; 
                    pixel = (alpha << 24) | (red << 16) | (0 << 8) | 0;
                    
                }else if(colour.equalsIgnoreCase("green")){
                    
                    int green = (pixel >> 8) & 0xff;
                    pixel = (alpha << 24) | (0 << 16) | (green << 8) | 0;
                    
                }else if(colour.equalsIgnoreCase("blue")){
                    
                    int blue = pixel & 0xff;
                    pixel = (alpha << 24) | (0 << 16) | (0 << 8) | (blue);
                    
                }else{
                    //same image should be returned
                }
                
                //setting the new RGB values for the image
                tempImage.setRGB(x, y, pixel);
                
            }
        }
        
        return tempImage;
    }
    
    
    public BufferedImage getNeagative(BufferedImage image){
        BufferedImage tempImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        tempImage.setData(image.getData());
        
        //getting the size of the image
        imageWidth = tempImage.getWidth();
        imageHeight = tempImage.getHeight();
        
        //getting the RGB number for each pixel and return it with a corresponding pixel value only with its channel
        // AAAAAAAA RRRRRRRR GGGGGGGG BBBBBBBB
        for (int x = 0; x < imageWidth; x++) {
            for (int y = 0; y < imageHeight; y++) {
                
                int pixel = tempImage.getRGB(x, y);
                int alpha = (pixel >> 24) & 0xff;
                
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                
                red = 255 - red;
                green = 255 - green;
                blue = 255 - blue;
                
                
                pixel = (alpha << 24) | (red << 16) | (green << 8) | (blue);
                
                
                //setting the new RGB values for the image
                tempImage.setRGB(x, y, pixel);
                
            }
        }
        
        return tempImage;
        
    }
    
    
    public BufferedImage changeBrightness(BufferedImage image, int value){
        
        //getting the size of the image
        imageWidth = image.getWidth();
        imageHeight = image.getHeight();
       
        for (int x = 0; x < imageWidth; x++) {
            for (int y = 0; y < imageHeight; y++) {
                
                //as getting the pixel value is implemented in RGB channel method and negative method, 
                //this method will directly extract RGB values by already implemented methods
                Color color = new Color(image.getRGB(x, y));
                
                int r = checkColorRange(color.getRed() + value);
                int g = checkColorRange(color.getGreen() + value);
                int b = checkColorRange(color.getBlue() + value);
                
                color = new Color(r, g, b);
                
                //setting the new RGB values for the image
                image.setRGB(x, y, color.getRGB());
                
            }
        }
        
        return image;
    }
    
    public int checkColorRange(int newColor){
        if(newColor > 255){
            newColor = 255;
        } else if (newColor < 0) {
            newColor = 0;
        }
        return newColor;
    }
    
    
    public BufferedImage changeContrast(BufferedImage image, float value){
        //getting the size of the image
        imageWidth = image.getWidth();
        imageHeight = image.getHeight();
        
        float scaleFactor = (259*(value + 255))/(255*(259-value));
        System.out.println(value + " -> " +scaleFactor);
       
        for (int x = 0; x < imageWidth; x++) {
            for (int y = 0; y < imageHeight; y++) {
                
                //as getting the pixel value is implemented in RGB channel method and negative method, 
                //this method will directly extract RGB values by already implemented methods
                Color color = new Color(image.getRGB(x, y));
                
                int r = checkColorRange((int) ((color.getRed()-128) * scaleFactor +128));
                int g = checkColorRange((int) ((color.getGreen()-128) * scaleFactor +128));
                int b = checkColorRange((int) ((color.getBlue()-128) * scaleFactor +128));
                
                color = new Color(r, g, b);
                
                //setting the new RGB values for the image
                image.setRGB(x, y, color.getRGB());
                
            }
        }
        return image;
    }
    
    public BufferedImage ContrastStretch(BufferedImage image, float newMin, float newMax)
    {
        //getting the size of the image
        imageWidth = image.getWidth();
        imageHeight = image.getHeight();
        
        //as Image values are 
        int min = 0;
        int max = 255;
        
        float val = (newMax - newMin)/(max-min);
        System.out.println(val);
        
        for (int x = 0; x < imageWidth; x++) {
            for (int y = 0; y < imageHeight; y++) {
                

                Color color = new Color(image.getRGB(x, y));
                
                
                int r = checkColorRange((int) ((color.getRed()-min)*val+newMin));
                int g = checkColorRange((int) ((color.getGreen()-min)*val+newMin));
                int b = checkColorRange((int) ((color.getBlue()-min)*val+newMin));
                
                color = new Color(r, g, b);
                
                //setting the new RGB values for the image
                image.setRGB(x, y, color.getRGB());
                
            }
        }
        return image;
    }
    
    
    public BufferedImage reSample(BufferedImage image, int width, int height, Object type)
    {
        int imgWidth = image.getWidth();
        int imgHeight = image.getHeight();
        
        int imageType = BufferedImage.TYPE_INT_RGB; //Including transparency
        
        BufferedImage newImage = new BufferedImage(width, height, imageType);
        //BufferedImage newImage = (BufferedImage)image;
        Graphics2D g2 = newImage.createGraphics();
        
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
        g2.drawImage(newImage, 0, 0, width, height, null);
        //g2.dispose();
        
        
        return newImage;
    }
    
    public BufferedImage getScaledInstance(
        BufferedImage img, int targetWidth,
        int targetHeight, Object hint, 
        boolean higherQuality)
    {
        int type =
            (img.getTransparency() == Transparency.OPAQUE)
            ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;
        BufferedImage ret = (BufferedImage) img;
        int w, h;
        if (higherQuality)
        {
            // Use multi-step technique: start with original size, then
            // scale down in multiple passes with drawImage()
            // until the target size is reached
            w = img.getWidth();
            h = img.getHeight();
        }
        else
        {
            // Use one-step technique: scale directly from original
            // size to target size with a single drawImage() call
            w = targetWidth;
            h = targetHeight;
        }

        do
        {
            if (higherQuality && w > targetWidth)
            {
                w /= 2;
                if (w < targetWidth)
                {
                    w = targetWidth;
                }
            }

            if (higherQuality && h > targetHeight)
            {
                h /= 2;
                if (h < targetHeight)
                {
                    h = targetHeight;
                }
            }

            BufferedImage tmp = new BufferedImage(w, h, type);
            Graphics2D g2 = tmp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, hint);
            g2.drawImage(ret, 0, 0, w, h, null);
            g2.dispose();

            ret = tmp;
        } while (w != targetWidth || h != targetHeight);

        return ret;
    }
        
}
