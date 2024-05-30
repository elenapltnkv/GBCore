package gb6;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Weather {
    public static void main(String[] args) throws IOException {
        String URL = "https://api.weather.yandex.ru/v2/forecast?lat=59.930995&lon=30.360776&lang=ru_RU&limit=1";
        MediaType JSON = MediaType.parse("JSON");

        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .build();

        Request request = new Request.Builder()
                .url(URL)
                .get()
                .addHeader("X-Yandex-API-Key","afebf4e4-d915-4dde-a4ab-e7f7a07b9e59")
                .build();

        Response response =  okHttpClient.newCall(request).execute();
        String weatherResult = response.body().string();
        System.out.println(response.code());
        System.out.println(weatherResult);
    }
}
//https://yandex.ru/pogoda/b2b/console/api-page