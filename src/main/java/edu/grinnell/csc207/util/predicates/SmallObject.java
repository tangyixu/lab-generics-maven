package edu.grinnell.csc207.util.predicates;

import edu.grinnell.csc207.util.Predicate;

public class SmallObject implements Predicate<Object> {
  // +-----------+---------------------------------------------------
  // | Constants |
  // +-----------+

  /**
   * One copy of this predicate, following the singleton pattern.
   */
  public static final SmallObject PRED = new SmallObject();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new predicate. Made private to prevent clients from
   * creating new objects (part of the singleton pattern).
   */
  private SmallObject() {
  } // SmallObject()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Determine if val is a small object.
   *
   * @param val
   *   The string we evaluate.
   *
   * @return
   *   true if val is small and false otherwise.
   */
  public boolean holds(Object val) {

   return val.toString().length()<5;
   
  } // holds(String)
} // class SmallObject

