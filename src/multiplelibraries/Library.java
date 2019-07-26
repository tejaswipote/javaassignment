package multiplelibraries;

import java.util.*;

public class Library implements Comparable {

	private String lname;

	public List<Album> albums = new ArrayList<Album>();

	Library(String name) {
		this.lname = name;

	}

	@Override
	public int compareTo(Object libraries) {
		// TODO Auto-generated method stub

		return lname.compareTo(((Library) libraries).lname);

	}

	public String getLName() {
		// TODO Auto-generated method stub
		return this.lname;
	}

}
