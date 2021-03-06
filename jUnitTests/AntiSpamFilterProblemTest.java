package antiSpamFilter_METIA1_55.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.uma.jmetal.solution.DoubleSolution;
import org.uma.jmetal.solution.Solution;

import antiSpamFilter_METIA1_55.AntiSpamFilterProblem;
import antiSpamFilter_METIA1_55.FileManager;

public class AntiSpamFilterProblemTest {
	
		private AntiSpamFilterProblem asfp = new AntiSpamFilterProblem();
		private FileManager fm = FileManager.getInstance();
		private DoubleSolution solution = new DoubleSolution() {
	
		
		@Override
		public void setVariableValue(int arg0, Double arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setObjective(int arg0, double arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setAttribute(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public String getVariableValueString(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Double getVariableValue(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public double getObjective(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getNumberOfVariables() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getNumberOfObjectives() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Object getAttribute(Object arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Solution<Double> copy() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Double getUpperBound(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Double getLowerBound(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
	};

	/**
	 * 
	 * Teste para verificar que as solu��es s�o colocadas corretamente.
	 * 
	 */
	@Test
	public void testSetSolution(){
		asfp.setSolution(solution);
		assertEquals(asfp.getSolution(), solution);
	}
	
	/**
	 * 
	 * Teste para verificar que o m�todo findRules() devolve com sucesso a posi��o de uma determinada regra e que 
	 * a mesma n�o � nula.
	 * 
	 */
	@Test
	public void testFindRules() {
		assertNotNull("Should not be null", asfp.findRules(new String()));
	}

	/**
	 * 
	 * Teste para verificar que as solu��es geradas pelo m�todo evaluate() n�o s�o nulas.
	 * 
	 */
	@Test
	public void testEvaluate() {
		asfp.evaluate(solution);
		assertNotNull("Should not be null", asfp.getSolution());
		
		assertNotNull("Should not be null", asfp.getSolution().getObjective(0));
		assertNotNull("Should not be null", asfp.getSolution().getObjective(1));

		
	}

}
