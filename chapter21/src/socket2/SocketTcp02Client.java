package socket2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTcp02Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket((InetAddress.getLocalHost()), 9999);
        System.out.println("客户端socket返回=" + socket.getClass());

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server".getBytes());
        socket.shutdownOutput();


        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}