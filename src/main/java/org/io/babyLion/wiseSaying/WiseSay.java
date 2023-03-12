package org.io.babyLion.wiseSaying;

public class WiseSay {
    private int id;
    private String content;
    private String Author;

    public WiseSay(int id, String content, String author) {
        this.id = id;
        this.content = content;
        Author = author;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return Author;
    }
}
