import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class MyStackTest {


	@Test 
	public void testPush()
	   {
		MyStack<String> stack = new MyStack<String>();
	      stack.push ("hello");
	      stack.push ("world");
	      assertEquals (stack.peek(), "world");
	   }

	//@Test
	//public void fallingTest(){
	//	assertTrue(false);
	//}
/*
	@Test
	public void testPop(){
		MyStack<String> stack = new MyStack<String>();
		stack.pop ();
	   }

	@Test
	public void testPush3()
           {    
                MyStack<String> stack = new MyStack<String>();
              stack.push ("hello");
              stack.push ("world");
	      assertEquals (stack.peek(), "world");
	      stack.push ("here");
	      stack.push ("I'm");
              assertEquals (stack.peek(), "I'm");
           }
	
	@Test
        public void testPop4(){
                MyStack<String> stack = new MyStack<String>();
                stack.pop ();
		stack.pop ();
		stack.pop ();
		stack.pop ();
           }

	@Test
	public void testPopandPush5(){
                MyStack<String> stack = new MyStack<String>();
                stack.push ("java");
		stack.pop ();
		assertEquals (stack.peek(), "java");
           }

	@Test	        
       public void testPush6()
          {
              MyStack<String> stack = new MyStack<String>();
              stack.push ("Riccardo");
              assertEquals (stack.peek(), "Munoz");
           }
	
	@Test
        public void testPush7()
           {
              MyStack<String> stack = new MyStack<String>();
              stack.push ("7777777777777777777777777777777777777777777777777");
	      assertEquals (stack.peek(), "7777777777777777777777777777777777777777777777777");
              stack.push ("7777777777777777777777777777777777777777777777777");
	      assertEquals (stack.peek(), "7777777777777777777777777777777777777777777777777");
	      stack.push ("7777777777777777777777777777777777777777777777777");
	      assertEquals (stack.peek(), "7777777777777777777777777777777777777777777777777");
              stack.push ("7");
           }
	@Test
        public void testPush8()
           {
              MyStack<String> stack = new MyStack<String>();
              stack.push ("7777777777777777777777777777777777777777777777777");
              stack.push ("7777777777777777777777777777777777777777777777777");
              stack.push ("7777777777777777777777777777777777777777777777777");
              stack.push ("7");
	      assertEquals (stack.peek(), "7");
	      stack.push ("7777777777777777777777777777777777777777777777777");
              stack.push ("7777777777777777777777777777777777777777777777777");
              stack.push ("7777777777777777777777777777777777777777777777777");
              stack.push ("7");
           }
        @Test
        public void testPop9(){
                MyStack<String> stack = new MyStack<String>();
                stack.pop ();
           }

        @Test
        public void testPush10()
           {
                MyStack<String> stack = new MyStack<String>();
              stack.push ("hello");
              stack.push ("world");
              assertEquals (stack.peek(), "world");
              stack.push ("here");
              stack.push ("I'm");
              assertEquals (stack.peek(), "I'm");
           }

        @Test
        public void testPop11(){
                MyStack<String> stack = new MyStack<String>();
                stack.pop ();
                stack.pop ();
                stack.pop ();
                stack.pop ();
           }

        @Test
        public void testPopandPush12(){
                MyStack<String> stack = new MyStack<String>();
                stack.push ("java");
                stack.pop ();
                assertEquals (stack.peek(), "java");
           }

        @Test
        public void testPop14(){
                MyStack<String> stack = new MyStack<String>();
                stack.pop ();
                stack.pop ();
                stack.pop ();
                stack.pop ();
           }

        @Test
        public void testPopandPush15(){
                MyStack<String> stack = new MyStack<String>();
                stack.push ("java");
                stack.pop ();
                assertEquals (stack.peek(), "java");
           }

	
	@Test
       public void testPush16()
          {
              MyStack<String> stack = new MyStack<String>();
              stack.push ("Riccardo");
              assertEquals (stack.peek(), "Riccardo");
          }

        @Test
        public void testPush17()
           {
              MyStack<String> stack = new MyStack<String>();
              stack.push ("7777777777777777777777777777777777777777777777777");
              assertEquals (stack.peek(), "7777777777777777777777777777777777777777777777777");
              stack.push ("7777777777777777777777777777777777777777777777777");
              assertEquals (stack.peek(), "7777777777777777777777777777777777777777777777777");
              stack.push ("7777777777777777777777777777777777777777777777777");
              assertEquals (stack.peek(), "7777777777777777777777777777777777777777777777777");
              stack.push ("7");
           }
*/
}
