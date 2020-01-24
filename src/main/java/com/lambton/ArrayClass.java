package com.lambton;

public class ArrayClass {
    public static void main(String[] args) {

        int d[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};


        int[] c = new int[6];
        int e = 10;
        for (int i = 0; i <= 5; i++) {
            c[i] = e;
            e = e + 10;
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(c[i]);
        }
        int l = d.length;

        System.out.println("using compact");
        for (int j : d) {
            System.out.println(j);
        }

        int sum = 0;
        System.out.println("length=" + l);
        for (int i = 0; i < c.length; i++) {
            sum += c[i];
        }
        System.out.println("avg is" + sum / c.length);
        System.out.println("sum is" + sum);
        int min = c[0], max = c[0];
        for (int i = 0; i < c.length; i++) {

            if (c[i] <min)
                min = c[i];
            if (c[i]>max)
                max=c[i];



        }
        System.out.println("min is"+min);
        System.out.println("max is"+max);
        for (int i = l - 1; i >= 0; i--) {
            System.out.println(d[i]);
        }


        String[] s = new String[]{"manish", "pawar", "raj"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}