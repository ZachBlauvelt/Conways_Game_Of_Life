package view;

import java.awt.*;

import javax.swing.*;

import controller.Features;
import model.ViewOnlyModel;

/**
 * The JPanel in which the user can click to add cells to the board.
 */
public class BlockPanel extends JPanel {
  private ViewOnlyModel model;
  private int size = 15;
  private Features features;

  public BlockPanel(ViewOnlyModel model) {
    super();
    this.model = model;
    this.setPreferredSize(new Dimension(800,800));
    this.setBackground(Color.WHITE);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(Color.black);

    for (int x = 0; x < model.dimensions()[0]; x++) {
      for (int y = 0; y < model.dimensions()[1]; y++) {
        if (model.isAlive(x, y)) {
          g2d.fillRect(x * size, y * size, size,size);
        } else {
          g2d.drawRect(x * size, y * size, size, size);
        }
      }
    }
  }

  public void handleMouseClick(int x, int y) {
    features.toggleCell(x/size, y/size);
  }

  public void addFeatures(Features f) {
    this.features = f;
  }
}
