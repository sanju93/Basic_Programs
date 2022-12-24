package Recursion;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n , char s,char h,char d){
        if (n == 1) {
            return;
        }

        towerOfHanoi(n-1, s, d, h);
        System.out.println("number of disks" + n + "source is" + s + " " + h + " " + d);
        towerOfHanoi(n-1, h, s, d);
    }

    public static void main(String args[]) {

        int n = 3;
        towerOfHanoi(n,'s','h','d');
    }
    
}
