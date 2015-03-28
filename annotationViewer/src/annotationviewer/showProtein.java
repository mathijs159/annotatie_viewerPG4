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
import java.util.HashMap;

public class showProtein extends showDNA {
        public static String showProtein(String sequence){
            String seq = showDNA.showDNA(sequence);
            
            HashMap table = new HashMap();
            table.put("TTT", "F__");
            table.put("TTC", "F__");
            table.put("TTA", "L__");
            table.put("TTG", "L__");
            table.put("TCT", "S__");
            table.put("TCC", "S__");
            table.put("TCA", "S__");
            table.put("TCG", "S__");
            table.put("TAT", "Y__");
            table.put("TAC", "Y__");
            table.put("TGT", "C__");
            table.put("TGC", "C__");
            table.put("TGG", "W__");
            table.put("CTT", "L__");
            table.put("CTC", "L__");
            table.put("CTA", "L__");
            table.put("CTG", "L__");
            table.put("CCT", "P__");
            table.put("CCC", "P__");
            table.put("CCA", "P__");
            table.put("CCG", "P__");
            table.put("CAT", "H__");
            table.put("CAC", "H__");
            table.put("CAA", "Q__");
            table.put("CAG", "Q__");
            table.put("CGT", "R__");
            table.put("CGC", "R__");
            table.put("CGA", "R__");
            table.put("CGG", "R__");
            table.put("ATT", "I__");
            table.put("ATC", "I__");
            table.put("ATA", "I__");
            table.put("ATG", "M__");
            table.put("ACT", "T__");
            table.put("ACC", "T__");
            table.put("ACA", "T__");
            table.put("ACG", "T__");
            table.put("AAT", "N__");
            table.put("AAC", "N__");
            table.put("AAA", "K__");
            table.put("AAG", "K__");
            table.put("AGT", "S__");
            table.put("AGC", "S__");
            table.put("AGA", "R__");
            table.put("AGG", "R__");
            table.put("GTT", "V__");
            table.put("GTC", "V__");
            table.put("GTA", "V__");
            table.put("GTG", "V__");
            table.put("GCT", "A__");
            table.put("GCC", "A__");
            table.put("GCA", "A__");
            table.put("GCG", "A__");
            table.put("GAT", "D__");
            table.put("GAC", "D__");
            table.put("GAA", "E__");
            table.put("GAG", "E__");
            table.put("GGT", "G__");
            table.put("GGC", "G__");
            table.put("GGA", "G__");
            table.put("GGG", "G__");
               
            String Amino = "";
            for(String codon:seq.split("(?<=\\G...)")){
                try {
                    Amino += table.get(codon.toUpperCase().replace("U", "T"));
                }catch(Exception e){
                    
                }
            }     
            return Amino;
    }
}
