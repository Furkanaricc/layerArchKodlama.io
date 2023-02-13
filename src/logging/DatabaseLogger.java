package logging;

public class DatabaseLogger implements Logger{
    @Override
    public void logg(String data) {
        System.out.println("Database de logglandı.");
    }
}
