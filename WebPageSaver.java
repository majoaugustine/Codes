import java.io.*;
import java.net.*;

public class WebPageSaver {

    public static void main(String[] args) {
        String url = "https://example.com"; // Replace this with the URL of the webpage you want to save
        saveWebPage(url, "saved_page.html");
    }

    public static void saveWebPage(String urlString, String fileName) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();
            connection.disconnect();

            System.out.println("Webpage saved successfully to: " + fileName);
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + urlString);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error saving webpage: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
