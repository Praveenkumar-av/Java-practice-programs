import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.Scanner;

public class Ex10_Q1
{
    public static void main(String args[])
    {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?user=root&password=2077");

            Statement stmt = con.createStatement();

            PreparedStatement ps;

            String q;

            Scanner scan = new Scanner(System.in);

            int n=0, i=0, na=0, id, age;
            String name, dept;
            float sal;

            // inserting values
            System.out.println("Enter the no. of value :");
            n = scan.nextInt();

            for(i=0;i<n;i++)
            {
                System.out.println("Enter the Id, name, age, dept, sal:");
                id = scan.nextInt();

                name = scan.next();
                age = scan.nextInt();
                dept = scan.next();
                sal = scan.nextFloat();
//                String q = "INSERT INTO `emp_management`.`emp_details` (`Id`, `Name`, `Age`, `Dept`, `Salary`) VALUES (`"+Integer.toString(id)+"`, '"+name+"', '"+Integer.toString(age)+"`, `"+dept+"`, `"+Float.toString(sal)+"`"+")";

                ps = con.prepareStatement("INSERT INTO `practice`.`emp_details` (`Id`, `Name`, `Age`, `Dept`, `Salary`) VALUES (?,?,?,?,?)");
                ps.setInt(1,id);
                ps.setString(2,name);
                ps.setInt(3,age);
                ps.setString(4,dept);
                ps.setFloat(5,sal);

                na = ps.executeUpdate();
                System.out.println(na+" row inserted");
            }

            ResultSet rs = stmt.executeQuery("select * from emp_details");

            // retrieve data
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getString(4)+"  "+rs.getInt(5));
            }

            System.out.print("Enter the id to update :");;
            id = scan.nextInt();
            System.out.print("Enter the new salary :");
            sal = scan.nextFloat();

            // update the details
//            q = "UPDATE `emp_management`.`emp_details` SET `Salary` = '"+Float.toString(sal)+"' WHERE (`Id` = '"+Integer.toString(id)+"')";
//            na = stmt.executeUpdate(q);

            ps = con.prepareStatement("UPDATE `practice`.`emp_details` SET `Salary` = '"+sal+"' WHERE (`Id` = '"+id+"')");
            na = ps.executeUpdate();
            System.out.println("No. of rows affected :"+na);

            // delete a row in table
            System.out.println("Enter the id to delete the record :");
            id = scan.nextInt();
            ps = con.prepareStatement("DELETE FROM `practice`.`emp_details` WHERE (`Id` = '"+id+"')");
            na = ps.executeUpdate();
            System.out.println("No. of rows affected :"+na);

            con.close();
        }
        catch (Exception e) {
            System.out.println("Error occurred while executing query");
            e.printStackTrace();
        }
    }
}
