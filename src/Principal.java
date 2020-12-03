public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.exibirDetalhes();
        filme.executar();
        System.out.println("Idioma do audio: " + filme.getIdiomaAudio() + "\n");
        filme.mudarAudio();
        filme.mudarAudio();
        filme.mudarLegenda();
        System.out.println("\n");

        Serie serie = new Serie();
        serie.exibirDetalhes();
        serie.executar();
        serie.mudarAudio();
        serie.pausar();
        System.out.println("Legenda: " + serie.getIdiomaLegenda());

        System.out.println("\nGuilherme Pereira da Silva | 2° Período | ADS");

    }
}
