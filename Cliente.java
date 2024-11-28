package com.example.SistemaMonitoreo;

import com.example.SistemaMonitoreo.util.AES;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class Cliente {

    public static void main(String[] args) {
        try {
            DatosReporte datos = new DatosReporte();
            datos.setTemperatura(25);
            datos.setPrecipitacion(10.5);
            datos.setViento(12.3);
            datos.setHumedad(60);
            datos.setPresionAtmosferica(1013.25);
            datos.setNubosidad(50);
            datos.setLatitud("32.715736");
            datos.setCirculacionAtmosferica("Alta");

            String jsonDatos = new ObjectMapper().writeValueAsString(datos);
            String datosCifrados = AES.cifrar(jsonDatos);

            System.out.println("JSON cifrado: " + datosCifrados);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> request = new HttpEntity<>(datosCifrados, headers);

            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.postForObject("http://localhost:8080/reporte", request, String.class);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


