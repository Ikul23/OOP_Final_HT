package CalculatorModel.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private final String logFileName;
    private final PrintWriter writer;

    public Logger(String logFileName) throws IOException {
        this.logFileName = logFileName;
        this.writer = new PrintWriter(new FileWriter(logFileName, true));
    }

    public void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);
        writer.println(timestamp + " : " + message);
        writer.flush(); // Принудительно сбрасываем буфер, чтобы гарантировать запись в файл
    }

    public void close() {
        writer.close(); // Закрываем поток PrintWriter при завершении работы
    }
}
