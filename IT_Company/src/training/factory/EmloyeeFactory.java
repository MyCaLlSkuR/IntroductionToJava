package training.factory;

import training.organization.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmloyeeFactory {

    public List<String> fileToStr(File file){
        List<String> employeesData = new ArrayList<>();

        try{
            Scanner enter = new Scanner(file);
            while (enter.hasNextLine()){
                employeesData.add(enter.nextLine());
            }
            enter.close();
        }catch (IOException e){
            System.out.println("Err " + e);
    }
        return employeesData;
    }




    public Employee addEmployee(String string){
        String[] str = string.split(" ");

        switch (str[0]){
            case "junior": {
                return new Junior(str[1],
                        str[2],
                        Integer.parseInt(str[3]),
                        Integer.parseInt(str[4]),
                        Integer.parseInt(str[5]));
            }
            case "middle": {

                return new Middle(str[1],
                        str[2],
                        Integer.parseInt(str[3]),
                        Integer.parseInt(str[4]),
                        Integer.parseInt(str[5]));

            }
            case "senior": {
                return new Senior(str[1],
                        str[2],
                        Integer.parseInt(str[3]),
                        Integer.parseInt(str[4]),
                        Integer.parseInt(str[5]));
            }
            default:{
                return null;
            }

        }

    }
}
