
package exercicio2_polimorfismo;


public class Triangulo extends Forma_geometrica {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
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
        double area = (this.altura * this.base)/2;
        System.out.println("Area do triangulo" + area);
    }
    
}
