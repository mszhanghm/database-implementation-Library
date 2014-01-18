package com.bioyinyang.library;

import com.bioyinyang.database.*;

public class CatalogNumber implements Key
 { private String letter_code;
   private double num_code;
  
   public CatalogNumber(String letter, double num)
   {  letter_code = letter;
      num_code = num;
   }
  
   public String getLetterCode()
   {   return letter_code; }
   
   public double getNumberCode()
   {   return num_code; }
  
   public boolean equals(Key c)
   { String letter =  ((CatalogNumber) c).getLetterCode() ;
     double num =  ((CatalogNumber) c).getNumberCode();
     return (letter == letter_code && num == num_code);
   }
    
   public boolean biggerthan(Key c)
   {  boolean answer;
       String letter = ((CatalogNumber) c).getLetterCode();
       double  num = ((CatalogNumber) c).getNumberCode();
       if (letter_code.compareTo(letter) > 0)
          answer = true;
       else if (letter_code.compareTo(letter) < 0)
          answer = false;
       else
          { if (num_code >= num)
              answer = true;
            else
              answer = false;
           }
        return answer;
    }
}
       
