package circlePattern;

import java.util.Arrays;

public class Circle {
	private int radius, posX, posY;
	boolean filled;
	int[] pattern;

	public Circle(int radius, int posX, int posY, boolean filled, int[] pattern) {
		this.radius = radius;
		this.posX = posX;
		this.filled = filled;

		this.pattern = Arrays.copyOf(pattern, pattern.length);
	}

	public Circle(Circle other) {

		this.radius = other.radius;
		this.posX = other.posX;
		this.filled = other.filled;

		this.pattern = Arrays.copyOf(other.pattern, other.pattern.length);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", posX=" + posX + ", posY=" + posY + ", filled=" + filled + ", pattern="
				+ Arrays.toString(pattern) + "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (filled ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(pattern);
		result = prime * result + posX;
		result = prime * result + posY;
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (filled != other.filled)
			return false;
		if (!Arrays.equals(pattern, other.pattern))
			return false;
		if (posX != other.posX)
			return false;
		if (posY != other.posY)
			return false;
		if (radius != other.radius)
			return false;
		return true;
	}

}
