package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
	private static final java.util.Map<Integer, String> productMap = new java.util.HashMap<Integer, String>();
    private static final java.util.Map<Integer, String> productMap1 = new java.util.HashMap<Integer, String>();

    static {
      productMap.put(1, "Keyboard");
      productMap.put(2, "Mouse");
      productMap.put(3, "Monitor");
      
      productMap1.put(1, "Keyboard");
      productMap1.put(2, "Mouse");
      productMap1.put(3, "Monitor");
    }

    public Result listProducts() {
      return ok(products.render(productMap.values()));
    }
    
    public Result listProducts2() {
       return ok(products2.render(productMap1.values()));
     }
  
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public Result hello() {
    	return ok("Hello World ha ha");
    }
    public Result echo(String msg) {
    	return ok("Message ::"+ msg);
    }
    
    public Result redir() {
    	return redirect(controllers.routes.Application.echo("Hello Redirect"));
    }
    
    public Result listProductsAsXML() {
        return ok(views.xml.products.render(productMap));
    }

    public Result listProductsAsTXT() {
        return ok(views.txt.products.render(productMap));
    }
}
