package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class inputStream {
    public static void main(String[] args) throws IOException {
        int a, b,c, max = 0;
        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(System.out);

        System.out.println("Enter the 3 Numbers ");
        a = in.readInt();
        b = in.readInt();
        c = in.readInt();

        if(a > b){
            max = a;
        }
        else if(a < b){
            max = b;
        }
        else if(c > max){
            max = c;
        }

        System.out.println("Maximum Number is ");
            out.write(a);
            out.write(b);
            out.write(c);
            out.write(max);
    }
}
