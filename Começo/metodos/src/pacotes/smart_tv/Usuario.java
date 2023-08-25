package pacotes.smart_tv;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? "+smartTv.ligada);
        System.out.println("Cana Atual: "+smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(13);
        System.out.println("-----------Novo Status-----------\nTV Ligada? "+smartTv.ligada);
        System.out.println("Cana Atual: "+smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.desligar();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("-----------Novo Status-----------\nTV Ligada? "+smartTv.ligada);
        System.out.println("Cana Atual: "+smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);

    }
}
