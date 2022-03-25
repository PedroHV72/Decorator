package Decorator;

public class CamisaPersonalizada extends RoupaDecorator {

    public CamisaPersonalizada(Roupa roupa) {
        super(roupa);
    }

    public float getValorTipoRoupa() {
        return 30.0f;
    }

    public String getTipoNomeRoupa() {
        return "Camisa com personalização";
    }
}
