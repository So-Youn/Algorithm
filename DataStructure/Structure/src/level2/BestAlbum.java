package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class BestAlbum {
	static ArrayList<Integer> bestAlbum = new ArrayList<>();
	static ArrayList<Song> songList = new ArrayList<>();;
	static HashMap<String, Integer> genreMap = new HashMap<>();;
	static HashMap<String, Integer> albumMap = new HashMap<>();;

	public static void main(String[] args) {
		String[] genres = new String[] { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = new int[] { 500, 600, 150, 800, 2500 };
		int[] result = solution(genres, plays);
		System.out.println(Arrays.toString(result));

	}

	public static int[] solution(String[] genres, int[] plays) {
		for (int i = 0; i < genres.length; i++) {
			int id = i;
			int play = plays[i];
			String genre = genres[i];
			songList.add(new Song(id, play, genre));
			if (genreMap.containsKey(genre)) {
				genreMap.put(genre, genreMap.get(genre) + play);
			} else {
				genreMap.put(genre, play);
			}

		}
		Collections.sort(songList, new Comparator<Song>() {

			@Override
			public int compare(Song o1, Song o2) {
				if (o1.genre.equals(o2.genre)) {
					return o1.compareTo(o2);
				} else {
					return -(genreMap.get(o1.genre) - genreMap.get(o2.genre));
				}
			}
		});
		sort();
		int[] answer = new int[bestAlbum.size()];
		for(int i=0; i<answer.length;i++) {
			answer[i] = bestAlbum.get(i);
		}
		return answer;
	}

	public static void sort() {
		for (Song song : songList) {
			if(!albumMap.containsKey(song.genre)) {
				albumMap.put(song.genre, 1);
				bestAlbum.add(song.id);
			}else {
				int genreCnt = albumMap.get(song.genre);
				if(genreCnt >= 2) continue;
				else {
					albumMap.put(song.genre, genreCnt+1);
					bestAlbum.add(song.id);
				}
			}
		}

	}

	static class Song implements Comparable<Song> {
		int id, play;
		String genre;

		Song(int id, int play, String genre) {
			this.id = id;
			this.play = play;
			this.genre = genre;
		}

		@Override
		public int compareTo(Song o) {
			if (this.play == o.play) {
				return this.id - o.id;
			} else {
				return -(this.play - o.play);
			}
		}
	}
}
