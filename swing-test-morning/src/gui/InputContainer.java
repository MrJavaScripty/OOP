package gui;

import javax.swing.*;
import java.awt.*;

public class InputContainer extends JPanel {
    final private JTextField inputField;
    final private JLabel totalLabel;
    public InputContainer() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        inputField= new JTextField();
        inputField.setEditable(false);
        inputField.setSize(new Dimension(CalculatorFrame.FRAME_WIDTH, CalculatorFrame.FRAME_WIDTH /4));
        this.setMinimumSize(new Dimension(CalculatorFrame.FRAME_WIDTH, CalculatorFrame.FRAME_HEIGHT / 2));
        this.setMaximumSize(new Dimension(CalculatorFrame.FRAME_WIDTH, 200));
        this.add(inputField);

        totalLabel = new JLabel("Total: 0");
        this.add(totalLabel);
    }

    public void setTextFieldValue(String displayValue){
        this.inputField.setText(displayValue);
    }

    public void setTotalLabelValue(int total){
        this.totalLabel.setText("Total: " + total);
    }
}