public class TestImpresora {
    static void main() {
        Impresora impresora = new Impresora();

        impresora.imprimir(10);
        impresora.imprimir(10.5);
        impresora.imprimir("patata");
        impresora.imprimir("patata",10);
    }
}
