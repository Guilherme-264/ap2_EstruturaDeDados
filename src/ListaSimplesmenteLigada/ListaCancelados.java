package ListaSimplesmenteLigada;

public class ListaCancelados <T>{
    public No<T> inicio;

    public ListaCancelados(){
        this.inicio = null;
    }

    //função para adicionar um pedido no final da pilha
    public void adicionar(T elemento){
        No<T> novoNo= new No<>(elemento);

        //se a pilha estiver vazia, o algoritimo ira entrar nesse if
        if (inicio == null){
            inicio = novoNo;
            return;
        }

        //se a pilha tiver um ou mais elementos, o algoritimo ira entrar nessa parte do código
        No<T> atual = inicio;
        while (atual.proximo != null){
            atual = atual.proximo;
        }
        atual.proximo = novoNo;
    }

    //função para adicionar recuperar o ultimo elemento da pilha
    public No<T> restaurarPedido(){
        No<T> atual = inicio;
        No<T> anterior = null;
        No<T> restaurado = inicio;

        if (inicio.proximo == null){
            restaurado = atual;
            inicio = null;
            return restaurado;
        }

        while (atual.proximo != null){
            anterior = atual;
            atual = atual.proximo;
        }
        restaurado = atual;
        anterior.proximo = null;
        return restaurado;

    }

    //função para exibir todos os pedidos da lista de pedidos cancelados
    public void exibirCancelados(){
        No<T> atual = inicio;

        //se a pilha estiver vazia, o algoritimo ira entrar nesse if
        if (inicio == null){
            System.out.println("A lista de pedidos cancelados esta vazia!");
            return;
        }

        //se a pilha tiver um ou mais pedidos, o algoritimo ira entrar nessa parte do código
        System.out.print("Lista de pedidos cancelados: {");
        while (atual.proximo != null){
            System.out.print(atual.elemento+ ", ");
            atual = atual.proximo;
        }
        System.out.println(atual.elemento + "}");
    }
}
