package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("Hello, this is the Voting booth. Please input your age: ");
		int ageInt = Integer.parseInt(age);
		if ( ageInt >= 18) {
			JOptionPane.showMessageDialog(null, "Who do you think should run for president next?");
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think");
		}

	}

}
