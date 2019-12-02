package com.messenger.springwebhandler.domain;


import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass //JPA Entity클래스 들이 BaseTimeEntity를 상속할 때 해당 변수도 컬럼으로 인식하게 함
@EntityListeners(AuditingEntityListener.class) //BaseTimeEntity에 Auditing 기능을 포함.. 추적하여 자동 변경
public abstract class BaseTimeEntity {
    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}