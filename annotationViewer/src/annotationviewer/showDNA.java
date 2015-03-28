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
        return dna_part;
        
    }
}
