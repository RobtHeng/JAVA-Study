package com.test.work.entity;

public class Kid {
    int id;
    Kid left;
    Kid right;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Kid getLeft() {
        return left;
    }

    public void setLeft(Kid left) {
        this.left = left;
    }

    public Kid getRight() {
        return right;
    }

    public void setRight(Kid right) {
        this.right = right;
    }
}
