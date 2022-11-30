package gui.OperationPanels;

import gui.InputContainer;
import models.AppState;

import javax.swing.*;
import java.awt.*;

public class OperationPad extends JPanel {
    private final AppState appState;
    final private InputContainer inputContainer;
    public OperationPad(AppState appState, InputContainer inputContainer) {
        super();
        this.appState = appState;
        this.inputContainer = inputContainer;

        this.setLayout(new GridLayout(6,1));

        var addBtn = new JButton("+");
        addBtn.addActionListener(e -> addOperationToDisplayText("+"));
        var subtractBtn = new JButton("-");
        subtractBtn.addActionListener(e -> addOperationToDisplayText("-"));
        var clearBtn = new JButton("CLS");
        clearBtn.addActionListener(e -> clearResult());

        this.add(addBtn);
        this.add(subtractBtn);
        this.add(clearBtn);
    }

    public void addOperationToDisplayText(String operationType){
        var currentDisplayText = appState.getResultDisplay();

        if(!(currentDisplayText.endsWith("+ ") || currentDisplayText.endsWith("- ")))
        {
            if (!appState.getIsOperationAdded()) appState.setOperationAdded(true);

            var updatedDisplayText = currentDisplayText.concat(" " + operationType + " ");
            appState.setResultDisplay(updatedDisplayText);
            inputContainer.setTextFieldValue(appState.getResultDisplay());
            if (appState.getIsOperationAdded()){
                var total = appState.getResult();

                appState.setResult(total);
                inputContainer.setTotalLabelValue(appState.getResult());
            }
        }
    }

    public void clearResult(){
        appState.setResult(0);
        appState.setResultDisplay("");
        inputContainer.setTextFieldValue(appState.getResultDisplay());
        inputContainer.setTotalLabelValue(appState.getResult());
    }
}
