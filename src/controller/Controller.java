package controller;

/**
 * Controls interaction between the View and Model.  Could potentially use the system clock to
 * tell the model when to update.
 */
public interface Controller {

  /**
   * Sets the program in action (initialize and draw view, initialize model, etc).
   */
  public void go();
}
