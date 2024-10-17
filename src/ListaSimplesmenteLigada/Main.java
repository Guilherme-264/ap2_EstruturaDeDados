package ListaSimplesmenteLigada;

public class Main {
    public static void main(String[] args) {
      ListaPedidos lista = new ListaPedidos();

      lista.adicionar("arroz");
      lista.adicionar("la minuta");
//      lista.adicionar("ramem");
//      lista.adicionar("polenta");

      lista.cancelarPedido();
      lista.cancelarPedido();
//      lista.atenderPedido();
//      lista.exibirCancelados();

      lista.restaurarPedido();


        lista.exibir();
    }
}