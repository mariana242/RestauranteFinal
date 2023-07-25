package com.example.restaurantefinal.dto;

public class MenuErrorDTO extends MenuDTO {

    private String mensajeError;

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
}
