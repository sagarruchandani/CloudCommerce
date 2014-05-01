import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cloudCommerce_userMyCart_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/MyCart.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1, maximum-scale=1")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(3)
invokeTag('resource','g',13,['dir':("css"),'file':("style.css")],-1)
printHtmlPart(4)
invokeTag('resource','g',17,['dir':("css"),'file':("megamenu.css")],-1)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',32,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(6)
if(true && (session?.user)) {
printHtmlPart(7)
expressionOut.print(session?.user.username)
printHtmlPart(8)
createClosureForHtmlPart(9, 3)
invokeTag('link','g',42,['controller':("user"),'action':("logout")],3)
printHtmlPart(10)
}
else {
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',45,['controller':("user"),'action':("login")],3)
printHtmlPart(11)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',46,['controller':("user"),'action':("register")],3)
printHtmlPart(14)
}
printHtmlPart(15)
createTagBody(2, {->
invokeTag('img','g',58,['dir':("images"),'file':("logo.jpg"),'width':("250px")],-1)
})
invokeTag('link','g',58,['controller':("user"),'action':("index")],2)
printHtmlPart(16)
createClosureForHtmlPart(17, 2)
invokeTag('link','g',62,['controller':("user"),'action':("index")],2)
printHtmlPart(18)
createClosureForHtmlPart(19, 2)
invokeTag('link','g',68,['controller':("Laptop"),'action':("showAll")],2)
printHtmlPart(20)
expressionOut.print(session?.user.counter)
printHtmlPart(21)
invokeTag('set','g',88,['var':("total"),'value':(0l)],-1)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
for( item in (cart) ) {
printHtmlPart(24)
invokeTag('img','g',95,['dir':("images/laptop"),'file':(item.Image),'width':("270"),'height':("200")],-1)
printHtmlPart(25)
createTagBody(4, {->
expressionOut.print(item.Title)
})
invokeTag('link','g',97,['class':("title"),'controller':("laptop"),'action':("details"),'id':(item.id)],4)
printHtmlPart(26)
expressionOut.print(item.Price)
printHtmlPart(27)
invokeTag('set','g',99,['var':("total"),'value':(total+item.Price)],-1)
printHtmlPart(28)
createClosureForHtmlPart(29, 4)
invokeTag('link','g',101,['value':("Remove"),'id':(item.id),'controller':("user"),'action':("removeFromCart")],4)
printHtmlPart(30)
}
printHtmlPart(31)
expressionOut.print(total)
printHtmlPart(32)
createClosureForHtmlPart(33, 3)
invokeTag('link','g',106,['controller':("user"),'action':("checkout"),'id':(total)],3)
printHtmlPart(34)
invokeTag('textField','g',113,['type':("text"),'name':("shipName"),'size':("18"),'width':("15px")],-1)
printHtmlPart(35)
invokeTag('textField','g',117,['name':("street"),'size':("18"),'autocomplete':("on")],-1)
printHtmlPart(36)
invokeTag('textField','g',121,['name':("city"),'size':("18"),'autocomplete':("on")],-1)
printHtmlPart(37)
invokeTag('textField','g',125,['name':("state"),'size':("18"),'autocomplete':("on")],-1)
printHtmlPart(38)
invokeTag('textField','g',134,['type':("text"),'name':("ccnumber"),'size':("18"),'width':("15px")],-1)
printHtmlPart(39)
invokeTag('textField','g',138,['name':("CVV"),'size':("18"),'autocomplete':("on")],-1)
printHtmlPart(40)
invokeTag('textField','g',142,['name':("fullname"),'size':("18"),'autocomplete':("on")],-1)
printHtmlPart(41)
expressionOut.print(total)
printHtmlPart(42)
invokeTag('submitButton','g',147,['value':("Submit Payment"),'name':("submitButton")],-1)
printHtmlPart(43)
})
invokeTag('form','g',150,['url':([controller:'user',action:'MyAccount'])],2)
printHtmlPart(44)
})
invokeTag('captureBody','sitemesh',174,[:],1)
printHtmlPart(45)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1398463055038L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
