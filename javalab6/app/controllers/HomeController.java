package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(String name) {
	//This return method is returning both the message to the  which is the first part to the  		//parameter in the view anf also the name as a parameter which was passed into the method
	//And then to the return method just after the message.

        return ok(index.render("Welcome to the homepage", name));
    }
   //Adds new View
    public Result aboutUs() {
	return ok(aboutUs.render("About Us"));
    }
    public Result Products() {
	return ok(Products.render());
    }
    public Result ContactUs() {
	return ok(ContactUs.render());
    }

}
