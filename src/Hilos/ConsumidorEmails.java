package Hilos;


public class ConsumidorEmails extends Hilo {

    public ConsumidorEmails(BufferEmails buffer, String nombre) {
        super(buffer, nombre);
    }

    @Override
    public void run() {
        int contador = 1;
        boolean dsp = true;
        while (dsp) {
            System.out.println(buffer.consumirMensaje(nombre));
            contador++;
            if (contador == 16){
                dsp = false;
            }
        }
    }
}
