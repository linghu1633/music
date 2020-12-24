package com.java.music.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 热加载，热更新
 * ctrl shift --> 搜索registry  然后找到 compiler.automake.allow.when.app.running
 * ctrl + F9   执行快捷方式，热加载生效
 */
@SpringBootApplication
public class MusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }

}
