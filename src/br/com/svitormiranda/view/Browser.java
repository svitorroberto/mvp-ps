package br.com.svitormiranda.view;

import br.com.svitormiranda.presenter.Presenter;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Vítor Miranda on 05/06/18.
 */
public class Browser {
    Presenter presenter;

    public Browser() {
    }

    public Browser(Presenter presenter) {
        this.presenter = presenter;
    }

    public void comecar() {
        presenter.start();
    }

    public void abrirBoasVindas() {
        JOptionPane.showMessageDialog(null, "Bem vindo ao paynt!");
        System.out.println(presenter.carregarCor());

        switch (lerOpcaoDoMenu()) {
            case 1:

        }
    }

    public void exibirListaDeDesenhos() {
        JOptionPane.showMessageDialog(null, imprimirLista(presenter.carregarDesenhos()));
    }

    private String imprimirLista(ArrayList<?> lista) {
        return lista.toString();
    }


    private static Integer lerOpcaoDoMenu() {
        String menu = "[-------- Menu ---------]";
        menu += "\n[1] - Desenhar";
        menu += "\n[2] - Consultar Lista";
        menu += "\n[9] - Sair";
        menu += "\n[ ------------------------- ]";
        menu += "\nInforme sua opcao: ";

        String strOpcao = JOptionPane.showInputDialog(null, menu);

        return Integer.parseInt(strOpcao);
    }

    private static Integer lerOpcaoDoDesenho() {
        String menu = "[-------- Menu ---------]";
        menu += "\n[1] - Desenhar";
        menu += "\n[2] - Consultar Lista";
        menu += "\n[9] - Sair";
        menu += "\n[ ------------------------- ]";
        menu += "\nInforme sua opcao: ";

        String strOpcao = JOptionPane.showInputDialog(null, menu);

        return Integer.parseInt(strOpcao);
    }

}
