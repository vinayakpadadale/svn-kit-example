package com.tomsovi;

public class App 
{
    public static void main( String[] args ) {
        String username = args[0];
        String password = args[1];
	App app = new App();
	app.doSvnKitExample(username,password);
    }

    private void doSvnKitExample(String username, String password) {
        System.out.println( "Connecting SVN repository with username '"+username+"' and password '"+password+"'." );
    }
}
