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

}
