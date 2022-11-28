package assignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PlayerSorter {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		File file = new File("D:\\Works_Space\\Timeline\\2022\\Friends\\aayush\\src\\assignment6\\players.txt");
		Scanner rows = new Scanner(file);
		ArrayList<Player> players = new ArrayList<>();
		while (rows.hasNextLine()) {
			String row = rows.nextLine();
			String[] words = row.split("[\s\t]");
			Player p = new Player(words[0], words[1], Double.parseDouble(words[2]));
			players.add(p);
		}
		rows.close();
		sc.close();

		NameLengthComparator nameLengthComparator = new NameLengthComparator();
		ScoreComparator scoreComparator = new ScoreComparator();
		PriorityQueue<Player> playerNameLenPQ = new PriorityQueue<>(nameLengthComparator);
		PriorityQueue<Player> playerScorePQ = new PriorityQueue<>(scoreComparator);
		for (Player p : players) {
			playerNameLenPQ.add(p);
			playerScorePQ.add(p);
		}
		System.out.println("--------- Name comparator -----------");
		removeAndPrintQueue(playerNameLenPQ);
		System.out.println("--------- Score Comparator ----------");
		removeAndPrintQueue(playerScorePQ);
	}

	public static void removeAndPrintQueue(PriorityQueue<Player> pq) {
		while (!pq.isEmpty()) {
			Player p = pq.remove();
			System.out.println(p.fName + " " + p.lName + "\t" + p.score);
		}
	}

}

class Player {
	String fName;
	String lName;
	Double score;

	public Player(String fName, String lName, Double score) {
		this.fName = fName;
		this.lName = lName;
		this.score = score;
	}
}

class NameLengthComparator implements java.util.Comparator<Player> {
	@Override
	public int compare(Player o1, Player o2) {
		if ((o1.fName + o1.lName).length() == (o2.fName + o2.lName).length()) {
			return 0;
		} else if ((o1.fName + o1.lName).length() > (o2.fName + o2.lName).length()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class ScoreComparator implements java.util.Comparator<Player> {
	@Override
	public int compare(Player o1, Player o2) {
		if (o1.score == o2.score)
			return 0;
		if (o1.score > o2.score)
			return 1;
		return -1;
	}
}