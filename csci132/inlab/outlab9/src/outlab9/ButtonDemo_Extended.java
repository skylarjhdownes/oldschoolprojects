
package outlab9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonDemo_Extended implements  ActionListener{
    // Definition of global values and items that are part of the GUI.
    int redScoreAmount = 0;
    int blueScoreAmount = 0;
    String redTeam;
    String blueTeam;
    
    JPanel titlePanel, scorePanel, buttonPanel;
    JLabel redLabel, blueLabel, redScore, blueScore;
    JButton redButton, blueButton, resetButton, blueSubButton, redSubButton, red2Button, blue2Button,red3Button, blue3Button;
    
    public JPanel createContentPane (){

        redTeam = JOptionPane.showInputDialog( "Enter first team name:");
        blueTeam = JOptionPane.showInputDialog( "Enter second team name:");
        
        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        // Creation of a Panel to contain the title labels
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 0);
        titlePanel.setSize(250, 30);
        totalGUI.add(titlePanel);

        redLabel = new JLabel(redTeam);
        redLabel.setLocation(0, 0);
        redLabel.setSize(120, 30);
        redLabel.setHorizontalAlignment(0);
        redLabel.setForeground(Color.red);
        titlePanel.add(redLabel);

        blueLabel = new JLabel(blueTeam);
        blueLabel.setLocation(130, 0);
        blueLabel.setSize(120, 30);
        blueLabel.setHorizontalAlignment(0);
        blueLabel.setForeground(Color.blue);
        titlePanel.add(blueLabel);

        // Creation of a Panel to contain the score labels.
        scorePanel = new JPanel();
        scorePanel.setLayout(null);
        scorePanel.setLocation(10, 40);
        scorePanel.setSize(900, 30);
        totalGUI.add(scorePanel);

        redScore = new JLabel(""+redScoreAmount);
        redScore.setLocation(0, 0);
        redScore.setSize(120, 30);
        redScore.setHorizontalAlignment(0);
        scorePanel.add(redScore);

        blueScore = new JLabel(""+blueScoreAmount);
        blueScore.setLocation(130, 0);
        blueScore.setSize(120, 30);
        blueScore.setHorizontalAlignment(0);
        scorePanel.add(blueScore);

        // Creation of a Panel to contain all the JButtons.
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(10, 80);
        buttonPanel.setSize(900, 70);
        totalGUI.add(buttonPanel);

        // We create a button and manipulate it using the syntax we have
        // used before. Now each button has an ActionListener which posts 
        // its action out when the button is pressed.
        resetButton = new JButton("Reset Score");
        resetButton.setLocation(0, 40);
        resetButton.setSize(250, 30);
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);
        
        redButton = new JButton(redTeam + " Score!");
        redButton.setLocation(0, 0);
        redButton.setSize(120, 30);
        redButton.addActionListener(this);
        buttonPanel.add(redButton);

        blueButton = new JButton(blueTeam + " Score!");
        blueButton.setLocation(390, 0);
        blueButton.setSize(120, 30);
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);
        
        blue2Button = new JButton(blueTeam + " Score + 2");
        blue2Button.setLocation(520, 0);
        blue2Button.setSize(120, 30);
        blue2Button.addActionListener(this);
        buttonPanel.add(blue2Button);
        
        blue3Button = new JButton(blueTeam + " Score + 3");
        blue3Button.setLocation(650, 0);
        blue3Button.setSize(120, 30);
        blue3Button.addActionListener(this);
        buttonPanel.add(blue3Button);
    
        red2Button = new JButton(redTeam + " Score + 2");
        red2Button.setLocation(130, 0);
        red2Button.setSize(120, 30);
        red2Button.addActionListener(this);
        buttonPanel.add(red2Button);
        
        red3Button = new JButton(redTeam + "Score + 3");
        red3Button.setLocation(260, 0);
        red3Button.setSize(120, 30);
        red3Button.addActionListener(this);
        buttonPanel.add(red3Button);
        
        blueSubButton = new JButton(blueTeam + " Score - 1");
        blueSubButton.setLocation(390, 40);
        blueSubButton.setSize(120, 30);
        blueSubButton.addActionListener(this);
        buttonPanel.add(blueSubButton);
        
        redSubButton = new JButton(redTeam + " Score - 1");
        redSubButton.setLocation(260, 40);
        redSubButton.setSize(120, 30);
        redSubButton.addActionListener(this);
        buttonPanel.add(redSubButton);
        
        
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    // This is the new ActionPerformed Method.
    // It catches any events with an ActionListener attached.
    // Using an if statement, we can determine which button was pressed
    // and change the appropriate values in our GUI.
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == redButton)
        {
            redScoreAmount = redScoreAmount + 1;
            redScore.setText(""+redScoreAmount);
        }
        else if(e.getSource() == blueButton)
        {
            blueScoreAmount = blueScoreAmount + 1;
            blueScore.setText(""+blueScoreAmount);
        }
        else if(e.getSource() == resetButton)
        {
            redScoreAmount = 0;
            blueScoreAmount = 0;
            redScore.setText(""+redScoreAmount);
            blueScore.setText(""+blueScoreAmount);
        }
        else if(e.getSource() == redSubButton)
        {
            redScoreAmount = redScoreAmount - 1;
            redScore.setText(""+redScoreAmount);
        }
        else if(e.getSource() == blueSubButton)
        {
            blueScoreAmount = blueScoreAmount - 1;
            blueScore.setText(""+blueScoreAmount);
        }
        else if(e.getSource() == red2Button)
        {
            redScoreAmount = redScoreAmount + 2;
            redScore.setText(""+redScoreAmount);
        }
        else if(e.getSource() == blue2Button)
        {
            blueScoreAmount = blueScoreAmount + 2;
            blueScore.setText(""+blueScoreAmount);
        }
        else if(e.getSource() == red3Button)
        {
            redScoreAmount = redScoreAmount + 3;
            redScore.setText(""+redScoreAmount);
        }
        else if(e.getSource() == blue3Button)
        {
            blueScoreAmount = blueScoreAmount + 3;
            blueScore.setText(""+blueScoreAmount);
        }
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] JButton Scores! [=]");

        //Create and set up the content pane.
        ButtonDemo_Extended demo = new ButtonDemo_Extended();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 190);
        frame.setVisible(true);
    }

    
    public void startButtonExtended() {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}