/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u5_l8_template;

/**
 *
 * @author Administrator
 */
import java.io.*;


class U5_L8_template{
  public static void main (String str[]) throws IOException {
    Book b = new Book ("BFG", "Roald Dahl", 1990);
    Book c = new Book ();
    System.out.println(c);
    System.out.println(Book.getNextID());
  }
}
