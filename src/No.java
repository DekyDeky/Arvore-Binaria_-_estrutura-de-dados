public class No {
    int valor;
    No esquerdo;
    No direito;
    No pai;

    public No(int valor) {
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
        this.pai = null;
    }

    public int getValor() {
        return valor;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public No getPai() {
        return pai;
    }

    public static No adicionar(No atual, int valor, No pai){
        if(atual == null){
            No novoNo = new No(valor);
            novoNo.setPai(pai);
            return novoNo;
        }

        if(valor < atual.getValor()){
            System.out.println(valor + " está a esquerda de " + atual.getValor());
            atual.setEsquerdo(adicionar(atual.getEsquerdo(), valor, atual));
        } else if (valor > atual.getValor()) {
            System.out.println(valor + " está a direita de " + atual.getValor());
            atual.setDireito(adicionar(atual.getDireito(), valor, atual));
        } else {
            return atual;
        }

        return atual;
    }

    public static void erd(No atual){
        if(atual != null){
            erd(atual.getEsquerdo());
            System.out.print(atual.getValor() + " - ");
            erd(atual.getDireito());
        }
    }

    public static void dre(No atual){
        if(atual != null){
            erd(atual.getDireito());
            System.out.println(atual.getValor());
            erd(atual.getEsquerdo());
        }
    }

    public static No buscar(No atual, int valorBusca){
        if(atual == null || atual.getValor() == valorBusca){
            return atual;
        }

        if(atual.getValor() > valorBusca){
            return buscar(atual.getEsquerdo(), valorBusca);
        }else {
            return buscar(atual.getDireito(), valorBusca);
        }
    }

    public static int altura(No atual){
        if(atual == null){
            return -1;
        }

        int alturaEsq = altura(atual.getEsquerdo());
        int alturaDir = altura(atual.getDireito());
        if(alturaEsq < alturaDir) return alturaDir + 1;
        else return alturaEsq + 1;
    }

    public static No seguinte(No atual){
        if(atual.getDireito() != null){
            No seguinte = atual.getDireito();
            System.out.println(seguinte.getValor());

            while (seguinte.getEsquerdo() != null) {
                System.out.println(seguinte.getValor());
                seguinte = seguinte.getEsquerdo();
            }

            return seguinte;
        }

        while(atual.getPai() != null && atual.getPai().direito == atual) atual = atual.getPai();


        return atual.getPai();
    }
}
