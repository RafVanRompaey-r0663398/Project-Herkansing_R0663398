/*@author  Van_Rompaey_Raf-r0663398
 * git-rep = https://github.com/RafVanRompaey-r0663398/Project-Herkansing_R0663398.git
 * */
package model.vraag;

import java.util.List;

import model.Vraag;

public class MultipleChoiceVraag extends Vraag {
	
	public MultipleChoiceVraag(String question, String category, String feedback,String correct,List<String >antwoorden) {
		super(question, category, feedback,correct, antwoorden);
		// TODO Auto-generated constructor stub
	}

}
