
package blog;
import java.util.*;
public class Blog 
{
private final List<Note> notes = new ArrayList();
private String title;

    public Blog(String title) {
        this.title = title;
    }

public void add(Note note){
notes.add(note);    
}

   
    
}
