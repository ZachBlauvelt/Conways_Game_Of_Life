package model;

/**
 * A Read-Only model that is meant to be used by the View in order to avoid unwanted access.
 */
public interface ViewOnlyModel {

  /**
   * Updates the game board based on the rules.
   */
  public void update();

  /**
   * Returns if the cell at the given x and y is alive
   * @param x x position of cell to check
   * @param y y position of cell to check
   * @return
   */
  public boolean isAlive(int x, int y);

  /**
   * Returns dimension array where arr[0] is width and arr[1] is height
   * @return
   */
  public int[] dimensions();
}
