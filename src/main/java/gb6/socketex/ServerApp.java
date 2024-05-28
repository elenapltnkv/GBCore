package gb6.socketex;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) {
        try(ServerSocket serverSocket =new ServerSocket(1234)){
            System.out.println("Сервер запущен");
           Socket socket= serverSocket.accept();
            System.out.println("Клиент подключился");
            DataOutputStream dataOutputStream= new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true){
                String data = dataInputStream.readUTF();
                if(data.equals("end")) break;
                System.out.println("Получили сообщение: "+ data);
                dataOutputStream.writeUTF("Получили сообщение: "+ data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
