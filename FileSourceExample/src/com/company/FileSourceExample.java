package com.zjg;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileSourceExample {

    public static void main(String[] args) {
	// write your code here
        try{
            String filePath = "D:/masterSpring/FileSourceExample/out/production/FileSourceExample/file1.txt";

            //1. Loader file with system file path
            WritableResource res1 = new PathResource(filePath);

            //2. Loader file with class path
            Resource res2 = new ClassPathResource("file1.txt");

            //3. Write resource file in writableResource interface
            OutputStream stream1 = res1.getOutputStream();
            stream1.write("Welcome to Hello World!".getBytes());

            //4 Read file with Resource function
            InputStream ins1 = res1.getInputStream();
            InputStream ins2 = res2.getInputStream();

            ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
            int i;
            while((i = ins1.read()) != -1){
                baos1.write(i);
            }

            ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
            while((i = ins2.read()) != -1){
                baos2.write(i);
            }

            System.out.println(baos1.toString());
            System.out.println(baos2.toString());
            System.out.println("res1: " + res1.getFilename());
            System.out.println("res2: " + res2.getFilename());

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
