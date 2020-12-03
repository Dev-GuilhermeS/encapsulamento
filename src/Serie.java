public class Serie implements Video {

//atributos
   private int temporadas;
   private int episodiosPorTemporada;
   private String idiomaAudio;
   private String idiomaLegenda;
   private String nome;
   private boolean estaPausado;
   

//construtores
public Serie(){
    this.nome = "Good Girls";
    this.idiomaAudio = "Português (Brasil)";
    this.idiomaLegenda = "Português (Brasil)";
    this.estaPausado = false;
    this.temporadas = 3;
    this.episodiosPorTemporada = 11;
}

//especificos
public void executar() {
    System.out.println("Você está assistindo a série: " + nome + "\n");
       estaPausado = false;
 }

 public void pausar() {
     System.out.println("Série em Pausa" + "\n");
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
     System.out.println("Série: " + nome + ", Temporadas: " + temporadas + ", Episódios: " + episodiosPorTemporada + "\n");
 return null;
 }

//getters / setters
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