package com.example.SistemaMonitoreo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReporteController {

    @PostMapping("/reporte")
    public String receiveDatosReporte(@RequestBody DatosReporte DatosReporte) {
        System.out.println("Datos recibidos: " + DatosReporte);
        return "Datos recibidos correctamente";
    }

}
