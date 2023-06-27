package com.openpay.apis.marvel.mavel.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ApisMarvel {

    @Value("${api.characters}")
    private String urlCharacters;

    @Value("${api.characters.id}")
    private String urlCharacterById;

    public String getUrlCharacters() {
        return urlCharacters;
    }

    public void setUrlCharacters(String urlCharacters) {
        this.urlCharacters = urlCharacters;
    }

    public String getUrlCharacterById() {
        return urlCharacterById;
    }

    public void setUrlCharacterById(String urlCharacterById) {
        this.urlCharacterById = urlCharacterById;
    }
}