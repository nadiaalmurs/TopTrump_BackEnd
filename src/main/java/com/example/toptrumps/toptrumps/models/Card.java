package com.example.toptrumps.toptrumps.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cards")
public class Card implements Serializable {
    @Column(name = "name")
    private String name;
    @Column(name = "attack")
    private Integer attack;
    @Column(name = "control")
    private  Integer control;
    @Column(name = "defence")
    private Integer defence;
    @Column(name = "frags")
    private Integer frags;
    @Column(name = "lurk")
    private  Integer lurk;
    @Column(name = "picture_link")
    private String picture;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Card(String name, Integer attack, Integer control, Integer defence, Integer frags, Integer lurk, String picture) {
        this.name = name;
        this.attack = attack;
        this.control = control;
        this.defence = defence;
        this.frags = frags;
        this.lurk = lurk;
        this.picture = picture;
    }

    public Card(){

    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getControl() {
        return control;
    }

    public void setControl(Integer control) {
        this.control = control;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getFrags() {
        return frags;
    }

    public void setFrags(Integer frags) {
        this.frags = frags;
    }

    public Integer getLurk() {
        return lurk;
    }

    public void setLurk(Integer lurk) {
        this.lurk = lurk;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
