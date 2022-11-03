/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package downloadmanager_main;
import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;


public class HTTPDownloader implements Serializable {

    private transient HttpURLConnection httpConn;
    private transient InputStream inputStream;

    public void downloadFile(MyFile file) throws IOException {
        URL url = new URL(file.getLink());
        httpConn = (HttpURLConnection) url.openConnection();
        int responseCode = httpConn.getResponseCode();

        if (responseCode / 100 == 2) { 
            inputStream = httpConn.getInputStream();
        }
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void disconnect() throws IOException {
        inputStream.close();
        httpConn.disconnect();
    }
}