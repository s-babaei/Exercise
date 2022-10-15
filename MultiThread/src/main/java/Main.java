import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {

    final static String outputFilePath
            = "D:\\digi\\Exercise1\\MultiThread\\result.txt";

    public static void main(String[] args)  {


        Map<String, Long> collect = null;
        try {
            collect = Files.lines(Paths.get("D:\\digi\\Exercise1\\MultiThread\\sara.txt")).parallel().
                    map(f -> f.split("[.]|[ ]|[?]|[!]|[,]|[:]|[\"]")).flatMap(Arrays::stream)
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println(collect);


        File file = new File(outputFilePath);

        BufferedWriter bufferedWriter= null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Map.Entry<String,Long> entry : collect.entrySet()) {
            bufferedWriter.write(entry.getKey() + ":"
                    + entry.getValue());
           bufferedWriter.newLine();
        }


        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            try {

                bufferedWriter.close();
            }
            catch (Exception e) {
            }
        }



    }
}
