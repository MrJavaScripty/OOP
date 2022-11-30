import gui.CalculatorFrame;
import gui.InputContainer;
import gui.OperationsContainer;
import models.AppState;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        AppState state = new AppState();

        JFrame app = new CalculatorFrame("Calculator");

        var mainContainer = new JPanel();
        var mainContainerLayout = new BoxLayout(mainContainer, BoxLayout.Y_AXIS);

        mainContainer.setPreferredSize(new Dimension(CalculatorFrame.FRAME_WIDTH, CalculatorFrame.FRAME_HEIGHT));
        mainContainer.setLayout(mainContainerLayout);

        var inputContainer = new InputContainer();
        var operationsContainer = new OperationsContainer(state, inputContainer);

        mainContainer.add(inputContainer);
        mainContainer.add(operationsContainer);

        app.add(mainContainer);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if(!app.isVisible()) app.setVisible(true);
    }
}
