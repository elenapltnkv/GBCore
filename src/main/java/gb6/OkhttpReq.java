package gb6;

import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OkhttpReq {
    public static void main(String[] args) throws IOException {
//https://reqres.in/api/users?page=2
        String URL = "https://reqres.in/api/users?page=2";
        String URL1 = "https://reqres.in/api/users";
        String URL2 = "https://reqres.in/api/users/7";
        MediaType JSON = MediaType.parse("JSON");
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
//        HttpUrl url = new HttpUrl.Builder()
//                .scheme("https")
//                .host("reqres.in")
//                //.addPathSegment("/")
//                .build();

        Request request = new Request.Builder()
                .url(URL)
                //.url("/api/users?page=2")
                .get()
                .build();

        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.headers());
        String body = response.body().string();
        System.out.println(body);

        System.out.println("Create new user: ");
        String createNewUser = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        RequestBody requestBody1 = RequestBody.create(createNewUser, JSON);

        Request request1 = new Request.Builder()
                .url(URL1)
                .post(requestBody1)
                .build();
        Response response1 = okHttpClient.newCall(request1).execute();
        System.out.println("status code: "+response1.code());
        System.out.println(response1.body().string());



        System.out.println("Update user: ");
        String updateUser = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        RequestBody requestBody2 = RequestBody.create(updateUser, JSON);

        Request request2 = new Request.Builder()
                .url(URL2)
                .put(requestBody2)
                .build();
        Response response2 = okHttpClient.newCall(request2).execute();
        System.out.println("status code: "+response2.code());
        String updateUserData = response2.body().string();
        System.out.println(updateUserData);




    }
}
