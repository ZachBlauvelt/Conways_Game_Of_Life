import java.awt.*;

import controller.ButtonController;
import controller.Controller;
import model.ArrayModel;
import model.Model;
import view.GraphicalView;
import view.View;

public class Main {
    public static void main(String[] args) {
      Model model = new ArrayModel(100, 100);
      View view = new GraphicalView(model);
      Controller cont = new ButtonController(model, view);
      cont.go();
  }
}
