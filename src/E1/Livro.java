package E1;

public class Livro {
    private String nome;
    private String autor;
    private int ano;

    public Livro() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro: " + nome + " | Autor: " + autor + " | Ano: " + ano;
    }
}
