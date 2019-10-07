
package primitivewriteutf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class PrimitiveWriteUTF {


    public static void main(String[] args) throws FileNotFoundException, IOException {
      
        //escritura en archivo OutPut
        //crea un archivo OutPut en el que escribir
       FileOutputStream esc = null;
       //permite escribir byte a byte en un archivo Output
       BufferedOutputStream escBuf = null;
       //permite escibir en caracteres primitivos de Java en un archivo Ouput
       DataOutputStream escData = null;
       
       //lectura en un archivo OutPut
       //Permite obtiene los bytes de java de un archivo 
        FileInputStream leer = null;
        //Crea un array interno de buffer
        BufferedInputStream leerBuffer = null;
        //Permite obtener los caracteres primitivos de java de un archivo 
        DataInputStream leerData = null;
String lecturas = "";
       

 esc = new FileOutputStream("/home/oracle/Desktop/Eje4/texto3.txt");
        escBuf = new BufferedOutputStream(esc);
escData = new DataOutputStream(escBuf);
    
    leer = new FileInputStream("/home/oracle/Desktop/Eje4/texto3.txt");
    leerBuffer = new BufferedInputStream(leer);
    leerData = new DataInputStream(leerBuffer);
    
    escData.writeUTF("o tempo es xelido");
    System.out.println("Número de bytes " + escData.size());
    
     escData.writeUTF("o tempo está xélido");
        System.out.println("Bytes escritos: " + escData.size());

        System.out.println("Bytes totales escritos: " + escData.size());
escData.close();

        while (leerData.available() != 0) {

            lecturas = leerData.readUTF();
            System.out.println("Leemos cadena:" + lecturas);
            System.out.println("Quedan por leer:" + leerData.available());

        }

leerData.close();
    }
    
}
