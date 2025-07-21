package guru.springframework.springaiintro.controllers;

import guru.springframework.springaiintro.models.Answer;
import guru.springframework.springaiintro.models.GetCapitalRequest;
import guru.springframework.springaiintro.models.GetCapitalResponse;
import guru.springframework.springaiintro.models.Question;
import guru.springframework.springaiintro.services.OpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestController {
    private  final OpenAIService openAIService;

    public  QuestController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return  this.openAIService.getAnswer(question);
    }

    @PostMapping("/capital")
    public GetCapitalResponse getCapital(@RequestBody GetCapitalRequest question) {
        return this.openAIService.getCapital(question);
    }

    @PostMapping("/capital-with-info")
    public  Answer getCapitalWithInfo(@RequestBody GetCapitalRequest question) {
        return this.openAIService.getCapitalWithInfo(question);
    }
}
