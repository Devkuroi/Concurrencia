public class Contador {
    private int valor = 0;

    // Método sincronizado: solo un hilo puede entrar a la vez
    public synchronized void incrementar() {
        int temp = valor;     // leer
        temp++;               // incrementar
        valor = temp;         // escribir

        System.out.println(Thread.currentThread().getName() + " incrementó a: " + valor);
    }

    public int getValor() {
        return valor;
    }
}
