public class Ebook extends ItemBibliotecaDigital implements Baixavel{
    public Ebook(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String descricao() {
        return "Ebook: " + "\n" +
                "Autor: " + getAutor() + "\n" +
                "Titulo: " + getTitulo();
    }

    @Override
    public void baixar() {
        System.out.println("Baixando ebook...");

    }
}
