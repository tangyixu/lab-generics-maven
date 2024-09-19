package edu.grinnell.csc207.util;

import java.util.Arrays;

public class Box <W>{
 // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  W val;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  public Box(W newval) {
    this.val = newval;
  } // Box

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+
  public void set(W Val) {
    this.val = Val;
  }
  
  public W get() {
   return this.val;
 }
}
