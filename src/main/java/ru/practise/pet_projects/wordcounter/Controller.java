package ru.practise.pet_projects.wordcounter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    private TextArea inputText;

    @FXML
    private Label symbolWithSpaceCounter;

    @FXML
    private Label symbolWithoutSpaceCounter;

    @FXML
    private Label wordsCounter;

    @FXML
    void CounterWordForInputText(KeyEvent even) {
        String text = inputText.getText();
        symbolWithSpaceCounter(text);
        symbolWithoutSpaceCounter(text);
        wordsCounter(text);

    }

    private void symbolWithSpaceCounter(String text) {
        symbolWithSpaceCounter.setText(String.valueOf(text.length()));
    }

    private void symbolWithoutSpaceCounter(String text) {
        String filteredText = text.replaceAll(" ", "");
        String filteredText1 = filteredText.replaceAll("\n", "");
        String filteredText2 = filteredText1.replaceAll("\t", "");
        symbolWithoutSpaceCounter.setText(String.valueOf(filteredText2.length()));
    }

    private void wordsCounter(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || text.charAt(i) == '\n' || text.charAt(i) == '\t'){
                count++;
            }
        }
        wordsCounter.setText(String.valueOf(count));
    }

}
