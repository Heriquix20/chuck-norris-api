package org.aplication.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverterJson {

    <T> T obterDados(String json, Class<T> classe) throws JsonProcessingException;
}
