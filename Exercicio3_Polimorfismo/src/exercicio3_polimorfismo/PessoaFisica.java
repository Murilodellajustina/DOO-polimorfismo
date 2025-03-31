/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3_polimorfismo;

class PessoaFisica extends Contato {
    private String nome;
    private String cpf;
    private String dataAniversario;

    public PessoaFisica(String nome, String cpf, String endereco, String dataAniversario) {
        super(endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.dataAniversario = dataAniversario;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pessoa Física: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", Aniversário: " + dataAniversario);
    }

    public String getCpf() {
        return cpf;
    }
}