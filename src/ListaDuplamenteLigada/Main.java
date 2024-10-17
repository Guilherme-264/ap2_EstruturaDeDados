package ListaDuplamenteLigada;

public class Main {
    public static void main(String[] args) {
        Biblioteca listaLivros = new Biblioteca<>();
        listaLivros.adicionarNoInicio("tituloX", "autorX");
        listaLivros.adicionarNoFim("tituloZ", "autorXN");
        listaLivros.adicionarNoInicio("tituloA", "dimitri");

//        listaLivros.exibirTodos();
//        listaLivros.procurarPorId(3);
//        listaLivros.removerNoFim();
//        listaLivros.imprimirOrdemOriginal();
        listaLivros.imprimirOrdemReversa();


    }
}
