/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package downloadmanager_main;

import java.io.Serializable;
import javax.swing.*;

public class MyFile implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name, link, directory, time;
    private double speed = 0;
    private JLabel speedLabel;
    private JPanel panel;
    private DownloadThread downloadThread;

    MyFile(String directory, String time) {
        this.directory = directory;
        this.time = time;

    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public String getDirectory() {
        return directory;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public JLabel getSpeedLabel() {
        return speedLabel;
    }

    public DownloadThread getDownloadThread() {
        return downloadThread;
    }

    public void setDownloadThread(DownloadThread downloadThread) {
        this.downloadThread = downloadThread;
    }


}
