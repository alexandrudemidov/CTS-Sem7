package s7.testare;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import s7.clase.SlowTest;

@RunWith(Categories.class)
//IncludeCategory()
@ExcludeCategory(SlowTest.class)
@SuiteClasses({ TestCalculPretTotal.class, TestSetModel.class })
public class AllTestsFaraSlowTest {
	//exclud alltest la selectate
	//schimb cu categoriesclass
	//adaug cu excludecategory ala de slowtest
	//daca pun include utilizeaza doar pe ala 
}
