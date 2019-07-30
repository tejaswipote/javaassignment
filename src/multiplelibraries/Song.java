package multiplelibraries;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

public class Song implements Comparable<Song> {
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
				System.out.print("Album Name : " + l.get(i).getAlbums().get(j).getAName() + "\n");
				for (int k = 0; k < 3; k++) {
					System.out.print("Author Name : " + l.get(i).getAlbums().get(j).getSong().get(k).displays());
				}
			}
		}
	}

	@Override
	public int compareTo(Song song) {
		// TODO Auto-generated method stub

		return date_of_Release.compareTo(((Song) song).date_of_Release);

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
