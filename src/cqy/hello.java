package cqy;

import java.io.*;
import static org.hamcrest.Matchers.*;
 
public class hello{
    private static boolean result; // ��̬���������ڴ洢���н��
    public void equilateral(int a, int b, int c) {
    	if(a==b && b==c){
        result = true;}
    	else {
    		result = false;
    	}
    	
    }

    public void isosceles(int a, int b, int c) {
    	if (a==b || b ==c || a==c){
    		if((a+b)>c &&(a+c)>b && (b+c)>a &&(a-b)<c && (a-c) <b && (b-c) <a){
               result = true;
            }
    		else{
    			result = false;
    		}
    	}
    }
    public void scalene(int a , int b, int c) {
    	if (a==b && b == c && a==c){
    		result = false;
    	}
    	else{
    		if((a+b)>c &&(a+c)>b && (b+c)>a &&(a-b)<c && (a-c) <b && (b-c) <a){
                result = true;
             }
    	}
    }
    public void clear() {     // ���������
        result = false;
    }
    public boolean getResult() {
        return result;
    }


}
