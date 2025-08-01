import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class IPTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IP Address: ");
        String ip = scanner.nextLine();

        try {
            String url = "http://ip-api.com/json/" + ip;
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
            );
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONObject json = new JSONObject(response.toString());

            if (json.getString("status").equals("success")) {
                System.out.println("\n=== IP Tracker Result ===");
                System.out.println("IP: " + json.getString("query"));
                System.out.println("Country: " + json.getString("country"));
                System.out.println("Region: " + json.getString("regionName"));
                System.out.println("City: " + json.getString("city"));
                System.out.println("ZIP: " + json.getString("zip"));
                System.out.println("Latitude: " + json.getDouble("lat"));
                System.out.println("Longitude: " + json.getDouble("lon"));
                System.out.println("ISP: " + json.getString("isp"));
                System.out.println("Timezone: " + json.getString("timezone"));
            } else {
                System.out.println("Error: " + json.getString("message"));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
