public class Main {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstancia();

        config.setConfiguracao("PDF");

        Documento modelo = new Documento("Modelo", "Conteúdo padrão", "PDF");
        config.setPrototipoDocumento(modelo);

        Documento doc1 = config.criarDocumento("Relatório 01", "Dados financeiros");
        Documento doc2 = config.criarDocumento("Relatório 02", "Análise");

        // Exibindo os documentos
        doc1.exibir();
        System.out.println("---");
        doc2.exibir();
    }
}