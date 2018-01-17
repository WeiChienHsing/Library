package ttt;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import com.atilika.kuromoji.ipadic.Token;
import com.atilika.kuromoji.ipadic.Tokenizer;

public class testt {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Tokenizer tokenizer = new Tokenizer();
		final String folderPath = "C:\\Users\\Administrator\\Desktop\\test";
		
		Stream<Path> paths = Files.walk(Paths.get(folderPath));
		
		// = new HashSet<Token>();
		
		
		
		paths.forEach(x -> {
			
			if (!Files.isDirectory(x)) {
				System.out.println(x);		
				System.out.println(x);			
				
				Set<Token> tokenSet = new HashSet<Token>();
				
				try {
					tokenSet.addAll(tokenizer.tokenize(new String(Files.readAllBytes(Paths.get(x.toString())), "UTF-8")));
										
					String output = "";
					Integer counter = 0;
					for (Token token : tokenSet) {
						// logger.error("111");
//						if (token.getPartOfSpeechLevel1().equals("Ñ”‘~")) {
//							output += token.getBaseForm() + "\t" + "placeholder\r\n";
//						}
						//System.out.println(token.getAllFeatures());			
						output += token.getBaseForm() + "\t" + "placeholder\r\n";
						counter++;
						System.out.println(counter);
					}
					
					output += "total words : " + counter + "/r/n";
					
					
					Files.write(Paths.get("C:\\\\Users\\\\Administrator\\\\Desktop\\\\output.txt"), Collections.singleton(output), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
					
					
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
		});
		
		
	
		
		
	}

}
