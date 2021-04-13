package AWT_SWING_NIO.PathPathsFiles;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest {

	public static void main(String[] args) {

		String op = "cout";

		try {
			switch (op) {
			case "cd":
				Files.createDirectories(Paths.get("dir/sub"));
				break;

			case "cf":
				Files.createFile(Paths.get("dir/test.txt"));
				break;

			case "ct":
				Path path = Files.createTempFile("test", null);
				System.out.println(path);
				break;

			case "m":
				Files.move(Paths.get("dir/test.txt"), Paths.get("dir/sub/test.txt"));
				break;

			case "c":
				Files.copy(Paths.get("dir/sub/test.txt"), Paths.get("dir/test.txt"));
				break;

			case "d":
				Files.delete(Paths.get("dir/sub/test.txt"));
				break;

			case "cin":
				URL url = new URL("http://www.google.de");
				Files.copy(url.openStream(), Paths.get("dir/aus.txt"));
				break;

			case "cout":

				Files.copy(Paths.get("src//AWT_SWING_NIO//PathPathsFiles//FilesTest.java"), System.out);
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
