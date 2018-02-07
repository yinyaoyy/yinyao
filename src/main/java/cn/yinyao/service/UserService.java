package cn.yinyao.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.yinyao.dao.UserDao;
import cn.yinyao.entity.User;
import cn.yinyao.entity.UserParam;

@Service
public class UserService {

	@Resource
	private UserDao userDao;

	public void save(Map<String,String> map) {

		userDao.save(map);
	}

	public void delete(int id) {
		userDao.delete(id);
	}

	public void update(Map<String, Object> map) {
		userDao.update(map);
		
	}
	
	public void saveAll(List<UserParam> list) {
		userDao.saveAll(list);
		
	}
	public List<User> getPage(int pageIndex,int pageSize) {
		int start = (pageIndex-1)*pageSize;
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("pageSize", pageSize);
		map.put("pageIndex", start);
		List<User> list = userDao.getPage(map);
		return list;
	}

	
}
