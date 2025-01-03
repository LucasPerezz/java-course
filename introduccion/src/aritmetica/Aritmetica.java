package introduccion.src.aritmetica;

public class Aritmetica {
    private int operando1;
    private int operando2;

    // Constructor
    public Aritmetica(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public Aritmetica() {
    }

    public void sumar() {
        System.out.println(operando1 + operando2);
    }

    public void restar() {
        System.out.println(operando1 - operando2);
    }

    public void multiplicar() {
        System.out.println(operando1 * operando2);
    }

    public int getOperando1() {
        return this.operando1;
    }

    public int getOperando2() {
        return this.operando2;
    }

    public void setOperando1(int op) {
        this.operando1 = op;
    }

    public void setOperando2(int op) {
        this.operando2 = op;
    }

    public void dividir() {
        if (operando2 == 0) {
            System.out.println("No se puede realizar la division");
        } else {
            System.out.println(operando1 / operando2);
        }
    }

}
