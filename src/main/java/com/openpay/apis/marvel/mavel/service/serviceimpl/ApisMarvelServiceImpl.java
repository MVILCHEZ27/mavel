package com.openpay.apis.marvel.mavel.service.serviceimpl;

import com.openpay.apis.marvel.mavel.service.ApisMarvelService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApisMarvelServiceImpl implements ApisMarvelService {

    private static final String PUBLIC_KEY = "525038b6cf787bb6faf908b6c4fdd3bf";
    private static final String PRIVATE_KEY = "69e11971d7d289422c22708fabbb8d7c";
    private static final String TIME_STAMP = "1687730967";

    public Object getAllCharacters(String urlAllCharacters) {

        String URL = getAllCharactersApi(urlAllCharacters);
        RestTemplate restTemplate = new RestTemplate();
        Object characters = restTemplate.getForObject(URL, Object.class);
        return characters;
    }

    public Object getCharacterById(String url, String id) {
        String URL = getCharacterByIdApi(url, id);
        RestTemplate restTemplate = new RestTemplate();
        Object character = restTemplate.getForObject(URL, Object.class);

        return character;
    }

    public String getAllCharactersApi(String urlAllCharacters){

        String allCharactersApi = urlAllCharacters+"?ts="+TIME_STAMP+"&apikey="+PUBLIC_KEY+"&hash="+PRIVATE_KEY;

        return allCharactersApi;
    }

    public String getCharacterByIdApi(String url, String id){

        String urlCharacter = url+id+"?ts="+TIME_STAMP+"&apikey="+PUBLIC_KEY+"&hash="+PRIVATE_KEY;

        return urlCharacter;

    }
}
