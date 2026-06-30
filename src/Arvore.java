import java.sql.SQLOutput;

public class Arvore {
    No raiz = null;

    public void adicionarNo(int valor){
        this.raiz = No.adicionar(this.raiz, valor, null);
    }

    public No getRaiz() {
        return raiz;
    }

    public int getAltura(){
        return No.altura(this.raiz);
    }

    public void varreduraERD(){
        No.erd(this.raiz);
        System.out.print("Fim.");
        System.out.println();
    }

    public void varreduraDRE(){
        No.dre(this.raiz);
        System.out.print("Fim.");
        System.out.println();
    }

    public void busca(int valor){
        No noBuscado = No.buscar(this.raiz, valor);
        if(noBuscado == null){
            System.out.println("Valor não está na árvore!");
        }else {
            System.out.println("Valor esta na árvore!");
            if(noBuscado.getPai() != null){
                System.out.println("Filho de: " + noBuscado.getPai().getValor());
            }
        }
    }

    public void getSeguinte(int valor){
        No atual = No.buscar(this.raiz, valor);
        if(atual == null){
            System.out.println("Valor não está na árvore!");
            return;
        }

        No seguinte = No.seguinte(atual);

        if(seguinte == null){
            System.out.println("Não há valores seguintes!");
        }else {
            System.out.println("Valor seguinte: " + seguinte.getValor());
        }


    }


}
