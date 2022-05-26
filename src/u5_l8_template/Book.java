/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u5_l8_template;

/**
 *
 *
 */
public class Book
  
{
  //Fields
  private String title;
  private String author;
  private int year;
  private static int num = 0;
  private int bookID;

  
  //Constructor
  
  public Book (){
      num++;
      bookID = num;
  }
  
  public Book(String t, String a, int y)
  {
    title = t;
    author = a;
    year = y;
    num++;
    bookID = num;

  }
  public static int getNextID(){
    num++;
    return(num);
  }
  
    /**
     * 
     * @return String that is the title of the book
     */
    public String getTitle(){
      return title;
  }
    
    /**
     *
     * @param t String for the new Title of the book
     */
    public void setTitle(String t){
        title =t;
    }
  
}
