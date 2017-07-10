package Miscellaneous;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

public class SearchingTextFiles {
	
	public static void main(String args[]){
		
		Path path = FileSystems.getDefault().getPath("files", "list.txt");
		String searchTerm = "To be, or not to be";
		
		try (Stream<String> lines = Files.lines(path)){
			Optional<String> line = lines.filter(l -> l.contains(searchTerm)).findFirst();
			if(line.isPresent()){
				System.out.println("Found: " +line.get());
			} else{
				System.out.println("Not Found");
			}
		}catch (Exception e){
			
		}
		
	}
}
