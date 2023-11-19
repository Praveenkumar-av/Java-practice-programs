import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame{
    private String gaurdianName;
    private String gaurdianOccupation;
    private String gaurdianContact;

    private JLabel collegeFairLabel;
    private JLabel venueLabel;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel homeAddress1Label;
    private JLabel homeAddress2Label;
    private JLabel cityStateZipLabel;
    private JLabel homePhoneLabel;
    private JLabel emailLabel;
    private JLabel genderLabel;
    private JLabel birthDateLabel;
    private JLabel ethnicityLabel;
    private JLabel citizenshipLabel;
    private JLabel academicInterestLabel;
    private JLabel extracurricularActivitiesLabel;
    private JLabel freshmanOrTransferLabel;
    private JLabel startingTermLabel;
    private JLabel highSchoolNameLabel;
    private JLabel highSchoolCityLabel;
    private JLabel hsGraduationYearLabel;
    private JLabel satActScoresLabel;
    private JLabel leaveBlank;
    private JLabel requiredLabel;

    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField homeAddress1Field;
    private JTextField homeAddress2Field;
    private JTextField cityField;
    private JComboBox<String> stateComboBox;
    private JTextField zipField;
    private JTextField homePhoneField;
    private JTextField emailField;
    private JComboBox<String> genderComboBox;
    private JComboBox<Integer> monthComboBox;
    private JComboBox<Integer> dayComboBox;
    private JComboBox<Integer> yearComboBox;
    private JComboBox<String> ethnicityComboBox;
    private JComboBox<String> citizenshipComboBox;
    private JTextField academicInterestField;
    private JTextField extracurricularActivitiesField;
    private JComboBox<String> freshmanOrTransferComboBox;
    private JTextField startingTermField;
    private JTextField highSchoolNameField;
    private JTextField highSchoolCityField;
    private JComboBox<Integer> hsGraduationYearComboBox;
    private JTextField satActScoresField;

    public RegistrationForm() {
        super("Student Registration Form");

        JPanel mainPanel = new JPanel(new GridBagLayout());

        collegeFairLabel = new JLabel("Your College Fair or Open House Student Registration");
        venueLabel = new JLabel("Your Venue");

        String[] stateNames={
            "Alabama",
            "Alaska",
            "Arizona",
            "Arkansas",
            "California",
            "Colorado",
            "Connecticut",
            "Delaware",
            "Florida",
            "Georgia"
        };

        firstNameLabel = new JLabel("First Name *");
        lastNameLabel = new JLabel("Last Name *");
        homeAddress1Label = new JLabel("Home Address 1 *");
        homeAddress2Label = new JLabel("Home Address 2");
        cityStateZipLabel = new JLabel("City *, State *, Zip *");
        homePhoneLabel = new JLabel("Home Phone *");
        emailLabel = new JLabel("E-mail *");
        genderLabel = new JLabel("Gender *");
        birthDateLabel = new JLabel("Birth Date (Month/Day/Year) *");
        ethnicityLabel = new JLabel("Ethnicity *");
        citizenshipLabel = new JLabel("Citizenship *");
        academicInterestLabel = new JLabel("Academic Interest / Intended Major(s) *");
        extracurricularActivitiesLabel = new JLabel("Extracurricular Activities");
        freshmanOrTransferLabel = new JLabel("Freshman or Transfer *");
        startingTermLabel = new JLabel("Starting Term *");
        highSchoolNameLabel = new JLabel("High School Name *");
        highSchoolCityLabel = new JLabel("High School City *");
        hsGraduationYearLabel = new JLabel("H.S. Graduation Year");
        satActScoresLabel = new JLabel("SAT/ACT scores");
        leaveBlank=new JLabel("* Leave blank if not taken");
        requiredLabel=new JLabel("* Denotes Required Information");

        firstNameField = new JTextField(20);
        lastNameField = new JTextField(20);
        homeAddress1Field = new JTextField(20);
        homeAddress2Field = new JTextField(20);
        cityField = new JTextField(15);
        stateComboBox = new JComboBox<>(stateNames);
        zipField = new JTextField(5);
        homePhoneField = new JTextField(10);
        emailField = new JTextField(20);
        genderComboBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        monthComboBox = new JComboBox<>();
        for (int month = 1; month <= 12; month++) {
            monthComboBox.addItem(month);
        }

        dayComboBox = new JComboBox<>();
        for (int day = 1; day <= 31; day++) {
            dayComboBox.addItem(day);
        }

        yearComboBox = new JComboBox<>();
        for (int year = 1900; year <= 2023; year++) {
            yearComboBox.addItem(year);
        }
        ethnicityComboBox = new JComboBox<>(new String[]{"Asian", "Black or African American", "Hispanic or Latino", "Native American", "White", "Other"});
        citizenshipComboBox = new JComboBox<>(new String[]{"US Citizen", "Permanent Resident", "International Student"});
        academicInterestField = new JTextField(20);
        extracurricularActivitiesField = new JTextField(20);
        freshmanOrTransferComboBox = new JComboBox<>(new String[]{"Freshman", "Transfer"});
        startingTermField = new JTextField(10);
        highSchoolNameField = new JTextField(20);
        highSchoolCityField = new JTextField(20);
        hsGraduationYearComboBox = new JComboBox<>();
        for (int year = 1900; year <= 2023; year++) {
            hsGraduationYearComboBox.addItem(year);
        }
        satActScoresField=new JTextField(20);

        JButton addParentButton = new JButton("Add Parent/Guardian");
        JButton submitButton = new JButton("Submit");

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        // Add components to the main panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        mainPanel.add(collegeFairLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        mainPanel.add(venueLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        mainPanel.add(new JLabel("College Fair Association"), constraints);

        constraints.gridy = 2;
        mainPanel.add(new JLabel(), constraints); // Add some space between sections

        constraints.gridx = 0;
        constraints.gridy = 3;
        mainPanel.add(firstNameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        mainPanel.add(firstNameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        mainPanel.add(lastNameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 4;
        mainPanel.add(lastNameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        mainPanel.add(homeAddress1Label, constraints);

        constraints.gridx = 1;
        constraints.gridy = 5;
        mainPanel.add(homeAddress1Field, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        mainPanel.add(homeAddress2Label, constraints);

        constraints.gridx = 1;
        constraints.gridy = 6;
        mainPanel.add(homeAddress2Field, constraints);

        constraints.gridx = 0;
        constraints.gridy = 7;
        mainPanel.add(cityStateZipLabel, constraints);

        JPanel panel1=new JPanel(new FlowLayout());
        panel1.add(cityField);
        panel1.add(stateComboBox);
        panel1.add(zipField);
        
        constraints.gridx = 1;
        constraints.gridy = 7;
        mainPanel.add(panel1, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 8;
        mainPanel.add(homePhoneLabel, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 8;
        mainPanel.add(homePhoneField, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 9;
        mainPanel.add(emailLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 9;
        mainPanel.add(emailField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 10;
        mainPanel.add(genderLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 10;
        mainPanel.add(genderComboBox, constraints);

        constraints.gridx = 0;
        constraints.gridy = 11;
        mainPanel.add(birthDateLabel, constraints);

        JPanel panel2=new JPanel(new FlowLayout());
        panel2.add(monthComboBox);
        panel2.add(dayComboBox);
        panel2.add(yearComboBox);

        constraints.gridx = 1;
        constraints.gridy = 11;
        mainPanel.add(panel2, constraints);

        constraints.gridx = 0;
        constraints.gridy = 12;
        mainPanel.add(ethnicityLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 12;
        mainPanel.add(ethnicityComboBox, constraints);

        constraints.gridx = 0;
        constraints.gridy = 13;
        mainPanel.add(citizenshipLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 13;
        mainPanel.add(citizenshipComboBox, constraints);

        constraints.gridx = 0;
        constraints.gridy = 14;
        mainPanel.add(academicInterestLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 14;
        mainPanel.add(academicInterestField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 15;
        mainPanel.add(extracurricularActivitiesLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 15;
        mainPanel.add(extracurricularActivitiesField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 16;
        mainPanel.add(freshmanOrTransferLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 16;
        mainPanel.add(freshmanOrTransferComboBox, constraints);

        constraints.gridx = 0;
        constraints.gridy = 17;
        mainPanel.add(startingTermLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 17;
        mainPanel.add(startingTermField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 18;
        mainPanel.add(highSchoolNameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 18;
        mainPanel.add(highSchoolNameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 19;
        mainPanel.add(highSchoolCityLabel, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 19;
        mainPanel.add(highSchoolCityField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 20;
        mainPanel.add(hsGraduationYearLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 20;
        mainPanel.add(hsGraduationYearComboBox, constraints);

        constraints.gridx = 0;
        constraints.gridy = 21;
        mainPanel.add(satActScoresLabel, constraints);
        
        constraints.gridx = 1;
        constraints.gridy =21;
        mainPanel.add( satActScoresField, constraints);

        constraints.gridx = 2;
        constraints.gridy =21;
        mainPanel.add( leaveBlank , constraints);
        constraints.gridx = 1;
        constraints.gridy =22;
        mainPanel.add( requiredLabel, constraints);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayForm();
            }
        });

        addParentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parentRegistrationForm();
            }
        });

        JPanel panel3=new JPanel(new FlowLayout());
        panel3.add(submitButton);
        panel3.add(addParentButton);

        constraints.gridx = 0;
        constraints.gridy =23;
        mainPanel.add( panel3, constraints);

        add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);
    }
    public void parentRegistrationForm(){
        JFrame pframe=new JFrame("Parent Registration Form");
        JPanel mainPanel=new JPanel(new GridBagLayout());
        JTextField gaurdianNameField=new JTextField(20);
        JTextField gaurdianOccupationField=new JTextField(20);
        JTextField gaurdianContactField=new JTextField(20);
        JButton guardianSubmitButton=new JButton("Submit");
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        // Add components to the main panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        mainPanel.add(new JLabel("Parent OR Gaurdian Details"), constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        mainPanel.add(new JLabel("Parent OR Gaurdian Name"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        mainPanel.add(gaurdianNameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        mainPanel.add(new JLabel("Parent OR Gaurdian Occupation"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        mainPanel.add(gaurdianOccupationField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        mainPanel.add(new JLabel("Parent OR Gaurdian Contact"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        mainPanel.add(gaurdianContactField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        mainPanel.add(guardianSubmitButton, constraints);

        guardianSubmitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gaurdianName=gaurdianNameField.getText();
                gaurdianOccupation=gaurdianOccupationField.getText();
                gaurdianContact=gaurdianContactField.getText();
                pframe.dispose();
            }
        });
        
        pframe.add(mainPanel);
        pframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pframe.setSize(500, 200);
        pframe.setVisible(true);
    }
    public void displayForm(){
        JFrame dframe=new JFrame("Display Form");
        
        JPanel mainPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        constraints.gridx = 0;
        constraints.gridy = 0;
        mainPanel.add(collegeFairLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        mainPanel.add(venueLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        mainPanel.add(new JLabel("College Fair Association"), constraints);

        constraints.gridy = 2;
        mainPanel.add(new JLabel(), constraints); // Add some space between sections

        constraints.gridx = 0;
        constraints.gridy = 3;
        mainPanel.add(firstNameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        mainPanel.add(new JLabel(firstNameField.getText()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        mainPanel.add(lastNameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 4;
        mainPanel.add(new JLabel(lastNameField.getText()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        mainPanel.add(homeAddress1Label, constraints);

        constraints.gridx = 1;
        constraints.gridy = 5;
        mainPanel.add(new JLabel(homeAddress1Field.getText()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        mainPanel.add(homeAddress2Label, constraints);

        constraints.gridx = 1;
        constraints.gridy = 6;
        mainPanel.add(new JLabel(homeAddress2Field.getText()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 7;
        mainPanel.add(cityStateZipLabel, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 7;
        mainPanel.add(new JLabel(cityField.getText()+" "+stateComboBox.getSelectedItem()+" "+zipField.getText()), constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 8;
        mainPanel.add(homePhoneLabel, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 8;
        mainPanel.add(new JLabel(homePhoneField.getText()), constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 9;
        mainPanel.add(emailLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 9;
        mainPanel.add(new JLabel(emailField.getText()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 10;
        mainPanel.add(genderLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 10;
        mainPanel.add(new JLabel(genderComboBox.getSelectedItem().toString()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 11;
        mainPanel.add(birthDateLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 11;
        mainPanel.add(new JLabel(monthComboBox.getSelectedItem().toString()+"/"+dayComboBox.getSelectedItem().toString()+"/"+yearComboBox.getSelectedItem().toString()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 12;
        mainPanel.add(ethnicityLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 12;
        mainPanel.add(new JLabel(ethnicityComboBox.getSelectedItem().toString()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 13;
        mainPanel.add(citizenshipLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 13;
        mainPanel.add(new JLabel(citizenshipComboBox.getSelectedItem().toString()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 14;
        mainPanel.add(academicInterestLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 14;
        mainPanel.add(new JLabel(academicInterestField.getText()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 15;
        mainPanel.add(extracurricularActivitiesLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 15;
        mainPanel.add(new JLabel(extracurricularActivitiesField.getText()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 16;
        mainPanel.add(freshmanOrTransferLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 16;
        mainPanel.add(new JLabel(freshmanOrTransferComboBox.getSelectedItem().toString()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 17;
        mainPanel.add(startingTermLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 17;
        mainPanel.add(new JLabel(startingTermField.getText()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 18;
        mainPanel.add(highSchoolNameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 18;
        mainPanel.add(new JLabel(highSchoolNameField.getText()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 19;
        mainPanel.add(highSchoolCityLabel, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 19;
        mainPanel.add(new JLabel(highSchoolCityField.getText()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 20;
        mainPanel.add(hsGraduationYearLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 20;
        mainPanel.add(new JLabel(hsGraduationYearComboBox.getSelectedItem().toString()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 21;
        mainPanel.add(satActScoresLabel, constraints);
        
        constraints.gridx = 1;
        constraints.gridy =21;
        mainPanel.add(new JLabel(satActScoresField.getText()), constraints);

        constraints.gridx = 0;
        constraints.gridy = 22;
        mainPanel.add(new JLabel("Parent OR Gaurdian Name"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 22;
        mainPanel.add(new JLabel(gaurdianName), constraints);

        constraints.gridx = 0;
        constraints.gridy = 23;
        mainPanel.add(new JLabel("Parent OR Gaurdian Occupation"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 23;
        mainPanel.add(new JLabel(gaurdianOccupation), constraints);

        constraints.gridx = 0;
        constraints.gridy = 24;
        mainPanel.add(new JLabel("Parent OR Gaurdian Contact"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 24;
        mainPanel.add(new JLabel(gaurdianContact), constraints);

        dframe.add(mainPanel);
        dframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dframe.setSize(1000, 1000);
        dframe.setVisible(true);
    }
    public static void main(String[] args) {
        RegistrationForm s=new RegistrationForm();
    }
}