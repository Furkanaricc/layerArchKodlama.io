package logging;

public class MailLogger implements Logger{
    @Override
    public void logg(String data) {
        System.out.println("Mail logglandı.");
    }
}
