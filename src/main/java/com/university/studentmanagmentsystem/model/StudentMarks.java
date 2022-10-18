package com.university.studentmanagmentsystem.model;

import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.*;

@Entity
public class StudentMarks implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long studentId;
    private String fileName;
    private String fileType;
    @Lob
    private byte[] data;

    public StudentMarks() {
    }

    public StudentMarks(Long studentId, String fileName, String fileType, byte[] data) {
        this.studentId = studentId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
            "id=" + id +
            ", studentId=" + studentId +
            ", fileName='" + fileName + '\'' +
            ", fileType='" + fileType + '\'' +
            ", data=" + Arrays.toString(data) +
            '}';
    }
}
