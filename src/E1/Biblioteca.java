package E1;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private String nome;

    public Biblioteca() {
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    
    public void adicionarLivo(Livro Livro) {
    	this.livros.add(Livro);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public void listarLivros() {
        System.out.println("Livros da " + nome + ":");
        for (Livro l : livros) {
            System.out.println(l);
        }
    }
}
