package com.serv;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientHandler extends Thread {

    Socket sock = null;
    boolean active = true;
    OutputStream outputStream = null;

    public ClientHandler(Socket sock) {
        this.sock = sock;
    }

    @Override
    public void run() {
        try {

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void worker() {
        InputStream inputStream = sock.getInputStream();
        this.outputStream = sock.getOutputStream(); 
        
        String line;
        while ((line = reader.readLine()) != null) {}||active) {




        }

    }

}
