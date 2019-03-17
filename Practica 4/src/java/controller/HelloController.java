package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.validation.BindException;
import service.HelloService;

public class HelloController extends SimpleFormController {
    
    public HelloController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(User.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");
    }
    
    //@Override
    //protected void doSubmitAction(Object command) throws Exception {
        //throw new UnsupportedOperationException("Not yet implemented");
    //}

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        User name = (User) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("helloMessage", helloService.sayHello(name.getName(),name.getAge(),name.getId()));
        return mv;
    }
    
    private HelloService helloService;
    
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
