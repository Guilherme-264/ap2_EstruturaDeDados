package ListaDuplamenteLigada;

public class Biblioteca <T> {
    No <T> inicio;
    No <T> fim;
    int idAtual;


    public Biblioteca(){
        this.inicio = null;
        this.fim = null;
        idAtual = 1;
    }

    //função de adicionar um livro no inicio da lista
    public void adicionarNoInicio(String titulo, String autor){
        No<T> novoNo = new No<>(idAtual, titulo, autor);

        //caso a lista esteje vazia, o algoritimo irá entrar nesse if
        if (inicio == null){
            inicio = novoNo;
            fim = novoNo;
            idAtual++;
            return;
        }

        //caso a lista ja tenha algum item adicionado o algoritimo irá para essa parte da função
        inicio.anterior = novoNo;
        novoNo.proximo = inicio;
        inicio = novoNo;
        idAtual++;
    }

    //função de adicionar um livro no final da lista
    public void adicionarNoFim(String titulo, String autor){
        No<T> novoNo = new No<>(idAtual, titulo, autor);

        //caso a lista esteje vazia, o algoritimo irá entrar nesse if
        if (fim == null){
            inicio = novoNo;
            fim = novoNo;
            idAtual++;
            return;
        }

        //caso a lista ja tenha algum item adicionado o algoritimo irá para essa parte da função
        fim.proximo = novoNo;
        novoNo.anterior = fim;
        fim = novoNo;
        idAtual++;

    }

    //função de remover o livro no inicio da lista
    public void removerNoInicio(){

        //caso a lista esteje vazia, o algoritimo irá entrar nesse if
        if(inicio == null){
            System.out.println("A biblioteca não tem livros para ser removido");
            return;
        }

        //caso a lista tenha apenas um livro, o algoritimo irá entrar nesse if
        if (inicio.proximo == null){
            System.out.println("O livro com as seguintes informações foi removido");
            System.out.println("Titulo: " + inicio.titulo);
            System.out.println("Autor: "+ inicio.autor);
            System.out.println("ID: "+ inicio.id);
            inicio = null;
            fim = null;
            return;
        }

        //caso a lista tenha 2 ou mais livros, o algoritimo irá entrar nessa parte do código
        System.out.println("O livro com as seguintes informações foi removido");
        System.out.println("Titulo: " + inicio.titulo);
        System.out.println("Autor: "+ inicio.autor);
        System.out.println("ID: "+ inicio.id);
        inicio = inicio.proximo;
        inicio.anterior = null;
    }

    //função de remover o livro no final da lista
    public void removerNoFim(){

        //caso a lista esteje vazia, o algoritimo irá entrar nesse if
        if(inicio == null){
            System.out.println("A biblioteca não tem livros para ser removido");
            return;
        }

        //caso a lista tenha apenas um livro, o algoritimo irá entrar nesse if
        if (fim.anterior == null){
            System.out.println("O livro com as seguintes informações foi removido");
            System.out.println("Titulo: " + inicio.titulo);
            System.out.println("Autor: "+ inicio.autor);
            System.out.println("ID: "+ inicio.id);
            inicio = null;
            fim = null;
            return;
        }

        //caso a lista tenha 2 ou mais livros, o algoritimo irá entrar nessa parte do código
        System.out.println("O livro com as seguintes informações foi removido");
        System.out.println("Titulo: " + fim.titulo);
        System.out.println("Autor: "+ fim.autor);
        System.out.println("ID: "+ fim.id);
        fim = fim.anterior;
        fim.proximo = null;
    }

    //função de procurar um livro pelo id
    public void procurarPorId(int id){

        //caso a lista esteje vazia, o algoritimo irá entrar nesse if
        if (inicio == null){
            System.out.println("A lista de livros está vazia");
            return;
        }else {
            No<T> atual = inicio;

            // a função irá percorrer por toda a lista até encontrar o id procurado, ou a lista acabar
            while (atual != null){
                if (atual.id == id){
                    System.out.print("O livro com ID "+ id +", ");
                    System.out.print("Titulo: " + atual.titulo+" e ");
                    System.out.println("Autor: "+ atual.autor);
                    return;
                }
                atual = atual.proximo;
            }
        }

    }

    //função de imprimir todos os livros em ordem de id
    public void imprimirOrdemOriginal(){

        //caso a lista esteje vazia, o algoritimo irá entrar nesse if
        if (inicio == null){
            System.out.println("A lista de livros está vazia");
            return;
        }

        //a função procurarPorId é chamada com o valor do id sendo selecionado pela estrutura de repetição for
        for (int i = 1; i < idAtual; i++) {
            procurarPorId(i);

        }
    }

    //função de imprimir todos os livros em ordem decrescente de id
    public void imprimirOrdemReversa(){

            //caso a lista esteje vazia, o algoritimo irá entrar nesse if
        if (inicio == null){
            System.out.println("A lista de livros está vazia");
            return;
        }

        //a função procurarPorId é chamada com o valor do id sendo selecionado pela estrutura de repetição for decrescente
        for (int i = idAtual; i > 0; i--) {
            procurarPorId(i);
        }
    }
}
