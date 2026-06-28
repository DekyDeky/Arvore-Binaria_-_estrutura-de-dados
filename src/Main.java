public class Main {
    static void main() {
        Arvore arvore = new Arvore();

        arvore.adicionarNo(9);
        arvore.adicionarNo(10);
        arvore.adicionarNo(15);
        arvore.adicionarNo(14);
        arvore.adicionarNo(7);
        arvore.adicionarNo(8);
        arvore.adicionarNo(5);
        arvore.adicionarNo(12);

        //arvore.varreduraERD();
        //arvore.varreduraDRE();

        //System.out.println(arvore.getAltura());
        arvore.getSeguinte(15);
        arvore.getSeguinte(12);
        arvore.getSeguinte(8);

    }
}
