package com.practica;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import org.w3c.dom.Text;

import lombok.Cleanup;
import lombok.NonNull;
import lombok.val;
import lombok.var;

/**
 * busquedaBinaria
 */
public class busquedaBinaria {

    public static void main(String[] args) {
        val lista = new int[] { 5, 10, 13, 16, 22, 25 };
        val buscado = 1;
        val resultado = buscar(lista, buscado);
        String texto = null;
        val path = "resultado.txt";
        if (resultado != -1) {
            texto = "El valor " + buscado + " se ha encontrado en el indice: " + resultado + ". El " + new Date();         
        }
        try {
            Guardar(path, texto);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    public static int buscar(int[] list, int valorBuscado) {
        val defecto = -1;
        var pos = 0;
        var size = list.length - 1;

        while (pos <= size) {
            var posActual = pos + ((list.length - 1) - pos) / 2;

            if (valorBuscado == list[posActual]) {
                return posActual;
            }
            if (valorBuscado < list[posActual]) {
                size = pos - 1;
            }
            if (valorBuscado > list[posActual]) {
                size = pos + 1;
            }
        }
        return defecto;
    }

    public static void Guardar(String file, @NonNull String text) throws FileNotFoundException {
        val buffer = (text + "\n").getBytes();
        try {
            @Cleanup
            OutputStream outputStream = new FileOutputStream(file, true);
            outputStream.write(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
