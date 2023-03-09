/**
 * Usuario
 */
public class Usuario {
    protected String nome;
    protected double nota;
    private double posicaoX;
    private double posicaoY;
    public Usuario(String nome, double nota, double posicaoX, double posicaoY ){
        this.nome = nome;
        this.nota = nota;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }
    public String getNome(){
        return this.nome;
    }
    public double getNota(){
        return this.nota;
    }
    public double getPosicaoX(){
        return this.posicaoX;
    }
    public double getPosicaoY(){
        return this.posicaoY;
    }
    public void setPosicaoX(double posicaoX){
        this.posicaoX = posicaoX;
    }
    public void setPosicaoY(double posicaoY){
        this.posicaoY = posicaoY;
    }
}