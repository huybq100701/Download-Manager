/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package downloadmanager_main;
import javax.swing.*;
import java.io.File;
import java.io.Serializable;


public class DownloadThread extends SwingWorker<Void, Void> implements Runnable, Serializable {

    private MyFile file;
    private HTTPDownloader downloader;

    DownloadThread(MyFile file) {
        super();
        this.file = file;
    }

    public HTTPDownloader getDownloader() {
        return downloader;
    }

}