

public class MateNumAleatoreos {
    public static void main(String[] args) {
        int n=1;
        int rol1,rol2;
        int suma;
        while(n<101){
            rol1=(int)(Math.random()*6)+1;
            rol2=(int)(Math.random()*6)+1;

            suma= rol1+rol2;


            System.out.println(suma);
            n++;
        }
        System.out.println(" ");
        System.out.println(n);
    }
}
