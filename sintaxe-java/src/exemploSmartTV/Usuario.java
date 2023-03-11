package exemploSmartTV;

public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTV smartTv = new SmartTV();
        System.out.println("TV ligada? " +smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);


        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.trocarCanal(53);

        System.out.println("NOVO STATUS ");
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume Atual: " + smartTv.volume);
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
