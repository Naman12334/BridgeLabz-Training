abstract class LibraryItem{
    private int id;
    private String title;

    LibraryItem(int id,String t){
        this.id=id;
        this.title=t;
    }

    abstract int getLoanDuration();

    void getItemDetails(){
        System.out.println(id+" "+title);
    }
}

interface Reservable{
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable{
    Book(int id,String t){
        super(id,t);
    }

    int getLoanDuration(){
        return 14;
    }

    public void reserveItem(){
        System.out.println("Book Reserved");
    }

    public boolean checkAvailability(){
        return true;
    }
}
