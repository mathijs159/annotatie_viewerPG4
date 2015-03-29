/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationviewer;

/**
 *
 * @author mathijs
 */

public class showDNA extends annotationJFrame {
    public static String showDNA(String sequence){
        String DNA = sequence;
        String[] parts = DNA.split("-");
        String dna_part = parts[1]; //DNA
        
        char[] seq = dna_part.toCharArray();
        int gcCount = 0;
        int seqLen = dna_part.length();
        
        for(char Character : seq) {
            if(Character == 'G' || Character == 'C') {
                gcCount = gcCount+1;
            }
        }
        System.out.println("Sequentie lengte: "+seqLen);
        System.out.println("GC Totaal: "+gcCount);
        float GC_Perc = (gcCount*100.0f)/seqLen;
        System.out.println("GC %: "+GC_Perc);
        
        return dna_part+"-"+GC_Perc;      
    }

}
