package blog;
import java.util.*;
public class Note {
    private String title, content;
    private List<Comment> comments = new ArrayList();
    public Note(String title, String content)
    {
    this.title=title;
    this.content=content;
    }
    public void add(Comment comment){
        comments.add(comment);
    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Wpis\n");
        sb.append("tytul: "+title);
        sb.append("tresc: "+content);
        sb.append("komentarze: "+comments);
        sb.append("/n");
        return sb.toString();
    }
    
    
}

