package org.aplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.aplication.model.Corpo;
import org.aplication.service.ConverterJson;
import org.aplication.service.LerApi;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        LerApi ler = new LerApi();
        ConverterJson converter = new ConverterJson();

        String json = ler.obterApi("https://api.chucknorris.io/jokes/random");
        Corpo fato = converter.obterDados(json, Corpo.class);

        System.out.println(fato);


    }
}