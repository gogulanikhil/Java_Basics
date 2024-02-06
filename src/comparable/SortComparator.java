package comparable;

import java.util.ArrayList;
import java.util.Collections;

class Movies implements Comparable<Movies> {

	private String moviename;
	private String Author;
	private Integer year;

	public Movies(String moviename, String author, int year) {
		this.moviename = moviename;
		this.Author = author;
		this.year = year;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movies [moviename=" + moviename + ", Author=" + Author + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Movies eachMovie) {
		return this.getMoviename().compareTo(eachMovie.getMoviename());
	}

}

public class SortComparator {

	public static void main(String[] args) {
		Movies movie1 = new Movies("marvel", "stanlee", 2003);
		Movies movie2 = new Movies("dc", "jeof johns", 2010);
		Movies movie3 = new Movies("anime", "name", 2022);
		Movies movie4 = new Movies("lcu", "lokesh", 1998);

		ArrayList<Movies> listOfMovies = new ArrayList<>();
		listOfMovies.add(movie1);
		listOfMovies.add(movie2);
		listOfMovies.add(movie3);
		listOfMovies.add(movie4);

		MyUtils.list(listOfMovies);
		Collections.sort(listOfMovies);
		System.out.println("after sorting");
		MyUtils.list(listOfMovies);
	}
}
