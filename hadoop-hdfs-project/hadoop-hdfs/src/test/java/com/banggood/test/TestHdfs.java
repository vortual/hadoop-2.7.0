package com.banggood.test;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class TestHdfs {
    public static void main(String[] args) throws Exception {
        FileSystem fs = FileSystem.newInstance(new Configuration());
        fs.mkdirs(new Path("xx"));
    }
}
