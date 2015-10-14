package practica3;

import java.util.ArrayList;

public class Practica3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Practica3\\emailsfilev1.txt";
        MailReader dominios = new MailReader(pathName);

        ArrayList<String> domis = dominios.getDominiosArray();
        
        Histogram<String> histograma = DominiosHistogramBuilder.execute(domis);

        HistogramDisplay histo = new HistogramDisplay(histograma);
        histo.execute();
    }
}
