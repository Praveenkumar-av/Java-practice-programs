// Social Media Profile
// Design a class UserProfile with attributes like username, bio, and friends list. Implement
// methods to add friends, remove friends, update the bio, and display user profile details.

import java.util.Scanner;
import java.util.ArrayList;
class UserProfile
{
    String userName, bio;
    ArrayList <String> friends = new ArrayList<String>();
    
    void addFriends(String name)
    {
        friends.add(name);
    }

    void remove(String name)
    {
        friends.remove(name);
    }

    void updateBio(String bio)
    {
        this.bio = bio; 
    }
    
    void display()
    {
        System.out.println("Name "+userName);
        System.out.println("Bio "+bio);
        System.out.println("Friends "+friends);
    }
}

class Ex2_Q7
{
    public static void main(String args[])
    {
        UserProfile user1 = new UserProfile();

        user1.userName = "Praveen";
        user1.bio = "I am a student.";
        user1.friends.add("John");

        Scanner scan = new Scanner(System.in);
        int choice = 1;
        String name;
        while(choice != 0)
        {
            System.out.print("Enter the choice 1 to add friend, 2 to remove friend, 3 to update Bio,4 to display, 0 to exit :");
            choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                    scan.nextLine();
                    System.out.println("Enter the Name of friend :");
                    name = scan.nextLine();
                    user1.addFriends(name);
                    user1.display();
                    break;

                case 2:
                    scan.nextLine();
                    System.out.println("Enter the name to remove :");
                    name = scan.nextLine();
                    user1.remove(name);
                    user1.display();
                    break;

                case 3:
                    scan.nextLine();
                    System.out.println("Enter the Bio :");
                    String bio = scan.nextLine();
                    user1.updateBio(bio);
                    user1.display();
                    break;
                
                case 4:
                    user1.display();
                    break;

                default :
                    if(choice != 0)
                        System.out.println("Invalid");
            }
        }
    }
}