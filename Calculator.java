import java.util.*;
import java.io.*;
public class Calculator {
double x,y;
double add,sub,div,multi;
double addition()
{
	return add=x+y;
}
double subtraction()
{
	return sub=x-y;
}
double division()
{
	return div=x/y;
}
double multipilication()
{
	return multi=x*y;
}
double res;
double result(){
if(res==add)
{
	return add;
	
	}
return result();
}
}
