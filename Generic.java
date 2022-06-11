package com.bridgelabz;
import java.util.Arrays;

public class Generic<E>  {
	
	
	    private final Object[] obj_array;   //object array
	    public final int length;
	    // class constructor
	    public Generic(int length)    {
	      
	        obj_array = new Object [length];
	        this.length = length;
	    }
	   
	    E get(int i) {
	        @SuppressWarnings("unchecked")
	        final E e = (E)obj_array[i];
	        return e;
	    }
	    // set e at obj_array[i]
	    void set(int i, E e) {
	        obj_array[i] = e;
	    }
	    @Override
	    public String toString() {
	        return Arrays.toString(obj_array);
	    }
	}
	class Main {
	    public static void main(String[] args){
	        final int length = 5;
	        // creating integer array 
	        Generic<Integer>int_Array = new  Generic(length);
	        System.out.print("Generic Array <Integer>:" + " ");
	        for (int i = 0; i < length; i++)
	            int_Array.set(i, i * 2);
	        System.out.println(int_Array);
	        // creating string array
	        Generic<String>str_Array = new  Generic(length);
	        System.out.print("Generic Array <String>:" + " ");
	        for (int i = 0; i < length; i++)
	            str_Array.set(i, String.valueOf((char)(i + 97)));
	        System.out.println(str_Array);
	    }
	}

