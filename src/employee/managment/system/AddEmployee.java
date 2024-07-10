package employee.managment.system;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.*;

public class AddEmployee extends JFrame {
JTextField tname, tfname, tadress,tphone,taadhar,temail,tsalary,tdesignation;
JDateChooser tdob;
JComboBox Boxeducation;
    AddEmployee(){
        getContentPane().setBackground(new Color(163,255,188));


        JLabel heading=new JLabel("Add Employee Detail");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,25));
        add(heading);

        JLabel name=new JLabel("Name");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(name);
        tname=new JTextField();
        tname.setBounds(200,150,150,30);
        tname.setBackground(new Color(177,252,197));
        add(tname);

        JLabel fname=new JLabel("Father's Name");
        fname.setBounds(400,150,150,30);
        fname.setFont(new Font("SANS_SERIF",Font.BOLD,20));
        add(fname);
        tfname=new JTextField();
        tfname.setBounds(600,150,150,30);
        tfname.setFont(new Font("SANS_SERIF",Font.BOLD,20));
        tfname.setBackground(new Color(177,252,197));
        add(tfname);

        JLabel dob=new JLabel("Date Of Birth");
        dob.setBounds(50,200,150,30);
        dob.setFont(new Font("SANS_SERIF",Font.BOLD,20));
        add(dob);

        tdob=new JDateChooser();
        tdob.setBounds(200,200,150,30);
        tdob.setBackground(new Color(177,252,197));
        add(tdob);
        
        JLabel salary=new JLabel("Salary");
            salary.setBounds(400,200,150,30);
            salary.setFont(new Font("SANS_SERIF",Font.BOLD,20));
            add(salary);

            tsalary=new JTextField();
            tsalary.setBounds(600,200,150,30);
            tsalary.setBackground(new Color(177,252,197));
            add(tsalary);

            JLabel address=new JLabel("Address");
            address.setBounds(50,250,150,30);
            address.setFont(new Font("SANS_SERIF",Font.BOLD,20));
            add(address);

            tadress=new JTextField();
            tadress.setBounds(200,250,150,30);
            tadress.setBackground(new Color(177,252,197));
            add(tadress);
            
            JLabel phone=new JLabel("Phone");
            phone.setBounds(400,250,150,30);
            phone.setFont(new Font("SANS_SERIF",Font.BOLD,20));
            add(phone);
             
            tphone=new JTextField();
            tphone.setBounds(600,250,150,30);
            tphone.setBackground(new Color(177,252,197));
            add(tphone);

            JLabel email=new JLabel("Email");
            email.setBounds(50,300,150,30);
            email.setFont(new Font("SANS_SERIF",Font.BOLD,20));
            add(email);

            temail=new JTextField();
            temail.setBounds(200,300,150,30);
            temail.setBackground(new Color(177,252,197));
            add(temail);

            JLabel education=new JLabel("Highest Education");
            education.setBounds(400,300,150,30);
            education.setFont(new Font("SANS_SERIF",Font.BOLD,20));
            add(education);

            String items[]={"BBA","B.TECH","BCA","BA","BSC","B.COM","MBA","MCA","MTECH","MSC"} ;
            Boxeducation=new JComboBox(items);
            Boxeducation.setBackground(new Color(177,252,197));
            Boxeducation.setBounds(600,300,150,30);
            add(Boxeducation);
        setSize(900,700);
        setLayout(null);
        setLocation(300,50);
        setVisible(true);


    }
        public static void main(String args[]){
          new AddEmployee();
        }

}
