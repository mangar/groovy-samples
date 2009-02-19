package com.mg.groovy.samples.know

import org.junit.Test


/**
 * ListSample.groovy
 *
 * @author Marcio Garcia - marcio@mangar.com.br
 */
public class ListSample{
	
    
    @Test
    public void test_Creating() {
	
		//define a fill list (1, 2, 3 elements)
		def myList = [1,2,3] 
		assert myList.size() == 3 
		assert myList[0] == 1 
		assert myList instanceof ArrayList
	
		//define an empty list...
		def emptyList = [] 
		assert emptyList.size() == 0 
		
		//define a list from a range....  Range.toList()
		def longList = (0..1000).toList() 
		assert longList[555] == 555
		assert longList.size() == 1001
		
		//explicit define...
		def explicitList = new ArrayList()
		//add an existing array to the new....
		explicitList.addAll(myList)
		assert explicitList.size() == 3
		
		//change the value from the first element (zero)
		println explicitList
		explicitList[0] = 10 
		assert explicitList[0] == 10
	    println explicitList
	        
	    
		explicitList = new LinkedList(myList)   
		assert explicitList.size() == 3
		
		println explicitList
		explicitList[0] = 10 
		assert explicitList[0] == 10 
	    println explicitList
	
    }
    
    @Test
    public void test_AddRemove(){
	
		def myList = ['a','b','c','d','e','f']   

		//part of the list...
		assert myList[0..2]  == ['a','b','c']
		
		//specific positions...
		assert myList[0,2,4] == ['a','c','e']   

		//replace range....
		myList[0..2] = ['x','y','z']   
		assert myList == ['x','y','z','d','e','f']  
		                    
		//clean positions...
		myList[3..5] = []                          
		assert myList == ['x','y','z']              
		                    
		//add range into a position....
		myList[1..1] = ['y','1','2']   
		assert myList == ['x','y','1','2','z']
	
    }
    
    @Test
    public void test_ListSample() {
	
		def myList = []
		
		//first element...
		myList += 'a'   		
		assert myList == ['a']
		
		//adding...
		myList += ['b','c']   
		assert myList == ['a','b','c']
		
		//reset...
		myList = [] 
		//add a, add b
		myList <<  'a' << 'b'   
		assert myList == ['a','b']
		
		//remove 'b'
		assert myList - ['b'] == ['a']
		
		//multiply the array...
		assert myList * 2 == ['a','b','a','b']
	
    }
	
    @Test
    public void test_A() {
	
    }
    
    
    
}
