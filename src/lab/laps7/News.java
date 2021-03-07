package lab.laps7;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    int id;
    String title, publishDate, author, content;
    float averageRate;

    public News(int id, String title, String publishDate, String author, String content) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println(title + " - " + publishDate + " - " + author + " - " + content + " - " + averageRate);
    }

    int rateList[] = new int[3];

    public void nhapRateList() {
        for (int i = 0; i < rateList.length; i++) {
            System.out.println("Moi ban nhap gia tri thu " + i);
            Scanner sc = new Scanner(System.in);
            rateList[i] = sc.nextInt();
        }
    }

    public void calculate() {
        int sum = 0;
        for (int i = 0; i < rateList.length; i++) {
            sum += rateList[i];
        }
        averageRate = (float) sum / rateList.length;
    }


}
