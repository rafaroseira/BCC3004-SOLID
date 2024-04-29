public class Quadrado implements Poligono{

    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float getArea() {
        return lado * lado;
    }

    @Override
    public float getPerimetro() {
        return lado * 4;
    }

    /*Versão Incorreta:
    public void printArea(){
        System.out.println("A área do quadrado é: " + getArea() + " unidades de área");

        viola o princípio de responsabilidade única
    }*/

    /*Versão Incorreta:
    public void printPerimetro(){
        System.out.println("O perímetro do quadrado é: " + getPerimetro() + " unidades de comprimento");

        viola o princípio de responsabilidade única
    }*/

    /*
     * Aqui há o princípio aberto/fechado
     * Um polígono é implementado por uma classe separada. Neste caso, a classe é Quadrado.
     * A interface Poligono permanece fechada para modificação enquanto Quadrado a estende
     */

}
