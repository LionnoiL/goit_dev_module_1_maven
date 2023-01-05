package ua.gaponov;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = new User("Andriy", "Gaponov");
        System.out.println(new Gson().toJson(user));
    }
}
