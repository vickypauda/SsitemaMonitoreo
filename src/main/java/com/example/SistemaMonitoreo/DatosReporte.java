package com.example.SistemaMonitoreo;

public class DatosReporte {

    private int temperatura;
    private double precipitacion;
    private double viento;
    private int humedad;
    private double presionAtmosferica;
    private int nubosidad;
    private String latitud;
    private String circulacionAtmosferica;


    public DatosReporte() {
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public double getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(double precipitacion) {
        this.precipitacion = precipitacion;
    }

    public double getViento() {
        return viento;
    }

    public void setViento(double viento) {
        this.viento = viento;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public double getPresionAtmosferica() {
        return presionAtmosferica;
    }

    public void setPresionAtmosferica(double presionAtmosferica) {
        this.presionAtmosferica = presionAtmosferica;
    }

    public int getNubosidad() {
        return nubosidad;
    }

    public void setNubosidad(int nubosidad) {
        this.nubosidad = nubosidad;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getCirculacionAtmosferica() {
        return circulacionAtmosferica;
    }

    public void setCirculacionAtmosferica(String circulacionAtmosferica) {
        this.circulacionAtmosferica = circulacionAtmosferica;
    }

    @Override
    public String toString() {
        return "DatosReporte{" +
                "temperatura=" + temperatura +
                ", precipitacion=" + precipitacion +
                ", viento=" + viento +
                ", humedad=" + humedad +
                ", presionAtmosferica=" + presionAtmosferica +
                ", nubosidad=" + nubosidad +
                ", latitud='" + latitud + '\'' +
                ", circulacionAtmosferica='" + circulacionAtmosferica + '\'' +
                '}';
    }
}
