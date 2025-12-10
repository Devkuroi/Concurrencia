public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();

        // Crear 3 hilos
        Thread hilo1 = new Thread(new Incremento(contador), "Hilo-1");
        Thread hilo2 = new Thread(new Incremento(contador), "Hilo-2");
        Thread hilo3 = new Thread(new Incremento(contador), "Hilo-3");

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nValor final del contador: " + contador.getValor());
    }
}