package com.bill.Test.framework.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.uri.UriComponent.Type;
import com.sun.jersey.core.header.ContentDisposition;
import com.sun.jersey.multipart.FormDataBodyPart;
import com.sun.jersey.multipart.FormDataMultiPart;

@Path("/postData")
public class PostData {

	@POST
	@Produces("application/json")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	//public Response postData(@FormParam("postData") String data,FormDataMultiPart form){
	public Response postData(FormDataMultiPart form){
		System.out.println("its working");
		//System.out.println(data);
		FormDataBodyPart filePart = form.getField("file");
		ContentDisposition headerOfFilePart =  filePart.getContentDisposition();
		String filePath = headerOfFilePart.getFileName();
		System.out.println(filePath);
		Gson gson = new Gson();
        // create the type for the collection. In this case define that the collection is of type Dataset
		//data=gson.fromJson(data, String.class); 
		//System.out.println(gson.toJson(data));
		
        
		return Response.status(200).entity(filePath).build();
	}


}
