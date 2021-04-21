package ie.tudublin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class ScoreDisplay extends PApplet {
	// String score = "DEFGABcd";
	String score = "D2E2F2G2A2B2c2d2";
	// String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	// array lisr for holding instances of the note class
	ArrayList<Note> notes = new ArrayList<Note>();

	public void settings() {
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48)
		println(i);
	}

	// loadscore populates the arraylist from the contents of the csv file
	public void loadScore() {

		// Table s = loadTable("score2.csv", "header");
		// for(TableRow row:s.rows()){

		// Note note = new Note(row);
		// notes.add(note);
		// }//end loop

		// boolean b1 = Character.isDigit('2');
		// String str1 = score+b1;
		// if()

		// List<String> myList = new ArrayList<String>(Arrays.asList(score.split("")));
		String[] str = score.split("");

		for (String ss : str) {
			Note n = new Note(ss);
			println(n);
		} // end loop

	}// end method

	// printscores iterates over the array list and prints the score
	public void printScores() {
		int one = 1;
		char two = '2';
		boolean check1 = Character.isDigit(one);

		for (int i = 0; i < score.length(); i++) {
			char ch1 = score.charAt(i);
			if (ch1 <='2') {
				System.out.println("crotchet");
				
			}

			else{
				System.out.println("quaver");
			}

		}
		for (int i = 0; i < score.length(); i++) {
			two = score.charAt(i);
			System.out.println(two);
		}
		for (Note n : notes) {
			// notes.add("2");
			println(n);

			System.out.println(score);
		} // end loop

	}// end method

	public void setup() {
		loadScore();
		printScores();
		print();

	}

	public void draw() {
		background(255);
		stroke(0);

		float leftBorder;
		float border = width * 0.001f;

		// drawing the stave
		for (int i = 1; i <= 5; i++) {
			float x = map(i, 1, 5, border * 2, width - border);
			line(border, x, width - border, x);
		} // end for

	}

	void drawNotes() {
	}
}