package com.example.SistemaMonitoreo;


import com.example.SistemaMonitoreo.util.AES;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReporteController {


    @PostMapping("/reporte")
    public String receiveDatosReporte(@RequestBody String datosCifrados) {
        try {
            String jsonDatos = AES.descifrar(datosCifrados);
            DatosReporte datosReporte = new ObjectMapper().readValue(jsonDatos, DatosReporte.class);
            System.out.println("Datos recibidos: " + datosReporte);
            return "Datos recibidos correctamente";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al recibir los datos";
        }

    }

}
