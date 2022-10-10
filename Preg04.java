#include <iostream>
using namespace std;
 
int main () 
{
 float ganancias;
 float total;
 float i=0;
 float t=100;
 
  while (i < 4) {
  	cout<<endl;
   cout << "   Ingrese sus ganancias: "  ;
    cin>>ganancias;
    
    if( ganancias>=0 && ganancias<=1000){
    	total = (ganancias*5)/t;
    	
     	cout << "   El precio a pagar es : "<<total  ;
	}
	
	if  (ganancias>1000 && ganancias<=1500){
		
		total = (ganancias*7)/t;
    	
     	cout << "   El precio a pagar es : "<<total  ;
	}
	
		if  (ganancias>1500 && ganancias<=2000){
		
		total = (ganancias*8)/t;
    	
     	cout << "   El precio a pagar es : "<<total  ;
	}
	
	
		if  (ganancias>2000 && ganancias<=5000){
		
		total = (ganancias*10)/t;
    	
     	cout << "   El precio a pagar es : "<<total  ;
	}
    if(ganancias>5000){
    	total = (ganancias*15)/t;
    	
     	cout << "   El precio a pagar es : "<<total  ;
	}

   cout<<endl;
}
    
   
    

    return 0;
}