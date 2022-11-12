package superclasstry;

public class GradeClass {

	int quiz1,quiz2,quiz3,unit1,unit2,termtest,sumQuiz,sumUnit;
	float QuizAve,UnitAve,TermAve,Total;
	char remark;
	
	public GradeClass(int quiz1, int quiz2, int quiz3, int unit1,int unit2, int termtest,
			int sumQuiz, int sumUnit,float quizAve, float unitAve, float termAve, float total) {
		this.quiz1 = quiz1;
		this.quiz2 = quiz2;
		this.quiz3 = quiz3;
		this.unit1 = unit1;
		this.unit2 = unit2;
		this.termtest = termtest;
		this.sumQuiz = sumQuiz;
		this.sumUnit = sumUnit;
		this.QuizAve = quizAve;
		this.UnitAve = unitAve;
		this.TermAve = termAve;
		this.Total = total;
	}

	public int getQuiz1() {
		return quiz1;
	}

	public int getQuiz2() {
		return quiz2;
	}

	public int getQuiz3() {
		return quiz3;
	}

	public int getUnit1() {
		return unit1;
	}

	public int getUnit2() {
		return unit2;
	}

	public int getTermtest() {
		return termtest;
	}

	public float getQuizAve() {
		sumQuiz = (getQuiz1() + getQuiz2() + getQuiz3()) / 3;
		QuizAve = (float) (sumQuiz * 0.3);
		
		return QuizAve;
	}

	public float getUnitAve() {
		sumUnit = (getUnit1() + getUnit2()) / 2;
		UnitAve = (float) (sumUnit * 0.4);
		
		return UnitAve;
	}

	public float getTermAve() {
		TermAve = (float) (getTermtest() * 0.3);
		
		return TermAve;
	}

	public float getTotal() {
		Total = getQuizAve() + getUnitAve() + getTermAve();
		
		return Total;
	}
	
	public char remarks(){
		
		if (getTotal() >= 90 && getTotal() <= 100) {
			return remark = 'A';
		}
		else if (getTotal() >= 80 && getTotal() <= 89){
			return remark = 'B';
		}
		else if (getTotal() >= 70 && getTotal() <= 79){
			return remark = 'C';
		}
		else if (getTotal() >= 60 && getTotal() <= 69){
			return remark = 'D';
		}
		return remark = 'F';
	}
	
	public String toString() {
		return String.format("%.2f\nYour Remark: %s", getTotal(),remarks());
	}
	
}



