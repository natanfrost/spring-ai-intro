package guru.springframework.springaiintro.services;

import guru.springframework.springaiintro.models.Answer;
import guru.springframework.springaiintro.models.GetCapitalRequest;
import guru.springframework.springaiintro.models.GetCapitalResponse;
import guru.springframework.springaiintro.models.Question;

public interface OpenAIService {
    String getAnswer(String question);
    Answer getAnswer(Question question);

    GetCapitalResponse getCapital(GetCapitalRequest question);
    Answer getCapitalWithInfo(GetCapitalRequest question);
}
