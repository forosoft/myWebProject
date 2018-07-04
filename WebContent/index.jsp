<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>$Title$</title>
</head>
<body>
<table border="1">
    <tr>
        <td>id</td>
        <td>title</td>
        <td>author</td>
        <td>date</td>
    </tr>
    <!-- 使用struts2标签库中的iterator将所有数据遍历循环显示出来 -->
    <s:iterator value="#runoobTblList" status="bcs">
        <tr>
            <td><s:property value="runoobId"></s:property></td>
            <td><s:property value="runoobTitle"></s:property></td>
            <td><s:property value="runoobAuthor"></s:property></td>
            <td><s:date name="submissionDate" format="yyyy年MM月dd日"></s:date></td>
        </tr>
    </s:iterator>
    <!-- 判断查询出来等于0，就显示“没有查找到数据” -->
    <s:if test="runoobTblList.size()==0">
        <tr>
            <td colspan="7">没有查找到数据</td>
        </tr>
    </s:if>
</table>
</body>
</html>
