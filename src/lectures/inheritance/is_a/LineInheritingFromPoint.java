package lectures.inheritance.is_a;

import lectures.graphics.Point;
/**
 * This class makes us think about correct and incorrect use of inheritance.
 *
 */
public interface LineInheritingFromPoint extends Point {
	int getWidth();

	int getHeight();

	void setWidth(int newVal);

	void setHeight(int newVal);
}
/*
 * CORRECT USE OF INHERITANCE
 * 
 * A class A should inherit from class B only if 
 * it "makes sense" to use A where B can be used.
 * 
 * If class A and B model real world types A' and B' then, in a program, 
 * it makes sense to use A where B can be used, if in the real world,
 * it makes sense to use A' where B' is used. 
 * 
 * Thus, this interface (which represents a line) should inherit
 * from Point only if it makes sense to use a line where a point
 * is expected.
 * 
 * (T/F) It makes sense of a type defining a line to inherit from a type defining a point.
 * That is, LineInheritingFromPoint uses inheritance correctly.
 * 
 * (T/F) It makes sense of a type defining a line to have all the properties
 * of a type defining Point.    

 * 
 * Go to interface Locatable to see another way to share code with Point.
 */
