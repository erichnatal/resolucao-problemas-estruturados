public class VideoDigital extends ItemBibliotecaDigital implements Baixavel,Visualizavel{
    public VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String descricao() {
        return "Video: " + "\n" +
                "Autor: " + getAutor() + "\n" +
                "Titulo: " + getTitulo();
    }

    @Override
    public void baixar() {
        System.out.println("Baixando video...");

    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando video");

    }
}
