package gb7.project;

import com.fasterxml.jackson.databind.ObjectMapper;
import gb7.project.entity.Weather;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class YaWeatherModel {
    //String URL = "https://api.weather.yandex.ru/v2/forecast?lat=59.930995&lon=30.360776&lang=ru_RU&limit=1";
    private static final String PROTOCOL = "https";
    private static final String BASE_URL = "api.weather.yandex.ru";
    private static final String VERSION = "v2";
    private static final String PART_URL = "forecast";
    private static final String latMoscow = "55.75396";
    private static final String lonMoscow = "37.620393";
    private static final String latPiter = "59.9342802";
    private static final String lonPiter = "30.3350986";
    private static final String latKaliningrad = "54.70649";
    private static final String lonKaliningrad = "20.51095";
    private static final String langRU = "ru_RU";
    //private static final String Period = String.valueOf(FIVE_DAY_WEATHER);
    private static final String KEY_NAME = "X-Yandex-API-Key";
    private static final String XYandexAPIKey = "afebf4e4-d915-4dde-a4ab-e7f7a07b9e59";





    static OkHttpClient okHttpClient = new OkHttpClient();
    static ObjectMapper objectMapper = new ObjectMapper();
    //Weather weather= new Weather(location, weatherText, degrees);

    public static void getCityMoscow(String lat, String lon, Period period) throws IOException {
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
            //location, weatherText, degrees
            String location = objectMapper.readTree(responseBody).at("/info/tzinfo/name").asText();
            int degrees = objectMapper.readTree(responseBody).at("/fact").at("/temp").asInt();
            String weatherText = objectMapper.readTree(responseBody).at("/fact").at("/feels_like").asText();
            Weather weather= new Weather(location, weatherText, degrees);
            DataBaseRepoitory dataBaseRepoitory = new DataBaseRepoitory();
            dataBaseRepoitory.saveWeather(weather);
            System.out.println("Сегодня погода в "+location+ " "+ "+"+degrees+". Ощущается как " + weatherText+" градусов.");
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
            String location = objectMapper.readTree(responseBody).at("/info/tzinfo/name").asText();
            int degrees = objectMapper.readTree(responseBody).at("/fact").at("/temp").asInt();
            String weatherText = objectMapper.readTree(responseBody).at("/fact").at("/feels_like").asText();
            System.out.println("Сегодня погода в "+location+ " "+ "+"+degrees+". Ощущается как " + weatherText+" градусов.");
        }

    }

    public static void getCityPiter(String lat, String lon, Period period) throws IOException {
        if (period == Period.NOW) {
            HttpUrl url = new HttpUrl.Builder()
                    .scheme(PROTOCOL)
                    .host(BASE_URL)
                    .addPathSegment(VERSION)
                    .addPathSegment(PART_URL)
                    .addQueryParameter("lat", latPiter)
                    .addQueryParameter("lon", lonPiter)
                    .addQueryParameter("lang", langRU)
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .get()
                    .addHeader(KEY_NAME, XYandexAPIKey)
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            String responseBody = response.body().string();
            String location = objectMapper.readTree(responseBody).at("/info/tzinfo/name").asText();
            int degrees = objectMapper.readTree(responseBody).at("/fact").at("/temp").asInt();
            String weatherText = objectMapper.readTree(responseBody).at("/fact").at("/feels_like").asText();
            Weather weather= new Weather(location, weatherText, degrees);
            DataBaseRepoitory dataBaseRepoitory = new DataBaseRepoitory();
            dataBaseRepoitory.saveWeather(weather);
            System.out.println("Сегодня погода в "+location+ " "+ "+"+degrees+". Ощущается как " + weatherText+" градусов.");
        }

        if (period == Period.FIVE_DAY) {
            HttpUrl url = new HttpUrl.Builder()
                    .scheme(PROTOCOL)
                    .host(BASE_URL)
                    .addPathSegment(VERSION)
                    .addPathSegment(PART_URL)
                    .addQueryParameter("lat", latPiter)
                    .addQueryParameter("lon", lonPiter)
                    .addQueryParameter("lang", langRU)
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .get()
                    .addHeader(KEY_NAME, XYandexAPIKey)
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            String responseBody = response.body().string();
            String location = objectMapper.readTree(responseBody).at("/info/tzinfo/name").asText();
            int degrees = objectMapper.readTree(responseBody).at("/fact").at("/temp").asInt();
            String weatherText = objectMapper.readTree(responseBody).at("/fact").at("/feels_like").asText();

            System.out.println("Сегодня погода в "+location+ " "+ "+"+degrees+". Ощущается как " + weatherText+" градусов.");
        }

    }

    public static void getCityKaliningrad(String lat, String lon, Period period) throws IOException {
        if (period == Period.NOW) {
            HttpUrl url = new HttpUrl.Builder()
                    .scheme(PROTOCOL)
                    .host(BASE_URL)
                    .addPathSegment(VERSION)
                    .addPathSegment(PART_URL)
                    .addQueryParameter("lat", latKaliningrad)
                    .addQueryParameter("lon", lonKaliningrad)
                    .addQueryParameter("lang", langRU)
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .get()
                    .addHeader(KEY_NAME, XYandexAPIKey)
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            String responseBody = response.body().string();
            String location = objectMapper.readTree(responseBody).at("/info/tzinfo/name").asText();
            int degrees = objectMapper.readTree(responseBody).at("/fact").at("/temp").asInt();
            String weatherText = objectMapper.readTree(responseBody).at("/fact").at("/feels_like").asText();
            Weather weather= new Weather(location, weatherText, degrees);
            DataBaseRepoitory dataBaseRepoitory = new DataBaseRepoitory();
            dataBaseRepoitory.saveWeather(weather);
            System.out.println("Сегодня погода в "+location+ " "+ "+"+degrees+". Ощущается как " + weatherText+" градусов.");
        }

        if (period == Period.FIVE_DAY) {
            HttpUrl url = new HttpUrl.Builder()
                    .scheme(PROTOCOL)
                    .host(BASE_URL)
                    .addPathSegment(VERSION)
                    .addPathSegment(PART_URL)
                    .addQueryParameter("lat", latKaliningrad)
                    .addQueryParameter("lon", lonKaliningrad)
                    .addQueryParameter("lang", langRU)
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .get()
                    .addHeader(KEY_NAME, XYandexAPIKey)
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            String responseBody = response.body().string();
            String location = objectMapper.readTree(responseBody).at("/info/tzinfo/name").asText();
            int degrees = objectMapper.readTree(responseBody).at("/fact").at("/temp").asInt();
            String weatherText = objectMapper.readTree(responseBody).at("/fact").at("/feels_like").asText();
            System.out.println("Сегодня погода в "+location+ " "+ "+"+degrees+". Ощущается как " + weatherText+" градусов.");
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

    public  static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для показа погоды выбирите город: ");
        System.out.println("1 - Москва ");
        System.out.println("2 - Санкт-Петербург ");
        System.out.println("3 - Калининград ");
        String inputWeatherString = scanner.nextLine();

           switch (inputWeatherString){
            case "1": getCityMoscow(latMoscow, lonMoscow, Period.NOW);
                break;
            case "2":
                getCityPiter(latPiter, lonPiter, Period.NOW);
                break;
            case "3":
                getCityKaliningrad(latKaliningrad, lonKaliningrad, Period.NOW);
                break;

        }



    }
}
