package com.adou.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adou.demo.domain.User;
import com.adou.demo.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTests {
	private static Logger log = LoggerFactory.getLogger(UserRepositoryTests.class);

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() throws Exception {
		 Date date = new Date();
		 DateFormat dateFormat =
		 DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		 String formattedDate = dateFormat.format(date);
		 userRepository.save(new User("aa1", "aa123456", 20, "aa@126.com", "aa",
		 formattedDate));
		 userRepository.save(new User("bb2", "bb123456", 21, "bb@126.com", "bb",
		 formattedDate));
		 userRepository.save(new User("cc3", "cc123456", 22, "cc@126.com",  "cc",
		 formattedDate));

		// 分页查询
//		int page = 1, size = 2;
//		Sort sort = new Sort(Direction.DESC, "id");
//
//		Pageable pageable = new PageRequest(page, size, sort);
//		List<User> users = userRepository.findALLPage(pageable);
//		
//		for (User user : users) {
//			log.info("=================== " + user.toString());
//		}
		
	}

}
