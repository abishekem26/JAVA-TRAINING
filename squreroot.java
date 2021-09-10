import java.util.*;

class GFG
{

static double Square(double n,
					double i, double j)
{
	double mid = (i + j) / 2;
	double mul = mid * mid;

	
	if ((mul == n) ||
		(Math.abs(mul - n) < 0.00001))
		return mid;

	
	else if (mul < n)
		return Square(n, mid, j);

	
	else
		return Square(n, i, mid);
}


static void findSqrt(double n)
{
	double i = 1;

	
	boolean found = false;
	while (!found)
	{

		
		if (i * i == n)
		{
			System.out.println(i);
			found = true;
		}
		
		else if (i * i > n)
		{

			
			double res = Square(n, i - 1, i);
			System.out.printf("%.5f", res);
			found = true;
		}
		i++;
	}
}


public static void main(String[] args)
{
	double n = 3;

	findSqrt(n);

                  int a1 = 10;
                  double Sqare = a1*a1;
System.out.println("Square of 10 is"+Sqare);
}
}