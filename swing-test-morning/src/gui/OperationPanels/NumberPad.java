package gui.OperationPanels;

import gui.InputContainer;
import models.AppState;

import javax.swing.*;
import java.awt.*;

public class NumberPad extends JPanel {
    final private AppState appState;
    final private InputContainer inputContainer;
    public NumberPad(AppState appState, InputContainer inputContainer) {
        super();

        this.appState = appState;
        this.inputContainer = inputContainer;

        var numberPadLayout = new GridLayout(4,3);
        numberPadLayout.setHgap(4);
        numberPadLayout.setVgap(4);
        this.setLayout(numberPadLayout);

        var buttonFont = new Font("ADL", Font.BOLD, 18);

        for (int i = 0; i < 9; i++) {
            final int value = i;
            JButton button = new JButton();
            button.setFont(buttonFont);
            button.setText(String.valueOf(i + 1));
            button.addActionListener(e -> handleDigitButtonClick(value + 1));
            this.add(button);
        }

        var zeroBtn = new JButton("0");
        zeroBtn.setFont(buttonFont);
        this.add(zeroBtn);

        var decimalButton = new JButton(".");
        decimalButton.setFont(buttonFont);
        this.add(decimalButton);
    }

    public void handleDigitButtonClick(int value) {
        String currentDisplayText = appState.getResultDisplay();
        String updatedDisplayText = currentDisplayText.concat(String.valueOf(value));
        appState.setResultDisplay(updatedDisplayText);
        inputContainer.setTextFieldValue(appState.getResultDisplay());
    }
}
