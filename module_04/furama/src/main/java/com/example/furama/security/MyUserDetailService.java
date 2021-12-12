//package com.example.furama.security;
//
//import com.example.furama.model.employee.User;
//import com.example.furama.repository.employee.IUserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MyUserDetailService implements UserDetailsService {
//    @Autowired
//    private IUserRepository repository;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = repository.findByUserName(username);
//            if (user == null){
//                throw new UsernameNotFoundException("Tên tài khoản không tồn tại");
//            }
//
//        return new MyUserDetail(user);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
