public class Filme implements Video {

//atributos
   private int duracao;
   private int anoLancamento;
   private String idiomaAudio;
   private String idiomaLegenda;
   private String nome;
   private boolean estaPausado;

//construtores
public Filme(){
    this.nome = "A chefa";
    this.anoLancamento = 2016;
    this.duracao = 104;
    this.idiomaAudio = "Português (Brasil)";
    this.idiomaLegenda = "Português (Brasil)";
    this.estaPausado = false;
}

//especificos
    public void executar() {
       System.out.println("Você está assistindo ao filme: " + nome + "\n");
          estaPausado = false;
    }
  
    public void pausar() {
        System.out.println("Filme em Pausa" + "\n");
        estaPausado = true;
    }
 
    public void mudarAudio() {
        if(idiomaAudio == "Português (Brasil)"){
            idiomaAudio =  "Inglês (Original)";
            System.out.println("Mudando idioma de audio para: " + idiomaAudio + "\n");
        }else if(idiomaAudio == "Inglês (Original)"){
            idiomaAudio = "Português (Brasil)";
            System.out.println("Mudando idioma de audio para: " + idiomaAudio + "\n");
        }

    }
 
    public void mudarLegenda() {
        if(idiomaLegenda == "Português (Brasil)"){
            idiomaLegenda = "Sem legenda";
            System.out.println("Mudando legenda para: " + idiomaLegenda + "\n");
        }else if(idiomaLegenda == "Sem legenda"){
            idiomaLegenda = "Português (Brasil)";
            System.out.println("Mudando idioma de legenda para: " + idiomaLegenda + "\n");    
        }
    
    }

    public String exibirDetalhes() {
        System.out.println("Filme: " + nome + ", Ano de Lançamento: " +  anoLancamento + ", Duração: " + duracao + " Min" + "\n");
    return null;
    }

//getters / setters
    public int getDuracao(){
        return this.duracao;
    }
    public String getIdiomaAudio(){
        return this.idiomaAudio;
    }
    public String getIdiomaLegenda(){
        return this.idiomaLegenda;
    }
    public boolean getEstaPausado(){
        return this.estaPausado;
    }
    
}