public class Circunferencia implements CircunferenciaProvider{

    private float raio;

    public Circunferencia(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getArea(){
        return (float) Math.PI * raio * raio;
    }

    public float getCircunferencia(){
        return (float) (2*Math.PI*raio);
    }

    /*Versão Incorreta:
    public void printArea(){
        System.out.println("A área da circunferência é: " + getArea() + " unidades de área");

        viola o princípio de responsabilidade única
    }*/

    /*Versão Incorreta:
    public void printCircunferencia(){
        System.out.println("O comprimento da circunferência é: " + getCircunferencia() + " unidades de comprimento");

        viola o princípio de responsabilidade única
    }*/

}
