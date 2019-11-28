/**

 * Autor @AndresMartinez
 * Version 1.0

 */
package proyectogithub;

public class ProyectoGitHub {

    private static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
        
        /**

        * Este método compara la nota esperada con la obtenida

        */
    }
    
    public static void main(String[] args) {
        System.out.println("La calificación de " + args[0] + ": "+args[2]+"\n"+veredicto(args[1], args[2]));
    }
    
}
