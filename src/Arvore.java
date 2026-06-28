public class Arvore {
    No raiz = null;

    public void adicionarNo(int valor){
        this.raiz = No.adicionar(this.raiz, valor);
    }

    public No getRaiz() {
        return raiz;
    }

    public int getAltura(){
        return No.altura(this.raiz);
    }

    public void varreduraERD(){
        No.erd(this.raiz);
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


}
