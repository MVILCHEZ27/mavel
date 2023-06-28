package com.openpay.apis.marvel.mavel.service.serviceimpl;

import org.junit.Assert;
import org.junit.Test;

public class ApisMarvelServiceImplTest {

    ApisMarvelServiceImpl apisMarvelService = new ApisMarvelServiceImpl();

    @Test
    public void getAllCharactersUrlTest() {
        String urlAllCharacters = "http://gateway.marvel.com/v1/public/characters";
        Assert.assertEquals("http://gateway.marvel.com/v1/public/characters?ts=1687730967&apikey=525038b6cf787bb6faf908b6c4fdd3bf&hash=69e11971d7d289422c22708fabbb8d7c", apisMarvelService.getAllCharactersApi(urlAllCharacters));
    }

    @Test
    public void getCharacterByIdUrlTest() {
        String id = "1011334";
        String urlAllCharacter = "http://gateway.marvel.com/v1/public/characters/";
        Assert.assertEquals("http://gateway.marvel.com/v1/public/characters/1011334?ts=1687730967&apikey=525038b6cf787bb6faf908b6c4fdd3bf&hash=69e11971d7d289422c22708fabbb8d7c", apisMarvelService.getCharacterByIdApi(urlAllCharacter, id));
    }
}