package ru.sbrf.ufs.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import ru.sbrf.ufs.service.MyService;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequiredArgsConstructor
public class MyController {

    private final MyService myService;

    @GetMapping("/test")
    public String test() {
        return myService.get();
    }

    @GetMapping("/header")
    public String header(@RequestHeader("test_header") @NotBlank String header) {
        return myService.get(header);
    }
}
