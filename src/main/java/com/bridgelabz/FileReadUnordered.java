package com.bridgelabz;

import java.io.*;
import java.util.Scanner;

public class FileReadUnordered <T extends Comparable> {

    public String fileReadWrite(T input) throws UnorderedListException {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\data\\data1.csv"));
                String line = null;
                Scanner scanner = null;
                int index = 0;
                UnorderedList list = new UnorderedList();

                while ((line = bufferedReader.readLine()) != null) {
                    scanner = new Scanner(line);
                    scanner.useDelimiter(",");
                    T data = null;
                    while (scanner.hasNext()) {
                        data = (T) scanner.next();
                        index++;
                    }
                    index = 0;
                    list.add(data);
                }
                System.out.println(list);
                FileWriter fw = new FileWriter(String.valueOf(list));
                System.out.println(list.size());

                if (list.search(input)) {
                    list.remove(input);
                    int n = 0;
                    while (n < list.size()) {
                        fw.write(list.pop(0) + " ");
                        fw.flush();
                        n++;
                    }
                    return "found and deleted";

                } else {
                    list.add(input);
                    int n = 0;
                    while (n < list.size()) {
                        fw.write(String.valueOf(list.pop(0)));
                        fw.flush();
                        n++;
                    }
                    fw.close();
                    return "added and saved";
                }

            } catch (FileNotFoundException e) {
                throw new UnorderedListException(UnorderedListException.ExceptionType.FILE_NOT_FOUND, "File not found in path");
            } catch (IOException e) {
                throw new UnorderedListException(UnorderedListException.ExceptionType.INPUT_OUTPUT_EXCEPTION, "Entered Input or File Input Not Found");
            }
    }
}
