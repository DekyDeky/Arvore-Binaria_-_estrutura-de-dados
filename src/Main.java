import java.util.Scanner;

public class Main {
    static void main() {

        Scanner entrada = new Scanner(System.in);
        Arvore arvore = new Arvore();
        int valor = 0;

        while(true){
            exibirTela();
            int numEscolhido = entrada.nextInt();
            System.out.println();

            switch (numEscolhido){
                case 1:
                    System.out.print("Digite o valor: ");
                    valor = entrada.nextInt();
                    arvore.adicionarNo(valor);
                    break;
                case 2:
                    System.out.println("Fazendo varredura ERD...");
                    arvore.varreduraERD();
                    break;
                case 3:
                    System.out.println("Fazendo varredura DRE");
                    arvore.varreduraDRE();
                    break;
                case 4:
                    System.out.print("Digite o valor: ");
                    valor = entrada.nextInt();
                    arvore.busca(valor);
                    break;
                case 5:
                    System.out.print("Digite o valor: ");
                    valor = entrada.nextInt();
                    arvore.getSeguinte(valor);
                    break;
                case 6:
                    System.out.println("Verificando altura...");
                    System.out.println("Altura da árvore: " + arvore.getAltura());
                    break;
                case 0:
                    System.exit(1);

        }

        }

    }

    public static void exibirTela(){
        System.out.println("=============================");
        System.out.println("Árvore Binária");
        System.out.println("1. Adicionar nó");
        System.out.println("2. Varredura ERD");
        System.out.println("3. Varredura DRE");
        System.out.println("4. Buscar Valor");
        System.out.println("5. Buscar Valor Seguinte");
        System.out.println("6. Checar Altura da Árvore");
        System.out.println("0. Sair");
        System.out.println("=============================");
        System.out.print("Digite um valor: ");
    }
}


