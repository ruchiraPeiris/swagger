/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.amithfernando.swagger.resteasy.api.resources.impl;

import com.amithfernando.swagger.resteasy.api.exception.ApiException;
import com.amithfernando.swagger.resteasy.api.models.TestResponse;
import com.amithfernando.swagger.resteasy.api.resources.TestResource;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Component;

/**
 *
 * @author Amith
 */
@Component
public class TestResourceImpl implements TestResource{

    @Override
    public Response testResource() throws ApiException {
        TestResponse response=new TestResponse();
        response.setName("Amith Fernando");
        response.setMessage("Hello Fortuna Team!");
         return Response.status(Response.Status.OK).entity(response).build();
    }

}
