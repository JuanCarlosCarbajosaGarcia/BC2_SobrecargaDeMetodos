public class Impresora {
    //muestra entero
    public void imprimir(int numero){
        System.out.println("numero: "+numero);
    }
    //muestra decimal
    public void imprimir(double numero){
        System.out.println("decimal: "+numero);
    }
    //muestra texto
    public void imprimir(String texto){
        System.out.println("texto: "+texto);
    }
    //muestra texto x veces
    public void imprimir(String texto, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("texto: "+texto);
        }
    }
}
