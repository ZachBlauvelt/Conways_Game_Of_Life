package view;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import controller.Features;
import model.ViewOnlyModel;

/**
 * A GUI representation of the View using Swing.
 */
public class GraphicalView extends JFrame implements View {
  private ViewOnlyModel model;
  private BlockPanel panel;
  private Features f;

  public GraphicalView(ViewOnlyModel model) {
    super();
    this.setTitle("Game of Life");
    this.setSize(800, 800);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.model = model;
    this.panel = new BlockPanel(model);
    panel.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        panel.handleMouseClick(e.getPoint().x, e.getPoint().y);
      }

      @Override
      public void mousePressed(MouseEvent e) {

      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {

      }

      @Override
      public void mouseExited(MouseEvent e) {

      }
    });
    this.setLayout(new BorderLayout());
    this.add(panel, BorderLayout.CENTER);

    this.addKeyListener(new KeyListener() {
      @Override
      public void keyTyped(KeyEvent e) {

      }

      @Override
      public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
          f.togglePause();
        }
        if (key == KeyEvent.VK_RIGHT) {
          f.advance();
        }
      }

      @Override
      public void keyReleased(KeyEvent e) {

      }
    });
  }

  @Override
  public void update() {
    this.repaint();
  }

  public void draw() {
    this.setVisible(true);
  }

  public void addFeatures(Features f) {
    this.f = f;
    this.panel.addFeatures(f);
  }
}