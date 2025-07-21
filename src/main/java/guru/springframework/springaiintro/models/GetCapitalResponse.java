package guru.springframework.springaiintro.models;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalResponse(@JsonPropertyDescription("This is the city name") GetCapitalResponse answer) {
}
