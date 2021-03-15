package at.bfi.jstdlib.exceptions;

public class TestExeptions {
	public static void main(String[] args) {
		int[] array = new int[10];

		try {
			array[array.length] = 0;
		} catch (IndexOutOfBoundsException e) {
			StackTraceElement[] stackTrace = e.getStackTrace();
			for (int i = 0; i < stackTrace.length; i++) {

			}
		}
	}
}
