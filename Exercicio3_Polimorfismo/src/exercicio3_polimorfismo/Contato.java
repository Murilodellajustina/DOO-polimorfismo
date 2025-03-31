/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3_polimorfismo;

abstract class Contato {
    protected String endereco;

    public Contato(String endereco) {
        this.endereco = endereco;
    }

    public abstract void exibirDetalhes();
}

