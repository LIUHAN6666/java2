package socket2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTcp02Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();//阻塞

        System.out.println("服务端在socket=" + socket.getClass());

        InputStream inputStream = socket.getInputStream();

        byte[] buf = new byte[1024];
        int readLIne = 0;
        while ((readLIne = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLIne));
        }

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        socket.shutdownOutput();


        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
