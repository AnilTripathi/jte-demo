package com.jte.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jte.demo.records.Todos;

import java.util.List;

@Controller
public class TodoController {

    @GetMapping("/")
    public String listTodos(Model model) {
        List<Todos> todos = List.of(
                new Todos(1L, "Learn Spring Boot", "Complete Spring Boot tutorial", false),
                new Todos(2L, "Create YouTube Video", "Record and edit tutorial video", false),
                new Todos(3L, "Write Documentation", "Document the code and process", true)
        );

        model.addAttribute("todos", todos);
        model.addAttribute("pageTitle", "My Todo List");
        return "index";
    }
}
