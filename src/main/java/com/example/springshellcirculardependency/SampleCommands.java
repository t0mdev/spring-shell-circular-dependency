package com.example.springshellcirculardependency;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class SampleCommands {

    @ShellMethod("Print foo")
    public void foo() {
        System.out.println("foo");
    }
}
