public class Main {

    public static void main(String[] args) {
        
        Poligono quadrado = new Quadrado(5);
        Poligono retangulo = new Retangulo(3, 7);
        Poligono trianguloEquilatero = new TrianguloEquilatero(8);
        CircunferenciaProvider circunferencia = new Circunferencia(12);

        OutputPoligono output = new OutputPoligono(quadrado);
        //System.out.println("Quadrado:");
        output.printArea();

        output = new OutputPoligono(retangulo);
        //System.out.println("Retangulo");
        output.printPerimetro();

        output = new OutputPoligono(trianguloEquilatero);
        //System.out.println("Triangulo:");
        output.printArea();

        OutputCircunferencia output2 = new OutputCircunferencia(circunferencia);
        //System.out.println("Circunferencia:");
        output2.printCircunferencia();
    }
}
