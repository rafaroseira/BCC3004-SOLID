public interface Forma {
    public float getArea();
}

/*
 * Esta interface descreve uma forma geométrica plana. Toda forma plana, seja ela um polígono ou uma
 * cirunferência, possui uma propridade em comum: A área.
 * Alguns polígonos populares: Quadrado, retângulo, triângulo, trapézio, etc...
 */

 /*Versão incorreta:
public interface Forma {
    public float getArea();
    public float getPerimetro();
    public float getCircunferencia();
}*/

/*
 * A versão incorreta do código fere o princípio da segregação de interfaces.
 * Precisa-se especializar Forma em outras duas interfaces, uma que descreve polígonos e outra, circunferências.
 */