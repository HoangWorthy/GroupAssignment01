public class Library {
    private final String[] books = new String[1000];
    private int size;

    public Library() {
        this.size = 0;
    }

    public String[] getBooks() {
        return books;
    }

    public void addBook(String title){
        books[size] = title;
        size++;
    }

    public void displayAllBooks(){
        for(String title : books){
            if(title==null) return;
            System.out.println(title);
        }
    }
}