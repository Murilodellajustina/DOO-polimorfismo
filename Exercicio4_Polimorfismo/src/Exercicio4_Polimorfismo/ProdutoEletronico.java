/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4_Polimorfismo;

class ProdutoEletronico extends Produto {
    public ProdutoEletronico(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPreco() {
        return precoBase * 0.90;
    }
}
