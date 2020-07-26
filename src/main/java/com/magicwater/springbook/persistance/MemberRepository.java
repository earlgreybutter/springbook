package com.magicwater.springbook.persistance;

import com.magicwater.springbook.domain.Member;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {
    
}