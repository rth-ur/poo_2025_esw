package E1;

public class Principal {
    public static void main(String[] args) {

        Livro l1 = new Livro();
        l1.setAno(2023);
        l1.setAutor("Pressman");
        l1.setNome("Engenharia de Software");

        Livro l2 = new Livro();
        l2.setAno(2025);
        l2.setAutor("Tanenbaum");
        l2.setNome("Banco de Dados 2");

        Biblioteca b1 = new Biblioteca();
        b1.setNome("Biblioteca CEUB");
        b1.getLivros().add(l1);
        b1.getLivros().add(l2);

        // Mostrar os livros
        b1.listarLivros();
    }
}
