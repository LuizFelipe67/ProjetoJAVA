class TelevisorComDVD extends Televisor1{
    public TelevisorComDVD(){
        canal = 31;
        tamanho = "20 polegadas";
        modelo = "PHILCO";
    }
    public String eject(){
        return "Eject ativado";
    }
    public String play(){
        return "Funcao play ativada";
    }
    public String stop(){
        return "Funcao stop ativada";
    }
    public String pause(){
        return "Funcao pause ativada";
    }
    
    
    public static void main (String args []){
        TelevisorComDVD tvdvd1= new TelevisorComDVD();
        
        System.out.println(" "+tvdvd1.eject());
        System.out.println(" "+tvdvd1.stop());
        System.out.println(" "+tvdvd1.play());
        System.out.println(" "+tvdvd1.pause());
    }

}

