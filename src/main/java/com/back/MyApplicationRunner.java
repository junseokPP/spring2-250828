package com.back;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

@RequiredArgsConstructor
public class MyApplicationRunner implements ApplicationRunner {
    private final int version;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("어플리케이션이 시작되었습니다." + "version: " + version);
    }

}
