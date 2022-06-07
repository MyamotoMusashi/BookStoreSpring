package com.knifed.bookstore.controllers;

import com.knifed.bookstore.entities.Paper;
import com.knifed.bookstore.repositories.PaperRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;

@RestController
public class PaperController {

    private PaperRepository paperRepository;

    public PaperController(PaperRepository paperRepository) {
        this.paperRepository = paperRepository;
    }

    @GetMapping("/papers")
    public List<Paper> getPapers(@RequestParam String page) {
        Integer pageInt = Integer.parseInt(page);
        Integer pageSize = 6;
        Integer result = this.paperRepository.findAll(PageRequest.of(0, pageSize)).getTotalPages();
        System.out.println(result);
        return this.paperRepository.findAll(PageRequest.of(pageInt, pageSize).withSort(Sort.by("id"))).getContent();
    }
}