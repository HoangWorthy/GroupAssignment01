import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {
    private final String[] books = new String[1000];

    public void addBook(String title){
        books[books.length-1] = title;
    }

    public void getAllBooks(){
        for(String title : books){
            System.out.println(title);
        }
    }
}
