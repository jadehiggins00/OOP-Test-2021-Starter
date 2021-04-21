package ie.tudublin;

import processing.data.TableRow;

public class Note {

    private String note;
    private int duration;
    


    // getters and setters
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
  

    //contructor
    public Note(String note, int duration) {
        this.note = note;
        this.duration = duration;
        
    }//end contructor


    // cosntructor created for the note object - constructor chaining
    public Note(TableRow row) {
        this(row.getString("Note"), row.getInt("Duration"));
    }//end contructor

    // to string method
    @Override
    public String toString() {
        return "Note [duration=" + duration + ",  note=" + note + "]";
    }

    


    
    

    
}//end class
