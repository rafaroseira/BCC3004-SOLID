public class TrianguloEquilatero implements Poligono{

    private float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public TrianguloEquilatero(float lado) {
        this.lado = lado;
    }

    public float getArea(){
        return (float)(lado*lado*Math.sqrt(3))/4;
    }

    public float getPerimetro(){
        return lado*3;
    }

    /*Versão Incorreta:
    public void printArea(){
        System.out.println("A área do triângulo equilátero é: " + getArea() + " unidades de área");

        viola o princípio de responsabilidade única
    }*/

    /*Versão Incorreta:
    public void printPerimetro(){
        System.out.println("O perímetro do triângulo equilátero é: " + getPerimetro() + " unidades de comprimento");

        viola o princípio de responsabilidade única
    }*/

    /*
     * Aqui há o princípio aberto/fechado
     * Um polígono é implementado por uma classe separada. Neste caso, a classe é TrianguloEquilatero.
     * A interface Poligono permanece fechada para modificação enquanto TrianguloEquilatero a estende
     */
}
