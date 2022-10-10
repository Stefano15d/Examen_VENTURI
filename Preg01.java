#include <iostream>
using namespace std;
 
int main () 
{
 int aux, a, b;
    
   
    
  a=8;
  b=9;

    
    aux = a;
    a = b;
    b = aux;

    cout <<   "El nuevo valor de a es: " << a <<endl;

    cout <<   "El nuevo valor de b es: " << b ;

    return 0;
}