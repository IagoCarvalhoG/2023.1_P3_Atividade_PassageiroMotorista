import java.util.ArrayList;
import java.util.Scanner;
public class Aplicativo {
    private static Motorista[] motoristas;
    private static Passageiro[] passageiros;
    public Aplicativo(){
        //this.motoristas =  new ArrayList<Motorista>();
        
    }
    public static void main(String[] args) {
        passageiros = new Passageiro[1];
        motoristas = new Motorista[1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserir dados de cadastro do motorista: Nome e nota");
        Motorista motorista = new Motorista(sc.next(),sc.nextDouble());
        motoristas[0] = motorista;
        passengerGenerator();
        

    }
    private static void passengerGenerator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserir dados de cadastro do Passageiro: Nome, nota e telefone");
        Passageiro passageiro = new Passageiro(sc.next(), sc.nextDouble(), sc.next());
        passageiros[0] = passageiro;
        passageiros[0].solicitarCorrida();
        if(!motoristas[0].aceitarCorrida()){
            System.out.println("Deseja fechar o aplicativo, pressione 0 para fechar");
            if(sc.next().equals("0")){
                System.exit(0);
            }
            passengerGenerator();
        }
        motoristas[0].pagamento(passageiros[0].distanciaAteDestino *10);
        passageiros[0].usuarioPosicaoFinal();
        motoristas[0].setPosicaoX(passageiros[0].getPosicaoX());
        motoristas[0].setPosicaoY(passageiros[0].getPosicaoY());
        System.out.println("Deseja fechar o aplicativo, pressione 0 para fechar, qualquer outro caractere para procurar outra corrida");
        if(sc.next().equals("0")){
            System.exit(0);
        }
        passengerGenerator();
    }
}
