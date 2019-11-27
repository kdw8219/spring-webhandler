package com.messenger.springwebhandler.DTO;

import com.messenger.springwebhandler.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/* DTO를 따로 만드는 이유는 DB 로직(Entity)와 DTO (Request / Response 처리 로직)을 별도로 관리하기 위해서*/
/* Controller에서 @RequestBody로 외부에서 데이터를 받는 경우엔 기본생성자 + set메소드를 통해서만 값이 할당됨 */
/* 따라서 Setter를 생성해주고, setPost 시 사용된 annotation @RequestBody에 의해 자동으로 값이 설정됨*/
/* 별도로 AllArgsConstruct 이런거 해줄 필요 없음 */
@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    public Posts toEntity()
    {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
