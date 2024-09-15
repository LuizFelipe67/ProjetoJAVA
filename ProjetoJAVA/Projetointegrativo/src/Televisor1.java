public class Televisor1 {
    protected int canal;
    protected String tamanho;
    protected String modelo;

    public Televisor1(){
        canal = 4;
        tamanho = "15 polegadas";
        modelo = "SEMP TOSHIBA"; 
    }
    public Televisor1 (int c, String t, String m){
        canal = c;
        tamanho = t;
        modelo = m;
    }
    public String getModelo(){
        return modelo;
    }

}
