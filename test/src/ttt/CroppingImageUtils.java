package ttt;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;

import javax.imageio.ImageIO;

public class CroppingImageUtils {

	public static void main(String[] args) throws IOException {
		
		Integer imgWidth = 1280;
		Integer imgHeight = 720;
		
		Integer subHeight = 100;
		
		final String folderPath = "C:\\Users\\Administrator\\Desktop\\listening\\只是先生的我\\08\\";
		
		Stream<Path> paths = FileUtils.getFilesByFolderPath(folderPath);
		
	
		
		paths.forEach(image -> {
			BufferedImage imgSrc = null;
			BufferedImage croppedImg = null;
			
			try {
				imgSrc = ImageIO.read(new File(image.toString()));
				
				croppedImg = cropImage(imgSrc, new Rectangle(0, imgHeight - subHeight), new Rectangle(imgWidth, subHeight));
				
				ImageIO.write(croppedImg, "jpeg", new File(image.toString().replace("png", "jpeg")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		});
		
	}

	private static BufferedImage cropImage(BufferedImage src, Rectangle start, Rectangle rect) {
		BufferedImage dest = src.getSubimage(start.width, start.height, rect.width, rect.height);
		return dest;
	}

}
