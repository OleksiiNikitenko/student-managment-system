package com.university.studentmanagmentsystem.model;

public class ResponseStudentMarks {
    private String fileName;
    private String fileType;
    private Long fileSize;
    private String downloadUrl;

    public ResponseStudentMarks() {
    }

    public ResponseStudentMarks(String fileName, String fileType, Long fileSize, String downloadUrl) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.downloadUrl = downloadUrl;
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

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public String toString() {
        return "ResponseStudentMarks{" +
            "fileName='" + fileName + '\'' +
            ", fileType='" + fileType + '\'' +
            ", fileSize=" + fileSize +
            ", downloadUrl='" + downloadUrl + '\'' +
            '}';
    }
}
