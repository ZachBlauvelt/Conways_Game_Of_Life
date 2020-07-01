package controller;

/**
 * A Listener class that allows the Controller to be alerted when changes are made to a GUI view.
 */
public interface Features {

  /**
   * Turn the cell at the given coord on if it is off or vice versa.
   * @param x x-coord
   * @param y y-coord
   */
  public void toggleCell(int x, int y);

  /**
   * Toggles the pause feature on/off
   */
  public void togglePause();

  /**
   * Tells the Features to advances the game (only if user input is being used)
   */
  public void advance();
}
