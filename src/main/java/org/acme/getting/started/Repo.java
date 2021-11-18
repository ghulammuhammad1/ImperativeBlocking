package org.acme.getting.started;

import java.io.IOException;

import javax.enterprise.context.RequestScoped;
@RequestScoped
public class Repo{
    public void callBlockingCode() throws IOException
    {       
         System.out.println("Starting 1........");
 
         int result;
         result = System.in.read();
         System.out.println(result+" \n Ending 1.........");
    }
}