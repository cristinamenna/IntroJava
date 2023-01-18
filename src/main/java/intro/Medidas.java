// 1 - pacote
package intro;

// 2 - Referência as bibliotecas

// 3 - class
public class Medidas {
    // 3.1 - Atributos - características

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        System.out.println("Cáculo de Areas!");

        //comentado por rogerio

        // Cáculo de área = reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m A área é de " + largura * comprimento + "m²");
    }

    public void calcularAreaModoExtenso(){
        // Cálculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println(" Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m A área é de " + resultado + "m²");
    }

    public void calcularAreaModoCompacto(){
        // Cálculo de área = Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println(" Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m A área é de " + comprimento + "m²");
    }

}







