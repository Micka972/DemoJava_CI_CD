package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceResponseDTO<T> {

    public String code;
    public String message;
    public T data;


    public static<T> ServiceResponseDTO<T> performResponse(ServiceResponseDTO<T> response) {
        // Récupérer le logger
        Logger logger = LoggerFactory.getLogger(BankService.class);

        // Logger la réponse
        logger.info(String.format("Code : %s - Message : %s", response.code, response.message));
        return response;
    }

    public static<T> ServiceResponseDTO<T> buildResponseWithData(String code, String message, T data) {
        ServiceResponseDTO<T> response = new ServiceResponseDTO<T>();
        response.code = code;
        response.message = message;
        response.data = data;

        return performResponse(response);
    }

    public static<T> ServiceResponseDTO<T> buildResponse(String code, String message) {
        return buildResponseWithData(code, message, null);
    }
}
