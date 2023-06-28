package com.openpay.apis.marvel.mavel.service;

import org.springframework.stereotype.Service;

@Service
public interface ApisMarvelService {

    Object getAllCharacters(String urlAllCharacters);

    Object getCharacterById(String url, String id);

}
