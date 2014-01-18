package  com.bioyinyang.library;

import   com.bioyinyang.database.*;

public class TestDatabase 
 {
  public static void main(String[] args)
   {
     Database db = new Database();
     Key num  = new CatalogNumber("Z",123);
     Record rec = new Book(num, "Gone with wind","a lady",1950);
     db.insert(rec);
     db.insert(new Book(new CatalogNumber("QR", 342.11), "Here i am","anonymous", 2014));
    
    System.out.println("database constructed!");
    Node answer= db.find(new CatalogNumber("Z",123));
    System.out.println("The author is: " + ((Book) answer.value()).getAuthor() );
    System.out.println("The title is: " + ((Book) answer.value()).getTitle() );
   }
 }

