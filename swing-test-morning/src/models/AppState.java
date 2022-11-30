package models;

import java.util.Objects;

public class AppState {
    private int result;
    private String resultDisplay;
    private Boolean isOperationAdded = false;

    public AppState() {
        this.result = 0;
        this.resultDisplay = "";
    }

    public int getResult() {
        var total = 0;
        var numbers = this.resultDisplay.split(" ");

        String operation = null;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                total = Integer.parseInt(numbers[i]);
                continue;
            }

            if (numbers[i].equals("+") || numbers[i].equals("-")) {
                operation = numbers[i];
                continue;
            }

            if (Objects.equals(operation, "+")) {
                total = total + Integer.parseInt(numbers[i]);
            }

            if (Objects.equals(operation, "-")) {
                total = total - Integer.parseInt(numbers[i]);
            }
        }

        this.result = total;
        return this.result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getResultDisplay() {
        return resultDisplay;
    }

    public void setResultDisplay(String resultDisplay) {
        this.resultDisplay = resultDisplay;
    }

    public Boolean getIsOperationAdded() {
        return this.isOperationAdded;
    }

    public void setOperationAdded(Boolean operationAdded) {
        isOperationAdded = operationAdded;
    }
}
