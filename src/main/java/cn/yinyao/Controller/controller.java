package cn.yinyao.Controller;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.yinyao.service.UserService;

@Controller
@RequestMapping("/hello")
public class controller {

	private static Logger logger = Logger.getLogger(controller.class);
	@Resource 
	private UserService userService;
	@RequestMapping("/login")
	@ResponseBody
	public String say(@RequestParam("username") String name,
			          @RequestParam("password") String word,String address) throws IOException {
		logger.info("名字："+name+"密码："+word+"地址:"+address);
		Map<String,String> map= new HashMap<String,String>();
		map.put("username", name);
		map.put("password", word);
		map.put("address", address);
		userService.save(map);
		return "username:"+name+"password:"+word+"address:"+address;
	}
	@RequestMapping("/delete")
	@ResponseBody
	public String say1(int id) throws Exception {
		logger.info("id:"+id);
		userService.delete(id);
		return "true";
	}
	@RequestMapping("/update")
	@ResponseBody
	public String update(@RequestParam("username") String name,
	          @RequestParam("password") String word,String address,int id) throws Exception {
		Map<String,Object> map= new HashMap<String,Object>();
		map.put("username", name);
		map.put("password", word);
		map.put("address", address);
		map.put("id", id);
		userService.update(map);
		return "true";
	}
//	@RequestMapping(value="/fileSave",method=RequestMethod.POST)
//	@ResponseBody
//	public String saveFile(@RequestParam("fileSave")MultipartFile file) throws Exception {
//		String fileName = UUID.randomUUID().toString();
//		System.out.println(fileName);
//		String fileFix = file.getOriginalFilename();
//		System.out.println(fileFix);
//		file.transferTo(new File("E:\\file\\"+File.separator+fileName+fileFix));
//		return "true";
//	}
	@RequestMapping(value="/fileSave",method=RequestMethod.POST)
    public String upload(HttpServletRequest request,
         
           @RequestParam("file") MultipartFile file) throws Exception {

       System.out.println(file.getOriginalFilename());
       //如果文件不为空，写入上传路径
       if(!file.isEmpty()) {
           //上传文件路径
           String path = request.getServletPath();
           System.out.println(path);
           //上传文件名
           String filename = file.getOriginalFilename();
           File filepath = new File(path,filename);
           System.out.println(filepath);
           //判断路径是否存在，如果不存在就创建一个
           if (!filepath.getParentFile().exists()) { 
               filepath.getParentFile().mkdirs();
           }
           //将上传文件保存到一个目标文件当中
           file.transferTo(new File(path + File.separator + filename));
           return "success";
       } else {
           return "error";
       }

    }	
	
}
