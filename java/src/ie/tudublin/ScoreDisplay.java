package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	// array lisr for holding instances of the note class
	ArrayList<Note> notes = new ArrayList<Note>();
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	// loadscore populates the arraylist from the contents of the csv file
	public void loadScore(){

		Table s = loadTable("score2.csv", "header");
		for(TableRow row:s.rows()){
			
			Note note = new Note(row);
			notes.add(note);
		}//end loop
	
	}//end method

	// printscores iterates over the array list and prints the score
	public void printScores(){
		for(Note n:notes){
			println(n);
		}//end loop
	}//end method

	public void setup() 
	{
		loadScore();
		printScores();
		
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}
