package com.infnet.model;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fileName;
    private String courseName;

    public Material() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return fileName.equals(material.fileName) &&
                courseName.equals(material.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, courseName);
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
