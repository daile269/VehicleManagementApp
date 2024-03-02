package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.JobTitle;
import com.springbootapp.vehicleapp.services.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/jobTitle")
public class JobTitleController {
    @Autowired
    private JobTitleService JobTitleService;


    @GetMapping
    public String getJobTitle(Model model){
        List<JobTitle> JobTitleList = JobTitleService.getJobTitle();
        model.addAttribute("jobTitle",JobTitleList);
        return "jobTitle";
    }

    @PostMapping("/addJobTitle")
    public String addNewJobTitle(JobTitle JobTitle){
        JobTitleService.saveJobTitle(JobTitle);
        return "redirect:/jobTitle";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<JobTitle> findByID(Long id){
        return JobTitleService.findById(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateJobTitle(JobTitle JobTitle){
        JobTitleService.saveJobTitle(JobTitle);
        return "redirect:/jobTitle";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteJobTitle(Long id){
        JobTitleService.deleteJobTitle(id);
        return "redirect:/jobTitle";
    }

}
