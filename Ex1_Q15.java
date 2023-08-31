// Given a 2D board and a word, find if the word exists in the grid. The word
// can be constructed from letters of sequentially adjacent cells, where
// "adjacent" cells are horizontally or vertically neighboring.

import java.util.Scanner;
class Ex1_Q15
{
    public static void main(String args[])
    {
        char arr[][] = {{'b','a','p','p','l','e','d','c','p','a'},
                       {'a','f','c','t','d','x','a','f','r','s'},
                       {'n','o','l','s','r','p','t','a','p','q'},
                       {'a','z','a','q','v','e','e','y','r','p'},
                       {'n','g','s','p','b','r','d','e','l','l'},
                       {'a','b','s','m','s','i','d','l','e','p'},
                       {'x','d','m','e','f','m','e','q','l','o'},
                       {'z','n','a','o','t','e','d','b','p','k'},
                       {'e','o','t','i','g','n','k','m','r','e'},
                       {'f','r','e','k','y','t','o','w','e','r'}};

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string to find :");
        String str = scan.next();

        boolean flag = false;
        int i, j, k, n, count=0;
        n = str.length();
        lbl1 :for(i=0;i<10;i++)
        {
            lbl2 :for(j=0;j<10;j++)
            {
                if(arr[i][j] == str.charAt(0))
                {
                    count = 1;
                    lbl3 :for(k=1;k<n && (j+k)<10;k++)
                    {
                        if(arr[i][j+k] == str.charAt(k))
                        {
                            count++;
                            if(count == n)
                            {
                                System.out.println("Word found horizontally at "+(i+1)+" "+(j+1));
                                flag = true;
                                break lbl1;
                            }
                        }
                        else
                            break lbl3;
                    }
                }
            }
        }

        lbl1 :for(i=0;i<10;i++)
        {
            lbl2 :for(j=0;j<10;j++)
            {
                if(arr[j][i] == str.charAt(0))
                {
                    count = 1;
                    lbl3 :for(k=1;k<n && (j+k)<10;k++)
                    {
                        if(arr[j+k][i] == str.charAt(k))
                        {
                            count++;
                            if(count == n)
                            {
                                System.out.println("Word found Vertically at "+(j+1)+" "+(i+1));
                                flag = true;
                                break lbl1;
                            }
                        }
                        else
                            break lbl3;
                    }
                }
            }
        }

        if(flag == false)
            System.out.println("Word not found!");
    }
}