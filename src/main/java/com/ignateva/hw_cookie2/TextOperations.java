package com.ignateva.hw_cookie2;

import java.util.ArrayList;
import java.util.List;

public class TextOperations {

public List<String> findQuestions (String text)
{
    List<String> questions = new ArrayList<>();

    if  (!text.contains("?"))
        questions.add("no questions");

    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) != '?') continue;
        for (int j = i - 1; j >= 0; j--) {
            char current = text.charAt(j);
            if (j == 0 || current == '.' || current == '?' || current == '!' || current == ':') {
                int space = j == 0 ? 0 : 2;
                questions.add(text.substring(j + space, i+1));
                break;
            }
        }

    }
    return questions;
}


}
