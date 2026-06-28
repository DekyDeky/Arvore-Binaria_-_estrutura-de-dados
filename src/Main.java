public class Main {
    static void main() {
        Arvore arvore = new Arvore();

        arvore.adicionarNo(9);
        arvore.adicionarNo(10);
        arvore.adicionarNo(15);
        arvore.adicionarNo(7);

        arvore.varreduraERD();
        arvore.varreduraDRE();

        System.out.println(arvore.getAltura());

    }
}
