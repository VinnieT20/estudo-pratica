public class ConfigManager {
    private static ConfigManager instancia;
    private String configuracao;
    private Documento prototipoDocumento;

    private ConfigManager() {}

    public static ConfigManager getInstancia() {
        if (instancia == null) {
            instancia = new ConfigManager();
        }
        return instancia;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }

    public Documento getPrototipoDocumento() {
        return prototipoDocumento;
    }

    public void setPrototipoDocumento(Documento doc) {
        this.prototipoDocumento = doc;
    }

    public Documento criarDocumento(String titulo, String conteudo) {
        Documento novoDoc = prototipoDocumento.clone();
        novoDoc.setTitulo(titulo);
        novoDoc.setConteudo(conteudo);
        novoDoc.setFormato(configuracao);
        return novoDoc;
    }
}