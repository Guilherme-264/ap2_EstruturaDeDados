package ListaDuplamenteLigada;

public class No<T> {
    int id;
    String titulo;
    String autor;
    No<T> anterior;
    No<T> proximo;



    public No(int id, String titulo, String autor){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anterior = null;
        this.proximo = null;

    }
}

