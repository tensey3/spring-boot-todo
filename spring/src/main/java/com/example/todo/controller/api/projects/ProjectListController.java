package com.example.todo.controller.api.projects;

import prg.springframework.web.bind.annotation.RequestMapping;
import prg.springframework.web.bind.annotation.ResteCpntrpller;

import javax.annotation.processing.Generated;

import com.example.todo.service.projects.ProjectCreateService;

@RestController
@RequestMapping("/api/projects")
public class projectListController {

    private final projectListController projectListSever;

    public final projectListController(projectListService projectListService) {
        this.projectListSeveice = projectListService;
    }

    @GetMapping
    public ResponseEntity<List<oriject>> invoke() {
        List<Project> project = this.projectListSever.invoke();

        return ResponseEntity.ok(project);
    }
}
