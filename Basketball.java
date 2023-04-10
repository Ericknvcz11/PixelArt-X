import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Basketball {
	// Definimos el tamaÃ±o de la imagen en ancho y alto
		private static int width = 800; 	
	    private static int height = 800;
	    
	    // Definimos el tamaÃƒÂ±o del pixel
	    private static int PIXEL_SIZE = 40;
	    private static Graphics2D g;
	    
	    // Definimos los colores a usar
	    static Color white 		= Color.white;
	    static Color red   		= Color.red;
	    static Color blue  		= Color.blue;
	    static Color dark 	= new Color(22,22,22);
	    static Color Orange = new Color(168,74,36);
	    static Color softOrange = new Color(252,109,3);
	    
	    private final static Color[][] PIXELS = {
	          /*1*/  {white, white, 	white, 	white, 	white, white, white, white, white, white, white, white, white, 	white, 	white, 	white, white, white, white, white, white},
	            {white, white, 	white, 	white, 	white, white, white, white, white, white, white, white, white, 	white, 	white, 	white, white, white, white, white, white},
	            {white, white, white, white, white, white, white, white, Orange, Orange, dark, Orange, Orange, 	white,  white, white, white, white, white, white, white},
	            {white, white, white, white, white, white, Orange, Orange, Orange, Orange, dark, Orange, Orange, 	Orange,  Orange, white, white, white, white, white, white},
	            {white, white, white, white, white, Orange, Orange, Orange, Orange, Orange, dark, Orange, Orange, 	Orange,  Orange, Orange, white, white, white, white, white},
	            {white, white, white, white, Orange, dark, Orange, Orange, Orange, Orange, dark, Orange, Orange, 	Orange,  Orange, dark, Orange, white, white, white, white},
	            {white, white, white, Orange, Orange, Orange, dark, Orange, Orange, Orange, dark, Orange, Orange, 	Orange,  dark, 	Orange, Orange, Orange, white, white, white},
	            {white, white, white, Orange, Orange, Orange, Orange, dark, Orange, Orange, dark, Orange, Orange, 	dark, 	Orange, 	Orange, Orange, Orange, white, white, white},
	            {white, white, Orange, Orange, Orange, Orange, Orange, dark, Orange, Orange, dark, Orange, Orange, 	dark, 	Orange, 	Orange, Orange, Orange, Orange, white, white},
	            {white, white, Orange, Orange, Orange, Orange, Orange, dark, Orange, Orange, dark, Orange, Orange, 	dark, 	Orange, 	Orange, Orange, Orange, Orange, white, white},
	            {white, white, 	dark, 	dark, 	dark, 	dark, 	dark, dark, dark, 	dark, dark, 	dark, dark, dark, 	dark, 	dark, dark, dark, dark, white, white},
	            {white, white, Orange, Orange, Orange, Orange, Orange, dark, Orange, Orange, dark, Orange, Orange, 	dark, 	Orange, 	Orange, Orange, Orange, Orange, white, white},
	            {white, white, Orange, Orange, Orange, Orange, Orange, dark, Orange, Orange, dark, Orange, Orange, 	dark, 	Orange, 	Orange, Orange, Orange, Orange, white, white},
	            {white, white, white, Orange, Orange, Orange, Orange, dark, Orange, Orange, dark, Orange, Orange, 	dark, 	Orange, 	Orange, Orange, Orange, white, white, white},
	            {white, white, white, Orange, Orange, Orange, dark, Orange, Orange, Orange, dark, Orange, Orange, 	Orange,  dark, 	Orange, Orange, Orange, white, white, white},
	            {white, white, white, white, Orange, dark, Orange, Orange, Orange, Orange, dark, Orange, Orange, 	Orange,  Orange, dark, Orange, white, white, white, white},
	            {white, white, white, white, white, Orange, Orange, Orange, Orange, Orange, dark, Orange, Orange, 	Orange,  Orange, Orange, white, white, white, white, white},
	            {white, white, white, white, white, white, Orange, Orange, Orange, Orange, dark, Orange, Orange, 	Orange,  Orange, white, white, white, white, white, white},
	            {white, white, white, white, white, white, white, white, Orange, Orange, dark, Orange, Orange, 	white,  white, white, white, white, white, white, white},
	            {white, white, 	white, 	white, 	white, white, white, white, white, white, white, white, white, 	white, 	white, 	white, white, white, white, white, white},
	            {white, white, 	white, 	white, 	white, white, white, white, white, white, white, white, white, 	white, 	white, 	white, white, white, white, white, white}
	        };
	    
	    
	    public static void main(String[] args) throws Exception {
	        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	        Graphics2D g = image.createGraphics();

	        for (int y = 0; y < PIXELS.length; y++) {
	            for (int x = 0; x < PIXELS[0].length; x++) {
	                g.setColor(PIXELS[y][x]);
	                g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
	            }
	        }

	        File outputfile = new File("Basketball.png");
	        ImageIO.write(image, "jpg", outputfile);
	    }
	}
