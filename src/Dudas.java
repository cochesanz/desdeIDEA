

public class Dudas {
    public static void main(String[] args) {
        /*int n = 0;
        System.out.println(++n);// Solo se aplica el decremento o el incremento a esa línea de código!!!
        System.out.println(n++);
        System.out.println(n++);*/


        /*char ch='1';
        System.out.print('\r'+ch);


    int c='z';
        System.out.println(c);

        char a='9'+'9';
        System.out.println(a);

        char r='\u0031'+'\u0035';
        System.out.println(r);*/

        String saludo= "Hola mi nombre es José";
        String vacio= saludo.replaceAll("nombre" , "edad");
        String cambio= saludo.replaceAll("José" , "18");// COMO CAMBIAR 2 EN  SOLA VARIABLE???
        System.out.println(vacio);
        System.out.println(cambio);

    }


}
