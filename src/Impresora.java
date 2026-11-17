public class Impresora {
    //muestra entero
    public static void imprimir(int numero){
        System.out.println("numero: "+numero);
    }
    //muestra decimal
    public static void imprimir(double numero){
        System.out.println("decimal: "+numero);
    }
    //muestra texto
    public static void imprimir(String texto){
        System.out.println("texto: "+texto);
    }
    //muestra texto x veces
    public static void imprimir(String texto, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("texto: "+texto);
        }
    }
}
