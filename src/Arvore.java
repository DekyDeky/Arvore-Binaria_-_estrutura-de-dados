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
        System.out.println();
    }

    public void varreduraDRE(){
        No.dre(this.raiz);
    }

    public boolean busca(int valor){
        No noBuscado = No.buscar(this.raiz, valor);
        if(noBuscado == null){
            return false;
        }else {
            return true;
        }
    }

    public void getSeguinte(int valor){
        No atual = No.buscar(this.raiz, valor);
        No seguinte = No.seguinte(atual);

        if(seguinte == null){
            System.out.println("Não há valores seguintes!");
        }else {
            System.out.println("Valor seguinte: " + seguinte.getValor());
        }


    }


}
