package com.gdstruc.module4;


import java.util.Objects;

public class Player {
    private int id;
    private String name;
    private int level;

    public Player(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String toString() {
        return "Player{id=" + this.id + ", name='" + this.name + "', level=" + this.level + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Player player = (Player)o;
            return this.id == player.id && this.level == player.level && Objects.equals(this.name, player.name);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name, this.level});
    }
}

