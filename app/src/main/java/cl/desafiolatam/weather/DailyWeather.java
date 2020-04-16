package cl.desafiolatam.weather;

public class DailyWeather {

    private String ciudad;
    private String fecha;
    private int imagenClima;
    private  int temperatura;
    private String unidadMedida;

    public String getCiudad() {
        return ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public int getImagenClima() {
        return imagenClima;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public DailyWeather(String ciudad, String fecha, int imagenClima, int temperatura, String unidadMedida) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.imagenClima = imagenClima;
        this.temperatura = temperatura;
        this.unidadMedida = unidadMedida;
    }
}

