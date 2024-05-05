package org.aplication.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterJson implements IConverterJson{

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) throws JsonProcessingException {
        return mapper.readValue(json, classe);
    }
}
