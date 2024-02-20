package CalculatorModel.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private final String logFilePath;

    public Logger(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public void log(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFilePath, true))) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = now.format(formatter);
            writer.println(timestamp + " : " + message);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл журнала: " + e.getMessage());
        }
    }
}
