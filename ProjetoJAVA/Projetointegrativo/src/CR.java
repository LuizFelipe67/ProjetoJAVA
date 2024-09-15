public class CR{
    public static void main (String args[]){
        Televisor1 tv1 = new Televisor1();
        Televisor1 tv2 = new Televisor1(10, new String("10 polegadas"), new String("Gradiante"));
        TelevisorComDVD tvdvd1 = new TelevisorComDVD();

        System.out.println("\nO objeto tv1 e" + tv1.getModelo());
        System.out.println("O objeto tv2 e" + tv2.getModelo());
        System.out.println("O objeto tvdvd1 e" + tvdvd1.getModelo());
        
        System.out.println("\n" + tvdvd1.eject());
        System.out.println("" + tvdvd1.stop());
        System.out.println("" + tvdvd1.play());
        System.out.println("" + tvdvd1.pause());

    }
}
