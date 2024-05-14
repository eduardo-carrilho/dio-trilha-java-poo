public class Autodromo {

    
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("123456");
        

        Moto z400 = new Moto();
        z400.setChassi("654321");

        System.out.println(jeep.getChassi());
        System.out.println(z400.getChassi());

        jeep.ligar();
        z400.ligar();

        Veiculo coringa = z400;

        coringa.ligar();
    }
}
