package Restfullws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.org.apache.xpath.internal.operations.String;

@Path("/hello")
public class Restwebservices {
    @GET
	@Produces(MediaType.TEXT_HTML)
	public java.lang.String getHtml1(){
	
		return "HELLOWORLD";
	}
}
				