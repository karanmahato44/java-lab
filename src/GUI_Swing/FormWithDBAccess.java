package GUI_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class FormWithDBAccess extends JFrame implements ActionListener {
    JButton button;
    JButton clearButton;
    JTextField id;
    JTextField name;
    JTextField address;
    JTextField salary;
    JTextField department;
    public FormWithDBAccess() {
        this.setTitle("Employee Form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setSize(250, 300);
//        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        JLabel idLabel = new JLabel("Id: ");
        id =  new JTextField(20);

        JLabel nameLabel = new JLabel("Name: ");
        name =  new JTextField(20);

        JLabel addressLabel = new JLabel("Address: ");
        address =  new JTextField(20);

        JLabel departmentLabel = new JLabel("Department: ");
        department =  new JTextField(20);

        JLabel salaryLabel = new JLabel("Salary: ");
        salary =  new JTextField(20);

        button = new JButton("Ok");
        button.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        this.add(idLabel);
        this.add(id);

        this.add(nameLabel);
        this.add(name);

        this.add(addressLabel);
        this.add(address);

        this.add(departmentLabel);
        this.add(department);

        this.add(salaryLabel);
        this.add(salary);

        this.add(button);
        this.add(clearButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            try {
                int empId = Integer.parseInt(id.getText());
                String empName = name.getText();
                String empAddress = address.getText();
                String empDepartment = department.getText();
                int empSalary = Integer.parseInt(salary.getText());

//                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_emp", "root", "nice");
                String query = "INSERT INTO employee(id, name, address, department, salary) VALUES(?, ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(query);

                statement.setInt(1, empId);
                statement.setString(2, empName);
                statement.setString(3, empAddress);
                statement.setString(4, empDepartment);
                statement.setInt(5, empSalary);
                statement.executeUpdate();

                connection.close();
                System.out.println("Data successfully inserted into the db table!");

            } catch (SQLException se) {
                se.printStackTrace();
            }
            catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        if(e.getSource() == clearButton) {
            id.setText("");
            name.setText("");
            address.setText("");
            department.setText("");
            salary.setText("");
        }
    }

    public static void main(String[] args) {
        new FormWithDBAccess();
    }
}