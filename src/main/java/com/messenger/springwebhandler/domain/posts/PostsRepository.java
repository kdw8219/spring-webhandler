package com.messenger.springwebhandler.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//보통 ibatis / mybatis에서는 DAO라고 부름 이걸.
//이렇게 하면 기본적인 CRUD Method가 생성됨
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
