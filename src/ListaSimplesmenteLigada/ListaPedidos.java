package ListaSimplesmenteLigada;

public class ListaPedidos <T> {
    public No<T> inicio;
    public ListaCancelados<T> cancelados;


    public ListaPedidos(){
        this.inicio = null;
        cancelados = new ListaCancelados<>();
    }

    //adiciona um pedido ao final da fila
    public void adicionar(T elemento){
        No<T> novoNo= new No<>(elemento);

        //caso a fila esteja vazia, o algoritimo entrará nesse if
        if (inicio == null){
            inicio = novoNo;
            return;
        }

        //caso a fila não esteja vazia, o algoritimo entrará nessa parte do código
        No<T> atual = inicio;
        while (atual.proximo != null){
            atual = atual.proximo;
        }
        atual.proximo = novoNo;
    }

    //atende o primeiro pedido da fila
    public void atenderPedido(){

        if (inicio == null){ //caso a fila esteja vazia, o algoritimo entrará nesse if

            System.out.println("A fila de pedidos esta vazia! ");

        } else if (inicio.proximo == null) { //caso a fila tenha somente um pedido, o algoritimo entrará nesse if
            System.out.println("O " + inicio.elemento+ " foi entregue!" );
            inicio = null;
        }else { //caso a fila tenha varios pedidos, o algoritimo entrará nesse if
            System.out.println("O " + inicio.elemento+ " foi entregue!" );
            inicio = inicio.proximo;
        }
    }

    //exclui o ultimo pedido adicionado na fila, e envia para a fila de cancelados
    public void cancelarPedido(){
        if (inicio == null){ //caso a fila esteja vazia, o algoritimo entrará nesse if
            System.out.println("A fila de pedidos esta vazia! ");

        }else if(inicio.proximo == null) {  //caso a fila tenha somente um pedido, o algoritimo entrará nesse if
            cancelados.adicionar(inicio.elemento);
            System.out.println(inicio.elemento + "  foi cancelado");
            inicio = null;

        }else{ //caso a fila tenha varios pedidos, o algoritimo entrará nesse if
            No<T> atual = inicio;
            No<T> anterior = null;

            while (atual.proximo != null){
                anterior = atual;
                atual = atual.proximo;
            }
            anterior.proximo = null;
            cancelados.adicionar(atual.elemento);
            System.out.println(atual.elemento+ " cancelado");
        }
    }

    //pega o ultimo valor adicionado na lista de cancelados e volta para a lista de pedidos
    public void restaurarPedido(){

        if (cancelados.inicio == null){//caso a pilha de cancelados esteja vazia, o algoritimo entrará nesse if
            System.out.println("Não a pedidos cancelados");
            return;
        }

        //caso a fila de cancelados tenha um ou mais pedidos, o algoritimo entrará nesse if
        No<T> restaurado = cancelados.restaurarPedido();
        adicionar(restaurado.elemento);
        System.out.println("O pedido "+ restaurado.elemento+ " foi restaurado a fila");
    }

    //exibi todos os pedidos da lista
    public void exibir(){
        No<T> atual = inicio;


        if (inicio == null){ //caso a fila de pedidos esteja vazia, o algoritimo entrará nesse if
            System.out.println("A lista de pedidos esta vazia!");
            return;
        }

        //caso a tenha um ou mais pedidos, o algoritimo entrará nessa parte do código
        System.out.print("Lista de pedidos: {");
        while (atual.proximo != null){
            System.out.print(atual.elemento+ ", ");
            atual = atual.proximo;
        }
        System.out.println(atual.elemento + "}");
    }

    //exibe os pedidos da pilha de pedidos cancelados
    public void exibirCancelados(){
        cancelados.exibirCancelados();

    }


}
