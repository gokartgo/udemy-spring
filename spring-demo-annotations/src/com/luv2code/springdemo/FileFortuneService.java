package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService{
    private File file;
    private List<String> theFortunes = new ArrayList<>();
    private Random random = new Random();


    public FileFortuneService() {
        file = new File("./src/com/luv2code/springdemo/fortune-data.txt");
        System.out.println(file.getAbsolutePath());
        try {
            BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
            System.out.println(br.readLine());
            String line;
            while((line = br.readLine()) != null) {
                theFortunes.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = random.nextInt(theFortunes.size());

        return theFortunes.get(index);
    }
}
