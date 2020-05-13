package SixthLaba;

import java.awt.*;
import java.awt.event.*;

public class MainMenu extends Frame  {

    public MainMenu(){
        super("Main Menu");
        setSize(800,600);
        setVisible(true);
        SetUIElement();
    }
    public void SetUIElement(){
        Label infStartPosition = new Label("Стартова позиція цілі");
        Label x = new Label("X = ");
        Label y = new Label("Y = ");
        Label radius = new Label("Radius = ");
        Label speedTxt = new Label("Speed = ");
        TextField xStart = new TextField();
        TextField yStart = new TextField();
        TextField radiusValue = new TextField();
        TextField speedValue = new TextField();
        Button play = new Button("PLAY");

        infStartPosition.setBounds(20,50,200,30);
        radius.setBounds(25,150,50,30);
        x.setBounds(25,85,20,30);
        y.setBounds(125,85,20,30);
        speedTxt.setBounds(25,200,50,30);
        xStart.setBounds(50,85,50,30);
        yStart.setBounds(150,85,50,30);
        radiusValue.setBounds(100,150,50,30);
        speedValue.setBounds(85,200,50,30);
        play.setBounds(100,250,100,60);
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(xStart.getText().equals("") || yStart.getText().equals("")||
                radiusValue.getText().equals("")|| speedValue.getText().equals("")){
                    new Tenis();
                }else{
                    new Tenis(Integer.parseInt(xStart.getText()),Integer.parseInt(yStart.getText()),
                            Integer.parseInt(radiusValue.getText()),Integer.parseInt(speedValue.getText()));
                }
            }
        });

        this.add(infStartPosition);
        this.add(x);
        this.add(y);
        this.add(xStart);
        this.add(yStart);
        this.add(radius);
        this.add(radiusValue);
        this.add(speedTxt);
        this.add(speedValue);
        this.add(play);
        this.setLayout(null);
    }
    public static void main(String[] args) {
        new MainMenu();
    }
}
