package GUI_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class FormWithDBAccess extends JFrame implements ActionListener {
    JButton button;
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            try {
                String empId = id.getText();
                String empName = name.getText();
                String empAddress = name.getText();
                String empDepartment = name.getText();
                int empSalary = Integer.parseInt(salary.getText());

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_emp", "root", "nice");
                Statement statement = connection.createStatement();
                String query = "INSERT INTO employee(id, name, address, department, salary) VALUES('"+ empId +"', '"+ empName +"', '"+ empAddress +"', '"+ empDepartment +"', '"+ empSalary +"'')";
                statement.executeUpdate(query);
                System.out.println("Successfully into db table!");

                connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            catch (Exception ee) {
                ee.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new FormWithDBAccess();
    }
}

