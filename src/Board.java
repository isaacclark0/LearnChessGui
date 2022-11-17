import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

	public class Board extends JFrame implements ActionListener{
		//panel and buttons
		JPanel panel = new JPanel();
		JButton[][] button = new JButton[8][8];
		//all of the icons I used for the chess pieces
		
		public Icon bBishop = new ImageIcon("Bbishop.png");
		Icon bKing = new ImageIcon("Bking.png");
		Icon bKnight = new ImageIcon("Bknight.png");
		Icon bQueen = new ImageIcon("Bqueen.png");
		Icon bPawn = new ImageIcon("Bpawn.png");
		Icon bRook = new ImageIcon("Brook.png");
		Icon wRook = new ImageIcon("Wrook.png");
		Icon wBishop = new ImageIcon("Wbishop.png");
		Icon wKnight = new ImageIcon("Wknight.png");
		Icon wQueen = new ImageIcon("Wqueen.png");
		Icon wKing = new ImageIcon("Wking.png");
		Icon wPawn = new ImageIcon("Wpawn.png");
	
		//board constructor
		public Board() {
		this.setTitle("Assignmet Six");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640,640);
		    
		//after creating the board and size
		//I add a panel that has a grid layout
		//of 80pxl squares by 8
		//I made all icons 80x80 pixels
		panel = new JPanel();
	    panel.setLayout(new GridLayout(8, 8));
	    panel.setPreferredSize(new Dimension(8 * 80, 8 * 80));
	    
	    //nested for loop to add each button 
	    for (int i = 0; i < 8; i++) {
	    	for(int j = 0; j < 8; j++) {
	    		//instantiate the buttons and 
	    		//add action listeners
	    		button[i][j] = new JButton();
	    		button[i][j].setBorderPainted(false);
	    		button[i][j].setOpaque(true);
	    		button[i][j].addActionListener(this);
	    		
	    		//if statements to set colors for every
	    		//other square 
	    		
	    		if(i % 2 == 0) {
	    			if(j%2 == 0) {
	    				button[i][j].setBackground(Color.orange.darker());
	    			}else {
	    				button[i][j].setBackground(Color.gray.brighter());
	    			}
	    		} else {
	    			if(j%2 != 0) {
	    				button[i][j].setBackground(Color.orange.darker());
	    			}else {
	    				button[i][j].setBackground(Color.gray.brighter());
	    			}
	    			
	    		}
	    		//adding the buttons
	    		panel.add(button[i][j]);
	    	}
	    	
	    	
	    }
	    //I used two array lists of 0-7
	    //and then shuffles the numbers in there
	    
	    ArrayList<Integer> num1 = new ArrayList<Integer>();
		for(int i = 0; i < 8; i++) {
			num1.add(i);
		}
	    Collections.shuffle(num1);
	    
	    ArrayList<Integer> num2 = new ArrayList<Integer>();
		for(int i = 0; i < 8; i++) {
			num2.add(i);
		}
	    Collections.shuffle(num2);
	   
	    
	    //I added each button to the board at different indexes
	    //i went through the 64 possible buttons if the list were in order
	    // and then gave each button a unique index
	    //each time  the array list is shuffled before the buttons are added
	    //allowing for unique positions every time the program is run
	    
	    button[num1.get(0)][num2.get(0)].setIcon(bKing);
	    button[num1.get(1)][num2.get(1)].setIcon(wKing);
	    
	    button[num1.get(2)][num2.get(2)].setIcon(bQueen);
	    button[num1.get(3)][num2.get(3)].setIcon(wQueen);
	    
	    button[num1.get(4)][num2.get(4)].setIcon(bRook);
	    button[num1.get(5)][num2.get(5)].setIcon(bRook);
	    button[num1.get(6)][num2.get(6)].setIcon(wRook);
	    button[num1.get(7)][num2.get(7)].setIcon(wRook);
	   
	    button[num1.get(1)][num2.get(7)].setIcon(wKnight);
	    button[num1.get(2)][num2.get(6)].setIcon(wKnight);
	    button[num1.get(3)][num2.get(5)].setIcon(bKnight);
	    button[num1.get(4)][num2.get(3)].setIcon(bKnight);
	    
	    button[num1.get(3)][num2.get(4)].setIcon(wBishop);
	    button[num1.get(5)][num2.get(3)].setIcon(wBishop);
	    button[num1.get(6)][num2.get(2)].setIcon(bBishop);
	    button[num1.get(7)][num2.get(1)].setIcon(bBishop);
	    
	    button[num1.get(7)][num2.get(0)].setIcon(wPawn);
	    button[num1.get(6)][num2.get(4)].setIcon(wPawn);
	    button[num1.get(1)][num2.get(4)].setIcon(wPawn);
	    button[num1.get(2)][num2.get(5)].setIcon(wPawn);
	    button[num1.get(3)][num2.get(7)].setIcon(wPawn);
	    button[num1.get(4)][num2.get(6)].setIcon(wPawn);
	    button[num1.get(6)][num2.get(1)].setIcon(wPawn);
	    button[num1.get(0)][num2.get(2)].setIcon(wPawn);
	    
	    button[num1.get(0)][num2.get(3)].setIcon(bPawn);
	    button[num1.get(1)][num2.get(6)].setIcon(bPawn);
	    button[num1.get(2)][num2.get(4)].setIcon(bPawn);
	    button[num1.get(3)][num2.get(1)].setIcon(bPawn);
	    button[num1.get(4)][num2.get(2)].setIcon(bPawn);
	    button[num1.get(5)][num2.get(7)].setIcon(bPawn);
	    button[num1.get(6)][num2.get(0)].setIcon(bPawn);
	    button[num1.get(7)][num2.get(5)].setIcon(bPawn);
	   
	    
	    //add panel and set visable
	    this.add(panel);
	    this.setVisible(true);
	    
	  }
		//action listener for the buttons
		
		
		
		
		
		
	
		public void actionPerformed(ActionEvent e) {
			//each time a button is clicked all the squares reset their color
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					if(i % 2 == 0) {
		    			if(j%2 == 0) {
		    				button[i][j].setBackground(Color.orange.darker());
		    			}else {
		    				button[i][j].setBackground(Color.gray.brighter());
		    			}
		    		} else {
		    			if(j%2 != 0) {
		    				button[i][j].setBackground(Color.orange.darker());
		    			}else {
		    				button[i][j].setBackground(Color.gray.brighter());
		    			}
		    			
		    		}
				}
				}
			//nested for loop to get through each possible button
			
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					
					
					//if the buttons icon is null
					//then we konw that it has no icon and an empty square
					//opens up the info about the chess pieces 
					
					//I then follow this logic for each piece
					//I would compare the icon.toString if there was an icon 
					//associated to the possible Icons that I earlier imported.toString
					
					//Rook: I made a loop that counted to 7,
					//it then checked to see if there were null slots,
					//opposite color, or same color - it would highlight accordingly
					
					//Pawn: If statement that made sure we did not go out of bounds,
					//then it would increment down 1 if white or up 1 if black if null slot
					//if there were opposite color pieces in diagnol slots in the corresponding 
					//direction it would attack
					
					//Bishop: Same as the rook but it used both I and J
					
					//Knight: I created bounds first then I would
					//check if there were null or opposite color pieces in the
					//slots that were up 2 over 1 or up 1 over to in all directions
					
					//Queen: used pawn logic and expanded it in all directions
					//King: used the bishop and rook logic 
					
					if(e.getSource() == button[i][j] && button[i][j].getIcon() == null) {
						
						new Info();
						
					}else if(e.getSource() == button[i][j] && (button[i][j].getIcon() == wRook)) {
							
							int count = i;
							int temp = i;
							while(count < 7) {
								if(button[temp + 1][j].getIcon() == null) {
									button[temp+1][j].setBackground(Color.red.brighter());
								}
								if(button[temp + 1][j].getIcon() == bKnight
										|| button[temp + 1][j].getIcon() == bPawn
										|| button[temp + 1][j].getIcon() == bQueen
										|| button[temp + 1][j].getIcon() == bKing
										|| button[temp + 1][j].getIcon() == bBishop
										|| button[temp + 1][j].getIcon() == bRook) {
									button[temp + 1][j].setBackground(Color.red.brighter());
									break;
								}
								if(button[temp + 1][j].getIcon() == wKnight
										|| button[temp + 1][j].getIcon() == wPawn
										|| button[temp + 1][j].getIcon() == wQueen
										|| button[temp + 1][j].getIcon() == wKing
										|| button[temp + 1][j].getIcon() == wBishop
										|| button[temp + 1][j].getIcon() == wRook) {
									break;
								}
								count++;
								temp++;
							}
							
							int count3 = j;
							int temp3 = j;
							while(count3 < 7) {
								if(button[i][temp3 + 1].getIcon() == null) {
									button[i][temp3 + 1].setBackground(Color.red.brighter());
								}
								if(button[i][temp3 + 1].getIcon() == bKnight
										|| button[i][temp3 + 1].getIcon() == bPawn
										|| button[i][temp3 + 1].getIcon() == bQueen
										|| button[i][temp3 + 1].getIcon() == bKing
										|| button[i][temp3 + 1].getIcon() == bBishop
										|| button[i][temp3 + 1].getIcon() == bRook) {
									button[i][temp3 + 1].setBackground(Color.red.brighter());
									break;
								}
								if(button[i][temp3 + 1].getIcon() == wKnight
										|| button[i][temp3 + 1].getIcon() == wPawn
										|| button[i][temp3 + 1].getIcon() == wQueen
										|| button[i][temp3 + 1].getIcon() == wKing
										|| button[i][temp3 + 1].getIcon() == wBishop
										|| button[i][temp3 + 1].getIcon() == wRook) {
									break;
								}
								count3++;
								temp3++;
							}
							
							
							int count2 = i;
							int temp2 = i;
							while(count2 > 0) {
								if(button[temp2 - 1][j].getIcon() == null) {
									button[temp2-1][j].setBackground(Color.red.brighter());
								}
								if(button[temp2 - 1][j].getIcon() == bKnight
										|| button[temp2 - 1][j].getIcon() == bPawn
										|| button[temp2 - 1][j].getIcon() == bQueen
										|| button[temp2 - 1][j].getIcon() == bKing
										|| button[temp2 - 1][j].getIcon() == bBishop
										|| button[temp2 - 1][j].getIcon() == bRook) {
									button[temp2 - 1][j].setBackground(Color.red.brighter());
									break;
								}
								if(button[temp2 - 1][j].getIcon() == wKnight
										|| button[temp2 - 1][j].getIcon() == wPawn
										|| button[temp2 - 1][j].getIcon() == wQueen
										|| button[temp2 - 1][j].getIcon() == wKing
										|| button[temp2 - 1][j].getIcon() == wBishop
										|| button[temp2 - 1][j].getIcon() == wRook) {
									break;
								}
								count2--;
								temp2--;
							}
							
							int count4 = j;
							int temp4 = j;
							while(count4 > 0) {
								if(button[i][temp4 - 1].getIcon() == null) {
									button[i][temp4 - 1].setBackground(Color.red.brighter());
								}
								if(button[i][temp4 - 1].getIcon() == bKnight
										|| button[i][temp4 - 1].getIcon() == bPawn
										|| button[i][temp4 - 1].getIcon() == bQueen
										|| button[i][temp4 - 1].getIcon() == bKing
										|| button[i][temp4 - 1].getIcon() == bBishop
										|| button[i][temp4 - 1].getIcon() == bRook) {
									button[i][temp4 - 1].setBackground(Color.red.brighter());
									break;
								}
								if(button[i][temp4 - 1].getIcon() == wKnight
										|| button[i][temp4 - 1].getIcon() == wPawn
										|| button[i][temp4 - 1].getIcon() == wQueen
										|| button[i][temp4 - 1].getIcon() == wKing
										|| button[i][temp4 - 1].getIcon() == wBishop
										|| button[i][temp4 - 1].getIcon() == wRook) {
									break;
								}
								count4--;
								temp4--;
							}
							
					}else if(e.getSource() == button[i][j] && (button[i][j].getIcon().toString() == bRook.toString())) {
						int count = i;
						int temp = i;
						while(count < 7) {
							if(button[temp + 1][j].getIcon() == null) {
								button[temp+1][j].setBackground(Color.red.brighter());
							}
							if(button[temp + 1][j].getIcon() == wKnight
									|| button[temp + 1][j].getIcon() == wPawn
									|| button[temp + 1][j].getIcon() == wQueen
									|| button[temp + 1][j].getIcon() == wKing
									|| button[temp + 1][j].getIcon() == wBishop
									|| button[temp + 1][j].getIcon() == wRook) {
								button[temp + 1][j].setBackground(Color.red.brighter());
								break;
							}
							if(button[temp + 1][j].getIcon() == bKnight
									|| button[temp + 1][j].getIcon() == bPawn
									|| button[temp + 1][j].getIcon() == bQueen
									|| button[temp + 1][j].getIcon() == bKing
									|| button[temp + 1][j].getIcon() == bBishop
									|| button[temp + 1][j].getIcon() == bRook) {
								break;
							}
							count++;
							temp++;
						}
						
						int count3 = j;
						int temp3 = j;
						while(count3 < 7) {
							if(button[i][temp3 + 1].getIcon() == null) {
								button[i][temp3 + 1].setBackground(Color.red.brighter());
							}
							if(button[i][temp3 + 1].getIcon() == wKnight
									|| button[i][temp3 + 1].getIcon() == wPawn
									|| button[i][temp3 + 1].getIcon() == wQueen
									|| button[i][temp3 + 1].getIcon() == wKing
									|| button[i][temp3 + 1].getIcon() == wBishop
									|| button[i][temp3 + 1].getIcon() == wRook) {
								button[i][temp3 + 1].setBackground(Color.red.brighter());
								break;
							}
							if(button[i][temp3 + 1].getIcon() == bKnight
									|| button[i][temp3 + 1].getIcon() == bPawn
									|| button[i][temp3 + 1].getIcon() == bQueen
									|| button[i][temp3 + 1].getIcon() == bKing
									|| button[i][temp3 + 1].getIcon() == bBishop
									|| button[i][temp3 + 1].getIcon() == bRook) {
								break;
							}
							count3++;
							temp3++;
						}
						
						
						int count2 = i;
						int temp2 = i;
						while(count2 > 0) {
							if(button[temp2 - 1][j].getIcon() == null) {
								button[temp2-1][j].setBackground(Color.red.brighter());
							}
							if(button[temp2 - 1][j].getIcon() == wKnight
									|| button[temp2 - 1][j].getIcon() == wPawn
									|| button[temp2 - 1][j].getIcon() == wQueen
									|| button[temp2 - 1][j].getIcon() == wKing
									|| button[temp2 - 1][j].getIcon() == wBishop
									|| button[temp2 - 1][j].getIcon() == wRook) {
								button[temp2 - 1][j].setBackground(Color.red.brighter());
								break;
							}
							if(button[temp2 - 1][j].getIcon() == bKnight
									|| button[temp2 - 1][j].getIcon() == bPawn
									|| button[temp2 - 1][j].getIcon() == bQueen
									|| button[temp2 - 1][j].getIcon() == bKing
									|| button[temp2 - 1][j].getIcon() == bBishop
									|| button[temp2 - 1][j].getIcon() == bRook) {
								break;
							}
							count2--;
							temp2--;
						}
						
						int count4 = j;
						int temp4 = j;
						while(count4 > 0) {
							if(button[i][temp4 - 1].getIcon() == null) {
								button[i][temp4 - 1].setBackground(Color.red.brighter());
							}
							if(button[i][temp4 - 1].getIcon() == wKnight
									|| button[i][temp4 - 1].getIcon() == wPawn
									|| button[i][temp4 - 1].getIcon() == wQueen
									|| button[i][temp4 - 1].getIcon() == wKing
									|| button[i][temp4 - 1].getIcon() == wBishop
									|| button[i][temp4 - 1].getIcon() == wRook) {
								button[i][temp4 - 1].setBackground(Color.red.brighter());
								break;
							}
							if(button[i][temp4 - 1].getIcon() == bKnight
									|| button[i][temp4 - 1].getIcon() == bPawn
									|| button[i][temp4 - 1].getIcon() == bQueen
									|| button[i][temp4 - 1].getIcon() == bKing
									|| button[i][temp4 - 1].getIcon() == bBishop
									|| button[i][temp4 - 1].getIcon() == bRook) {
								break;
							}
							count4--;
							temp4--;
						}
						
					}else if(e.getSource() == button[i][j] && (button[i][j].getIcon().toString() == wQueen.toString())) {
						if(i+1 <= 7) {
							if(button[i+1][j].getIcon() == null
									|| button[i+1][j].getIcon()== bKnight
									|| button[i+1][j].getIcon() == bPawn
									|| button[i+1][j].getIcon() == bQueen
									|| button[i+1][j].getIcon() == bKing
									|| button[i+1][j].getIcon() == bBishop
									|| button[i+1][j].getIcon() == bRook) {
							button[i+1][j].setBackground(Color.red.brighter());
							}
						}
						if(i-1 >= 0) {
							if(button[i-1][j].getIcon() == null
									|| button[i-1][j].getIcon()== bKnight
									|| button[i-1][j].getIcon() == bPawn
									|| button[i-1][j].getIcon() == bQueen
									|| button[i-1][j].getIcon() == bKing
									|| button[i-1][j].getIcon() == bBishop
									|| button[i-1][j].getIcon() == bRook) {
							button[i-1][j].setBackground(Color.red.brighter());
							}
						}
						if(j+1 <= 7) {
							if(button[i][j+1].getIcon() == null
									|| button[i][j+1].getIcon()== bKnight
									|| button[i][j+1].getIcon() == bPawn
									|| button[i][j+1].getIcon() == bQueen
									|| button[i][j+1].getIcon() == bKing
									|| button[i][j+1].getIcon() == bBishop
									|| button[i][j+1].getIcon() == bRook) {
							button[i][j+1].setBackground(Color.red.brighter());
							}
						}
						if(j-1 >= 0) {
							if(button[i][j-1].getIcon() == null
									|| button[i][j-1].getIcon()== bKnight
									|| button[i][j-1].getIcon() == bPawn
									|| button[i][j-1].getIcon() == bQueen
									|| button[i][j-1].getIcon() == bKing
									|| button[i][j-1].getIcon() == bBishop
									|| button[i][j-1].getIcon() == bRook) {
							button[i][j-1].setBackground(Color.red.brighter());
							}
						}
						if(i+1 <= 7 && j+1 <=7) {
							if(button[i+1][j+1].getIcon() == null
									|| button[i+1][j+1].getIcon()== bKnight
									|| button[i+1][j+1].getIcon() == bPawn
									|| button[i+1][j+1].getIcon() == bQueen
									|| button[i+1][j+1].getIcon() == bKing
									|| button[i+1][j+1].getIcon() == bBishop
									|| button[i+1][j+1].getIcon() == bRook) {
							button[i+1][j+1].setBackground(Color.red.brighter());
							}
						}
						if(i+1 <= 7 && j-1 >=0) {
							if(button[i+1][j-1].getIcon() == null
									|| button[i+1][j-1].getIcon()== bKnight
									|| button[i+1][j-1].getIcon() == bPawn
									|| button[i+1][j-1].getIcon() == bQueen
									|| button[i+1][j-1].getIcon() == bKing
									|| button[i+1][j-1].getIcon() == bBishop
									|| button[i+1][j-1].getIcon() == bRook) {
							button[i+1][j-1].setBackground(Color.red.brighter());
							}
						}
						if(i-1 >= 0 && j+1<=7) {
							if(button[i-1][j+1].getIcon() == null
									|| button[i-1][j+1].getIcon()== bKnight
									|| button[i-1][j+1].getIcon() == bPawn
									|| button[i-1][j+1].getIcon() == bQueen
									|| button[i-1][j+1].getIcon() == bKing
									|| button[i-1][j+1].getIcon() == bBishop
									|| button[i-1][j+1].getIcon() == bRook) {
							button[i-1][j+1].setBackground(Color.red.brighter());
							}
						}
						if(i-1 >=0 && j-1 >=0) {
							if(button[i-1][j-1].getIcon() == null
									|| button[i-1][j-1].getIcon()== bKnight
									|| button[i-1][j-1].getIcon() == bPawn
									|| button[i-1][j-1].getIcon() == bQueen
									|| button[i-1][j-1].getIcon() == bKing
									|| button[i-1][j-1].getIcon() == bBishop
									|| button[i-1][j-1].getIcon() == bRook) {
							button[i-1][j-1].setBackground(Color.red.brighter());
							}
						}
						
					}else if(e.getSource() == button[i][j] && (button[i][j].getIcon().toString() == bQueen.toString())) {
						 if(i+1 <= 7) {
							if(button[i+1][j].getIcon() == null
									|| button[i+1][j].getIcon()== wKnight
									|| button[i+1][j].getIcon() == wPawn
									|| button[i+1][j].getIcon() == wQueen
									|| button[i+1][j].getIcon() == wKing
									|| button[i+1][j].getIcon() == wBishop
									|| button[i+1][j].getIcon() == wRook) {
							button[i+1][j].setBackground(Color.red.brighter());
							}
						}
						if(i-1 >= 0) {
							if(button[i-1][j].getIcon() == null
									|| button[i-1][j].getIcon()== wKnight
									|| button[i-1][j].getIcon() == wPawn
									|| button[i-1][j].getIcon() == wQueen
									|| button[i-1][j].getIcon() == wKing
									|| button[i-1][j].getIcon() == wBishop
									|| button[i-1][j].getIcon() == wRook) {
							button[i-1][j].setBackground(Color.red.brighter());
							}
						}
						if(j+1 <= 7) {
							if(button[i][j+1].getIcon() == null
									|| button[i][j+1].getIcon()== wKnight
									|| button[i][j+1].getIcon() == wPawn
									|| button[i][j+1].getIcon() == wQueen
									|| button[i][j+1].getIcon() == wKing
									|| button[i][j+1].getIcon() == wBishop
									|| button[i][j+1].getIcon() == wRook) {
							button[i][j+1].setBackground(Color.red.brighter());
							}
						}
						if(j-1 >= 0) {
							if(button[i][j-1].getIcon() == null
									|| button[i][j-1].getIcon()== wKnight
									|| button[i][j-1].getIcon() == wPawn
									|| button[i][j-1].getIcon() == wQueen
									|| button[i][j-1].getIcon() == wKing
									|| button[i][j-1].getIcon() == wBishop
									|| button[i][j-1].getIcon() == wRook) {
							button[i][j-1].setBackground(Color.red.brighter());
							}
						}
						if(i+1 <= 7 && j+1 <=7) {
							if(button[i+1][j+1].getIcon() == null
									|| button[i+1][j+1].getIcon()== wKnight
									|| button[i+1][j+1].getIcon() == wPawn
									|| button[i+1][j+1].getIcon() == wQueen
									|| button[i+1][j+1].getIcon() == wKing
									|| button[i+1][j+1].getIcon() == wBishop
									|| button[i+1][j+1].getIcon() == wRook) {
							button[i+1][j+1].setBackground(Color.red.brighter());
							}
						}
						if(i+1 <= 7 && j-1 >=0) {
							if(button[i+1][j-1].getIcon() == null
									|| button[i+1][j-1].getIcon()== wKnight
									|| button[i+1][j-1].getIcon() == wPawn
									|| button[i+1][j-1].getIcon() == wQueen
									|| button[i+1][j-1].getIcon() == wKing
									|| button[i+1][j-1].getIcon() == wBishop
									|| button[i+1][j-1].getIcon() == wRook) {
							button[i+1][j-1].setBackground(Color.red.brighter());
							}
						}
						if(i-1 >= 0 && j+1<=7) {
							if(button[i-1][j+1].getIcon() == null
									|| button[i-1][j+1].getIcon()== wKnight
									|| button[i-1][j+1].getIcon() == wPawn
									|| button[i-1][j+1].getIcon() == wQueen
									|| button[i-1][j+1].getIcon() == wKing
									|| button[i-1][j+1].getIcon() == wBishop
									|| button[i-1][j+1].getIcon() == wRook) {
							button[i-1][j+1].setBackground(Color.red.brighter());
							}
						}
						if(i-1 >=0 && j-1 >=0) {
							if(button[i-1][j-1].getIcon() == null
									|| button[i-1][j-1].getIcon()== wKnight
									|| button[i-1][j-1].getIcon() == wPawn
									|| button[i-1][j-1].getIcon() == wQueen
									|| button[i-1][j-1].getIcon() == wKing
									|| button[i-1][j-1].getIcon() == wBishop
									|| button[i-1][j-1].getIcon() == wRook) {
							button[i-1][j-1].setBackground(Color.red.brighter());
							}
						}
						
					}else if(e.getSource() == button[i][j] && (button[i][j].getIcon().toString() == wKing.toString())) {
						//line movement
						int count = i;
						int temp = i;
						while(count < 7) {
							if(button[temp + 1][j].getIcon() == null) {
								button[temp+1][j].setBackground(Color.red.brighter());
							}
							if(button[temp + 1][j].getIcon() == bKnight
									|| button[temp + 1][j].getIcon() == bPawn
									|| button[temp + 1][j].getIcon() == bQueen
									|| button[temp + 1][j].getIcon() == bKing
									|| button[temp + 1][j].getIcon() == bBishop
									|| button[temp + 1][j].getIcon() == bRook) {
								button[temp + 1][j].setBackground(Color.red.brighter());
								break;
							}
							if(button[temp + 1][j].getIcon() == wKnight
									|| button[temp + 1][j].getIcon() == wPawn
									|| button[temp + 1][j].getIcon() == wQueen
									|| button[temp + 1][j].getIcon() == wKing
									|| button[temp + 1][j].getIcon() == wBishop
									|| button[temp + 1][j].getIcon() == wRook) {
								break;
							}
							count++;
							temp++;
						}
						
						int count3 = j;
						int temp3 = j;
						while(count3 < 7) {
							if(button[i][temp3 + 1].getIcon() == null) {
								button[i][temp3 + 1].setBackground(Color.red.brighter());
							}
							if(button[i][temp3 + 1].getIcon() == bKnight
									|| button[i][temp3 + 1].getIcon() == bPawn
									|| button[i][temp3 + 1].getIcon() == bQueen
									|| button[i][temp3 + 1].getIcon() == bKing
									|| button[i][temp3 + 1].getIcon() == bBishop
									|| button[i][temp3 + 1].getIcon() == bRook) {
								button[i][temp3 + 1].setBackground(Color.red.brighter());
								break;
							}
							if(button[i][temp3 + 1].getIcon() == wKnight
									|| button[i][temp3 + 1].getIcon() == wPawn
									|| button[i][temp3 + 1].getIcon() == wQueen
									|| button[i][temp3 + 1].getIcon() == wKing
									|| button[i][temp3 + 1].getIcon() == wBishop
									|| button[i][temp3 + 1].getIcon() == wRook) {
								break;
							}
							count3++;
							temp3++;
						}
						
						
						int count2 = i;
						int temp2 = i;
						while(count2 > 0) {
							if(button[temp2 - 1][j].getIcon() == null) {
								button[temp2-1][j].setBackground(Color.red.brighter());
							}
							if(button[temp2 - 1][j].getIcon() == bKnight
									|| button[temp2 - 1][j].getIcon() == bPawn
									|| button[temp2 - 1][j].getIcon() == bQueen
									|| button[temp2 - 1][j].getIcon() == bKing
									|| button[temp2 - 1][j].getIcon() == bBishop
									|| button[temp2 - 1][j].getIcon() == bRook) {
								button[temp2 - 1][j].setBackground(Color.red.brighter());
								break;
							}
							if(button[temp2 - 1][j].getIcon() == wKnight
									|| button[temp2 - 1][j].getIcon() == wPawn
									|| button[temp2 - 1][j].getIcon() == wQueen
									|| button[temp2 - 1][j].getIcon() == wKing
									|| button[temp2 - 1][j].getIcon() == wBishop
									|| button[temp2 - 1][j].getIcon() == wRook) {
								break;
							}
							count2--;
							temp2--;
						}
						
						int count4 = j;
						int temp4 = j;
						while(count4 > 0) {
							if(button[i][temp4 - 1].getIcon() == null) {
								button[i][temp4 - 1].setBackground(Color.red.brighter());
							}
							if(button[i][temp4 - 1].getIcon() == bKnight
									|| button[i][temp4 - 1].getIcon() == bPawn
									|| button[i][temp4 - 1].getIcon() == bQueen
									|| button[i][temp4 - 1].getIcon() == bKing
									|| button[i][temp4 - 1].getIcon() == bBishop
									|| button[i][temp4 - 1].getIcon() == bRook) {
								button[i][temp4 - 1].setBackground(Color.red.brighter());
								break;
							}
							if(button[i][temp4 - 1].getIcon() == wKnight
									|| button[i][temp4 - 1].getIcon() == wPawn
									|| button[i][temp4 - 1].getIcon() == wQueen
									|| button[i][temp4 - 1].getIcon() == wKing
									|| button[i][temp4 - 1].getIcon() == wBishop
									|| button[i][temp4 - 1].getIcon() == wRook) {
								break;
							}
							count4--;
							temp4--;
						}
						//diagnol movement
						int countD = i;
						int count2D = j;
						int tempD = i;
						int temp2D = j;
						while(countD < 7 && count2D < 7) {
							if(button[tempD + 1][temp2D+1].getIcon() == null) {
								button[tempD+1][temp2D+1].setBackground(Color.red.brighter());
							}
							if(button[tempD + 1][temp2D+1].getIcon() == bKnight
									|| button[tempD + 1][temp2D+1].getIcon() == bPawn
									|| button[tempD + 1][temp2D+1].getIcon() == bQueen
									|| button[tempD + 1][temp2D+1].getIcon() == bKing
									|| button[tempD + 1][temp2D+1].getIcon() == bBishop
									|| button[tempD + 1][temp2D+1].getIcon() == bRook) {
								button[tempD + 1][temp2D+1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempD + 1][temp2D+1].getIcon() == wKnight
									|| button[tempD + 1][temp2D+1].getIcon() == wPawn
									|| button[tempD + 1][temp2D+1].getIcon() == wQueen
									|| button[tempD + 1][temp2D+1].getIcon() == wKing
									|| button[tempD + 1][temp2D+1].getIcon() == wBishop
									|| button[tempD + 1][temp2D+1].getIcon() == wRook) {
								break;
							}
							countD++;
							count2D++;
							tempD++;
							temp2D++;
						}
						
						int countA = i;
						int count2A = j;
						int tempA = i;
						int temp2A = j;
						while(countA < 7 && count2A > 0) {
							if(button[tempA + 1][temp2A-1].getIcon() == null) {
								button[tempA+1][temp2A-1].setBackground(Color.red.brighter());
							}
							if(button[tempA + 1][temp2A-1].getIcon() == bKnight
									|| button[tempA + 1][temp2A-1].getIcon() == bPawn
									|| button[tempA + 1][temp2A-1].getIcon() == bQueen
									|| button[tempA + 1][temp2A-1].getIcon() == bKing
									|| button[tempA + 1][temp2A-1].getIcon() == bBishop
									|| button[tempA + 1][temp2A-1].getIcon() == bRook) {
								button[tempA + 1][temp2A-1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempA + 1][temp2A-1].getIcon() == wKnight
									|| button[tempA + 1][temp2A-1].getIcon() == wPawn
									|| button[tempA + 1][temp2A-1].getIcon() == wQueen
									|| button[tempA + 1][temp2A-1].getIcon() == wKing
									|| button[tempA + 1][temp2A-1].getIcon() == wBishop
									|| button[tempA + 1][temp2A-1].getIcon() == wRook) {
								break;
							}
							countA++;
							count2A--;
							tempA++;
							temp2A--;
						}
						
						int countB = i;
						int count2B = j;
						int tempB = i;
						int temp2B = j;
						while(countB > 0 && count2B > 0) {
							if(button[tempB- 1][temp2B-1].getIcon() == null) {
								button[tempB-1][temp2B-1].setBackground(Color.red.brighter());
							}
							if(button[tempB-1][temp2B-1].getIcon() == bKnight
									|| button[tempB-1][temp2B-1].getIcon() == bPawn
									|| button[tempB-1][temp2B-1].getIcon() == bQueen
									|| button[tempB-1][temp2B-1].getIcon() == bKing
									|| button[tempB-1][temp2B-1].getIcon() == bBishop
									|| button[tempB-1][temp2B-1].getIcon() == bRook) {
								button[tempB-1][temp2B-1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempB-1][temp2B-1].getIcon() == wKnight
									|| button[tempB-1][temp2B-1].getIcon() == wPawn
									|| button[tempB-1][temp2B-1].getIcon() == wQueen
									|| button[tempB-1][temp2B-1].getIcon() == wKing
									|| button[tempB-1][temp2B-1].getIcon() == wBishop
									|| button[tempB-1][temp2B-1].getIcon() == wRook) {
								break;
							}
							countB--;
							count2B--;
							tempB--;
							temp2B--;
						}
						
						int countC = i;
						int count2C = j;
						int tempC = i;
						int temp2C = j;
						while(countC > 0 && count2C <7) {
							if(button[tempC- 1][temp2C+1].getIcon() == null) {
								button[tempC-1][temp2C+1].setBackground(Color.red.brighter());
							}
							if(button[tempC-1][temp2C+1].getIcon() == bKnight
									|| button[tempC-1][temp2C+1].getIcon() == bPawn
									|| button[tempC-1][temp2C+1].getIcon() == bQueen
									|| button[tempC-1][temp2C+1].getIcon() == bKing
									|| button[tempC-1][temp2C+1].getIcon() == bBishop
									|| button[tempC-1][temp2C+1].getIcon() == bRook) {
								button[tempC-1][temp2C+1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempC-1][temp2C+1].getIcon() == wKnight
									|| button[tempC-1][temp2C+1].getIcon() == wPawn
									|| button[tempC-1][temp2C+1].getIcon() == wQueen
									|| button[tempC-1][temp2C+1].getIcon() == wKing
									|| button[tempC-1][temp2C+1].getIcon() == wBishop
									|| button[tempC-1][temp2C+1].getIcon() == wRook) {
								break;
							}
							countC--;
							count2C++;
							tempC--;
							temp2C++;
						}
					}else if(e.getSource() == button[i][j] && (button[i][j].getIcon().toString() == wPawn.toString())) {
						
						if(i+1 <= 7) {
							if(button[i+1][j].getIcon() == null) {
							button[i+1][j].setBackground(Color.red.brighter());
							}
						}
						if(i+1<=7 && j+1<=7) {
							if(button[i+1][j+1].getIcon()== bKnight
								|| button[i+1][j+1].getIcon() == bPawn
								|| button[i+1][j+1].getIcon() == bQueen
								|| button[i+1][j+1].getIcon() == bKing
								|| button[i+1][j+1].getIcon() == bBishop
								|| button[i+1][j+1].getIcon() == bRook) {
							button[i+1][j+1].setBackground(Color.red.brighter());
							} 
						}
						if(i+1<=7 && j-1 >=0) {
							if(button[i+1][j-1].getIcon() == bKnight
								|| button[i+1][j-1].getIcon() == bPawn
								|| button[i+1][j-1].getIcon() == bQueen
								|| button[i+1][j-1].getIcon() == bKing
								|| button[i+1][j-1].getIcon() == bBishop
								|| button[i+1][j-1].getIcon() == bRook) {
							button[i+1][j-1].setBackground(Color.red.brighter());
							}
						}
							
							
							
					}else if(e.getSource() == button[i][j] && (button[i][j].getIcon().toString() == bPawn.toString())) {
						
						if(i-1 >= 0) {
							if(button[i-1][j].getIcon() == null) {
							button[i-1][j].setBackground(Color.red.brighter());
							}
						}
						if(i-1 >=0 && j+1 <= 7) {
							if(button[i-1][j+1].getIcon() == wKnight
								|| button[i-1][j+1].getIcon() == wPawn
								|| button[i-1][j+1].getIcon() == wQueen
								|| button[i-1][j+1].getIcon() == wKing
								|| button[i-1][j+1].getIcon() == wBishop
								|| button[i-1][j+1].getIcon() == wRook) {
							button[i-1][j+1].setBackground(Color.red.brighter());
							} 
						}
						if(i-1 >= 0 && j-1 >=0) {
							if(button[i-1][j-1].getIcon() == wKnight
								||button[i-1][j-1].getIcon() == wPawn
								|| button[i-1][j-1].getIcon() == wQueen
								|| button[i-1][j-1].getIcon() == wKing
								|| button[i-1][j-1].getIcon() == wBishop
								|| button[i-1][j-1].getIcon() == wRook) {
							button[i-1][j-1].setBackground(Color.red.brighter());
							}
						}
						
					}else if(e.getSource() == button[i][j] && (button[i][j].getIcon().toString() == wKnight.toString())) {
						if(i-2 <= 7 && j + 1 <= 7 && i-2 >= 0 && j + 1 >= 0) {
							if(button[i-2][j+1].getIcon() == null  
								||button[i-2][j+1].getIcon() == bPawn
								||button[i-2][j+1].getIcon() == bKing
								||button[i-2][j+1].getIcon() == bQueen
								||button[i-2][j+1].getIcon() == bBishop
								||button[i-2][j+1].getIcon()== bRook
								||button[i-2][j+1].getIcon() == bKnight ) {
							button[i-2][j+1].setBackground(Color.red.brighter());
							}
						}
						if(i-2 <= 7 && j - 1 <= 7 && i-2 >= 0 && j - 1 >= 0) {
							if(button[i-2][j-1].getIcon() == null
								||button[i-2][j-1].getIcon() == bPawn
								||button[i-2][j-1].getIcon() == bKing
								||button[i-2][j-1].getIcon() == bQueen
								||button[i-2][j-1].getIcon() == bBishop
								||button[i-2][j-1].getIcon() == bRook
								||button[i-2][j-1].getIcon() == bKnight) {
							button[i-2][j-1].setBackground(Color.red.brighter());
							}
						}
						if(i+2 <= 7 && j - 1 <= 7 && i+2 >= 0 && j - 1 >= 0) {
							if(button[i+2][j-1].getIcon() == null
								||button[i+2][j-1].getIcon() == bPawn
								||button[i+2][j-1].getIcon() == bKing
								||button[i+2][j-1].getIcon() == bQueen
								||button[i+2][j-1].getIcon() == bBishop
								||button[i+2][j-1].getIcon() == bRook
								||button[i+2][j-1].getIcon() == bKnight) {
							button[i+2][j-1].setBackground(Color.red.brighter());
							}
						}
						if(i+2 <= 7 && j + 1 <= 7 && i+2 >= 0 && j + 1 >= 0) {
							if(button[i+2][j+1].getIcon() == null
								||button[i+2][j+1].getIcon() == bPawn
								||button[i+2][j+1].getIcon() == bKing
								||button[i+2][j+1].getIcon() == bQueen
								||button[i+2][j+1].getIcon()== bBishop
								||button[i+2][j+1].getIcon()== bRook
								||button[i+2][j+1].getIcon()== bKnight) {
							button[i+2][j+1].setBackground(Color.red.brighter());
							}
						}
						if(i+1 <= 7 && j + 2 <= 7 && i+1 >= 0 && j + 2 >= 0){
							if(button[i+1][j+2].getIcon() == null
								||button[i+1][j+2].getIcon() == bPawn
								||button[i+1][j+2].getIcon() == bKing
								||button[i+1][j+2].getIcon() == bQueen
								||button[i+1][j+2].getIcon() == bBishop
								||button[i+1][j+2].getIcon() == bRook
								|button[i+1][j+2].getIcon()== bKnight) {
							button[i+1][j+2].setBackground(Color.red.brighter());
							}
						}
						if(i+1 <= 7 && j-2 <= 7 && i+1 >= 0 && j-2 >= 0) {
							if(button[i+1][j-2].getIcon() == null 
								||button[i+1][j-2].getIcon() == bPawn
								||button[i+1][j-2].getIcon() == bKing
								||button[i+1][j-2].getIcon() == bQueen
								||button[i+1][j-2].getIcon() == bBishop
								||button[i+1][j-2].getIcon() == bRook
								||button[i+1][j-2].getIcon()== bKnight) {
							button[i+1][j-2].setBackground(Color.red.brighter());
							}
						}
						if(i-1 <= 7 && j + 2 <= 7 && i-1 >= 0 && j + 2 >= 0) {
							if(button[i-1][j+2].getIcon() == null
								||button[i-1][j+2].getIcon() == bPawn
								||button[i-1][j+2].getIcon() == bKing
								||button[i-1][j+2].getIcon() == bQueen
								||button[i-1][j+2].getIcon() == bBishop
								||button[i-1][j+2].getIcon() == bRook
								||button[i-1][j+2].getIcon() == bKnight) {
							button[i-1][j+2].setBackground(Color.red.brighter());
							}
						}
						if(i-1 <= 7 && j-2 <= 7 && i-1 >= 0 && j-2 >= 0) {
							if(button[i-1][j-2].getIcon() == null
								||button[i-1][j-2].getIcon() == bPawn
								||button[i-1][j-2].getIcon() == bKing
								||button[i-1][j-2].getIcon() == bQueen
								||button[i-1][j-2].getIcon()== bBishop
								||button[i-1][j-2].getIcon() == bRook
								||button[i-1][j-2].getIcon() == bKnight) {
							button[i-1][j-2].setBackground(Color.red.brighter());
							}
						}
						
					}else if(e.getSource() == button[i][j] && (button[i][j].getIcon().toString() == bKnight.toString())) {
						if(i-2 <= 7 && j + 1 <= 7 && i-2 >= 0 && j + 1 >= 0) {
							if(button[i-2][j+1].getIcon() == null  
								||button[i-2][j+1].getIcon() == wPawn
								||button[i-2][j+1].getIcon() == wKing
								||button[i-2][j+1].getIcon() == wQueen
								||button[i-2][j+1].getIcon() == wBishop
								||button[i-2][j+1].getIcon() == wRook
								||button[i-2][j+1].getIcon() == wKnight ) {
							button[i-2][j+1].setBackground(Color.red.brighter());
							}
						}
						if(i-2 <= 7 && j - 1 <= 7 && i-2 >= 0 && j - 1 >= 0) {
							if(button[i-2][j-1].getIcon() == null
								||button[i-2][j-1].getIcon() == wPawn
								||button[i-2][j-1].getIcon() == wKing
								||button[i-2][j-1].getIcon()== wQueen
								||button[i-2][j-1].getIcon() == wBishop
								||button[i-2][j-1].getIcon() == wRook
								||button[i-2][j-1].getIcon() == wKnight) {
							button[i-2][j-1].setBackground(Color.red.brighter());
							}
						}
						if(i+2 <= 7 && j - 1 <= 7 && i+2 >= 0 && j - 1 >= 0) {
							if(button[i+2][j-1].getIcon() == null
								||button[i+2][j-1].getIcon() == wPawn
								||button[i+2][j-1].getIcon() == wKing
								||button[i+2][j-1].getIcon()== wQueen
								||button[i+2][j-1].getIcon()== wBishop
								||button[i+2][j-1].getIcon() == wRook
								||button[i+2][j-1].getIcon() == wKnight) {
							button[i+2][j-1].setBackground(Color.red.brighter());
							}
						}
						if(i+2 <= 7 && j + 1 <= 7 && i+2 >= 0 && j + 1 >= 0) {
							if(button[i+2][j+1].getIcon() == null
								||button[i+2][j+1].getIcon() == wPawn
								||button[i+2][j+1].getIcon()== wKing
								||button[i+2][j+1].getIcon() == wQueen
								||button[i+2][j+1].getIcon() == wBishop
								||button[i+2][j+1].getIcon() == wRook
								||button[i+2][j+1].getIcon() == wKnight) {
							button[i+2][j+1].setBackground(Color.red.brighter());
							}
						}
						if(i+1 <= 7 && j + 2 <= 7 && i+1 >= 0 && j + 2 >= 0){
							if(button[i+1][j+2].getIcon() == null
								||button[i+1][j+2].getIcon() == wPawn
								||button[i+1][j+2].getIcon() == wKing
								||button[i+1][j+2].getIcon()== wQueen
								||button[i+1][j+2].getIcon() == wBishop
								||button[i+1][j+2].getIcon() == wRook
								|button[i+1][j+2].getIcon() == wKnight) {
							button[i+1][j+2].setBackground(Color.red.brighter());
							}
						}
						if(i+1 <= 7 && j-2 <= 7 && i+1 >= 0 && j-2 >= 0) {
							if(button[i+1][j-2].getIcon() == null 
								||button[i+1][j-2].getIcon() == wPawn
								||button[i+1][j-2].getIcon() == wKing
								||button[i+1][j-2].getIcon()== wQueen
								||button[i+1][j-2].getIcon() == wBishop
								||button[i+1][j-2].getIcon() == wRook
								||button[i+1][j-2].getIcon() == wKnight) {
							button[i+1][j-2].setBackground(Color.red.brighter());
							}
						}
						if(i-1 <= 7 && j + 2 <= 7 && i-1 >= 0 && j + 2 >= 0) {
							if(button[i-1][j+2].getIcon() == null
								||button[i-1][j+2].getIcon() == wPawn
								||button[i-1][j+2].getIcon() == wKing
								||button[i-1][j+2].getIcon() == wQueen
								||button[i-1][j+2].getIcon() == wBishop
								||button[i-1][j+2].getIcon() == wRook
								||button[i-1][j+2].getIcon() == wKnight) {
							button[i-1][j+2].setBackground(Color.red.brighter());
							}
						}
						if(i-1 <= 7 && j-2 <= 7 && i-1 >= 0 && j-2 >= 0) {
							if(button[i-1][j-2].getIcon() == null
								||button[i-1][j-2].getIcon() == wPawn
								||button[i-1][j-2].getIcon() == wKing
								||button[i-1][j-2].getIcon() == wQueen
								||button[i-1][j-2].getIcon() == wBishop
								||button[i-1][j-2].getIcon() == wRook
								||button[i-1][j-2].getIcon() == wKnight) {
							button[i-1][j-2].setBackground(Color.red.brighter());
							}
						}
						
					}else if(e.getSource() == button[i][j] && (button[i][j].getIcon().toString() == wBishop.toString())) {
						int count = i;
						int count2 = j;
						int temp = i;
						int temp2 = j;
						while(count < 7 && count2 < 7) {
							if(button[temp + 1][temp2+1].getIcon() == null) {
								button[temp+1][temp2+1].setBackground(Color.red.brighter());
							}
							if(button[temp + 1][temp2+1].getIcon() == bKnight
									|| button[temp + 1][temp2+1].getIcon() == bPawn
									|| button[temp + 1][temp2+1].getIcon() == bQueen
									|| button[temp + 1][temp2+1].getIcon() == bKing
									|| button[temp + 1][temp2+1].getIcon() == bBishop
									|| button[temp + 1][temp2+1].getIcon() == bRook) {
								button[temp + 1][temp2+1].setBackground(Color.red.brighter());
								break;
							}
							if(button[temp + 1][temp2+1].getIcon() == wKnight
									|| button[temp + 1][temp2+1].getIcon() == wPawn
									|| button[temp + 1][temp2+1].getIcon() == wQueen
									|| button[temp + 1][temp2+1].getIcon() == wKing
									|| button[temp + 1][temp2+1].getIcon() == wBishop
									|| button[temp + 1][temp2+1].getIcon() == wRook) {
								break;
							}
							count++;
							count2++;
							temp++;
							temp2++;
						}
						
						int countA = i;
						int count2A = j;
						int tempA = i;
						int temp2A = j;
						while(countA < 7 && count2A > 0) {
							if(button[tempA + 1][temp2A-1].getIcon() == null) {
								button[tempA+1][temp2A-1].setBackground(Color.red.brighter());
							}
							if(button[tempA + 1][temp2A-1].getIcon() == bKnight
									|| button[tempA + 1][temp2A-1].getIcon() == bPawn
									|| button[tempA + 1][temp2A-1].getIcon() == bQueen
									|| button[tempA + 1][temp2A-1].getIcon() == bKing
									|| button[tempA + 1][temp2A-1].getIcon() == bBishop
									|| button[tempA + 1][temp2A-1].getIcon() == bRook) {
								button[tempA + 1][temp2A-1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempA + 1][temp2A-1].getIcon() == wKnight
									|| button[tempA + 1][temp2A-1].getIcon() == wPawn
									|| button[tempA + 1][temp2A-1].getIcon() == wQueen
									|| button[tempA + 1][temp2A-1].getIcon() == wKing
									|| button[tempA + 1][temp2A-1].getIcon() == wBishop
									|| button[tempA + 1][temp2A-1].getIcon() == wRook) {
								break;
							}
							countA++;
							count2A--;
							tempA++;
							temp2A--;
						}
						
						int countB = i;
						int count2B = j;
						int tempB = i;
						int temp2B = j;
						while(countB > 0 && count2B > 0) {
							if(button[tempB- 1][temp2B-1].getIcon() == null) {
								button[tempB-1][temp2B-1].setBackground(Color.red.brighter());
							}
							if(button[tempB-1][temp2B-1].getIcon() == bKnight
									|| button[tempB-1][temp2B-1].getIcon() == bPawn
									|| button[tempB-1][temp2B-1].getIcon() == bQueen
									|| button[tempB-1][temp2B-1].getIcon() == bKing
									|| button[tempB-1][temp2B-1].getIcon() == bBishop
									|| button[tempB-1][temp2B-1].getIcon() == bRook) {
								button[tempB-1][temp2B-1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempB-1][temp2B-1].getIcon() == wKnight
									|| button[tempB-1][temp2B-1].getIcon() == wPawn
									|| button[tempB-1][temp2B-1].getIcon() == wQueen
									|| button[tempB-1][temp2B-1].getIcon() == wKing
									|| button[tempB-1][temp2B-1].getIcon() == wBishop
									|| button[tempB-1][temp2B-1].getIcon() == wRook) {
								break;
							}
							countB--;
							count2B--;
							tempB--;
							temp2B--;
						}
						
						int countC = i;
						int count2C = j;
						int tempC = i;
						int temp2C = j;
						while(countC > 0 && count2C <7) {
							if(button[tempC- 1][temp2C+1].getIcon() == null) {
								button[tempC-1][temp2C+1].setBackground(Color.red.brighter());
							}
							if(button[tempC-1][temp2C+1].getIcon() == bKnight
									|| button[tempC-1][temp2C+1].getIcon() == bPawn
									|| button[tempC-1][temp2C+1].getIcon() == bQueen
									|| button[tempC-1][temp2C+1].getIcon() == bKing
									|| button[tempC-1][temp2C+1].getIcon() == bBishop
									|| button[tempC-1][temp2C+1].getIcon() == bRook) {
								button[tempC-1][temp2C+1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempC-1][temp2C+1].getIcon() == wKnight
									|| button[tempC-1][temp2C+1].getIcon() == wPawn
									|| button[tempC-1][temp2C+1].getIcon() == wQueen
									|| button[tempC-1][temp2C+1].getIcon() == wKing
									|| button[tempC-1][temp2C+1].getIcon() == wBishop
									|| button[tempC-1][temp2C+1].getIcon() == wRook) {
								break;
							}
							countC--;
							count2C++;
							tempC--;
							temp2C++;
						}
						
						
					}else if(e.getSource() == button[i][j] && (button[i][j].getIcon().toString() == bBishop.toString())) {
						int count = i;
						int count2 = j;
						int temp = i;
						int temp2 = j;
						while(count < 7 && count2 < 7) {
							if(button[temp + 1][temp2+1].getIcon() == null) {
								button[temp+1][temp2+1].setBackground(Color.red.brighter());
							}
							if(button[temp + 1][temp2+1].getIcon() == wKnight
									|| button[temp + 1][temp2+1].getIcon() == wPawn
									|| button[temp + 1][temp2+1].getIcon() == wQueen
									|| button[temp + 1][temp2+1].getIcon() == wKing
									|| button[temp + 1][temp2+1].getIcon() == wBishop
									|| button[temp + 1][temp2+1].getIcon() == wRook) {
								button[temp + 1][temp2+1].setBackground(Color.red.brighter());
								break;
							}
							if(button[temp + 1][temp2+1].getIcon() == bKnight
									|| button[temp + 1][temp2+1].getIcon() == bPawn
									|| button[temp + 1][temp2+1].getIcon() == bQueen
									|| button[temp + 1][temp2+1].getIcon() == bKing
									|| button[temp + 1][temp2+1].getIcon() == bBishop
									|| button[temp + 1][temp2+1].getIcon() == bRook) {
								break;
							}
							count++;
							count2++;
							temp++;
							temp2++;
						}
						
						int countA = i;
						int count2A = j;
						int tempA = i;
						int temp2A = j;
						while(countA < 7 && count2A > 0) {
							if(button[tempA + 1][temp2A-1].getIcon() == null) {
								button[tempA+1][temp2A-1].setBackground(Color.red.brighter());
							}
							if(button[tempA + 1][temp2A-1].getIcon() == wKnight
									|| button[tempA + 1][temp2A-1].getIcon() == wPawn
									|| button[tempA + 1][temp2A-1].getIcon() == wQueen
									|| button[tempA + 1][temp2A-1].getIcon() == wKing
									|| button[tempA + 1][temp2A-1].getIcon() == wBishop
									|| button[tempA + 1][temp2A-1].getIcon() == wRook) {
								button[tempA + 1][temp2A-1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempA + 1][temp2A-1].getIcon() == bKnight
									|| button[tempA + 1][temp2A-1].getIcon() == bPawn
									|| button[tempA + 1][temp2A-1].getIcon() == bQueen
									|| button[tempA + 1][temp2A-1].getIcon() == bKing
									|| button[tempA + 1][temp2A-1].getIcon() == bBishop
									|| button[tempA + 1][temp2A-1].getIcon() == bRook) {
								break;
							}
							countA++;
							count2A--;
							tempA++;
							temp2A--;
						}
						
						int countB = i;
						int count2B = j;
						int tempB = i;
						int temp2B = j;
						while(countB > 0 && count2B > 0) {
							if(button[tempB- 1][temp2B-1].getIcon() == null) {
								button[tempB-1][temp2B-1].setBackground(Color.red.brighter());
							}
							if(button[tempB-1][temp2B-1].getIcon() == wKnight
									|| button[tempB-1][temp2B-1].getIcon() == wPawn
									|| button[tempB-1][temp2B-1].getIcon() == wQueen
									|| button[tempB-1][temp2B-1].getIcon() == wKing
									|| button[tempB-1][temp2B-1].getIcon() == wBishop
									|| button[tempB-1][temp2B-1].getIcon() == wRook) {
								button[tempB-1][temp2B-1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempB-1][temp2B-1].getIcon() == bKnight
									|| button[tempB-1][temp2B-1].getIcon() == bPawn
									|| button[tempB-1][temp2B-1].getIcon() == bQueen
									|| button[tempB-1][temp2B-1].getIcon() == bKing
									|| button[tempB-1][temp2B-1].getIcon() == bBishop
									|| button[tempB-1][temp2B-1].getIcon() == bRook) {
								break;
							}
							countB--;
							count2B--;
							tempB--;
							temp2B--;
						}
						
						int countC = i;
						int count2C = j;
						int tempC = i;
						int temp2C = j;
						while(countC > 0 && count2C <7) {
							if(button[tempC- 1][temp2C+1].getIcon() == null) {
								button[tempC-1][temp2C+1].setBackground(Color.red.brighter());
							}
							if(button[tempC-1][temp2C+1].getIcon() == wKnight
									|| button[tempC-1][temp2C+1].getIcon() == wPawn
									|| button[tempC-1][temp2C+1].getIcon() == wQueen
									|| button[tempC-1][temp2C+1].getIcon() == wKing
									|| button[tempC-1][temp2C+1].getIcon() == wBishop
									|| button[tempC-1][temp2C+1].getIcon() == wRook) {
								button[tempC-1][temp2C+1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempC-1][temp2C+1].getIcon() == bKnight
									|| button[tempC-1][temp2C+1].getIcon() == bPawn
									|| button[tempC-1][temp2C+1].getIcon() == bQueen
									|| button[tempC-1][temp2C+1].getIcon() == bKing
									|| button[tempC-1][temp2C+1].getIcon() == bBishop
									|| button[tempC-1][temp2C+1].getIcon() == bRook) {
								break;
							}
							countC--;
							count2C++;
							tempC--;
							temp2C++;
						}
						
					}else if(e.getSource() == button[i][j] && (button[i][j].getIcon().toString() == bKing.toString())) {
						//line movement
						int count = i;
						int temp = i;
						while(count < 7) {
							if(button[temp + 1][j].getIcon() == null) {
								button[temp+1][j].setBackground(Color.red.brighter());
							}
							if(button[temp + 1][j].getIcon() == wKnight
									|| button[temp + 1][j].getIcon() == wPawn
									|| button[temp + 1][j].getIcon() == wQueen
									|| button[temp + 1][j].getIcon() == wKing
									|| button[temp + 1][j].getIcon() == wBishop
									|| button[temp + 1][j].getIcon() == wRook) {
								button[temp + 1][j].setBackground(Color.red.brighter());
								break;
							}
							if(button[temp + 1][j].getIcon() == bKnight
									|| button[temp + 1][j].getIcon() == bPawn
									|| button[temp + 1][j].getIcon() == bQueen
									|| button[temp + 1][j].getIcon() == bKing
									|| button[temp + 1][j].getIcon() == bBishop
									|| button[temp + 1][j].getIcon() == bRook) {
								break;
							}
							count++;
							temp++;
						}
						
						int count3 = j;
						int temp3 = j;
						while(count3 < 7) {
							if(button[i][temp3 + 1].getIcon() == null) {
								button[i][temp3 + 1].setBackground(Color.red.brighter());
							}
							if(button[i][temp3 + 1].getIcon() == wKnight
									|| button[i][temp3 + 1].getIcon() == wPawn
									|| button[i][temp3 + 1].getIcon() == wQueen
									|| button[i][temp3 + 1].getIcon() == wKing
									|| button[i][temp3 + 1].getIcon() == wBishop
									|| button[i][temp3 + 1].getIcon() == wRook) {
								button[i][temp3 + 1].setBackground(Color.red.brighter());
								break;
							}
							if(button[i][temp3 + 1].getIcon() == bKnight
									|| button[i][temp3 + 1].getIcon() == bPawn
									|| button[i][temp3 + 1].getIcon() == bQueen
									|| button[i][temp3 + 1].getIcon() == bKing
									|| button[i][temp3 + 1].getIcon() == bBishop
									|| button[i][temp3 + 1].getIcon() == bRook) {
								break;
							}
							count3++;
							temp3++;
						}
						
						
						int count2 = i;
						int temp2 = i;
						while(count2 > 0) {
							if(button[temp2 - 1][j].getIcon() == null) {
								button[temp2-1][j].setBackground(Color.red.brighter());
							}
							if(button[temp2 - 1][j].getIcon() == wKnight
									|| button[temp2 - 1][j].getIcon() == wPawn
									|| button[temp2 - 1][j].getIcon() == wQueen
									|| button[temp2 - 1][j].getIcon() == wKing
									|| button[temp2 - 1][j].getIcon() == wBishop
									|| button[temp2 - 1][j].getIcon() == wRook) {
								button[temp2 - 1][j].setBackground(Color.red.brighter());
								break;
							}
							if(button[temp2 - 1][j].getIcon() == bKnight
									|| button[temp2 - 1][j].getIcon() == bPawn
									|| button[temp2 - 1][j].getIcon() == bQueen
									|| button[temp2 - 1][j].getIcon() == bKing
									|| button[temp2 - 1][j].getIcon() == bBishop
									|| button[temp2 - 1][j].getIcon() == bRook) {
								break;
							}
							count2--;
							temp2--;
						}
						
						int count4 = j;
						int temp4 = j;
						while(count4 > 0) {
							if(button[i][temp4 - 1].getIcon() == null) {
								button[i][temp4 - 1].setBackground(Color.red.brighter());
							}
							if(button[i][temp4 - 1].getIcon() == wKnight
									|| button[i][temp4 - 1].getIcon() == wPawn
									|| button[i][temp4 - 1].getIcon() == wQueen
									|| button[i][temp4 - 1].getIcon() == wKing
									|| button[i][temp4 - 1].getIcon() == wBishop
									|| button[i][temp4 - 1].getIcon() == wRook) {
								button[i][temp4 - 1].setBackground(Color.red.brighter());
								break;
							}
							if(button[i][temp4 - 1].getIcon() == bKnight
									|| button[i][temp4 - 1].getIcon() == bPawn
									|| button[i][temp4 - 1].getIcon() == bQueen
									|| button[i][temp4 - 1].getIcon() == bKing
									|| button[i][temp4 - 1].getIcon() == bBishop
									|| button[i][temp4 - 1].getIcon() == bRook) {
								break;
							}
							count4--;
							temp4--;
						}
						//diagnol movement
						int countD = i;
						int count2D = j;
						int tempD = i;
						int temp2D = j;
						while(countD < 7 && count2D < 7) {
							if(button[tempD + 1][temp2D+1].getIcon() == null) {
								button[tempD+1][temp2D+1].setBackground(Color.red.brighter());
							}
							if(button[tempD + 1][temp2D+1].getIcon() == wKnight
									|| button[tempD + 1][temp2D+1].getIcon() == wPawn
									|| button[tempD + 1][temp2D+1].getIcon() == wQueen
									|| button[tempD + 1][temp2D+1].getIcon() == wKing
									|| button[tempD + 1][temp2D+1].getIcon() == wBishop
									|| button[tempD + 1][temp2D+1].getIcon() == wRook) {
								button[tempD + 1][temp2D+1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempD + 1][temp2D+1].getIcon() == bKnight
									|| button[tempD + 1][temp2D+1].getIcon() == bPawn
									|| button[tempD+ 1][temp2D+1].getIcon() == bQueen
									|| button[tempD + 1][temp2D+1].getIcon() == bKing
									|| button[tempD + 1][temp2D+1].getIcon() == bBishop
									|| button[tempD + 1][temp2D+1].getIcon() == bRook) {
								break;
							}
							countD++;
							count2D++;
							tempD++;
							temp2D++;
						}
						
						int countA = i;
						int count2A = j;
						int tempA = i;
						int temp2A = j;
						while(countA < 7 && count2A > 0) {
							if(button[tempA + 1][temp2A-1].getIcon() == null) {
								button[tempA+1][temp2A-1].setBackground(Color.red.brighter());
							}
							if(button[tempA + 1][temp2A-1].getIcon() == wKnight
									|| button[tempA + 1][temp2A-1].getIcon() == wPawn
									|| button[tempA + 1][temp2A-1].getIcon() == wQueen
									|| button[tempA + 1][temp2A-1].getIcon() == wKing
									|| button[tempA + 1][temp2A-1].getIcon() == wBishop
									|| button[tempA + 1][temp2A-1].getIcon() == wRook) {
								button[tempA + 1][temp2A-1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempA + 1][temp2A-1].getIcon() == bKnight
									|| button[tempA + 1][temp2A-1].getIcon() == bPawn
									|| button[tempA + 1][temp2A-1].getIcon() == bQueen
									|| button[tempA + 1][temp2A-1].getIcon() == bKing
									|| button[tempA + 1][temp2A-1].getIcon() == bBishop
									|| button[tempA + 1][temp2A-1].getIcon() == bRook) {
								break;
							}
							countA++;
							count2A--;
							tempA++;
							temp2A--;
						}
						
						int countB = i;
						int count2B = j;
						int tempB = i;
						int temp2B = j;
						while(countB > 0 && count2B > 0) {
							if(button[tempB- 1][temp2B-1].getIcon() == null) {
								button[tempB-1][temp2B-1].setBackground(Color.red.brighter());
							}
							if(button[tempB-1][temp2B-1].getIcon() == wKnight
									|| button[tempB-1][temp2B-1].getIcon() == wPawn
									|| button[tempB-1][temp2B-1].getIcon() == wQueen
									|| button[tempB-1][temp2B-1].getIcon() == wKing
									|| button[tempB-1][temp2B-1].getIcon() == wBishop
									|| button[tempB-1][temp2B-1].getIcon() == wRook) {
								button[tempB-1][temp2B-1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempB-1][temp2B-1].getIcon() == bKnight
									|| button[tempB-1][temp2B-1].getIcon() == bPawn
									|| button[tempB-1][temp2B-1].getIcon() == bQueen
									|| button[tempB-1][temp2B-1].getIcon() == bKing
									|| button[tempB-1][temp2B-1].getIcon() == bBishop
									|| button[tempB-1][temp2B-1].getIcon() == bRook) {
								break;
							}
							countB--;
							count2B--;
							tempB--;
							temp2B--;
						}
						
						int countC = i;
						int count2C = j;
						int tempC = i;
						int temp2C = j;
						while(countC > 0 && count2C <7) {
							if(button[tempC- 1][temp2C+1].getIcon() == null) {
								button[tempC-1][temp2C+1].setBackground(Color.red.brighter());
							}
							if(button[tempC-1][temp2C+1].getIcon() == wKnight
									|| button[tempC-1][temp2C+1].getIcon() == wPawn
									|| button[tempC-1][temp2C+1].getIcon() == wQueen
									|| button[tempC-1][temp2C+1].getIcon() == wKing
									|| button[tempC-1][temp2C+1].getIcon() == wBishop
									|| button[tempC-1][temp2C+1].getIcon() == wRook) {
								button[tempC-1][temp2C+1].setBackground(Color.red.brighter());
								break;
							}
							if(button[tempC-1][temp2C+1].getIcon() == bKnight
									|| button[tempC-1][temp2C+1].getIcon() == bPawn
									|| button[tempC-1][temp2C+1].getIcon() == bQueen
									|| button[tempC-1][temp2C+1].getIcon() == bKing
									|| button[tempC-1][temp2C+1].getIcon() == bBishop
									|| button[tempC-1][temp2C+1].getIcon() == bRook) {
								break;
							}
							countC--;
							count2C++;
							tempC--;
							temp2C++;
						}
					}
				}
					
			}
		} 
	}

		
	
	

	
