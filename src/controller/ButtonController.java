package controller;

import model.Model;
import view.View;

/**
 * An implementation of a Controller that relies on user input to determine when to advance the
 * state of the game.
 */
public class ButtonController implements Features, Controller {
  private Model m;
  private View v;
  private boolean paused;

  public ButtonController(Model m, View v) {
    this.m = m;
    this.v = v;
    v.addFeatures(this);
    paused = false;
  }

  @Override
  public void go() {
    v.draw();
  }

  @Override
  public void toggleCell(int x, int y) {
    m.resurrect(x,y);
    v.update();
  }

  @Override
  public void togglePause() {
    paused = !paused;
  }

  @Override
  public void advance() {
    if (!paused) {
      m.update();
      v.update();
    }
  }
}
