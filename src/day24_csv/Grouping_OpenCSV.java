package day24_csv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Grouping_OpenCSV {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/day24_csv/1000 Sales Records.csv");
        BufferedReader reader = Files.newBufferedReader(path);
        
        CsvToBean<Sales> salesList = new CsvToBeanBuilder(reader)
                .withType(Sales.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();
        // 分析
        salesList.parse().stream()
                .filter(s -> s.getTotalProfit() >= 160_0000.0)
                .peek(System.out::println)
                .map(s -> s.getCountry())
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()))
                .forEach((key, value) -> System.out.printf("%s : %d\n", key, value));
    }
}
