package gb6;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
    public static void main(String[] args) throws MalformedURLException {
        URL url =new URL("https://dzen.ru/a/ZV40z-KaylGNNUMW");
        System.out.println("Протокол: "+url.getProtocol());
        System.out.println("Хост: "+url.getHost());
        System.out.println("Файл: "+url.getFile());
    }
}
