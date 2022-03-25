package Decorator;

public class Camisa implements Roupa {

    public float valorCamisa;

    public Camisa() {
    }

    public Camisa(float valorCamisa) {
        this.valorCamisa = valorCamisa;
    }

    public float getValorRoupa() {
        return valorCamisa;
    }

    public String getNomeRoupa() {
        return "Camisa sem personalização";
    }

}
