public class OutputCircunferencia implements OutputCircunferenciaProvider {

    private CircunferenciaProvider circunferencia;

    public OutputCircunferencia(CircunferenciaProvider circunferencia) { //inversão de dependências
        this.circunferencia = circunferencia; 
    }

    @Override
    public void printArea(){
        System.out.println("A área da circunferência é " + circunferencia.getArea() + " unidades de área");
    }

    @Override
    public void printCircunferencia(){
        System.out.println("O comprimento da circunferência é " + circunferencia.getCircunferencia() + " unidades de comprimento");
    }
}

/*
 * Aqui percebe-se dois princípios: Inversão de depedências e responsabilidade única
 * Esta classe é responsável apenas por exibir os resultados de cálculos de circunferência via terminal.
 * Já para realizar os cálculos, utiliza-se a classe Circunferencia
 * Esta classe possui como variável de instância uma interface CircunferenciaProvider.
 */