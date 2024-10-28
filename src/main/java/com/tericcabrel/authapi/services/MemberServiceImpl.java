// package com.tericcabrel.authapi.services;

// import com.tericcabrel.authapi.entities.Member;
// import com.tericcabrel.authapi.repositories.MemberRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;
// import java.util.Objects;
// import java.util.Optional;
 
// import java.util.List;

 // @Service
// public class MemberServiceImpl implements MemberService {
	
    // @Autowired
    // private MemberRepository memberRepository;

    // @Override
    // public Member saveEmployee(Member employee) {
        // return memberRepository.save(employee);
    // }

    // @Override
    // public List<Member> fetchAllEmployees() {
        // List<Member> allEmployees = memberRepository.findAll();
        // return allEmployees;
    // }

    // @Override
    // public Member getEmployeeById(Long id) {
        // Optional<Member> employee = memberRepository.findById(id);
        // if (employee.isPresent()) {
            // return employee.get();
        // }
        // return null;
    // }

    // @Override
    // public Member updateEmployeeById(Long id, Member employee) {
        // Optional<Member> employee1 = memberRepository.findById(id);

        // if (employee1.isPresent()) {
            // Member originalEmployee = employee1.get();

            // if (Objects.nonNull(employee.getEmployeeName()) && !"".equalsIgnoreCase(employee.getEmployeeName())) {
                // originalEmployee.setEmployeeName(employee.getEmployeeName());
            // }
            // if (Objects.nonNull(employee.getEmployeeSalary()) && employee.getEmployeeSalary() != 0) {
                // originalEmployee.setEmployeeSalary(employee.getEmployeeSalary());
            // }
            // return memberRepository.save(originalEmployee);
        // }
        // return null;
    // }

    // @Override
    // public String deleteDepartmentById(Long id) {
        // if (memberRepository.findById(id).isPresent()) {
            // memberRepository.deleteById(id);
            // return "Employee deleted successfully";
        // }
        // return "No such employee in the database";
    // }
// }
