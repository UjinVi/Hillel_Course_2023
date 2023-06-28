package ua.hilell.Files;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

import java.nio.file.StandardOpenOption;
import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.StringUtils.split;
import static org.bouncycastle.crypto.tls.CipherType.stream;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("dir/Example.txt");

//        file.deleteOnExit();
//
//        Reader reader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        bufferedReader.readLine();
//
//        Writer writer = new FileWriter(file);
//        writer.write('f');
//
//        BufferedWriter bufferedWriter = new BufferedWriter(writer);
//        bufferedWriter.write('f');

//        Files.readAllLines(file.toPath());


//        List<String> lines = new ArrayList<>();
//        Files.write(file.toPath(),lines,
//                StandardOpenOption.APPEND,
//                StandardOpenOption.DELETE_ON_CLOSE);

        File usersFile = new File("Files/Example.txt");
        List<String> lines = Files.readAllLines(file.toPath());

        List<String> headers = Arrays.stream(lines.get(0).split(",")).toList();
        List<Map<String,String>> users = new ArrayList<>();

        for (int i=1; 1<lines.size(); i++){
            Map<String,String> user = new HashMap<>();
            List<String> line = Arrays.stream(lines.get(i).split(",")).toList();

            for(int j=0; j<line.size(); j++) {
                user.put(headers.get(j),line.get(j));
            }
            users.add(user);
        }
                System.out.println(users);
    }
}
