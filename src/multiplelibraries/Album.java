package multiplelibraries;

import java.util.ArrayList;
import java.util.List;

public class Album implements Comparable<Album> {
	private String aname;
	public List<Song> song = new ArrayList<>();
	int index = 0;

	Album(String name) {
		this.aname = name;

	}

	// special setters: adding new song
	public void addSong(Song newSong) {
		song.add(newSong);
	}

	public String getAName() {
		// TODO Auto-generated method stub
		return this.aname;
	}

	@Override
	public int compareTo(Album album) {
		return this.getAName().compareTo(album.getAName());
	}

}
