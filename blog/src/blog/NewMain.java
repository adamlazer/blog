
package blog;
import java.util.*;
public class NewMain {

  
    public static void main(String[] args) {
      Blog blog = new Blog("blog");
      Note note1 = new Note("Co nowego w Java 9","co nowego w Java9);
      Note note2 = new Note("Co nowego w Java 9","co nowego w Java9);        
      Note note3 = new Note("Co nowego w Java 9","co nowego w Java9);        
         blog.add(note1);   
         blog.add(note2); 
         blog.add(note3); 
         Comment c1 = new Comment ("jan","kolekcje sa bardzo trudne");
         note2.add(c1);
    }
    
}
