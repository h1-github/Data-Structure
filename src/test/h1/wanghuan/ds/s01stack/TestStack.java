package h1.wanghuan.ds.s01stack;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by wanghuan on 16/4/7.
 */
public class TestStack {

    Stack stack;

    @Before
    public void setUp(){
        stack = new Stack(1);
    }

    @Test
    public void push01(){
        try {
            stack.push(1);
//            stack.push(2);
//            stack.push(3);
//            stack.push(4);
//            stack.push(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void pop01(){
        try {
            stack.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
