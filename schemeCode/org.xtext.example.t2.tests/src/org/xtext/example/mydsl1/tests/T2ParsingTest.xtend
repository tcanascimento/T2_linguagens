/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl1.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.mydsl1.t2.Model

@RunWith(XtextRunner)
@InjectWith(T2InjectorProvider)
class T2ParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void validaPrefixoPrint() {
		val result = parseHelper.parse('''
			print 'oi'
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaPrefixoPrint2() {
		val result = parseHelper.parse('''
			(print 'oi')
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaNumeroSozinho() {
		val result = parseHelper.parse('''
			10
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaExpressaoSemParentesesComposta() {
		val result = parseHelper.parse('''
			+10(* 11 20)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaExpressaoSemParenteses() {
		val result = parseHelper.parse('''
			* 11 20)
		''')
		Assert.assertNotNull(result)
		Assert.assertFalse(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaOperacaoSemParenteses() {
		val result = parseHelper.parse('''
			* 11 20 129 12 19
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	
	@Test
	def void validaExpressaoSoma() {
		val result = parseHelper.parse('''
			(+ 10 20)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaExpressaoSubtracao() {
		val result = parseHelper.parse('''
			(- 99 10)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaExpressaoMultiplicacao() {
		val result = parseHelper.parse('''
			(* 11 10)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaExpressaoDivisao() {
		val result = parseHelper.parse('''
			(/ 10 20)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaExpressaoMenorQue() {
		val result = parseHelper.parse('''
			(< 10 20)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaExpressaoMenorIgualQue() {
		val result = parseHelper.parse('''
			(<= 10 20)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaExpressaoMaiorQue() {
		val result = parseHelper.parse('''
			(> 10 20)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaExpressaoMaiorIgualQue() {
		val result = parseHelper.parse('''
			(>= 10 20)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaDefinicao() {
		val result = parseHelper.parse('''
			(define a 10)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void validaDefinicaoComposta() {
		val result = parseHelper.parse('''
			(define a (+ a 50))
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
}
