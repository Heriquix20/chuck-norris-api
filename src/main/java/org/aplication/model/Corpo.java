package org.aplication.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Corpo(String icon_url, String value) {
    @Override
    public String toString() {
        return "\nUm fato aleatório sobre Chuck Norris:  \n" + value;
    }
}
