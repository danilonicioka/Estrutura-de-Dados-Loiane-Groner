package Parte01_Arrays;

public class Ex01 {
    
    public static void main(String[] args) {
        
        double temperaturas[] = new double[365];
        
        for(double temp:temperaturas){ //para percorrer todo o array(inclusive as posições sem nada)
            System.out.println(temp);
        }
        
    }
    
}
