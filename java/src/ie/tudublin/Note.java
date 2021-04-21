package ie.tudublin;

import processing.data.TableRow;

public class Note {

    private char note;
    private int duration;
    


    // getters and setters
    public char getNote() {
        return note;
    }
    public void setNote(char note) {
        this.note = note;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
  

    //contructor
    public Note(char note, int duration) {
        this.note = note;
        this.duration = duration;
        
    }//end contructor


    // cosntructor created for the note object - constructor chaining
    public Note(TableRow row) {
        // this(row.getCharacter("Note"), row.getInt("Duration"));
    }//end contructor

    // to string method
    @Override
    public String toString() {
        return "Note [duration=" + duration + ",  note=" + note + "]";
    }

    


    
    

    
}//end class
