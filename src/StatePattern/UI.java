package StatePattern;

import javax.swing.*;
import java.awt.*;

public class UI {
    private Car car;

    private static JTextField textField = new JTextField();

    public UI(Car car) {
        this.car = car;
    }

    public void init() {
        JFrame frame = new JFrame("Car Controls");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        textField.setFont(new Font("SansSerif", Font.BOLD, 20));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel radioButtonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(radioButtonsPanel);
        context.add(buttonsPanel);

        JRadioButton regularChoice = new JRadioButton("Regular", true);
        regularChoice.addActionListener(e -> car.changeRoad(new RegularRoad(car)));

        JRadioButton GravelChoice = new JRadioButton("Gravel");
        GravelChoice.addActionListener(e -> car.changeRoad(new GravelRoad(car)));

        JRadioButton WetChoice = new JRadioButton("Wet");
        WetChoice.addActionListener(e -> car.changeRoad(new WetRoad(car)));

        JRadioButton iceChoice = new JRadioButton("Ice");
        iceChoice.addActionListener(e -> car.changeRoad(new IceRoad(car)));

        regularChoice.setBounds(75, 50, 100, 30);
        GravelChoice.setBounds(75, 100, 100, 30);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(regularChoice);
        buttonGroup.add(GravelChoice);
        buttonGroup.add(WetChoice);
        buttonGroup.add(iceChoice);
        radioButtonsPanel.add(regularChoice);
        radioButtonsPanel.add(GravelChoice);
        radioButtonsPanel.add(WetChoice);
        radioButtonsPanel.add(iceChoice);

        JButton left = new JButton("Left");
        left.addActionListener(e -> textField.setText(car.getRoad().left()));
        JButton accel = new JButton("Accelerate");
        accel.addActionListener(e -> textField.setText(car.getRoad().accel()));
        JButton right = new JButton("Right");
        right.addActionListener(e -> textField.setText(car.getRoad().right()));
        JButton brake = new JButton("Brake");
        brake.addActionListener(e -> textField.setText(car.getRoad().brake()));
        frame.setVisible(true);
        frame.setSize(360, 140);
        buttonsPanel.add(left);
        buttonsPanel.add(accel);
        buttonsPanel.add(right);
        buttonsPanel.add(brake);
    }

}
