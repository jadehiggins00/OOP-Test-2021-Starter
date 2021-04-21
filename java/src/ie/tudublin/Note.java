package ie.tudublin;

import processing.data.TableRow;

public class Note {

    private char note;


    private int duration;
    private String type;
    


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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
  

    //contructor
    public Note(char note, int duration, String type) {
        this.note = note;
        this.duration = duration;
        this.type = type;
        
    }//end contructor


    // cosntructor created for the note object - constructor chaining

    public Note(String ss) {
    }

    // to string method
    @Override
    public String toString() {
        return "Note [duration=" + duration + ",  note=" + note + ", type="+type+" ]";
    }

    


    
    

    
}//end class
