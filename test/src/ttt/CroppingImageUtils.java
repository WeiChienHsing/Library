package ttt;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import javax.imageio.ImageIO;

import com.github.tonydeng.fmj.runner.FFmpegCommandRunner;

public class CroppingImageUtils {

	public static void main(String[] args) throws IOException {
		final String videoFilePath = "C:\\Users\\Administrator\\Desktop\\listening\\Â½Íõ\\08.mp4";
		
		File imageFile = FFmpegCommandRunner.screenshot(new File(videoFilePath), 1);
		
		
		
		
		
		
		
	}

	private static void backup() throws IOException {
		
		Integer offSet = 190;
		Integer imgWidth = 1060;
		Integer imgHeight = 720;
		
		Integer subHeight = 48;
		
		final String imageFolderPath = "C:\\Users\\Administrator\\Desktop\\listening\\ÐÌ¾¯¹­Éñ\\10";
		final String exportTxtPath = "";
		String content = "Hello World !!";
		Files.write(Paths.get("c:/output.txt"), content.getBytes());
		
		Stream<Path> paths = FileUtils.getFilesByFolderPath(imageFolderPath);
		
	
		
		paths.forEach(image -> {
			BufferedImage imgSrc = null;
			BufferedImage croppedImg = null;
			
			try {
				if (image.toString().indexOf("png") == -1) {
					return;
				}
				
				File imageFile = new File(image.toString());
				
				imgSrc = ImageIO.read(imageFile);
				
				croppedImg = cropImage(imgSrc, new Rectangle(offSet, imgHeight - subHeight), new Rectangle(imgWidth - offSet, subHeight));
				
				ImageIO.write(croppedImg, "jpeg", new File(image.toString().replace("png", "jpeg")));
				
				imageFile.delete();
				
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
