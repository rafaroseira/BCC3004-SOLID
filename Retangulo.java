public class Retangulo implements Poligono {

    protected float altura;
    protected float largura;

    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public float getaltura() {
        return altura;
    }
    public void setaltura(float altura) {
        this.altura = altura;
    }
    public float getlargura() {
        return largura;
    }
    public void setlargura(float largura) {
        this.largura = largura;
    }

    @Override
    public float getArea(){
        return altura * largura;
    }

    @Override
    public float getPerimetro(){
        return (altura*2) + (largura*2);
    }

    /*
     * Aqui há o princípio aberto/fechado
     * Um polígono é implementado por uma classe separada. Neste caso, a classe é Retangulo.
     * A interface Poligono permanece fechada para modificação enquanto Retangulo a estende
     */

}
