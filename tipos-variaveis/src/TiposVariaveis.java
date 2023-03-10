public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;

         //variavel float o valor atribuido tem que terminar com letra F
         

         //variavel do tipo long precisa terminar com a letra L
         long cpf = 98765432109L;
        // System.out.println(salarioMinimo +" - " + PI);

         short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // fazer casting não é recomendado

        // exemplo variavel constante 
        final float PI = 3.14F;
        
        System.out.println(PI);
    }
}
