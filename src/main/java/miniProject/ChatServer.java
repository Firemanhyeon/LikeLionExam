package miniProject;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(9993)){
            System.out.println("서버가 준비되었습니다.");
            Map<String, PrintWriter> chatClients = new HashMap<>();
            Map<Integer, List<String>> room = new HashMap<>();
            int count=0;
            while(true){
                Socket socket = serverSocket.accept();
                new ServerMessageWriter(socket , chatClients , room , count).start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
