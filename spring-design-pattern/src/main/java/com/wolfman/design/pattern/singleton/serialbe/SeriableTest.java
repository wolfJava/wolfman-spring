package com.wolfman.design.pattern.singleton.serialbe;

import java.io.*;

public class SeriableTest {

    public static void main(String[] args) {

        Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("seriable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Seriable) ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }



}
