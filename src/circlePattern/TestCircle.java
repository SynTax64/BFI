package circlePattern;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class TestCircle {
	public static void main(String[] args) {

		int[] pattern = new int[] { 5, 6, 7, 5, 8 };
		Circle c1 = new Circle(10, 20, 20, true, pattern);

		Circle c2 = new Circle(c1);

		Circle c3 = new Circle(10, 20, 20, true, pattern);

		Set<Circle> kreise = new HashSet<>();
		kreise.add(c1);
		kreise.add(c2);
		kreise.add(c3);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(kreise);

		System.out.println(c1.getClass().getName());
		System.out.println(c1.getClass().getCanonicalName());
		System.out.println(c1.getClass().getSimpleName());
		System.out.println(c1.getClass().getTypeName());

		Field[] contructors = c1.getClass().getFields();

		for (int i = 0; i < contructors.length; i++) {
			System.out.println(contructors[i].getName());
		}
	}
}