import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import HW11.TicTacToe;

public class HW11_1 {
    static TicTacToe game = new TicTacToe();
    public static void main(String[] args) throws Exception {
        
        JFrame frame = new JFrame();
        JButton[][] buttons = new JButton[3][3];
        String currentPlayer = "X";
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        frame.add(panel, BorderLayout.CENTER);

        JLabel statusLabel = new JLabel("PLayer"+currentPlayer+"'s turn");
        frame.add(statusLabel, BorderLayout.SOUTH);

        for (int i = 0; i < 3; i++){
            for (int j = 0; j <3; j++){
                buttons[i][j] = new JButton();  
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 40));
                final int row = i;
                final int col = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    
                    public void actionPerformed(ActionEvent e){

                        if(game.makeMove(row, col)){
                            buttons[row][col].setText(String.valueOf(game.getCurrentPlayer()));

                            if(game.hasWinner()){
                                statusLabel.setText("Player" + currentPlayer + "wins");
                            }else if(game.isBoardFull()){
                                statusLabel.setText("It's a draw!");
                            }else{
                                game.switchPlayer();
                                statusLabel.setText("Player"+game.getCurrentPlayer()+"'s turn");
                            }
                        }
                        //JButton clickButton = (JButton) e.getSource();
                       // clickButton.setText(currentPlayer);
                    }
                });

                panel.add(buttons[i][j]);
            }
        }
        frame.setTitle("HW11");
        frame.setVisible(true); 
    }
}
