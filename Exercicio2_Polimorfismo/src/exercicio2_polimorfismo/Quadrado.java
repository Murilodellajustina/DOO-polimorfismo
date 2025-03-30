
package exercicio2_polimorfismo;


public class Quadrado extends Forma_geometrica {
    
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    @Override
    public void calcularArea(){
        int area;
        area = this.lado* this.lado;
        System.out.println("A area do quadrado : "+ area);
    }
    
}
