
package exercicio2_polimorfismo;


public class Circulo extends Forma_geometrica {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    @Override
    public void calcularArea(){
        double area = Math.PI * this.raio * this.raio;
        System.out.println("Área do Círculo: " + area);
    }
    
}
