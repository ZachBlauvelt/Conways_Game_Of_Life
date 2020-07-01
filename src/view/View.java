package view;

import controller.Features;

/**
 * The visual component of the game.  Could range from a GUI to ASCII.
 */
public interface View {

  /**
   * Tells the view to recreate itself as the model's state has changed.
   */
  public void update();

  /**
   * Tells the view to set itself to be visible.
   */
  public void draw();

  /**
   * Adds a Features object to serve as a Listener to the View.
   * @param f the Features Listener
   */
  public void addFeatures(Features f);
}
