// package com.tericcabrel.authapi.controllers;

// import com.tericcabrel.authapi.entities.Member;
// import com.tericcabrel.authapi.services.MemberService;
// import org.springframework.http.ResponseEntity;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*; 

// import java.util.List;

// @RequestMapping("/members")

// @RestController
// public class MemberController {
	 
	  // @Autowired
    // private MemberService memberService;

    // @PostMapping("/member")
    // public Member saveEmployee(@RequestBody Member employee) {
        // return memberService.saveEmployee(employee);
    // }

    // @GetMapping("/member")
    // public List<Member> getAllEmployees() {
        // return memberService.fetchAllEmployees();
    // }

    // @GetMapping("/member/{id}")
    // public Member getEmployeeById(@PathVariable("id") Long id) {
        // return memberService.getEmployeeById(id);
    // }

    // @PutMapping("/member/{id}")
    // public Member updateEmployee(@PathVariable("id") Long id, @RequestBody Member employee) {
        // return memberService.updateEmployeeById(id, employee);
    // }

    // @DeleteMapping("/member/{id}")
    // public String deleteEmployee(@PathVariable("id") Long id) {
        // return memberService.deleteDepartmentById(id);
    // }
 
// }
