package com.tamidev.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("tami-gill-code-images");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
