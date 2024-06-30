package com.housing.back.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor // 매개변수가 없는 생성자
@AllArgsConstructor // 모든 필드에 대한 생성자 생성
@Entity(name = "user")
@Table(name = "user") //데이터베이스와의 매핑
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    private String password;
    private String email;
    private String type;
    private String role;

}
