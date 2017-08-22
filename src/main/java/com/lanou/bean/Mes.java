package com.lanou.bean;

public class Mes {
    private int down;
    private int id;
    private int up;
    private String content;
    public Mes() {
    }

    public Mes( int up,String content, int id, int down) {
        this.content = content;
        this.id = id;
        this.up = up;
        this.down = down;

    }

    @Override
    public String toString() {
        return "com.lanou.bean.Mes{" +
                "content='" + content + '\'' +
                ", id=" + id +
                ", up=" + up +
                ", down=" + down +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUp() {
        return up;
    }

    public void setUp(int up) {
        this.up = up;
    }

    public int getDown() {
        return down;
    }

    public void setDown(int down) {
        this.down = down;
    }


}
