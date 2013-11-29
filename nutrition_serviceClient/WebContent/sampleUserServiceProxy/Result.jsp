<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleUserServiceProxyid" scope="session" class="model.business.service.UserServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleUserServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleUserServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleUserServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        model.business.service.UserService getUserService10mtemp = sampleUserServiceProxyid.getUserService();
if(getUserService10mtemp == null){
%>
<%=getUserService10mtemp %>
<%
}else{
        if(getUserService10mtemp!= null){
        String tempreturnp11 = getUserService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String email_1id=  request.getParameter("email16");
            java.lang.String email_1idTemp = null;
        if(!email_1id.equals("")){
         email_1idTemp  = email_1id;
        }
        String password_2id=  request.getParameter("password18");
            java.lang.String password_2idTemp = null;
        if(!password_2id.equals("")){
         password_2idTemp  = password_2id;
        }
        boolean isRegistered13mtemp = sampleUserServiceProxyid.isRegistered(email_1idTemp,password_2idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(isRegistered13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 20:
        gotMethod = true;
        String id_4id=  request.getParameter("id25");
        int id_4idTemp  = Integer.parseInt(id_4id);
        String description_6id=  request.getParameter("description29");
            java.lang.String description_6idTemp = null;
        if(!description_6id.equals("")){
         description_6idTemp  = description_6id;
        }
        String id_7id=  request.getParameter("id31");
        int id_7idTemp  = Integer.parseInt(id_7id);
        %>
        <jsp:useBean id="model1business1entities1Language_5id" scope="session" class="model.business.entities.Language" />
        <%
        model1business1entities1Language_5id.setDescription(description_6idTemp);
        model1business1entities1Language_5id.setId(id_7idTemp);
        String firstname_8id=  request.getParameter("firstname33");
            java.lang.String firstname_8idTemp = null;
        if(!firstname_8id.equals("")){
         firstname_8idTemp  = firstname_8id;
        }
        String lastname_9id=  request.getParameter("lastname35");
            java.lang.String lastname_9idTemp = null;
        if(!lastname_9id.equals("")){
         lastname_9idTemp  = lastname_9id;
        }
        String email_10id=  request.getParameter("email37");
            java.lang.String email_10idTemp = null;
        if(!email_10id.equals("")){
         email_10idTemp  = email_10id;
        }
        String birthday_11id=  request.getParameter("birthday39");
            java.util.Calendar birthday_11idTemp = null;
        if(!birthday_11id.equals("")){
        java.text.DateFormat dateFormatbirthday39 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempbirthday39  = dateFormatbirthday39.parse(birthday_11id);
         birthday_11idTemp = new java.util.GregorianCalendar();
        birthday_11idTemp.setTime(dateTempbirthday39);
        }
        String password_12id=  request.getParameter("password41");
            java.lang.String password_12idTemp = null;
        if(!password_12id.equals("")){
         password_12idTemp  = password_12id;
        }
        %>
        <jsp:useBean id="model1business1entities1User_3id" scope="session" class="model.business.entities.User" />
        <%
        model1business1entities1User_3id.setId(id_4idTemp);
        model1business1entities1User_3id.setLanguage(model1business1entities1Language_5id);
        model1business1entities1User_3id.setFirstname(firstname_8idTemp);
        model1business1entities1User_3id.setLastname(lastname_9idTemp);
        model1business1entities1User_3id.setEmail(email_10idTemp);
        model1business1entities1User_3id.setBirthday(birthday_11idTemp);
        model1business1entities1User_3id.setPassword(password_12idTemp);
        boolean updateProfile20mtemp = sampleUserServiceProxyid.updateProfile(model1business1entities1User_3id);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateProfile20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
case 43:
        gotMethod = true;
        java.lang.String hello43mtemp = sampleUserServiceProxyid.hello();
if(hello43mtemp == null){
%>
<%=hello43mtemp %>
<%
}else{
        String tempResultreturnp44 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(hello43mtemp));
        %>
        <%= tempResultreturnp44 %>
        <%
}
break;
case 46:
        gotMethod = true;
        String id_14id=  request.getParameter("id51");
        int id_14idTemp  = Integer.parseInt(id_14id);
        String description_16id=  request.getParameter("description55");
            java.lang.String description_16idTemp = null;
        if(!description_16id.equals("")){
         description_16idTemp  = description_16id;
        }
        String id_17id=  request.getParameter("id57");
        int id_17idTemp  = Integer.parseInt(id_17id);
        %>
        <jsp:useBean id="model1business1entities1Language_15id" scope="session" class="model.business.entities.Language" />
        <%
        model1business1entities1Language_15id.setDescription(description_16idTemp);
        model1business1entities1Language_15id.setId(id_17idTemp);
        String firstname_18id=  request.getParameter("firstname59");
            java.lang.String firstname_18idTemp = null;
        if(!firstname_18id.equals("")){
         firstname_18idTemp  = firstname_18id;
        }
        String lastname_19id=  request.getParameter("lastname61");
            java.lang.String lastname_19idTemp = null;
        if(!lastname_19id.equals("")){
         lastname_19idTemp  = lastname_19id;
        }
        String email_20id=  request.getParameter("email63");
            java.lang.String email_20idTemp = null;
        if(!email_20id.equals("")){
         email_20idTemp  = email_20id;
        }
        String birthday_21id=  request.getParameter("birthday65");
            java.util.Calendar birthday_21idTemp = null;
        if(!birthday_21id.equals("")){
        java.text.DateFormat dateFormatbirthday65 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempbirthday65  = dateFormatbirthday65.parse(birthday_21id);
         birthday_21idTemp = new java.util.GregorianCalendar();
        birthday_21idTemp.setTime(dateTempbirthday65);
        }
        String password_22id=  request.getParameter("password67");
            java.lang.String password_22idTemp = null;
        if(!password_22id.equals("")){
         password_22idTemp  = password_22id;
        }
        %>
        <jsp:useBean id="model1business1entities1User_13id" scope="session" class="model.business.entities.User" />
        <%
        model1business1entities1User_13id.setId(id_14idTemp);
        model1business1entities1User_13id.setLanguage(model1business1entities1Language_15id);
        model1business1entities1User_13id.setFirstname(firstname_18idTemp);
        model1business1entities1User_13id.setLastname(lastname_19idTemp);
        model1business1entities1User_13id.setEmail(email_20idTemp);
        model1business1entities1User_13id.setBirthday(birthday_21idTemp);
        model1business1entities1User_13id.setPassword(password_22idTemp);
        boolean registerNewUser46mtemp = sampleUserServiceProxyid.registerNewUser(model1business1entities1User_13id);
        String tempResultreturnp47 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(registerNewUser46mtemp));
        %>
        <%= tempResultreturnp47 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>