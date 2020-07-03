package fileOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class DistinctWords {
	public static void main(String[] args) throws IOException {
		Set<String> set=new HashSet<String>();
		Path path=Paths.get("D:\\Learn\\Test.txt");
		try {
			List<String> lines=Files.readAllLines(path);
			for(String line:lines) {
				String[] words=line.split("\\s+");
				for(String word:words) {
					set.add(word);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(set);	
		
		// Applying flatMap to filter distinct words
		Files.lines(path).map(e->e.split("\\s+")).flatMap(Arrays::stream).distinct().forEach(s->System.out.println(s));
		
		// FlatMap used to display distinct letters
		List<String> strArray=Arrays.asList("javascriptjava","java");
		//
		strArray.stream().map(lan->lan.split("")).flatMap(Arrays::stream).distinct().forEach(System.out::print);
		
	}
}
