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
				System.out.println("Album Name : " + list.get(1).albums.get(j).getAName());
			}
		}
	}

	public static void displayAllSongs(List<Library> l) {
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				for (int k = 0; k < 3; k++) {
					System.out.println(l.get(i).albums.get(j).song.get(k).getName());

				}
			}
		}
	}

	public static void displayAll(List<Library> l) {
		for (int i = 0; i < 3; i++) {
			System.out.print("Library Name : " + l.get(i).getLName() + "\n");
			for (int j = 0; j < 3; j++) {
				System.out.print("Album Name : " + l.get(i).albums.get(j).getAName() + "\n");
				for (int k = 0; k < 3; k++) {
					System.out.print(l.get(i).albums.get(j).song.get(k)
							.displays());
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Library> libraries = new ArrayList<>();
		Library lib[] = new Library[3];
		lib[0] = new Library("Library3");
		lib[1] = new Library("Library2");
		lib[2] = new Library("Library1");

		libraries.add(lib[0]);
		libraries.add(lib[1]);
		libraries.add(lib[2]);

		Album a[] = new Album[9];
		a[0] = new Album("Album1");
		a[1] = new Album("Album2");
		a[2] = new Album("Album3");
		a[3] = new Album("Album4");
		a[4] = new Album("Album5");
		a[5] = new Album("Album6");
		a[6] = new Album("Album7");
		a[7] = new Album("Album8");
		a[8] = new Album("Album9");
		int index = 0;
		for (int i = 0; i < 3; i++) {
			lib[i].albums.add(a[index++]);
			lib[i].albums.add(a[index++]);
			lib[i].albums.add(a[index++]);
		}

		List<Album> al = new ArrayList<Album>();

		for (int i = 0; i < 9; i++) {
			al.add(a[i]);
		}

		List<Song> s1 = new ArrayList<Song>();

		Song s[] = new Song[27];
		s[0] = new Song("Song1", "Ajay-Atul", Date.valueOf("2010-1-3"), "3 idiots");
		s[1] = new Song("Song2", "Ajay-Atul", Date.valueOf("2011-1-3"), "3 idiots");
		s[2] = new Song("Song3", "Ajay-Atul", Date.valueOf("2030-1-3"), "3 idiots");
		s[3] = new Song("Song4", "Ajay-Atul", Date.valueOf("2031-1-3"), "3 idiots");
		s[4] = new Song("Song5", "Ajay-Atul", Date.valueOf("2036-1-3"), "3 idiots");
		s[5] = new Song("Song6", "Ajay-Atul", Date.valueOf("2034-1-3"), "3 idiots");
		s[6] = new Song("Song7", "Ajay-Atul", Date.valueOf("2033-1-3"), "3 idiots");
		s[7] = new Song("Song8", "Ajay-Atul", Date.valueOf("2032-1-3"), "3 idiots");
		s[8] = new Song("Song9", "Ajay-Atul", Date.valueOf("2035-1-3"), "3 idiots");
		s[9] = new Song("Song10", "Ajay-Atul", Date.valueOf("2024-1-3"), "3 idiots");
		s[10] = new Song("Song11", "Ajay-Atul", Date.valueOf("2029-1-3"), "3 idiots");
		s[11] = new Song("Song12", "Ajay-Atul", Date.valueOf("2028-1-3"), "3 idiots");
		s[12] = new Song("Song13", "Ajay-Atul", Date.valueOf("2014-1-3"), "3 idiots");
		s[13] = new Song("Song14", "Ajay-Atul", Date.valueOf("2027-1-3"), "3 idiots");
		s[14] = new Song("Song15", "Ajay-Atul", Date.valueOf("2026-1-3"), "3 idiots");
		s[15] = new Song("Song16", "Ajay-Atul", Date.valueOf("2025-1-3"), "3 idiots");
		s[16] = new Song("Song17", "Ajay-Atul", Date.valueOf("2015-1-3"), "3 idiots");
		s[17] = new Song("Song18", "Ajay-Atul", Date.valueOf("2023-1-3"), "3 idiots");
		s[18] = new Song("Song19", "Ajay-Atul", Date.valueOf("2020-1-3"), "3 idiots");
		s[19] = new Song("Song20", "Ajay-Atul", Date.valueOf("2012-1-3"), "3 idiots");
		s[20] = new Song("Song21", "Ajay-Atul", Date.valueOf("2013-1-3"), "3 idiots");
		s[21] = new Song("Song22", "Ajay-Atul", Date.valueOf("2022-1-3"), "3 idiots");
		s[22] = new Song("Song23", "Ajay-Atul", Date.valueOf("2018-1-3"), "3 idiots");
		s[23] = new Song("Song24", "Ajay-Atul", Date.valueOf("2019-1-3"), "3 idiots");
		s[24] = new Song("Song25", "Ajay-Atul", Date.valueOf("2021-1-3"), "3 idiots");
		s[25] = new Song("Song26", "Ajay-Atul", Date.valueOf("2017-1-3"), "3 idiots");
		s[26] = new Song("Song27", "Ajay-Atul", Date.valueOf("2016-1-3"), "3 idiots");

		Collections.sort((List<Library>) libraries);

		libraries.get(0).albums.get(0).song.add(s[0]);
		libraries.get(0).albums.get(0).song.add(s[1]);
		libraries.get(0).albums.get(0).song.add(s[2]);

		libraries.get(0).albums.get(1).song.add(s[3]);
		libraries.get(0).albums.get(1).song.add(s[4]);
		libraries.get(0).albums.get(1).song.add(s[5]);

		libraries.get(0).albums.get(2).song.add(s[6]);
		libraries.get(0).albums.get(2).song.add(s[7]);
		libraries.get(0).albums.get(2).song.add(s[8]);

		libraries.get(1).albums.get(0).song.add(s[9]);
		libraries.get(1).albums.get(0).song.add(s[10]);
		libraries.get(1).albums.get(0).song.add(s[11]);

		libraries.get(1).albums.get(1).song.add(s[12]);
		libraries.get(1).albums.get(1).song.add(s[13]);
		libraries.get(1).albums.get(1).song.add(s[14]);

		libraries.get(1).albums.get(2).song.add(s[15]);
		libraries.get(1).albums.get(2).song.add(s[16]);
		libraries.get(1).albums.get(2).song.add(s[17]);

		libraries.get(2).albums.get(0).song.add(s[18]);
		libraries.get(2).albums.get(0).song.add(s[19]);
		libraries.get(2).albums.get(0).song.add(s[20]);

		libraries.get(2).albums.get(1).song.add(s[21]);
		libraries.get(2).albums.get(1).song.add(s[22]);
		libraries.get(2).albums.get(1).song.add(s[23]);

		libraries.get(2).albums.get(2).song.add(s[24]);
		libraries.get(2).albums.get(2).song.add(s[25]);
		libraries.get(2).albums.get(2).song.add(s[26]);

		for (int i = 0; i < 3; i++) {
			Collections.sort((List<Song>) a[i].song);
			Collections.sort((List<Album>) lib[i].albums);

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
			for (Album alm : lib[choice - 1].albums) {
				System.out.println("0" + (i + 1) + ": " + alm.getAName());
				i++;

			}
		}
		int choice2 = sc.nextInt();

		if (choice2 == 0)
			displayAllAlbums(libraries);
		else
			displaySongs(libraries.get(choice - 1).albums.get(choice2 - 1).song);
		int choice3 = sc.nextInt();
		if (choice3 == 0)
			displayAllSongs(libraries);
		else

		{
			System.out.println(libraries.get(choice - 1).albums.get(choice2 - 1).song.get(choice3 - 1).displays());
		}
	}

}
