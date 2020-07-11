package MomentoPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {
    public static void main(String[] args) {
        new Test();
    }

    private JButton btnSave, btnLoad, btnUndo, btnCreateMemento;
    private JTextField txtUserName = new JTextField();
    private JTextField txtUserEmail = new JTextField();
    private JTextField txtUserAge = new JTextField();

    CareTaker careTaker = new CareTaker();
    Originator originator = new Originator();

    int saveUsers = 0, currentUser = 0;

    public Test() {
        JFrame frame = new JFrame("Momento Pattern");
        frame.setSize(480, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);

        context.add(new JLabel("Full Name: "));
        context.add(txtUserName);
        context.add(new JLabel("Email: "));
        context.add(txtUserEmail);
        context.add(new JLabel("Age: "));
        context.add(txtUserAge);

        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(buttonsPanel);

        ButtonListener createMementoListener = new ButtonListener();
        ButtonListener saveListener = new ButtonListener();
        ButtonListener loadListener = new ButtonListener();
        ButtonListener undoListener = new ButtonListener();

        btnCreateMemento = new JButton("Create Memento");
        btnCreateMemento.addActionListener(createMementoListener);

        btnSave = new JButton("Save");
        btnSave.addActionListener(createMementoListener);

        btnLoad = new JButton("Load");
        btnLoad.addActionListener(createMementoListener);

        btnUndo = new JButton("Undo");
        btnUndo.addActionListener(createMementoListener);

        buttonsPanel.add(btnLoad);
        buttonsPanel.add(btnUndo);
        buttonsPanel.add(btnSave);
        buttonsPanel.add(btnCreateMemento);

        frame.add(context);
        frame.setVisible(true);
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnLoad) {
                User user = new User("Bleard Rexhaj", "brexhaj@miu.edu", 22);
                txtUserName.setText(user.getFullName());
                txtUserAge.setText(String.valueOf(user.getAge()));
                txtUserEmail.setText(user.getEmail());
            } else if (e.getSource() == btnCreateMemento) {
                String fullName = txtUserName.getText();
                String email = txtUserEmail.getText();
                int age = Integer.parseInt(txtUserAge.getText());

                User user = new User(fullName, email, age);

                originator.set(user);

                careTaker.addMemento(originator.storeMemento());
                saveUsers++;
                currentUser++;

                System.out.println("Save Users " + saveUsers);
            } else if (e.getSource() == btnUndo) {
                if (currentUser >= 1) {
                    currentUser--;
                    User user = originator.restoreFromMemento(careTaker.getMemento(currentUser));
                    txtUserName.setText(user.getFullName());
                    txtUserAge.setText(String.valueOf(user.getAge()));
                    txtUserEmail.setText(user.getEmail());
                }
            }
        }
    }

}
