package com.messenger.springwebhandler.web;

import com.messenger.springwebhandler.domain.posts.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.messenger.springwebhandler.DTO.PostsSaveRequestDto;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;

    //@AllArgsConstructor -> 아래와 같은 member를 Argument로 가지는 Class를 생성함
    /*
    public WebRestController(PostsRepository postsRepository)
    {
        this.postsRepository = postsRepository; //주입
    }
    */

    @GetMapping("/hello")//Get으로 /hello로 들어올 때 ReponseBody, 즉 json으로 데이터를 반환함.
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("Posts")
    public void setPosts(@RequestBody PostsSaveRequestDto postDto)
    {
        postsRepository.save(postDto.toEntity());
    }
}
