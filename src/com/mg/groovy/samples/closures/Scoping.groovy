package com.mg.groovy.samples.closures

import org.junit.Test


/**
 * Scoping.groovy
 *
 * @author Marcio Garcia - marcio@mangar.com.br
 */
public class Scoping{
	
	@Test
	def void test_Scopping1() {
	    println "test_Scopping1 - " * 5
	    
	    def x = 0         
	    println "X: ${x}"
	    10.times {     
	        x++       
	    }             
	    assert x == 10
	    
	    println "X: ${x}"
	}
	
	
	
}
