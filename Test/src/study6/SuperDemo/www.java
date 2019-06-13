package study6.SuperDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class www {

    private final static int PORT = 13;
    private static final String HOSTNAME = "192.168.2.185";


    public static void main(String[] args) {
        //传入0表示让操作系统分配一个端口号

        try (DatagramSocket socket = new DatagramSocket(0)) {

            while (true){
                try{ Thread.sleep(500); }catch (Exception ee){ }

                socket.setSoTimeout(1000000);
                InetAddress host = InetAddress.getByName(HOSTNAME);
                //指定包要发送的目的地
                DatagramPacket request = new DatagramPacket(new byte[1], 1, host, PORT);
                //为接受的数据包创建空间
                DatagramPacket response = new DatagramPacket(new byte[1024], 1024);
                socket.send(request);
                socket.receive(response);
                String result = new String(response.getData(), 0, response.getLength(), "UTF-8");
                System.out.println("接受到的值:"+result);

            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
