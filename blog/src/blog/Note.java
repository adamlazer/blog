
package blog;
import java.util.*;
public class Note 
{
    private String title, content;
    private List<Comment> comments = new ArrayList();

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public void add(Comment comment)
    {
        comments.add(comment);
    }
   public String toString()
   {
       StringBuilder sb = new StringBuilder();
       sb.append("Wpis: ");
       sb.append("\n tytul: "+title);
       sb.append("\n tresc: "+content);
       sb.append("\n komentarze: "+comments);
       
   }
}
