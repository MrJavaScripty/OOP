package gui;

import gui.OperationPanels.NumberPad;
import gui.OperationPanels.OperationPad;
import models.AppState;

import javax.swing.*;
import java.awt.*;

public class OperationsContainer extends JPanel {
    public OperationsContainer(AppState appState, InputContainer inputContainer) {
        super(new GridLayout(1,2));

        this.add(new NumberPad(appState, inputContainer));
        this.add(new OperationPad(appState, inputContainer));
    }
}
