public class Library {
    private String[] books;
    private int size;

    public Library() {
        this.size = 0;
        books = new String[1];
    }

    public String[] getBooks() {
        return books;
    }

    public void generateNewArray(){
        String[] newArray = new String[books.length*2];
        for(int i = 0;i < size;i++){
            newArray[i] = books[i];
        }
        books = newArray;
    }

    public void addBook(String title){
        if(size == books.length) generateNewArray();
        books[size] = title;
        size++;
    }

    public void displayAllBooks(){
        for(int i =0;i < size;i++){
            System.out.println(books[i]);
        }
    }

    public boolean searchBook(String book){
        for(int i = 0;i < size;i++){
            if(book.equalsIgnoreCase(books[i])) return true;
        }
        return false;
    }

    public void removeBook(String title){
        for(int i = 0;i < size;i++){
            if(books[i].equalsIgnoreCase(title)){
                for(int j = i;j < size;j++){
                    books[j] = books[j+1];
                }
                size--;
                return;
            }
        }
    }
}


