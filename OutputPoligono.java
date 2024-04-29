public class OutputPoligono implements OutputPoligonoProvider {

    private Poligono poligono; 

    public OutputPoligono(Poligono poligono) { //princípio da inversão de dependências
        this.poligono = poligono;
    }

    @Override
    public void printArea(){
        System.out.println("A área do " + poligono.getClass().getName() + " é " + poligono.getArea() + " unidades de área");
    }

    @Override
    public void printPerimetro(){
        System.out.println("O perímetro do " + poligono.getClass().getName() + " é " + poligono.getPerimetro() + " unidades de comprimento");
    }

}

/*
 * Aqui percebe-se dois princípios: Inversão de depedências e responsabilidade única
 * Esta classe é responsável apenas por exibir os resultados de cálculos de polígonos via terminal.
 * Já para realizar os cálculos, utiliza-se outra classe (Quadrado, Retângulo, etc)
 * Esta classe possui como variável de instância uma interface Poligono.
 * Dessa forma, o código pode ser utilizado para imprimir dados de qualquer tipo de polígono
 */