import java.util.*;
class InvalidPhoneNumberException extends Exception{
    public InvalidPhoneNumberException(String msg){
        super(msg);
    }
}


class Contact{
    String name;
    String phone;

    Contact(String name,String phone){
        this.name=name;
        this.phone=phone;
    }

    public String toString(){
        return name+" - "+phone;
    }
}


class ContactManager{
    List<Contact> list=new ArrayList<>();

    void addContact(String name,String phone)throws InvalidPhoneNumberException{
        if(!phone.matches("\\d{10}")){
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits");
        }

        for(Contact c:list){
            if(c.phone.equals(phone)){
                System.out.println("Duplicate contact not allowed");
                return;
            }
        }

        list.add(new Contact(name,phone));
        System.out.println("Contact added successfully");
    }

    void deleteContact(String phone){
        Iterator<Contact> it=list.iterator();
        while(it.hasNext()){
            if(it.next().phone.equals(phone)){
                it.remove();
                System.out.println("Contact deleted");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    void searchContact(String phone){
        for(Contact c:list){
            if(c.phone.equals(phone)){
                System.out.println("Found: "+c);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    void showAll(){
        if(list.isEmpty()){
            System.out.println("No contacts available");
            return;
        }
        for(Contact c:list){
            System.out.println(c);
        }
    }
}


public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ContactManager cm=new ContactManager();

        try{
            cm.addContact("Rahul","9876543210");
            cm.addContact("Aman","1234567890");
            cm.addContact("Riya","987654321");  
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        cm.showAll();
        cm.searchContact("9876543210");
        cm.deleteContact("1234567890");
        cm.showAll();
    }
}
