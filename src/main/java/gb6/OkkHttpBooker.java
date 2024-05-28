package gb6;

import okhttp3.*;

import java.io.IOException;

public class OkkHttpBooker {
    public static void main(String[] args) throws IOException {
        //https://restful-booker.herokuapp.com/auth
        String URL = "https://restful-booker.herokuapp.com/auth";
        String requesrBodyBooker = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        MediaType JSON = MediaType.parse("JSON");
        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody requestBody = RequestBody.create(requesrBodyBooker, JSON);
        Request request = new Request.Builder()
                .url(URL)
                .post(requestBody)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.code());
        String responseBody = response.body().string();
        System.out.println(responseBody);
        //{"token":"499ad38b1e11f1f"}

         /*
        https://restful-booker.herokuapp.com/booking
curl -X POST \
  https://restful-booker.herokuapp.com/booking \
  -H 'Content-Type: application/json' \
  -d '{
    "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}'
         */

        String token = responseBody.split(":")[1];
        System.out.println(token);
        String resultToken = token.replaceAll("[\"}]", "");
        System.out.println(resultToken);

        String bookingBody = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        RequestBody requestBodyBooking = RequestBody.create(bookingBody, JSON);
        Request requestBooking = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/booking")
                .post(requestBodyBooking)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .addHeader("Cookie", String.format("token=$s", resultToken))
                .build();

        Response responseBooking = okHttpClient.newCall(requestBooking).execute();
        System.out.println(responseBooking.body().string());


//        String updateURL = "https://restful-booker.herokuapp.com/booking/3230";
        String updateBookingBody = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        RequestBody requestBodyUpdateBooking = RequestBody.create(updateBookingBody, JSON);
        Request requestBookingUpdate = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/booking/1")
                .put(requestBodyUpdateBooking)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .addHeader("Cookie", String.format("token=$s", resultToken))
                .addHeader("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .build();
        Response responseUpdateBooking = okHttpClient.newCall(requestBookingUpdate).execute();
        System.out.println(responseUpdateBooking.code());
        System.out.println(responseUpdateBooking.headers());
        String responseAnswer = responseUpdateBooking.body().string();
        System.out.println(responseAnswer);

        //DeleteBooking
        System.out.println("DeleteBooking: ");
        System.out.println("__________________");
        Request requestBookingDelete = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/booking/1")
                .delete()
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .build();
        Response responseBookingDelete = okHttpClient.newCall(requestBookingDelete).execute();
        System.out.println(responseBookingDelete.code());
        System.out.println(responseBookingDelete.headers());
        String responseDeleteData = responseBookingDelete.body().string();
        System.out.println(responseDeleteData);
    }
}
