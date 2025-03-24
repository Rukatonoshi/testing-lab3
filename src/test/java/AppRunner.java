import org.itmo.testing.lab2.controller.UserAnalyticsController;

public class AppRunner {
    public static void main(String[] args) {
        UserAnalyticsController.createApp().start(7000);
    }
}