package practica3;

import java.util.ArrayList;

public class Practica3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Practica3\\emailsfilev1.txt";
        MailReader dominios = new MailReader(pathName);

        ArrayList<String> domis = dominios.getDominiosArray();
        
        for (int i = 0; i < domis.size(); i++) {
            histogram.increment(domis.get(i));
        }

        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
