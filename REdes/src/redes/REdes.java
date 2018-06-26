
package redes;

import java.util.Scanner;

/**
 *
 * @author STALIN CARRION, ANDREA MENA, DANILO LEON
 */
public class REdes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se Declara los string y para poder
        String primero = "";
        String segundo = "";
        String tercero = "";
        //Se llama al metodo para poder realizar las operaciones de suma
        Suma();

    }

    //Clase suma
    public static void Suma() {
        //Se crean los int que despues seran convertidos en binarios,
        //Aqui puede cambiar los numero como usted desee
        int primero = Integer.parseInt("0110011001100000", 2);
        int segundo = Integer.parseInt("0101010101010101", 2);
        int tercero = Integer.parseInt("1000111100001100", 2);
        //Se realiza la primera suma
        int suma1 = primero + segundo;
        //Se realiza la segunda suma
        int suma2 = suma1 + tercero;
        //Utilizamos un corte para poder saber cuando es uno 
        String auxCorte = Integer.toString(suma2, 2);
        //mostrarmos los datos de todos los bits
        System.out.println("Primer bits:" + Integer.toString(primero, 2));
        System.out.println("Primer bits:" + Integer.toString(segundo, 2));
        System.out.println("Primer bits:" + Integer.toString(tercero, 2));
        System.out.println("Suma " + Integer.toString(suma2, 2));
        //para saber si es mayor o menor a 16
        if (auxCorte.length() == 16) {
            String aux = Integer.toString(suma2, 2);
            String aux2 = "";
            //Se recorre los bits ingresados para despues transforma de 0  a1
            for (int i = 0; i < aux.length(); i++) {

                if (aux.charAt(i) == '0') {
                    aux2 = aux2 + "1";
                } else {
                    aux2 = aux2 + "0";
                }

            }
            //Se presenta en el caso que sea 16
            System.out.println("resultado final < 16 " + aux2);
            int resultadoFF = suma2 + Integer.parseInt(aux, 2);
            //el resultado de la tarea 2
            System.out.println("REUSLTADO Tarea 2 " + Integer.toString(resultadoFF, 2));
        } else {
            String corte = auxCorte.substring(1);

            int complemente = Integer.parseInt("0000000000000001", 2);
            int resultadoAux = Integer.parseInt(corte, 2) + complemente;
            String resultado = Integer.toString(resultadoAux, 2);
            if (resultado.length() == 15) {

                resultado = "0" + resultado;
                String aux = "";
                //Se presenta en el caso que sea 16
                for (int i = 0; i < 16; i++) {
                    if (resultado.charAt(i) == '0') {
                        aux = aux + "1";
                    } else {
                        aux = aux + "0";
                    }
                }
                //Se presentan todo los resultados
                System.out.println("resultado final >16 " + aux);
                int resultadoFF = resultadoAux + Integer.parseInt(aux, 2);
                System.out.println("REUSLTADO Tarea 2 " + Integer.toString(resultadoFF, 2));
            } else {
                System.out.println("resultado final >16 " + resultado);
                //se calcula los resultados anteriores y se tranforman en binario para poder hacer el calculo
                int resultadoFF = resultadoAux + Integer.parseInt(resultado, 2);
                //se presenta el resultado de la tarea 2
                System.out.println("REUSLTADO Tarea 2 " + Integer.toString(resultadoFF, 2));
            }
        }

    }

}
