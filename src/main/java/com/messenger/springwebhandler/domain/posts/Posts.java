package com.messenger.springwebhandler.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity//Table과 링크될 것임을 나타냄(SalesManager.java -> sales_manager table 이런 식으로 매핑됨)
//Table과 매칭될 클래스로, 이걸 Entity Class라고 부른다.
//JPA로 DB 데이터에 작업할 경우 Query 전송 보다는 Entity Class를 수정한다.
public class Posts {
    @Id
    @GeneratedValue //PK로 생성됨을
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition =  "TEXT", nullable = false)
    private String content;

    private String author;

    //지금 이건 protected니까.
    @Builder //Builder로 Class를 생성하고, Public Method로 값을 채워넣는 방식을 사용할 것.
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
