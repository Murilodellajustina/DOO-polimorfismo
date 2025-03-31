/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3_polimorfismo;

class PessoaJuridica extends Contato {
    private String razaoSocial;
    private String cnpj;
    private double faturamento;

    public PessoaJuridica(String razaoSocial, String cnpj, String endereco, double faturamento) {
        super(endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pessoa Jurídica: " + razaoSocial + ", CNPJ: " + cnpj + ", Endereço: " + endereco + ", Faturamento: R$ " + faturamento);
    }

    public String getCnpj() {
        return cnpj;
    }
}

