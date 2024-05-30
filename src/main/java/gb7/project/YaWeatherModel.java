package gb7.project;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class YaWeatherModel {
    //String URL = "https://api.weather.yandex.ru/v2/forecast?lat=59.930995&lon=30.360776&lang=ru_RU&limit=1";
    private static final String PROTOCOL = "https";
    private static final String BASE_URL = "api.weather.yandex.ru";
    private static final String VERSION = "v2";
    private static final String PART_URL = "forecast";
    private static final String latMoscow = "55.75396";
    private static final String lonMoscow = "37.620393";
    private static final String langRU = "ru_RU";
    //private static final String Period = String.valueOf(FIVE_DAY_WEATHER);
    private static final String KEY_NAME = "X-Yandex-API-Key";
    private static final String XYandexAPIKey = "afebf4e4-d915-4dde-a4ab-e7f7a07b9e59";

    static OkHttpClient okHttpClient = new OkHttpClient();
    static ObjectMapper objectMapper = new ObjectMapper();

    public static void getCity(String lat, String lon, Period period) throws IOException {
        if (period == Period.NOW) {
            HttpUrl url = new HttpUrl.Builder()
                    .scheme(PROTOCOL)
                    .host(BASE_URL)
                    .addPathSegment(VERSION)
                    .addPathSegment(PART_URL)
                    .addQueryParameter("lat", latMoscow)
                    .addQueryParameter("lon", lonMoscow)
                    .addQueryParameter("lang", langRU)
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .get()
                    .addHeader(KEY_NAME, XYandexAPIKey)
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            String responseBody = response.body().string();
            String weatherCityText = objectMapper.readTree(responseBody).at("/info").at("/tzinfo").at("/name").asText();
            String weatherTempText = objectMapper.readTree(responseBody).at("/fact").at("/temp").asText();
            String weatherFeelLikeText = objectMapper.readTree(responseBody).at("/fact").at("/feels_like").asText();
            System.out.println("Сегодня погода в "+weatherCityText+ " "+ "+"+weatherTempText+". Ощущается как " + weatherFeelLikeText+" градусов.");
        }
        if (period == Period.FIVE_DAY) {
            HttpUrl url = new HttpUrl.Builder()
                    .scheme(PROTOCOL)
                    .host(BASE_URL)
                    .addPathSegment(VERSION)
                    .addPathSegment(PART_URL)
                    .addQueryParameter("lat", latMoscow)
                    .addQueryParameter("lon", lonMoscow)
                    .addQueryParameter("lang", langRU)
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .get()
                    .addHeader(KEY_NAME, XYandexAPIKey)
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            String responseBody = response.body().string();
            String weatherCityText = objectMapper.readTree(responseBody).at("/info").at("/tzinfo").at("/name").asText();
            String weatherTempText = objectMapper.readTree(responseBody).at("/fact").at("/temp").asText();
            String weatherFeelLikeText = objectMapper.readTree(responseBody).at("/fact").at("/feels_like").asText();
            System.out.println("Сегодня погода в "+weatherCityText+ " "+ "+"+weatherTempText+". Ощущается как " + weatherFeelLikeText+" градусов.");
        }

    }

    public static void weatherByPoint(String lat, String lon, Period period) throws IOException {
        if (period == Period.NOW) {
            HttpUrl url = new HttpUrl.Builder()
                    .scheme(PROTOCOL)
                    .host(BASE_URL)
                    .addPathSegment(VERSION)
                    .addPathSegment(PART_URL)
                    .addQueryParameter("lat", latMoscow)
                    .addQueryParameter("lon", lonMoscow)
                    .build();

            Request request = new Request.Builder()
                    .url(url)
                    .get()
                    .addHeader(KEY_NAME, XYandexAPIKey)
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            String weatherResult = response.body().string();
            System.out.println(response.code());
            System.out.println(weatherResult);

        }
    }

    public static void main(String[] args) throws IOException {
        weatherByPoint(latMoscow, lonMoscow, Period.NOW);
        getCity(latMoscow, lonMoscow, Period.NOW);


    }
}