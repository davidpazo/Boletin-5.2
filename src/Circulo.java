
public class Circulo {
    private double radio;
    private double pi=3.14;
    
    public Circulo(){
    }
    public Circulo(double r){
        radio=r;
    }
    public double calcularArea(){
        return Math.pow(radio,2)*pi;
    }
    public double clacularLonxitude(){
        return 2+pi+radio;
    }
    public void setradio(double r){
        this.radio=r;
    }
}
