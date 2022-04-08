package com.org.example.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * NoArgsConstructor : 기본 생성자 자동 추가
 * Entity : 테이블과 링크될 클래스임을 나타낸다(카멜 -> 언더스코어 네이밍)
 */
@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id //해당 테이블의 PK필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성규칙
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    /**
     * Builder : 해당 클래스의 빌더 패턴 클래스를 생성
     * @param title
     * @param content
     * @param author
     */
    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
