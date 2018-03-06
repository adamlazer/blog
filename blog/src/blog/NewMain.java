
package blog;
import java.util.*;
public class NewMain {
     public static void main(String[] args) {
        Blog blog = new Blog("Blog programistyczny");
        Note note1 = new Note("co nowego - java 9","co nowego - java 9");
        Note note2 = new Note("Kolekcje","kolekcje");
        Note note3 = new Note("JavaFX", "JavaFX");
        blog.add(note3);
        blog.add(note2);
        blog.add(note1);
        Comment c1 = new Comment("Rafal","Kolekcje sa trudne");
        note2.add(c1);
        Comment c2 = new Comment("Krzysztof","Kolekcje sa latwe");
        note2.add(c2);
        
    }
    
}
