package calculadora;
public class Calculadora {
    /* constructor
    int a;
    int b;
    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;

    }
*/
    public Calculadora() {

    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No es valido dividir por cero");
        }
        return a / b;
    }
}

