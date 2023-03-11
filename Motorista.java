import java.util.Scanner;
public class Motorista extends Usuario {
    private double saldo =0;
    public Motorista(String nome, double nota){
        super(nome,nota);
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void pagamento(double pagamento){
        this.saldo = saldo + pagamento;
    }
    public boolean aceitarCorrida(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja aceitar a corrida? pressione y para sim");
        return sc.next().equals("y");
    }

}
