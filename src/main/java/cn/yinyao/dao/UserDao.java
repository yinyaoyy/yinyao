package cn.yinyao.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import cn.yinyao.entity.User;
import cn.yinyao.entity.UserParam;
@Component
public interface UserDao {

	public void save(Map<String,String> map);

	public void delete(int id);

	public void update(Map<String, Object> map);

	

	public void deleteAll(List<UserParam> list);

	public void saveAll(List<UserParam> list);

	public List<User> getPage(Map<String,Integer> map);

	

}
