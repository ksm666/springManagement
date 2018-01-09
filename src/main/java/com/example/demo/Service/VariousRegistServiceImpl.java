package com.example.demo.Service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.Management.dbflute.exbhv.MemberBhv;
import com.Management.dbflute.exentity.Member;

@Service
public class VariousRegistServiceImpl implements VariousRegistService {

	@Autowired
	MemberBhv memberBhv; 
	
	@Override
	public void regist(VariousRegistDto dto) {
		
		Member member = new Member();

		
		memberBhv.insert(member);

	}

}
