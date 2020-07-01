package model;

/**
 * A model to represent the Game of Life board and actions that can be taken.
 */
public interface Model extends ViewOnlyModel {

  /**
   * Allows user to set cell at position x,y to alive.
   * @param x x-coord
   * @param y y-coord
   */
  public void resurrect(int x, int y);
}
