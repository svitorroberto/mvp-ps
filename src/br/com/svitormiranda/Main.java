package br.com.svitormiranda;

import br.com.svitormiranda.presenter.Presenter;
import br.com.svitormiranda.view.Browser;

/**
 * Created by Vítor Miranda on 05/06/18.
 */
public class Main {

    public static void main(String[] args) {
        Browser browser = new Browser(new Presenter());
        browser.abrirBoasVindas();
    }
}
