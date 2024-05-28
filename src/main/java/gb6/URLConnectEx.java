package gb6;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class URLConnectEx {
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("https", "gb.ru", "/");
            InputStream inputStream = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
            }
            bufferedReader.close();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        //https://restful-booker.herokuapp.com/auth

        URL urlBooking = new URL("https://restful-booker.herokuapp.com/auth");
        HttpURLConnection httpURLConnection = (HttpURLConnection) urlBooking.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setDoOutput(true);
        String authJson = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream()))) {
            bufferedWriter.write(authJson);
        }
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))) {
            String line1 = "";
            while ((line1 = bufferedReader.readLine()) != null) {
                System.out.println(line1);
            }
        }

    }
}
