package applistadupla;

public class AppListaDupla {

    public static void main(String[] args) {
        // Não modificar nada deste código
        ListaDupla l = new ListaDupla();
        l.adicionaNoFim(10);
        l.adicionaNoFim(20);
        l.adicionaNoFim(30);
        l.adicionaNoFim(40);
        l.imprime();
        l.removePenultimo();
        l.imprime();
    }
}
