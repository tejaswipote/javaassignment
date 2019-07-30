package multiplelibraries;

import java.util.ArrayList;
import java.util.List;

public class Album implements Comparable<Album> {
	private String aname;
	private List<Song> song = new ArrayList<>();
	int index = 0;

	Album(String name) {
		this.aname = name;

	}

	public String getAName() {
		// TODO Auto-generated method stub
		return this.aname;
	}

	@Override
	public int compareTo(Album album) {
		return this.getAName().compareTo(album.getAName());
	}

	/**
	 * @return the song
	 */
	public List<Song> getSong() {
		return song;
	}
}
