package com.company;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoadDataIntoDB{

    public void loadAllFilesDataInfile() {
        MySQLConnect MySQL = new MySQLConnect();



        // Load the filepath location into an array
        List<String> files = new ArrayList<>();
        List<String> directories = new ArrayList<>();
        String fileExtension = ".csv";

        File folder = new File("/Users/mako-mac/IdeaProjects/untitled2/src/com/company/csvfiles/");
        File[] listOfFiles = folder.listFiles();


        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                if (listOfFiles[i].getName().endsWith(fileExtension)) {
                    files.add(listOfFiles[i].getName());
                }
            }
        }

        Collections.sort(files);
        try {
            Statement stmt = MySQL.getConnection().createStatement();



        } catch (
                SQLException se) {
            System.out.println(se);
        }
    }
}
