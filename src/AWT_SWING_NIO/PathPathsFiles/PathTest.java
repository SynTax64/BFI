package PathPathsFiles;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		
		String home = System.getProperty("user.home");
		
		System.out.println(home);
		
		String dir = System.getProperty("user.dir");
		
		System.out.println(dir);
		
		Path path = Paths.get(dir, "src","com","bfi","workwithpath", "PathTest.java");
		
		System.out.println(path);
		
		
		System.out.println("filename: " + path.getFileName());
		System.out.println("parent: " + path.getParent());
		System.out.println("root: " + path.getRoot());
		
		System.out.println("exist: " + Files.exists(path));
		System.out.println("isDirectory: " + Files.isDirectory(path));
		
		System.out.println("isRegularFile: " + Files.isRegularFile(path));
		System.out.println("isReadable: " +  Files.isReadable(path));
		System.out.println("isWritable: " +  Files.isWritable(path));
		try {
			System.out.println("size: " + Files.size(path));
			System.out.println("lastModifiedTime: " + Files.getLastModifiedTime(path));
			System.out.println("owner: " + Files.getOwner(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int n = path.getNameCount();
		
		for (int i = 0; i < n; i++) {
			System.out.println(path.getName(i) + " ");
			
		}
		
		System.out.println("******************");
		
		
		Path currentDir = Paths.get(".");
		System.out.println(currentDir.toAbsolutePath());
		try {
			System.out.println("realPath: " + currentDir.toRealPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("******************");
		 currentDir = Paths.get("..");
		System.out.println(currentDir.toAbsolutePath());
		try {
			System.out.println("realPath: " + currentDir.toRealPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				

	}

}
