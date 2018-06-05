package br.com.svitormiranda.presenter;

import br.com.svitormiranda.model.Cor;
import br.com.svitormiranda.model.Desenho;
import br.com.svitormiranda.model.Figura;
import br.com.svitormiranda.view.Browser;

import java.util.ArrayList;

/**
 * Created by Vítor Miranda on 05/06/18.
 */
public class Presenter {
    private ArrayList<Desenho> desenhos;
    private Browser browser;

//    public Presenter() {
//        this.desenhos = new ArrayList<Desenho>();
//        this.browser = new Browser();
//    }

    public Figura[] carregarFiguras() {
        return Figura.values();
    }

    public Cor[] carregarCor() {
        return Cor.values();
    }

    public void start() {
        browser.abrirBoasVindas();
    }

    public ArrayList<Desenho> carregarDesenhos() {
        return desenhos;
    }

}
