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
public class showGenes extends annotationJFrame {
    public static String showGenes(String sequence){
        String GEN = sequence;
        String[] parts = GEN.split("-");
        String gene_part = parts[0]; //geneName
        return gene_part;
        
    }
}
