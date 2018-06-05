package br.com.svitormiranda.model;

/**
 * Created by Vítor Miranda on 05/06/18.
 */
public class Desenho {
    private Cor cor;
    private Figura figura;
    private int x;
    private int y;

    public Desenho() {
    }

    public Desenho(Cor cor, Figura figura, int x, int y) {
        this.cor = cor;
        this.figura = figura;
        this.x = x;
        this.y = y;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Desenho{" +
                "cor=" + cor +
                ", figura=" + figura +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
