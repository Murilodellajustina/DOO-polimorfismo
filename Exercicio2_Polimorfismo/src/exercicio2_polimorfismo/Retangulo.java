
package exercicio2_polimorfismo;


public class Retangulo extends Forma_geometrica {
    
    private int base;
    private int altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public void calcularArea(){
        int area = this.altura*this.base;
        System.out.println("A area do retangulo e: "+area);
    }
}
