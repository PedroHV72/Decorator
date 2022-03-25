package Decorator;

public abstract class RoupaDecorator implements Roupa {

    private Roupa roupa;
    public String tipoRoupa;

    public RoupaDecorator(Roupa roupa) {
        this.roupa = roupa;
    }

    public Roupa getRoupa() {
        return roupa;
    }

    public void setRoupa(Roupa roupa) {
        this.roupa = roupa;
    }

    public abstract float getValorTipoRoupa();

    public float getValorRoupa() {
        return this.roupa.getValorRoupa() + this.getValorTipoRoupa();
    }

    public abstract String getTipoNomeRoupa();

    public String getNomeRoupa() {
        return this.getTipoNomeRoupa();
    }

    public void setNomeRoupa(String tipoRoupa) {
        this.tipoRoupa = tipoRoupa;
    }
}
