import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;


public class Info extends JFrame{
	JPanel panel = new JPanel();
	
	JLabel pawnInfo = new JLabel();
	JLabel kingInfo = new JLabel();
	JLabel queenInfo = new JLabel();
	JLabel bishopInfo = new JLabel();
	JLabel knightInfo = new JLabel();
	JLabel rookInfo = new JLabel();
	
	
	
	public Info() {
		this.setTitle("Chess Info");
		this.setSize(550,300);
		
		pawnInfo = new JLabel("Pawn one square forward after opening move and not attacking, diagnol one sqaure on attack");
		kingInfo = new JLabel("King moves any direction any amount of squares - can't jump");
		queenInfo = new JLabel("Queen moves any direction one square unless same color is in the sqaure");
		bishopInfo = new JLabel("Bishop moves diagonally any amount cannot skip pieces");
		knightInfo = new JLabel("Knight moves in L's, can jump other pieces");
		rookInfo = new JLabel("Rook moves in straight lines any amount, cannot skip pieces");
		
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new GridLayout(6,0));
		
		panel.add(pawnInfo);
		panel.add(kingInfo);
		panel.add(queenInfo);
		panel.add(bishopInfo);
		panel.add(rookInfo);
		panel.add(knightInfo);
		
		
		this.add(panel);
		this.setVisible(true);
	}
}
