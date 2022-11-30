package gui;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {
    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 500;
    public CalculatorFrame(String title) throws HeadlessException {
        super(title);
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }
}
