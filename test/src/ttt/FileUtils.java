package ttt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUtils {
	
	
	public static Stream<Path> getFilesByFolderPath(String folderPath) throws IOException {
		return Files.walk(Paths.get(folderPath));
	}
	
	
	
	

}
