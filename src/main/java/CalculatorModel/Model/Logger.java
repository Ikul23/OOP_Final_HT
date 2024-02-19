package CalculatorModel.Model;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private final String logFileName;

    public Logger(String logFileName) {
        this.logFileName = logFileName;
    }

    public void log(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFileName, true))) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = now.format(formatter);
            writer.println(timestamp + " : " + message);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл журнала: " + e.getMessage());
        }
    }
}