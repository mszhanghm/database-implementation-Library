package com.bioyinyang.library;

import com.bioyinyang.database.*;

public class Book implements Record
{ private Key  catalog_number;
  private String title;
  private String author;
  private int    publication_date;

  public Book(Key num, String t, String a, int d)
  {  catalog_number = num ;
     title = t;
     author = a;
     publication_date = d;
   }
  
  public Key  getKey()
   { return catalog_number;}

  public String getTitle()
   { return title;}

  public String getAuthor()
   { return author;}
  
  public int getDate()
   { return publication_date;}

}
   
 

