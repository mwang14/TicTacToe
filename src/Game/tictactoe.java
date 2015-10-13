package Game;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class tictactoe extends JFrame {
    Util util = new Util();
    JFrame frame = new JFrame("TicTacToe");
    JPanel panel = new JPanel();
    JButton btn1 = new JButton("");
    JButton btn2 = new JButton("");
    JButton btn3 = new JButton("");
    JButton btn4 = new JButton("");
    JButton btn5 = new JButton("");
    JButton btn6 = new JButton("");
    JButton btn7 = new JButton("");
    JButton btn8 = new JButton("");
    JButton btn9 = new JButton("");
    JButton btn10 = new JButton("Play Again");
    JLabel xwins = new JLabel("X Wins");
    JLabel owins = new JLabel("O Wins");
    JLabel draw = new JLabel("DRAW");
    
    
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new tictactoe();
                }
            });
            
        }
        

    public boolean didXwin() {
        return (btn1.getText().equals("X") &&
                btn2.getText().equals("X") &&
                btn3.getText().equals("X")) ||
                (btn1.getText().equals("X") &&
                        btn5.getText().equals("X") &&
                        btn9.getText().equals("X")) ||
                        (btn1.getText().equals("X") &&
                        btn4.getText().equals("X") &&
                        btn7.getText().equals("X")) ||
                        (btn2.getText().equals("X") &&
                                btn5.getText().equals("X") &&
                                btn8.getText().equals("X")) ||
                                (btn3.getText().equals("X") &&
                                        btn6.getText().equals("X") &&
                                        btn9.getText().equals("X")) ||
                                        (btn4.getText().equals("X") &&
                                                btn5.getText().equals("X") &&
                                                btn6.getText().equals("X")) ||
                                                (btn7.getText().equals("X") &&
                                                        btn8.getText().equals("X") &&
                                                        btn9.getText().equals("X")) ||
                                                        (btn7.getText().equals("X") &&
                                                                btn5.getText().equals("X") &&
                                                                btn3.getText().equals("X"));
                        
                        
    }
    
    public boolean didOwin() {
        return (btn1.getText().equals("O") &&
                btn2.getText().equals("O") &&
                btn3.getText().equals("O")) ||
                (btn1.getText().equals("O") &&
                        btn5.getText().equals("O") &&
                        btn9.getText().equals("O")) ||
                        (btn1.getText().equals("O") &&
                        btn4.getText().equals("O") &&
                        btn7.getText().equals("O")) ||
                        (btn2.getText().equals("O") &&
                                btn5.getText().equals("O") &&
                                btn8.getText().equals("O")) ||
                                (btn3.getText().equals("O") &&
                                        btn6.getText().equals("O") &&
                                        btn9.getText().equals("O")) ||
                                        (btn4.getText().equals("O") &&
                                                btn5.getText().equals("O") &&
                                                btn6.getText().equals("O")) ||
                                                (btn7.getText().equals("O") &&
                                                        btn8.getText().equals("O") &&
                                                        btn9.getText().equals("O")) ||
                                                        (btn7.getText().equals("O") &&
                                                                btn5.getText().equals("O") &&
                                                                btn3.getText().equals("O"));
                        
                        
    }
    
    public tictactoe() {
        panel.setLayout(new GridLayout(3,3));

        panel.add(btn1);
        btn1.setFont(new Font("Arial", Font.PLAIN, 40));
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                
                if (util.isXturn(panel)) {
                    btn1.setText("X");
                    btn1.setEnabled(false);
                    if (didXwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        xwins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(xwins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });


                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
                else {
                    btn1.setText("O");
                    btn1.setEnabled(false);
                    if (didOwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        owins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(owins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
            }
        });
        panel.add(btn2);
        btn2.setFont(new Font("Arial", Font.PLAIN, 40));
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                
                if (util.isXturn(panel)) {
                    btn2.setText("X");
                    btn2.setEnabled(false);
                    if (didXwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        xwins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(xwins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
                else {
                    btn2.setText("O");
                    btn2.setEnabled(false);
                    if (didOwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        owins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(owins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
            }
        });
        panel.add(btn3);
        btn3.setFont(new Font("Arial", Font.PLAIN, 40));
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                
                if (util.isXturn(panel)) {
                    btn3.setText("X");
                    btn3.setEnabled(false);
                    if (didXwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        xwins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(xwins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
                else {
                    btn3.setText("O");
                    btn3.setEnabled(false);
                    if (didOwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        owins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(owins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
            }
        });
        panel.add(btn4);
        btn4.setFont(new Font("Arial", Font.PLAIN, 40));
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                
                if (util.isXturn(panel)) {
                    btn4.setText("X");
                    btn4.setEnabled(false);
                    if (didXwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        xwins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(xwins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
                else {
                    btn4.setText("O");
                    btn4.setEnabled(false);
                    if (didOwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        owins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(owins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
            }
        });
        panel.add(btn5);
        btn5.setFont(new Font("Arial", Font.PLAIN, 40));
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                
                if (util.isXturn(panel)) {
                    btn5.setText("X");
                    btn5.setEnabled(false);
                    if (didXwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        xwins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(xwins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
                else {
                    btn5.setText("O");
                    btn5.setEnabled(false);
                    if (didOwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        owins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(owins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                    
                }
            }
        });
        panel.add(btn6);
        btn6.setFont(new Font("Arial", Font.PLAIN, 40));
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                
                if (util.isXturn(panel)) {
                    btn6.setText("X");
                    btn6.setEnabled(false);
                    if (didXwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        xwins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(xwins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
                else {
                    btn6.setText("O");
                    btn6.setEnabled(false);
                    if (didOwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        owins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(owins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
            }
        });
        panel.add(btn7);
        btn7.setFont(new Font("Arial", Font.PLAIN, 40));
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                
                if (util.isXturn(panel)) {
                    btn7.setText("X");
                    btn7.setEnabled(false);
                    if (didXwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        xwins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(xwins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
                else {
                    btn7.setText("O");
                    btn7.setEnabled(false);
                    if (didOwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        owins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(owins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
            }
        });
        panel.add(btn8);
        btn8.setFont(new Font("Arial", Font.PLAIN, 40));
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                
                if (util.isXturn(panel)) {
                    btn8.setText("X");
                    btn8.setEnabled(false);
                    if (didXwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        xwins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(xwins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
                else {
                    btn8.setText("O");
                    btn8.setEnabled(false);
                    if (didOwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        owins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(owins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
            }
        });
        panel.add(btn9);
        btn9.setFont(new Font("Arial", Font.PLAIN, 40));
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                
                if (util.isXturn(panel)) {
                    btn9.setText("X");
                    btn9.setEnabled(false);
                    if (didXwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        xwins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(xwins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
                else {
                    btn9.setText("O");
                    btn9.setEnabled(false);
                    if (didOwin()) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        owins.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(owins, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });

                        
                    }
                    if (util.isDraw(panel)) {
                        panel.removeAll();
                        panel.repaint();
                        panel.setLayout(new BorderLayout());
                        draw.setFont(new Font("Arial", Font.PLAIN, 40));
                        frame.add(draw, BorderLayout.NORTH);
                        btn10.setPreferredSize(new Dimension(50, 50));
                        panel.add(btn10, BorderLayout.SOUTH);
                        btn10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                new tictactoe();
                            }
                        });
                    }
                }
            }
        });
    
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setBounds(50, 50, 300, 300);
        frame.setVisible(true);
    }
    
    
}

class Util {
    boolean isXturn(JPanel panel) {
        
        int count = 0;
    
        for (Component button : panel.getComponents()) {
            if (button instanceof JButton) {
                if (((JButton)button).getText().equals("O") ||
                        ((JButton)button).getText().equals("X")) {
                    count = count + 1;
                }
                else {
                }
                        
        }
        }
        return count%2 == 0;
        
    }
    
    boolean isDraw(JPanel panel) {
        
        int count = 0;
        
        for (Component button : panel.getComponents()) {
            if (button instanceof JButton) {
                if (((JButton)button).getText().equals("O") ||
                        ((JButton)button).getText().equals("X")) {
                    count = count + 1;
                }
                else {
                }
                        
        }
        }
        return count == 9;
}
}
 
 
 
