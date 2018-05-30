<%@ page language="java" contentType="text/html;utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

</head>
<body>
<h2>文件上传</h2>
    <form action="/yinyao/hello/fileSave.do" enctype="multipart/form-data" method="post">
        
          <!--       文件描述:<input type="text" name="description"><br> -->
           请选择文件:<input type="file" name="file"><br>
           <input type="text" name="text"/>
           <input type="submit" value="上传">      
    </form>
    <table class="table1">
       <thead>
       <tr>
             <td>姓名</td>
             <td>性别</td>
             <td>民族</td>
             <td>身份证</td>
             <td>地址</td>
          </tr>
          </thead>
       <tbody>
          <tr>
             <td>尹垚</td>
             <td>男</td>
             <td>汉族</td>
             <td>2330证</td>
             <td>山东</td>
          </tr>
          <tr>
             <td>高猛</td>
             <td>男</td>
             <td>汉族</td>
             <td>2330证</td>
             <td>山东</td>
          </tr>
          <tr>
             <td>刘鹏</td>
             <td>男</td>
             <td>汉族</td>
             <td>2330证</td>
             <td>山东</td>
          </tr>
          <tr>
             <td>孙斌</td>
             <td>男</td>
             <td>汉族</td>
             <td>2330证</td>
             <td>山东</td>
          </tr>
        
       </tbody>
    </table>
</body>
</html>