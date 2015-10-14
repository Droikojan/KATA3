package practica3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Practica3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Practica3\\emailsfilev1.txt";
        
        try{
            BufferedReader fileIn = new BufferedReader(new FileReader(pathName));
            String mail;
            while ((mail=fileIn.readLine()) != null){
                if (mail.contains("@")){
                    histogram.increment(mail.split("@")[1]);
                }
            }
        }catch (Exception e){
            System.out.println("Fichero no existe " + e);
        }
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
