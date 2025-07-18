package guru.springframework.springaiintro.controllers;

import guru.springframework.springaiintro.models.Answer;
import guru.springframework.springaiintro.models.Question;
import guru.springframework.springaiintro.services.OpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestController {
    private  final OpenAIService openAIService;

    public  QuestController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping
    public Answer askQuestion(Question question) {
        return  this.openAIService.getAnswer(question);
    }
}
