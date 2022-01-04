package day02;

public class Tour {

    private double GPSLat;
    private double GPSLng;
    private double height;

    public Tour(double GPSLat, double GPSLng, double height) {
        this.GPSLat = GPSLat;
        this.GPSLng = GPSLng;
        this.height = height;
    }

    public void setGPSLat(double GPSLat) {
        this.GPSLat = GPSLat;
    }

    public void setGPSLng(double GPSLng) {
        this.GPSLng = GPSLng;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getGPSLat() {
        return GPSLat;
    }

    public double getGPSLng() {
        return GPSLng;
    }

    public double getHeight() {
        return height;
    }
}
