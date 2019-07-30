package multiplelibraries;

import java.util.*;

public class Library implements Comparable<Library> {

	private String lname;

	private List<Album> albums = new ArrayList<Album>();

	Library(String name) {
		this.lname = name;

	}

	@Override
	public int compareTo(Library libraries) {
		// TODO Auto-generated method stub

		return lname.compareTo(((Library) libraries).lname);

	}

	public String getLName() {
		// TODO Auto-generated method stub
		return this.lname;
	}

	/**
	 * @return the albums
	 */
	public List<Album> getAlbums() {
		return albums;
	}

}
