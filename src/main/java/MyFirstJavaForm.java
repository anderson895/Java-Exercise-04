import javax.swing.*;

public class MyFirstJavaForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Java Form");
        frame.setSize(500, 400);
        frame.setLayout(null); // No Layout Manager
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblName = new JLabel("Input your name:");
        lblName.setBounds(20, 20, 120, 25);
        frame.add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(150, 20, 200, 25);
        frame.add(txtName);

        JButton btnDisplay = new JButton("Display my name!");
        btnDisplay.setBounds(20, 60, 150, 25);
        frame.add(btnDisplay);

        JTextField txtDisplay = new JTextField();
        txtDisplay.setBounds(180, 60, 200, 25);
        frame.add(txtDisplay);

        JLabel lblSection = new JLabel("Year & Section:");
        lblSection.setBounds(20, 100, 100, 25);
        frame.add(lblSection);

        String[] sections = {"DSA1A", "DSA1B", "DSA1C"};
        JComboBox<String> cbSection = new JComboBox<>(sections);
        cbSection.setBounds(150, 100, 100, 25);
        frame.add(cbSection);

        JLabel lblGender = new JLabel("Sex at Birth:");
        lblGender.setBounds(20, 140, 100, 25);
        frame.add(lblGender);

        JRadioButton rbMale = new JRadioButton("Male");
        rbMale.setBounds(150, 140, 60, 25);
        JRadioButton rbFemale = new JRadioButton("Female");
        rbFemale.setBounds(220, 140, 80, 25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);
        frame.add(rbMale);
        frame.add(rbFemale);

        JLabel lblSubjects = new JLabel("Favorite Subjects:");
        lblSubjects.setBounds(20, 180, 120, 25);
        frame.add(lblSubjects);

        JCheckBox cbComp1 = new JCheckBox("CompProg1");
        cbComp1.setBounds(150, 180, 100, 25);
        JCheckBox cbComp2 = new JCheckBox("CompProg2");
        cbComp2.setBounds(260, 180, 100, 25);
        JCheckBox cbMath = new JCheckBox("Math");
        cbMath.setBounds(150, 210, 100, 25);
        JCheckBox cbEnglish = new JCheckBox("English");
        cbEnglish.setBounds(260, 210, 100, 25);

        frame.add(cbComp1);
        frame.add(cbComp2);
        frame.add(cbMath);
        frame.add(cbEnglish);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(180, 260, 100, 30);
        frame.add(btnSave);

        frame.setVisible(true);
    }
}
