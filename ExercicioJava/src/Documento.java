public class Documento {
    private String titulo;
    private String conteudo;
    private String formato;

    public Documento(String titulo, String conteudo, String formato) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.formato = formato;
    }

    public Documento clone() {
        return new Documento(this.titulo, this.conteudo, this.formato);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Formato: " + formato);
    }
}