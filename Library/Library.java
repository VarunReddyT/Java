public class Library {
    String name; int capacity;Book []  books;
    public Library(String name, int capacity, Book[] books) {
        super();
        this.name = name;
        this.capacity = capacity;
        this.books = books;
    }
    public void issueBook(Book b,Customer c)
    {
        //check if any array element is null , null indicates
        // it can accomodate one more book 
        Book [] books = c.b;
        for (int i = 0; i < books.length; i++) {
            if(books[i] == null)
            {
                if(!b.isIssued) {
                    b.isIssued = true;
                    System.out.println("Issued "+b.name);}
                else
                    System.out.println(b.name+" is already issued");}
            return;
            }
        System.out.println(c.name+ "Cant issue a book");
        }
        
        
    public void returnBook(Book b)
    {
        b.isIssued = false;
        System.out.println(b.name+ " returned successfully");
    }

    
    }