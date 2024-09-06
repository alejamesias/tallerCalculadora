package calculadora;
public class Calculadora {
    // Constructor por defecto
    public Calculadora() {
        // No hace nada específico
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

