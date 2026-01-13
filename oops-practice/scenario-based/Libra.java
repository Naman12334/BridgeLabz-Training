import java.util.*;

//Custom Exception
class BookNotAvailableException extends Exception{
    BookNotAvailableException(String msg){
        super(msg);
    }
}

class Book{
    String t,a;
    boolean av;

    Book(String t,String a,boolean av){
        this.t=t;
        this.a=a;
        this.av=av;
    }

    public String toString(){
        return t+" | "+a+" | "+(av?"Available":"Checked Out");
    }
}

class Library2{
    List<Book> list=new ArrayList<>();

 

    void search(String k){
        for(Book b:list){
            if(b.t.toLowerCase().contains(k.toLowerCase()))
                System.out.println(b);
        }
    }

    void checkout(String t)throws BookNotAvailableException{
        for(Book b:list){
            if(b.t.equalsIgnoreCase(t)){
                if(!b.av)
                    throw new BookNotAvailableException("Book not available");
                b.av=false;
                System.out.println("Book checked out");
                return;
            }
        }
        System.out.println("Book not found");
    }

    void show(){
        for(Book b:list)
            System.out.println(b);
    }
}



