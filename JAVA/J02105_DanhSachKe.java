/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Lycuy
 */
import java.util.Scanner;
public class J02105_DanhSachKe {
    public static Scanner ip = new Scanner (System.in);
    public static int[][] a= new int[1005][1005];
    public static void nhap(int n){
        
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                a[i][j]=ip.nextInt();
            }
        }
        
    }
    public static void slove(int n)
    {
        for (int i=1;i<=n;i++){
            System.out.printf("List(%d) = ",i);
            for (int j=1;j<=n;j++)
            {
                if (a[i][j]==1)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n= ip.nextInt();
        nhap(n);
        slove(n);
    }
}
