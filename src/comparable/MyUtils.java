package comparable;

import java.util.ArrayList;

public class MyUtils {

	public static <T> void list(ArrayList<T> listOfMovies) {
		for (T collect : listOfMovies) {
			System.out.println(collect);
		}
	}
}
