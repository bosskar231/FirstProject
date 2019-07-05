package com.auxo;

import com.auxo.model.Questions;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import me.xdrop.fuzzywuzzy.model.ExtractedResult;
import java.util.List;

public class Search {

    public float searchQuestion(List<Questions> questions,String newQuestion)
    {
        float result=0;
        int max=0;
        for(int i=0;i<questions.size();i++) {
            if (questions.get(i).getQuestion() != null) {
                ExtractedResult extractedResult = FuzzySearch.extractOne(newQuestion, questions.get(i).getQuestion());
                if (extractedResult.getScore() > max) {
                    result = questions.get(i).getQsno();
                    max = extractedResult.getScore();
                }
            }
        }

        return  result;
    }
}
