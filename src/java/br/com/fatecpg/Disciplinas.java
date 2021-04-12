/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg;

import java.util.ArrayList;

/**
 *
 * @author Fernanda
 */
public class Disciplinas {

    private String nome;
    private double notaP1;
    private double notaP2;

    public Disciplinas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaP1() {
        if (notaP1 < 0) {
            this.notaP1 = 0;
        } else if (notaP1 > 10) {
            this.notaP1 = 10;
        } else {
            this.notaP1 = notaP1;
        }

        return notaP1;
    }

    public void setNotaP1(double notaP1) {
        this.notaP1 = notaP1;
    }

    public double getNotaP2() {
        if (notaP2 < 0) {
            this.notaP2 = 0;
        } else if (notaP2 > 10) {
            this.notaP2 = 10;
        } else {
            this.notaP2 = notaP2;
        }
        return notaP2;
    }

    public void setNotaP2(double notaP2) {
        this.notaP2 = notaP2;
    }

    public static ArrayList getList() {
        ArrayList<Disciplinas> disciplinas = new ArrayList<>();

        disciplinas.add(new Disciplinas("Gestão de equipes"));
        disciplinas.add(new Disciplinas("Empreendedorismo"));
        disciplinas.add(new Disciplinas("Estágio supervisionado"));
        disciplinas.add(new Disciplinas("Ética e responsabilidade profissional"));
        disciplinas.add(new Disciplinas("Tópicos especiais em informática"));
        disciplinas.add(new Disciplinas("Gestão e Governança de TI"));
        disciplinas.add(new Disciplinas("Inglês VI"));
        disciplinas.add(new Disciplinas("Programação Linear e aplicações"));
        disciplinas.add(new Disciplinas("Trabalho de Graduação II"));
        disciplinas.add(new Disciplinas("Inteligência artificial"));
        disciplinas.add(new Disciplinas("Programação orientada a objetos"));
        disciplinas.add(new Disciplinas("Laboratório de engenharia de software"));

        return disciplinas;

    }
;

}
