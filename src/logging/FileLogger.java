package logging;

public class FileLogger implements Logger{
    @Override
    public void logg(String data) {
        System.out.println("File'a logglandı.");
    }
}
