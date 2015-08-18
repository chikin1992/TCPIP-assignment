import java.net.*;
import java.util.*;

public class test1
{
	 public static void show(NetworkInterface networkinterface) throws SocketException
      {
        System.out.printf("General name: %s\n", networkinterface.getDisplayName());
        System.out.printf("Interface name: %s\n",networkinterface.getName());
        Enumeration<InetAddress> inetAddresses = networkinterface.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses))
        {
          System.out.printf("Interface address: %s\n", inetAddress);
        }

     }

  public static void main(String[] args)
   	      	{
   	    	try
	        	{
		            InetAddress	ip_address = InetAddress.getLocalHost();
	            	String	host = ip_address.getHostName();
	                System.out.println("your ip \n"+ip_address);
		        	System.out.println("your hostname \n"+host);


		        }
		   catch(UnknownHostException e)
		        {
			     System.out.println("unknown host");
		        }
          try
              {
               Enumeration<NetworkInterface> n = NetworkInterface.getNetworkInterfaces();
               for (NetworkInterface networkinterface : Collections.list(n))
               {
        	      show(networkinterface);
               }
              }
              catch(Exception e)
              {
              	System.out.println("error");
              }

      }
}

