import java.io.*;
import java.net.*;

public class Cliente {
    int puerto = 6996;
    Socket sCliente;
    DataInputStream bajada;
    DataOutputStream subida;

    public static void main(String args[]) {
        String IP;
        if (args.length > 0) {
            IP = args[0];
        } else {
            IP = "localhost";
        }
        new Cliente(IP);
    }

    public Cliente(String IP) {
        try {
            sCliente = new Socket(IP, puerto);
            System.out.println("Conectado al servidor...");

            InputStream is = sCliente.getInputStream();
            bajada = new DataInputStream(is);

            OutputStream os = sCliente.getOutputStream();
            subida = new DataOutputStream(os);

            // COMIENZAN LOS MENSAJES
            sube("Hola");
            baja();
            sube("Como estas?");
            baja();
            sube("Adios");
            baja();

            System.out.println("Cerrando conexion...");
            cierra();

        } catch (Exception e) {
            System.out.println("Excepcion en Cliente(): " + e);
        }
    }

    public void sube(String texto) {
        texto = "[Cliente] " + texto;
        try {
            subida.writeUTF(texto);
            System.out.println(texto);
        } catch (IOException e) {
            System.out.println("Excepcion en sube(): " + e);
        }
    }

    public void baja() {
        try {
            System.out.println(bajada.readUTF());
        } catch (IOException e) {
            System.out.println("Excepcion en baja(): " + e);
        }
    }

    public void cierra() {
        try {
            subida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bajada.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
