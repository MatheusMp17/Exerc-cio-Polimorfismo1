import java.util.*;
public class Pokemon {
    private Random gerador = new Random();
    private String nome;
    private String classe;
    private int indicePokedex;
    private float altura;
    private float peso;
    private int vida;
    private int vidaMax;
    private int ataque;
    private int defesa;
    private String regiao;
    private int velocidade;
    private int numeroEvolucoes;
    private int evolucaoAtual;
    private int tipo;
    public Pokemon(String nome, String classe, int indicePokedex, float altura, float peso, String regiao, int numeroEvolucoes){
        setAltura(altura);
        setClasse(classe);
        setIndicePokedex(indicePokedex);
        setNome(nome);
        setNumeroEvolucoes(numeroEvolucoes);
        setPeso(peso);
        setRegiao(regiao);
    }
    //construtor com todos os atributos imutáveis
    //definir sets para os atributos mutáveis
    //definir os gets
    public int getTipo(){
        return tipo;
    }
    public void setTipo(int tipo){
        this.tipo =tipo;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        if(altura > 0)
        this.altura = altura;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        if(defesa > 0 )
        this.defesa = defesa;
    }
    public int getEvolucaoAtual() {
        return evolucaoAtual;
    }
    public void setEvolucaoAtual(int evolucaoAtual) {
        this.evolucaoAtual = evolucaoAtual;
    }
    public int getIndicePokedex() {
        return indicePokedex;
    }
    public void setIndicePokedex(int indicePokedex) {
        this.indicePokedex = indicePokedex;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroEvolucoes() {
        return numeroEvolucoes;
    }
    public void setNumeroEvolucoes(int numeroEvolucoes) {
        this.numeroEvolucoes = numeroEvolucoes;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getRegiao() {
        return regiao;
    }
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getVelocidade() {
        return velocidade;
    }public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        if (vida >= 0 && vida <= vidaMax)
        this.vida = vida;
    }
    public int getVidaMax() {
        return vidaMax;
    }
    public void setVidaMax(int vidaMax) {
        if (vidaMax > 0)
        this.vidaMax = vidaMax;
    }

    public void atacar(Pokemon alvo, int tipoAtaque){

    }

    public void sofrerDano(int dano){
        if(getVida() - dano >= 0){
            setVida(getVida() - dano);
        }
        else if(getVida() - dano < 0){
            setVida(0);
        }
    }

    public void curar(int cura){
        if(getVida() + cura <= getVidaMax()){
            setVida(getVida() + cura);
        }
        else if(getVida() + cura > getVidaMax()){
            setVida(getVidaMax());
        }
    }

    /*
     * tipos:
     * 0 Normal
     * 1 Fogo
     * 2 Agua
     * 3 Planta
     */
    public boolean testarResistencia(int tipoAtaque, int tipoDefensor){
        if(tipoDefensor == tipoAtaque || tipoDefensor == 0 || tipoAtaque == 0){
            return false;
        }
        else if(tipoDefensor == 1 && tipoAtaque == 3){
            return true;
        }
        else if(tipoDefensor == 2 && tipoAtaque == 1){
            return true;
        }
        else if(tipoDefensor == 3 && tipoAtaque == 2){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean testarFraqueza(int tipoAtaque, int tipoDefensor){
        if(tipoDefensor == tipoAtaque || tipoDefensor == 0 || tipoAtaque == 0){
            return false;
        }
        else if(tipoDefensor == 3 && tipoAtaque == 1){
            return true;
        }
        else if(tipoDefensor == 1 && tipoAtaque == 2){
            return true;
        }
        else if(tipoDefensor == 2 && tipoAtaque == 3){
            return true;
        }
        else{
            return false;
        }
    }

    public int determinarStatusBase(int statusBase){
        return gerador.nextInt(statusBase) + 5;
    }
    @Override
    public String toString(){
        return "info: ";
    }
}
