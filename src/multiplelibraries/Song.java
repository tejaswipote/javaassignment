package multiplelibraries;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

public class Song implements Comparable {
	private String name;
	private String author;
	private Date date_of_Release;
	private String movie_Name;

	Song(String name, String author, java.util.Date date, String movie_Name) {
		this.name = name;
		this.author = author;
		this.date_of_Release = date;
		this.movie_Name = movie_Name;
	}

	public String getSName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public static void displayAll(ArrayList<Library> l) {
		for (int i = 0; i < 3; i++) {
			System.out.print("Library Name : " + l.get(i).getLName() + "\n");
			for (int j = 0; j < 3; j++) {
				System.out.print("Album Name : " + l.get(i).albums.get(j).getAName() + "\n");
				for (int k = 0; k < 3; k++) {
					System.out.print("Author Name : " + l.get(i).albums.get(j).song.get(k).author + ", ");
					System.out.print("Date of Release : " + l.get(i).albums.get(j).song.get(k).date_of_Release + ", ");
					System.out.print("Movie Name : " + l.get(i).albums.get(j).song.get(k).movie_Name + " ");
					System.out.println();
				}
			}
		}
	}

	@Override
	public int compareTo(Object song) {
		// TODO Auto-generated method stub

		return name.compareTo(((Song) song).name);

	}

	public String displays() {
		return "name=" + name + ", author=" + author + ", date_of_Release=" + date_of_Release + ", movie_Name="
				+ movie_Name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
