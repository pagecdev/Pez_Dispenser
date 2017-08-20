package com.treehouse.main;

import java.net.MalformedURLException;
import java.net.URL;

class NameAndLink {

    String name;

   public URL url;

 

    // constructor

    NameAndLink(String name, String url) {

         this.name = name;

         try {
			this.url = new URL(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}
