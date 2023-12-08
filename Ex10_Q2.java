import java.util.Scanner;
import java.sql.*;

class Database
{
    Connection con;
    PreparedStatement ps;
    Statement stmt;
    Scanner scan;

    Database() throws Exception
    {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        scan = new Scanner(System.in);
    }
    void insert_data() throws Exception{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?user=root&password=2077");

        int n, i;

        System.out.print("Enter the no. of records :");
        n = scan.nextInt();

        int id, na;
        String name, course;
        Float maths, english, physics, java;

        for(i=0;i<n;i++) {
            System.out.println("Enter the Id, Name, Course, Maths, English, Physics, Java :");
            id = scan.nextInt();
            name = scan.next();
            course = scan.next();
            maths = scan.nextFloat();
            english = scan.nextFloat();
            physics = scan.nextFloat();
            java = scan.nextFloat();

            ps = con.prepareStatement("INSERT INTO `practice`.`student_details` (`Id`, `Name`, `Course`, `Maths`, `English`, `Physics`, `Java`) "+
                    "VALUES ('"+id+"', '"+name+"', '"+course+"', '"+maths+"', '"+english+"', '"+physics+"', '"+java+"');");

            na = ps.executeUpdate();
            System.out.println("No. of rows inserted :"+na);
        }

        con.close();
    }

    void specificCourse() throws Exception
    {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?user=root&password=2077");

        stmt = con.createStatement();

        System.out.println("Enter the specific course to display :");
        String co = scan.next();

        ResultSet rs = stmt.executeQuery("select * from practice.student_details where course='"+co+"'");

        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4)+rs.getFloat(5)+"  "+rs.getFloat(6)+"  "+rs.getFloat(7));
        }

        con.close();
    }

    void averageGrade() throws Exception
    {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?user=root&password=2077");

        stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("select * from student_details");

        float average;
        while(rs.next())
        {
            average = (rs.getFloat(4)+rs.getFloat(5)+rs.getFloat(6)+rs.getFloat(7))/4;
            System.out.println("Average of "+rs.getInt(1)+"  "+rs.getString(2)+"  is :"+average);
        }

        con.close();
    }

    void updateDetails() throws SQLException
    {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?user=root&password=2077");

        int id;
        float maths, eng, phy, java;
        System.out.println("Enter the id to update grades :");
        id = scan.nextInt();
        System.out.println("Enter the new marks of maths, english, physics, java :");
        maths = scan.nextFloat();
        eng = scan.nextFloat();
        phy = scan.nextFloat();
        java = scan.nextFloat();

        ps = con.prepareStatement("UPDATE `practice`.`student_details` SET `Maths` = '"+maths+"', `English` = '"+eng+"', `Physics` = '"+phy+"', `Java` = '"+java+"' WHERE (`Id` = '"+id+"');");

        int na = ps.executeUpdate();
        System.out.println("No. of rows affected :"+na);

        con.close();
    }
}

public class Ex10_Q2
{
    public static void main(String args[])
    {
        try {
            Database db = new Database();

            Scanner scan = new Scanner(System.in);
            int choice = 0;
            do {
                System.out.println("----------------------------------------------");
                System.out.println("Enter the choice :\n 1 to insert \n 2 to find the average");
                System.out.println(" 3 to list the details of specific course \n 4 to update details\n 0 to exit");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        db.insert_data();
                        break;

                    case 2:
                        db.averageGrade();
                        break;

                    case 3:
                        db.specificCourse();
                        break;

                    case 4:
                        db.updateDetails();
                        break;

                    default:
                        if (choice != 0)
                            System.out.println("Invalid choice");
                }
            }while(choice != 0);
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred :");
            e.printStackTrace();
        }
    }
}