package ie.tudublin;

import processing.data.TableRow;

public class Note {

    private String note;
    private int duration;
    private String name;


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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //contructor
    public Note(String note, int duration, String name) {
        this.note = note;
        this.duration = duration;
        this.name = name;
    }//end contructor


    // cosntructor created for the note object - constructor chaining
    public Note(TableRow row) {
        this(row.getString("Note"), row.getInt("Duration"), row.getString("Name"));
    }//end contructor

    // to string method
    @Override
    public String toString() {
        return "Note [duration=" + duration + ", name=" + name + ", note=" + note + "]";
    }

    


    
    

    
}//end class
