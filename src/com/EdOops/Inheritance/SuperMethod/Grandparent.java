package com.EdOops.Inheritance.SuperMethod;

public class Grandparent {
    private String eyeColor;
    private int height;

    public Grandparent(String eyeColor, int height) {
        this.eyeColor = eyeColor;
        this.height = height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void hasSuperPowers() {
        boolean superPowers = false;
    }

    public void GrandParent() {
        System.out.println("GrandParent method called.");
    }
}
