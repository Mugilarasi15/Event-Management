package com.celebrato.backend.controller;


import com.celebrato.backend.model.Inquiry;
import com.celebrato.backend.service.InquiryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inquiries")
@CrossOrigin(origins = "*")  // Allow frontend access
public class InquiryController {

    private final InquiryService inquiryService;

    public InquiryController(InquiryService inquiryService) {
        this.inquiryService = inquiryService;
    }

    // Save new inquiry
    @PostMapping
    public Inquiry createInquiry(@RequestBody Inquiry inquiry) {
        return inquiryService.saveInquiry(inquiry);
    }

    // Get all inquiries
    @GetMapping
    public List<Inquiry> getAllInquiries() {
        return inquiryService.getAllInquiries();
    }

    // Get single inquiry
    @GetMapping("/{id}")
    public Inquiry getInquiryById(@PathVariable Long id) {
        return inquiryService.getInquiryById(id);
    }
}

