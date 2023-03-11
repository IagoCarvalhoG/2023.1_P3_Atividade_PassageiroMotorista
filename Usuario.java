/**
 * Usuario
 */
public class Usuario extends Bhaskara {
    protected String nome;
    protected double nota;
    private double posicaoX = 0;
    private double posicaoY = 0;
    protected double distanciaAteDestino = 0;
    public Usuario(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
        super.bhaskaraSolverPart1();
        usuarioPosicaoInicio();
        this.distanciaAteDestino = courseLength();
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
    private void usuarioPosicaoInicio(){
        this.posicaoX = super.bhaskaraSolverForPositive();
        this.posicaoY = super.a * Math.pow(this.posicaoX, 2) + super.b * this.posicaoX + super.c;
    }
    public void usuarioPosicaoFinal(){
        this.posicaoX = super.bhaskaraSolverForNegative();
        this.posicaoY = super.a * Math.pow(this.posicaoX, 2) + super.b * this.posicaoX + super.c;
    }
    private double courseLength(){
        double posicaoFinalX = super.bhaskaraSolverForNegative();
        double posicaoFinalY = super.a * Math.pow(this.posicaoX, 2) + super.b * this.posicaoX + super.c;
        return Math.sqrt(Math.pow((posicaoFinalX -this.posicaoX), 2) + Math.pow((posicaoFinalY -this.posicaoY), 2));
    }
}