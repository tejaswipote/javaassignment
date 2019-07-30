package multiplelibraries;

import java.util.*;

import java.sql.Date;
import java.util.List;

public class MainClass {

	public static void displaySongs(List<Song> song) {
		System.out.println("0. All");
		for (int i = 0; i < 3; i++)
			System.out.print((i + 1) + ". " + song.get(i).getName() + "\n");
	}

	public static void displayAllAlbums(List<Library> list) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Album Name : " + list.get(i).getAlbums().get(j).getAName());
			}
		}
	}

	public static void displayAllSongs(List<Library> l) {
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				for (int k = 0; k < 3; k++) {
					System.out.println(l.get(i).getAlbums().get(j).getSong().get(k).getName());

				}
			}
		}
	}

	public static void displayAll(List<Library> l) {
		for (int i = 0; i < 3; i++) {
			System.out.print("Library Name : " + l.get(i).getLName() + "\n");
			for (int j = 0; j < 3; j++) {
				System.out.print("Album Name : " + l.get(i).getAlbums().get(j).getAName() + "\n");
				for (int k = 0; k < 3; k++) {
					System.out.print(l.get(i).getAlbums().get(j).getSong().get(k).displays());
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Library> libraries = new ArrayList<>();

		libraries.add(new Library("Library3"));
		libraries.add(new Library("Library2"));
		libraries.add(new Library("Library1"));
		Collections.sort((List<Library>) libraries);

		List<Album> album = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			album.add(new Album("Album" + (i + 1)));
		}

		Collections.sort((List<Album>) album);

		int index = 0;
		for (int i = 0; i < 3; i++) {
			libraries.get(i).getAlbums().add(album.get(index++));

			libraries.get(i).getAlbums().add(album.get(index++));

			libraries.get(i).getAlbums().add(album.get(index++));

		}

		List<Song> s1 = new ArrayList<Song>();

		s1.add(new Song("Song1", "Ajay-Atul", Date.valueOf("2010-1-3"), "3 idiots"));
		s1.add(new Song("Song2", "Ajay-Atul", Date.valueOf("2011-1-3"), "3 idiots"));
		s1.add(new Song("Song3", "Ajay-Atul", Date.valueOf("2012-3-3"), "3 idiots"));
		s1.add(new Song("Song4", "Ajay-Atul", Date.valueOf("2013-1-3"), "3 idiots"));
		s1.add(new Song("Song5", "Ajay-Atul", Date.valueOf("2014-1-3"), "3 idiots"));
		s1.add(new Song("Song6", "Ajay-Atul", Date.valueOf("2015-1-3"), "3 idiots"));
		s1.add(new Song("Song7", "Ajay-Atul", Date.valueOf("2016-1-3"), "3 idiots"));
		s1.add(new Song("Song8", "Ajay-Atul", Date.valueOf("2017-1-3"), "3 idiots"));
		s1.add(new Song("Song9", "Ajay-Atul", Date.valueOf("2018-1-3"), "3 idiots"));
		s1.add(new Song("Song10", "Ajay-Atul", Date.valueOf("2019-1-3"), "3 idiots"));
		s1.add(new Song("Song11", "Ajay-Atul", Date.valueOf("2020-1-3"), "3 idiots"));
		s1.add(new Song("Song12", "Ajay-Atul", Date.valueOf("2021-1-3"), "3 idiots"));
		s1.add(new Song("Song13", "Ajay-Atul", Date.valueOf("2022-1-3"), "3 idiots"));
		s1.add(new Song("Song14", "Ajay-Atul", Date.valueOf("2023-1-3"), "3 idiots"));
		s1.add(new Song("Song15", "Ajay-Atul", Date.valueOf("2024-1-3"), "3 idiots"));
		s1.add(new Song("Song16", "Ajay-Atul", Date.valueOf("2025-1-3"), "3 idiots"));
		s1.add(new Song("Song17", "Ajay-Atul", Date.valueOf("2026-1-3"), "3 idiots"));
		s1.add(new Song("Song18", "Ajay-Atul", Date.valueOf("2027-1-3"), "3 idiots"));
		s1.add(new Song("Song19", "Ajay-Atul", Date.valueOf("2028-1-3"), "3 idiots"));
		s1.add(new Song("Song20", "Ajay-Atul", Date.valueOf("2029-1-3"), "3 idiots"));
		s1.add(new Song("Song21", "Ajay-Atul", Date.valueOf("2030-1-3"), "3 idiots"));
		s1.add(new Song("Song22", "Ajay-Atul", Date.valueOf("2031-1-3"), "3 idiots"));
		s1.add(new Song("Song23", "Ajay-Atul", Date.valueOf("2032-1-3"), "3 idiots"));
		s1.add(new Song("Song24", "Ajay-Atul", Date.valueOf("2033-1-3"), "3 idiots"));
		s1.add(new Song("Song25", "Ajay-Atul", Date.valueOf("2034-1-3"), "3 idiots"));
		s1.add(new Song("Song26", "Ajay-Atul", Date.valueOf("2035-1-3"), "3 idiots"));
		s1.add(new Song("Song27", "Ajay-Atul", Date.valueOf("2036-1-3"), "3 idiots"));
		Collections.sort((List<Song>) s1);

		index = 0;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {

				libraries.get(i).getAlbums().get(j).getSong().add(s1.get(index++));

				libraries.get(i).getAlbums().get(j).getSong().add(s1.get(index++));

				libraries.get(i).getAlbums().get(j).getSong().add(s1.get(index++));

			}

		int i = 1;
		System.out.println("00: all");
		for (Library l : libraries) {
			System.out.println("0" + i + ": " + l.getLName());
			i++;

		}
		java.util.Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		i = 0;
		if (choice == 0)
			displayAll(libraries);
		else

		{
			System.out.println("00: all");
			for (Album alm : libraries.get(choice - 1).getAlbums()) {
				System.out.println("0" + (i + 1) + ": " + alm.getAName());
				i++;
			}
		}
		int choice2 = sc.nextInt();

		if (choice2 == 0)
			displayAllAlbums(libraries);
		else
			displaySongs(libraries.get(choice - 1).getAlbums().get(choice2 - 1).getSong());
		int choice3 = sc.nextInt();
		if (choice3 == 0)
			displayAllSongs(libraries);
		else

		{
			System.out.println(
					libraries.get(choice - 1).getAlbums().get(choice2 - 1).getSong().get(choice3 - 1).displays());
		}
	}

}
