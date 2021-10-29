package com.huarui;

import com.huarui.dao.PostMapper;
import com.huarui.dao.UserMapper;
import com.huarui.entity.Post;
import com.huarui.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbMybatisApplicationTests {


	@Autowired
	private UserMapper userMapper;

	@Autowired
	private PostMapper postMapper;

	/**
	 *  Mybatis表关联一对多
	 */
	@Test
	public void test001() {

		System.out.println("======");
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println("============");
		System.out.println(user);

		User newUser = userMapper.getUser(1);
		System.out.println("===========");
		System.out.println(newUser.getPosts().size());

	}

	/**
	 *  Mybatis表关联一对多
	 */
	@Test
	public void test002() {

		System.out.println("======");
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println("============");
		System.out.println(user);

		User newUser = userMapper.getUser2(1);
		System.out.println("===========");
		System.out.println(newUser.getPosts().size());

	}

	/**
	 *  Mybatis关联多对一
	 */
	@Test
	public void test03(){
		List<Post> posts = postMapper.getPosts(1);
		System.out.println(posts.size());
	}



	/**
	 *  Mybatis关联多对一
	 */
	@Test
	public void test04(){
		List<Post> posts = postMapper.getPosts2(1);
		System.out.println(posts.size());
	}


	/**
	 *  Mybatis left join
	 */
	@Test
	public void test05(){
		List<Post> posts = postMapper.getPosts3(1);
		System.out.println(posts.get(0).getUser());
		System.out.println(posts.size());
	}


	/**
	 *  Mybatis query
	 */
	@Test
	public void test06(){
		List<Post> posts = postMapper.getPosts4(1);
		System.out.println(posts.get(0).getUser());
	}

}

